package com.krutova.pyramid.validation;

import com.krutova.pyramid.factoryMethod.AbstractPyramid;

public class PyramidValidation {

	public static boolean isPyramidOnCoordinatePlane(AbstractPyramid pyramid){
		return ((pyramid.getPointA().getZ() == 0F && pyramid.getPointB().getZ() == 0F && pyramid.getPointC().getZ() == 0F) ||
		(pyramid.getPointA().getY() == 0F && pyramid.getPointB().getY() == 0F && pyramid.getPointC().getY() == 0F) ||
		(pyramid.getPointA().getX() == 0F && pyramid.getPointB().getX() == 0F && pyramid.getPointC().getX() == 0F));
	}

}
