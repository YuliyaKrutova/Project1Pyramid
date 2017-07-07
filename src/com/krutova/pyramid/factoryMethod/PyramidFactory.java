package com.krutova.pyramid.factoryMethod;

import com.krutova.pyramid.entity.Point;

public class PyramidFactory { 

	public AbstractPyramid concretePyramid(String type, Point topPoint, Point pointA, Point pointB, Point pointC) {
		if ("Big".equals(type)) {
			return new BigPyramid(topPoint,pointA,pointB,pointC);
		}
		else{
			return new SmallPyramid(topPoint,pointA,pointB,pointC);
		}
	}
}
