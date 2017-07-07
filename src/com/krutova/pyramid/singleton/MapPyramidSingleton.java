package com.krutova.pyramid.singleton;

import java.util.HashMap;
import java.util.Map;

import com.krutova.pyramid.entity.Point;

public class MapPyramidSingleton {

	private Map<Integer, Point> MapPyramidSingleton = new HashMap<Integer, Point>();
		   
	private static class SingletonInitial{
		private static final MapPyramidSingleton INSTANCE = new MapPyramidSingleton();
	}
		   
	public static MapPyramidSingleton getInstance(){
	    return SingletonInitial.INSTANCE;
	}
	
	public void put(Integer num, Point point){
		MapPyramidSingleton.put(num,point);
    }
	public Point fetch(Integer key){
		return MapPyramidSingleton.get(key);
	}

	
}
