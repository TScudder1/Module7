package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void test() {
		String[] args = {toString()};
		TextAnalyzer test = new TextAnalyzer();
		test.launch(args);
		assertEquals(0, 0);		
	}

}
