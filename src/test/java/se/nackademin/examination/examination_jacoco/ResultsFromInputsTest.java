package se.nackademin.examination.examination_jacoco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ResultsFromInputsTest {

	@Test
	public void testAgeGettersAndSettersMethods() {
		ResultFromInputs resultsFromInputs = new ResultFromInputs();

		resultsFromInputs.setResultForNameLenght(10);
		assertEquals("The result should be 10", resultsFromInputs.getResultForNameLenght(), 10);

		resultsFromInputs.setResultForGender(5);
		assertEquals("should be 5", 5, resultsFromInputs.getResultForGender());

		resultsFromInputs.setResultForAge(40);
		assertEquals("should be 40", 40, resultsFromInputs.getResultForAge());

		resultsFromInputs.setResultForHomeCity(44);
		assertEquals("should be 44", 44, resultsFromInputs.getResultForHomeCity());
	}

}
