package Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import Print.DrawTree;

public class XmasTreeTest {

	DrawTree xmasTree;

	@Before
	public void init() {
     xmasTree = new DrawTree();
	}

	@Test
	public void testSingleRow() {
		String tree = xmasTree.drawTree(1, "x", "g");
		assertThat(tree, equalTo("x"));
	}

	@Test
	public void testSign() {
		String tree = xmasTree.drawTree(2, "b", "g");
		assertThat(tree, equalTo(
				" b\n" +
				"bbb"
						));
	}

	@Test
	public void testDirectionLeft() {
		String tree = xmasTree.drawTree(3, "x", "l");
		assertThat(tree, equalTo(
				"x\n" + 
				"xx\n" + "x"));
	}

	@Test
	public void testDirectionDown() {
		String tree = xmasTree.drawTree(3, "x", "d");
		assertThat(tree, equalTo("xxxxx\n" + " xxx\n" + "  x"));
	}

}
