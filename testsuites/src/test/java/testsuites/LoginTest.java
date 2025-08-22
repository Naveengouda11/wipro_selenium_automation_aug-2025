package testsuites;

import org.testng.annotations.Test;

public class LoginTest {
@Test
	public void loginwithvalid() {
		System.out.println("Login with valid credentail test exectued");
	}
	@Test
	public void loginwithinvalid() {
		System.out.println("Login with invalid credential test executed");
	}
}
