package ${package};

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	public void hello(){
		System.out.println("hello world");
		logger.debug("debug ..........."); 
		logger.info("info.............."); 
		logger.warn("warn.............."); 
		logger.error("error............"); 
	}
	
	public static void main(String[] args) {
		new App().hello();
	}
}
