package com.krutova.pyramid.factoryMethod;

import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krutova.pyramid.entity.Point;
import com.krutova.pyramid.observer.Observable;
import com.krutova.pyramid.observer.Observer;

public class BigPyramid extends AbstractPyramid implements Observable {

	private Logger LOGGER  = LogManager.getLogger(); 

	private List<Observer> observers;

	public BigPyramid(Point topPoint, Point pointA, Point pointB, Point pointC) {
		this.topPoint = new Point(100,100,100);
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
		LOGGER.info("Coordinates of Top Point = "+this.topPoint);
		observers = new LinkedList<>();
	}

	@Override
	public void registerObserver(Observer obs) {
		observers.remove(obs);
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

