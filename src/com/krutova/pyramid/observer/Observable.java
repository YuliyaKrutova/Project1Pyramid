package com.krutova.pyramid.observer;

public interface Observable {
	void registerObserver(Observer obs);
    void removeObserver(Observer obs);
    void notifyObservers();
}
