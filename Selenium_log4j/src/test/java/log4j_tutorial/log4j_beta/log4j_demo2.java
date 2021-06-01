package log4j_tutorial.log4j_beta;


import org.apache.logging.log4j.*;


public class log4j_demo2 {

	private static Logger log =LogManager.getLogger(log4j_demo2.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for this only the error logs will be printed because level of logs is set to error 
		log.info("object is present");
		log.debug("object is present");
		log.fatal("object is present");
		
		log.error("object is present");
	}

}
