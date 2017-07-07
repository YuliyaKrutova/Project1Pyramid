package test.krutova.pyramid.action;

import org.junit.Assert;
import org.junit.Test;

import com.krutova.pyramid.action.PointAction;
import com.krutova.pyramid.entity.Point;

public class PointActionTest {

	@Test
	public void vectorCoordinatesEqual() {
		Point expected = new Point(-3,3,-2);	
		Point pointA = new Point(1,1,4);		
		Point pointB = new Point(-2,4,2);		
		
		PointAction vectorAB = new PointAction();
		Point actual = vectorAB.vector(pointA, pointB); //coordinates of vector
		System.out.println(actual);
		System.out.println(expected);
		Assert.assertEquals(expected, actual); 

	}

}