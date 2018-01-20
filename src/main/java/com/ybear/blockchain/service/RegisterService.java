package com.ybear.blockchain.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.alibaba.fastjson.JSON;
import com.ybear.blockchain.entity.APP_INFO;
import com.ybear.blockchain.entity.URLConstant;

import bubi4j.Account;
import bubi4j.common.BubiServiceFactory;

/**
 * 
 * @date 2018年1月19日下午5:22:39
 *
 * @description
 */
public class RegisterService {
	private static String accessToken = null;

	/**
	 * 
	 * 简单描述：
	 * 
	 * @param userName
	 *            待注册布比账户名
	 * @param password
	 *            待注册布比账户密码
	 * @throws Exception
	 */
	public static void Regist(String userName, String password) throws Exception {
		BubiServiceFactory factory=BubiService.BubiServiceFactory();
		accessToken = AuthenticationService.getAuthenticationToken();
		// 接口调用凭据号,必须在商户系统里保证唯一 写入数据库
		String tradeNo = String.valueOf((int) (Math.random() * 1000000000));
		System.out.println(tradeNo);
		// 把请求参数组装成集合
		Map<String, String> sParaTemp = new HashMap<String, String>();
		sParaTemp.put("user_name", userName);
		sParaTemp.put("password", password);
		sParaTemp.put("trade_no", tradeNo);

		// 请求布比区块链注册接口
		Account account = factory.getAccountService(accessToken);
		String result = account.registerBubiAccount(JSON.toJSONString(sParaTemp));
		System.out.println(result);
	}
}
