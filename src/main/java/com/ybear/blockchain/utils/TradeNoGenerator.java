package com.ybear.blockchain.utils;
/**
 * 
 * @date 2018年1月19日下午5:26:24
 *
 * @description
 */
public class TradeNoGenerator {
	public static String generatTradeNo() {
		return String.valueOf((int)(Math.random()*1000000000));
		
	}
}
