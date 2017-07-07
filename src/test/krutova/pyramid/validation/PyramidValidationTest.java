package test.krutova.pyramid.validation;

import org.junit.Assert;
import org.junit.Test;

import com.krutova.pyramid.entity.Point;
import com.krutova.pyramid.factoryMethod.AbstractPyramid;
import com.krutova.pyramid.factoryMethod.PyramidFactory;
import com.krutova.pyramid.validation.PyramidValidation;

public class PyramidValidationTest {

	@Test
	public void isPyramidOnCoordTest() {
		AbstractPyramid pyramid = new PyramidFactory().concretePyramid("Small",new Point(10,10,10),new Point(1,1,0),new Point(12,2,0),new Point(3,4,0));
		Assert.assertTrue(PyramidValidation.isPyramidOnCoordinatePlane(pyramid));
	}

}
