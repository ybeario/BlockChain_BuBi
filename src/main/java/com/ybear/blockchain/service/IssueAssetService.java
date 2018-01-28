package com.ybear.blockchain.service;

import com.ybear.blockchain.utils.TradeNoGenerator;

import bubi4j.Asset;
import bubi4j.common.BubiServiceFactory;

public class IssueAssetService {
	private static String accessToken = null;
	private static BubiServiceFactory factory = null;

	public IssueAssetService() throws Exception {

		
	}

	public static void IssueAsset() throws Exception {
		accessToken = AuthenticationService.getAuthenticationToken();
		factory = BubiService.BubiServiceFactory();
		// [必填] 资产发行商布比地址 即bubi_id
		String assetIssuer = "bubiV8hz6ZRDDcviNbscMoFzdSN6MYkmciHcTduF";
		// [必填] 待发行资产名称
		String assetName = "保全币";
		// [必填] 待发行资产单位
		String assetUnit = "枚";
		// [必填] 待发行资产数量
		String assetAmount = "10000";
		// [必填] 资产发行商账号密码  区块链地址类似于ID，加上此处的密码即可
		String accPwd = "123";
		// [可选] 资产说明，如，资产描述或摘要
		String metadata = "证据保全";
		// [必填]接口调用凭据号,必须在商户系统里保证唯一
		String tradeNo = TradeNoGenerator.generatTradeNo();
		// 请求资产发行接口
		Asset asset = factory.getAssetService(accessToken);
		String result = asset.issue(assetIssuer, accPwd, tradeNo, assetName, assetUnit, assetAmount, metadata);
		System.out.println(result);
	}
}
