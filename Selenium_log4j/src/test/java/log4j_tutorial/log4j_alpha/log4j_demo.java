package log4j_tutorial.log4j_alpha;


import org.apache.logging.log4j.*;


public class log4j_demo {

	private static Logger log =LogManager.getLogger(log4j_demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for this all the logs will be printed because level of logs is set to trace 
		log.info("object is present");
		log.debug("web object is  clicked");
		log.fatal("web object is not visible ");
		
		log.error("web button is not present");
	}

}
