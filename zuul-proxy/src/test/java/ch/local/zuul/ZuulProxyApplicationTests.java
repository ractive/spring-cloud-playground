package ch.local.zuul;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ch.local.zuul.ZuulProxyApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ZuulProxyApplication.class)
public class ZuulProxyApplicationTests {

	@Test
	public void contextLoads() {
	}

}
