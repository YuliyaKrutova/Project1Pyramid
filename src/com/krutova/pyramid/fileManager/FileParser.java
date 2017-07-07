package com.krutova.pyramid.fileManager;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krutova.pyramid.entity.Point;
import com.krutova.pyramid.exception.PyramidException;

public class FileParser {

	private static final Logger LOGGER  = LogManager.getLogger();
	
	public static Point[] parseListToPointArray(String fileName) throws PyramidException {
		
		ArrayList<String> lines = FileManager.readLineFromFile(fileName);
		int lineSize = lines.size();
		float PointX = 0;
		float PointY = 0;
		float PointZ = 0;
		Point[] pointArray = new Point[lineSize];
		int rowCount=0;
		for (String rowLines : lines){
			if (rowCount<=3){
			PointX = Coordinate(rowLines,1);
			PointY = Coordinate(rowLines,2);
			PointZ = Coordinate(rowLines,3);
			pointArray[rowCount] = new Point(PointX,PointY,PointZ);
			LOGGER.info("New Point is created from File:"+pointArray[rowCount]);
			}
			else{
				LOGGER.warn("More rows than expected!");
			}
			rowCount++;
		}
			
		return pointArray;
	}
	
	public static float Coordinate (String string, int numCoordinate) throws PyramidException{
		float x=0;
		switch (numCoordinate){
		case 1: 
			x = Float.parseFloat(string.substring(0, string.indexOf(" ")));
			break;
		case 2:
			x = Float.parseFloat(string.substring(string.indexOf(" ")+1,string.indexOf(" ", string.indexOf(" ")+1)));
			break;
		case 3:
			x = Float.parseFloat(string.substring(string.lastIndexOf(" ")+1,string.length()));
			break;
		default:
			throw new PyramidException("Point has 3 coordinates only");
		}
		return x;
	}

}
