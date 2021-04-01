package se.nackademin.examination.examination_jacoco;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class DataAnalysisTest {
	DataAnalysis dataAnalysis = new DataAnalysis();
	ArrayList<String> values = new ArrayList<String>();

	@Test
	public void testGetResulStringHomecityAndAge(){
		values.addAll(Arrays.asList("Game", "Anna", "Brown", "F", "38", "Stockholm"));
		assertEquals("The name of the homecity is big and the participant is 30 or older",
						dataAnalysis.getResulStringHomecityAndAge(values));
		values.set(4, "14");
		assertEquals("The name of the homecity is big and the participant is younger than 30",
				dataAnalysis.getResulStringHomecityAndAge(values));
		values.set(5, "OK");
		assertEquals("The name of the homecity is small and the participant is younger than 30",
				dataAnalysis.getResulStringHomecityAndAge(values));
		values.set(4, "55");
		assertEquals("The name of the homecity is small and the participant is 30 or older",
				dataAnalysis.getResulStringHomecityAndAge(values));
	}
	@Test
	public void testGetResultStringNamesAndAge(){
		values.addAll(Arrays.asList("Game", "Anna", "Brown", "F", "38", "Stockholm"));
		assertEquals("No analysis was performed", dataAnalysis.getResultStringNamesAndAge(values));
		values.set(1, "Cassandra");
		assertEquals("The first name is greater or equals in size to the last name and the participant older than 30",
				dataAnalysis.getResultStringNamesAndAge(values));
		values.set(4, "29");
		assertEquals("No analysis was performed", dataAnalysis.getResultStringNamesAndAge(values));
		values.set(1, "My");
		assertEquals("The first name is smaller or equals in size to the last name and the participant is 30 or younger",
				dataAnalysis.getResultStringNamesAndAge(values));
	}
	@Test
	public void testBuildFinalString(){
		values.addAll(Arrays.asList("Game", "My", "Brown", "F", "18", "Stockholm"));
		String result = dataAnalysis.buildFinalString(values);
		assertTrue("name of the city is big and the participant is older",
				result.contains("The name of the homecity is big and the participant is younger than 30"));
		assertTrue("The first name is smaller or equals in size to the last name and the participant is 30 or younger",
				result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
	}

}
