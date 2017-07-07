package com.krutova.pyramid.action;

import com.krutova.pyramid.entity.Point;

public class PointAction {
	public Point vector(Point pointA, Point pointB){ 
		Point vectorAB = new Point(pointB.getX()-pointA.getX(),pointB.getY()-pointA.getY(),pointB.getZ()-pointA.getZ());
		return vectorAB;
	}

}
