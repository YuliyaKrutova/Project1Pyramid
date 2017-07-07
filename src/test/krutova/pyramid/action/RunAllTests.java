package test.krutova.pyramid.action;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PointActionParameterTest.class, PointActionTest.class, PyramidActionAreaTest.class,
		PyramidActionVolumeTest.class })
public class RunAllTests {

}
