package java_erp_teacher.util;

import java.sql.Connection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

//import junit.framework.Assert;

public class JdbcUtilTest {

	@After
	public void tearDown() throws Exception {
		System.out.println();
	}

	@Test
	public void testGetConnection() {
		System.out.println("testGetConnection()");
		Connection con = JdbcUtil.getConnection();
		Assert.assertNotNull(con);
		System.out.println("con >> " + con);
	}

}
