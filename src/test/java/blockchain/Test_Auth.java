package blockchain;

import org.testng.annotations.Test;

import com.ybear.blockchain.factory.AuthenticationFactory;


public class Test_Auth {
	@Test
	public void test_AuthenticationFactory() throws Exception {
		String token=AuthenticationFactory.getAuthenticationToken();
	}
}
