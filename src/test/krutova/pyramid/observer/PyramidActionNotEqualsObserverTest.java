package test.krutova.pyramid.observer;

import static org.junit.Assert.*;

import org.junit.Test;

import com.krutova.pyramid.action.PyramidAction;
import com.krutova.pyramid.entity.Point;
import com.krutova.pyramid.factoryMethod.PyramidFactory;
import com.krutova.pyramid.factoryMethod.AbstractPyramid;

public class PyramidActionNotEqualsObserverTest {
	@Test
	public void testPyramidActionNotEqualsObserver() {
		Point topPoint = new Point(21,65,1);
		Point pointA = new Point(1,1,4);
		Point pointB = new Point(-2,4,2);
		Point pointC = new Point(-2,-2,-2);
		
		AbstractPyramid pyramid = new PyramidFactory().concretePyramid("Small",topPoint, pointA, pointB, pointC);
		PyramidAction pyramidAction = new PyramidAction();
		pyramidAction.pyramidArea(pyramid);
		float unexpectedVolume = pyramidAction.pyramidVolume(pyramid);
		pyramid.registerObserver(pyramidAction); 
		pyramid.setTopPoint(new Point(21,65,2));
		float actualVolume = pyramidAction.getVolume();
		assertNotEquals(unexpectedVolume, actualVolume, 0.0001);
	}

}
