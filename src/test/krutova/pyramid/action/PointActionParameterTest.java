package test.krutova.pyramid.action;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.krutova.pyramid.action.PointAction;
import com.krutova.pyramid.entity.Point;

@RunWith(Parameterized.class)
public class PointActionParameterTest {

	private final Point pointA;
	private final Point expected;

	public PointActionParameterTest(final Point pointA, final Point expected){
		this.pointA = pointA;
		this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static List<Object[]> AreaData() {
		return Arrays.asList(new Object[][] {
	      { new Point(1,1,4), new Point(-3,3,-2) },
	      { new Point(1,1,3), new Point(-3,3,-1) },
	      { new Point(1,1,2), new Point(-3,3,0)}, //fail
	      { new Point(1,1,1), new Point(-3,3,1) },
	    });
	  }

	@Test
	public void vectorCoordinatesEqual() {
		Point pointB = new Point(-2,4,2);		
		PointAction vectorAB = new PointAction();
		Point actual = vectorAB.vector(pointA, pointB);
		Assert.assertEquals(expected, actual); 

	}
	
	

}
