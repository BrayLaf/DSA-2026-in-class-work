/**
 * 
 */
package unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class RectangleTest {
	
	static Rectangle obj;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		obj = new Rectangle();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test_area1() {
		assertEquals(15, obj.area(5, 3));
	}
	@Test
	void test_area2() {
		assertEquals(100, obj.area(10, 10));
	}
	@Test
	void test_area3() {
		assertEquals(30, obj.area(6, 5));
	}
}
