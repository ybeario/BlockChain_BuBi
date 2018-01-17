package com.ybear.blockchain.factory;

import com.ybear.blockchain.model.APP_INFO;

import bubi4j.common.BubiServiceFactory;
/**
 * 
 * @author yu xiong
 * @date 2018年1月17日上午11:34:50
 * @version 1.0
 *
 * @description 获取token
 */
public class AuthenticationFactory {
	private static String accessToken = null ;
	public static String getAuthenticationToken() throws Exception {
		if (accessToken == null) {
			String url = "https://api.bubidev.cn/";
			String appid = APP_INFO.APP_ID;
			String appkey = APP_INFO.APP_SECREAT;
			BubiServiceFactory factory = BubiServiceFactory.getInstance(url, appid, appkey);
			//获取token
			accessToken = factory.getOAuthService().getAccessToken();
			System.out.println("accessToken:"+accessToken);
		}	
		return accessToken;
	}
}
