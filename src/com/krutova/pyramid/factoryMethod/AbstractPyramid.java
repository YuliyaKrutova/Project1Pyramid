package com.krutova.pyramid.factoryMethod;

import com.krutova.pyramid.entity.Point;
import com.krutova.pyramid.observer.Observer;

public abstract class AbstractPyramid {

	public Point topPoint;
	public Point pointA;
	public Point pointB;
	public Point pointC;
	
	public Point getTopPoint() {
		return topPoint;
	}

	public Point getPointA() {
		return pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setTopPoint(Point topPoint) {
		this.topPoint = topPoint;
		notifyObservers();
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
		notifyObservers();
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
		notifyObservers();
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
		notifyObservers();
	}
	
	public abstract void registerObserver(Observer obs);
	public abstract void removeObserver(Observer obs);
	public abstract void notifyObservers();
}
