package test.krutova.pyramid.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

import com.krutova.pyramid.entity.Point;
import com.krutova.pyramid.singleton.MapPyramidSingleton;

public class MapPyramidSingletonTest {
	
	@Test
	public void testSingleton() {
		Point topPoint = new Point(21,65,2);
		MapPyramidSingleton firstSingleton = MapPyramidSingleton.getInstance();
		firstSingleton.put(1, topPoint);

		MapPyramidSingleton secondSingleton = MapPyramidSingleton.getInstance();
		Point topPoint2 = secondSingleton.fetch(1);
		
		assertEquals(topPoint, topPoint2);
	}

}
