package test.krutova.pyramid.action;

import org.junit.Assert;
import org.junit.Test;

import com.krutova.pyramid.action.PyramidAction;
import com.krutova.pyramid.entity.Point;
import com.krutova.pyramid.factoryMethod.PyramidFactory;
import com.krutova.pyramid.fileManager.FileParser;
import com.krutova.pyramid.factoryMethod.AbstractPyramid;

public class PyramidActionVolumeTest {

	@Test
	public void pyramidVolumeEqual() throws Exception {
		float expected = 217;
		Point[] arrayOfPoints = FileParser.parseListToPointArray("data\\Parameters.txt");
		
		AbstractPyramid pyramid = new PyramidFactory().concretePyramid("Small",arrayOfPoints[0],arrayOfPoints[1],arrayOfPoints[2],arrayOfPoints[3]);
		PyramidAction pyramidAction = new PyramidAction();
		float pyramidVolume = pyramidAction.pyramidVolume(pyramid);

		Assert.assertEquals("test failed:",expected, pyramidVolume, 0.000001);
	}
	

}
