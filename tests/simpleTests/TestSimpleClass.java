/**
 * 
 */
package simpleTests;

import static org.junit.Assert.*;

import org.junit.Test;

import simplePackage.SimpleClass;

/**
 * @author sarahjoseph
 *
 */
public class TestSimpleClass {

	@Test
	public void test() {
		SimpleClass sc = new SimpleClass();
		
		
		assertEquals(5,sc.dumbMethod(3));
	}

}
