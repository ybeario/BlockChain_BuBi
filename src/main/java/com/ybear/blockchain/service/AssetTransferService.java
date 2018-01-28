package com.ybear.blockchain.service;

import com.ybear.blockchain.utils.TradeNoGenerator;

import bubi4j.Asset;
import bubi4j.common.BubiServiceFactory;
import bubi4j.util.GUIDUtil;

public class AssetTransferService {
	private static String accessToken = null;
	private static BubiServiceFactory factory = null;
	public static void AssetTransfer() throws Exception {
		factory = BubiService.BubiServiceFactory();
		//获取token
		accessToken = AuthenticationService.getAuthenticationToken();
		//[必填] 随机字符串
		String currentString = GUIDUtil.createNewGuid(GUIDUtil.AfterMD5);
		//[必填] 资产转出方的账户密码
		String accPwd = "123";
		//[必填] 接口调用凭据号,必须在商户系统里保证唯一
		String tradeNo = TradeNoGenerator.generatTradeNo();
		//[必填] 资产CODE,转出方给转入方转让的资产标识（全网唯一）
		String assetCode = "2UX4xvQ4aXNRFwvdZbE6rXP9uc1WsxBbvXu7nKp1qNABbiDCCj6toYJxBpCXqjNcvCjkAo8GnWNxL1Sfr"
		+"fQ77RLCKBTortzwaTkDgDDsGiXmMAEeJJWZkrqxZq92AjA7uxToPkYXVosxfdcP";
		//[必填] 资产转移数量
		String assetAmount = "1";
		//[必填] 资产转出方
		String fromBubiId = "bubiV8hz6ZRDDcviNbscMoFzdSN6MYkmciHcTduF";
		//[必填] 资产转入方
		String toBubiId = "bubiV8i1NqtNZjmVso2fFtxLdurYxhBkMY2uYcJF";
		//请求资产转移接口
		Asset asset = factory.getAssetService(accessToken);
		String result = asset.send(currentString, accPwd, tradeNo, assetCode, assetAmount, fromBubiId, toBubiId);
		System.out.println(result);
	}
}
