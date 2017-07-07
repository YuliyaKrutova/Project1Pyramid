package com.krutova.pyramid.entity;
/*
package com.krutova.pyramid.entity;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krutova.project_pyramid.observer.Observable;
import com.krutova.project_pyramid.observer.Observer;

import java.util.LinkedList;

public class Pyramid implements Observable {
	private static final Logger LOGGER  = LogManager.getLogger();

	private List<Observer> observers;
	private Point topPoint;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Pyramid(Point topPoint, Point pointA, Point pointB, Point pointC) {
		this.topPoint = topPoint;
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		LOGGER.info("Coordinates of Top Point = "+topPoint);
		observers = new LinkedList<>();

	}

	public Point getTopPoint() {
		return topPoint;
	}

	public void setTopPoint(Point topPoint) {
		this.topPoint = topPoint;
		notifyObservers();
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
		notifyObservers();
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
		notifyObservers();
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer obs) {
		observers.add(obs);
		
	}

	@Override
	public void removeObserver(Observer obs) {
		observers.remove(obs);

	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers)
            observer.update(this);
	}

}
*/
