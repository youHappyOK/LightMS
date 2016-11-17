package com.LightMQ.store;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.LightMS.common.constant.LoggerName;


public class testLogger {
	private static final Logger log = LoggerFactory.getLogger(LoggerName.StoreLoggerName);
	public static void main(String []args){
		log.info("OK");
	}
}
