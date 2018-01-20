package com.ybear.blockchain.service;

import com.ybear.blockchain.entity.APP_INFO;
import com.ybear.blockchain.entity.URLConstant;

import bubi4j.common.BubiServiceFactory;

public class BubiService {
	public static BubiServiceFactory factory = null;
	public static BubiServiceFactory BubiServiceFactory() {
		factory = BubiServiceFactory.getInstance(URLConstant.BASE_URL, APP_INFO.APP_ID, APP_INFO.APP_SECREAT);
		return factory;
	}
}
