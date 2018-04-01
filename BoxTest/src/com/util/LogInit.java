package com.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.util.LogInit;

public class LogInit {

		public static Logger logger=LogManager.getLogger(LogInit.class.getName());

		public static void logfatal(String msg){
			logger.fatal(msg);
		}
		
		public static void logerror(String msg){
			logger.error(msg);
		}
		
		public static void logwarn(String msg){
			logger.warn(msg);
		}
		
		public static void info(String msg){
			logger.info(msg);
		}
		
		public static void debug(String msg){
			logger.debug(msg);
		}
	
}
