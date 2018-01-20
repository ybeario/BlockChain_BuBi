package blockchain;

import org.testng.annotations.Test;

import com.ybear.blockchain.service.AuthenticationService;
import com.ybear.blockchain.service.RegisterService;


public class Test_Example {
	private String token=null;
	@Test
	public void AuthenticationServiceTest() throws Exception {
		token=AuthenticationService.getAuthenticationToken();
	}
	@Test
	public void RegisterServiceTest() throws Exception {
		RegisterService.Regist("abc", "123");
	}
}
