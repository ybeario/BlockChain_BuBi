package blockchain;

import org.testng.annotations.Test;

import com.ybear.blockchain.service.AssetTransferService;
import com.ybear.blockchain.service.AuthenticationService;
import com.ybear.blockchain.service.IssueAssetService;
import com.ybear.blockchain.service.RegisterService;


public class Test_Example {
	private String token=null;
	@Test
	public void AuthenticationServiceTest() throws Exception {
		token=AuthenticationService.getAuthenticationToken();
	}
	@Test
	public void RegisterServiceTest() throws Exception {
		RegisterService.Regist("abcd", "123");
	}
	@Test
	public void IssueAssetServiceTest() throws Exception {
		IssueAssetService.IssueAsset();
	}
	//{"data":{"asset_amount":10000,"asset_code":"2UX4xvQ4aX17ZYfx4W4QrWyHhv3McSqBickNAHVSr8w6NntVsNQYwvv5rPio4pYaMMKYC6PtGjBhE75xLfc6g8U7vptnLrktmyeE6A94fTTtqMUqQNz4f9jeUri3GLz3Esiu3MWMGaMc7eX5","asset_issuer":"bubiV8hz6ZRDDcviNbscMoFzdSN6MYkmciHcTduF","asset_name":"保全币","asset_unit":"枚","bc_hash":"30f9442770c919a4909dfd59a853bcf05d0b6dfc0f320f01e7cbf7b2a183b2af"},"err_code":"0","msg":"操作成功"}
	@Test
	public void AssetTransferServiceTest() throws Exception {
		AssetTransferService.AssetTransfer();
	}
}
