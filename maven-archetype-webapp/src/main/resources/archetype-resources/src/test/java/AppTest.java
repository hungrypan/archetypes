package ${package};

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppTest {
	
	private static final Logger logger = LoggerFactory.getLogger(AppTest.class);

	@Test
	public void testHello(){
		new App().hello();
		logger.debug("debug ...test.....");
		logger.info("info......test.....");
		logger.warn("warn......test.....");
		logger.error("error....test.....");
	}
}