package com.ybear.blockchain.service;

import com.ybear.blockchain.entity.APP_INFO;
import com.ybear.blockchain.entity.URLConstant;

import bubi4j.common.BubiServiceFactory;
/**
 * 
 * @author yu xiong
 * @date 2018年1月17日上午11:34:50
 * @version 1.0
 *
 * @description 获取token
 */
public class AuthenticationService {
	private static String accessToken = null ;
	public static String getAuthenticationToken() throws Exception {
		if (accessToken == null) {
			BubiServiceFactory factory=BubiService.BubiServiceFactory();
			//获取token
			accessToken = factory.getOAuthService().getAccessToken();
			System.out.println("accessToken:"+accessToken);
		}	
		return accessToken;
	}
}
