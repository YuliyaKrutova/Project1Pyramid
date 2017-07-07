package com.krutova.pyramid.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krutova.pyramid.action.PointAction;
import com.krutova.pyramid.entity.Point;
import com.krutova.pyramid.exception.PyramidException;
import com.krutova.pyramid.factoryMethod.AbstractPyramid;
import com.krutova.pyramid.observer.Observer;

public class PyramidAction implements Observer {
	private static final Logger LOGGER  = LogManager.getLogger();
	private float volume;
	private float area;

	public float triangleArea (Point pointA, Point pointB, Point pointC) throws PyramidException{ //calculation Area for Triangle
		
		PointAction vectorCoordinate = new PointAction(); 
		
		Point vectorAB = vectorCoordinate.vector(pointA, pointB);
		Point vectorBC = vectorCoordinate.vector(pointB, pointC);
		Point vectorAC = vectorCoordinate.vector(pointA, pointC);
		
		float lenVectorAB = (float) Math.sqrt(Math.pow(vectorAB.getX(),2)+Math.pow(vectorAB.getY(),2)+Math.pow(vectorAB.getZ(),2));
		float lenVectorBC = (float) Math.sqrt(Math.pow(vectorBC.getX(),2)+Math.pow(vectorBC.getY(),2)+Math.pow(vectorBC.getZ(),2));
		float lenVectorAC = (float) Math.sqrt(Math.pow(vectorAC.getX(),2)+Math.pow(vectorAC.getY(),2)+Math.pow(vectorAC.getZ(),2));
		
		float perimeter = (lenVectorAB+lenVectorBC+lenVectorAC)/2;
		if (perimeter<=0){
			throw new PyramidException("Perimeter < 0");
		}
	
		float area = (float) Math.sqrt(perimeter*(perimeter-lenVectorAB)*(perimeter-lenVectorBC)*(perimeter-lenVectorAC));
		
		return area;
		}

	public float pyramidVolume (AbstractPyramid pyramid) {
		PointAction vectorCoordinate = new PointAction();
		Point vectorA = vectorCoordinate.vector(pyramid.getTopPoint(), pyramid.getPointA());
		Point vectorB = vectorCoordinate.vector(pyramid.getTopPoint(), pyramid.getPointB());
		Point vectorC = vectorCoordinate.vector(pyramid.getTopPoint(), pyramid.getPointC());

		float volume = (vectorA.getX()*vectorB.getY()*vectorC.getZ()+vectorA.getY()*vectorB.getZ()*vectorC.getX()+vectorA.getZ()*vectorB.getX()*vectorC.getY()
				-vectorA.getZ()*vectorB.getY()*vectorC.getX()-vectorA.getY()*vectorB.getX()*vectorC.getZ()-vectorA.getX()*vectorB.getZ()*vectorC.getY())/6;
		LOGGER.info("Volume of a shape = "+volume);
		return volume;
	}
	
	public float pyramidArea (AbstractPyramid pyramid) {
		float pyramidArea=0;
		try {
			pyramidArea = triangleArea(pyramid.getPointA(), pyramid.getPointB(), pyramid.getPointC())+triangleArea(pyramid.getTopPoint(), pyramid.getPointB(), pyramid.getPointC())+triangleArea(pyramid.getPointA(), pyramid.getTopPoint(), pyramid.getPointC())+triangleArea(pyramid.getPointA(), pyramid.getPointB(), pyramid.getTopPoint());
		} catch (PyramidException e) {
			System.err.println(e.getCause());
		}
		LOGGER.info("Surface area of a shape = "+pyramidArea);
		return pyramidArea;		
	}
	
	public float getVolume() {
		return volume;
	}

	public float getArea() {
		return area;
	}

	@Override
	public void update(AbstractPyramid pyramid) {
		LOGGER.info("Coordinates of Top Point = "+pyramid.getTopPoint());
		this.area = pyramidArea(pyramid);
		this.volume = pyramidVolume(pyramid);
	}

}
