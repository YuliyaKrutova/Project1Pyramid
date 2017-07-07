package test.krutova.pyramid.action;

import org.junit.Assert;
import org.junit.Test;

import com.krutova.pyramid.action.PyramidAction;
import com.krutova.pyramid.entity.Point;
import com.krutova.pyramid.factoryMethod.PyramidFactory;
import com.krutova.pyramid.fileManager.FileParser;
import com.krutova.pyramid.factoryMethod.AbstractPyramid;

public class PyramidActionAreaTest {

	@Test
	public void pyramidVolumeEqual() throws Exception {
		float expected = 1000.6F;	
		Point[] arrayOfPoints = FileParser.parseListToPointArray("data\\Parameters.txt");

		AbstractPyramid pyramid = new PyramidFactory().concretePyramid("Big",arrayOfPoints[0],arrayOfPoints[1],arrayOfPoints[2],arrayOfPoints[3]);
		PyramidAction pyramidAction = new PyramidAction();
		float pyramidArea = pyramidAction.pyramidArea(pyramid);

		Assert.assertEquals("test failed:",expected, pyramidArea, 0.1);
	}

}
