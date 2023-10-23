/**
 *  @version:
 */
package com.ychs.demo;

import org.apache.log4j.Logger;
import org.junit.Test;



/**
 * @author Ysheng
 *
 *   @date: 2021年8月11日下午4:37:53 ;
 */
public class Demo09 {
	private static Logger logger = 
			Logger.getLogger(Demo09.class);
	@Test
	public void f1() {
		logger.debug("debug...");
		logger.info("info");
		logger.error("error");
	}
}
