package se.nackademin.examination.examination_jacoco;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConversorTest {
	Conversor conversor = new Conversor();
	@Test
	public void testConversor() {

		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
	}
	@Test
	public void testSetNameConverterArrayValues(){
		conversor.setNameConverterArrayValues();
		assertEquals("Your first name is smaller than your last name", conversor.getNameConverterArray().get(0));
		assertEquals("Your last name is smaller than your first name", conversor.getNameConverterArray().get(1));
		assertEquals("The lengths of your first name is your last name are the same", conversor.getNameConverterArray().get(2));
	}
	/*
	@Test
	public void testGetNameConverterArrayValues(){
		if(conversor.getNameConverterArray().add("anna")){
			for(int i = 0; i < conversor.getNameConverterArray().size(); i++){
				System.out.println(conversor.getNameConverterArray().get(i));
			}
			fail("text was added to array");
		}
	}
	*/
	@Test
	public void testGetSetGenderConverterArrayValues(){
		conversor.setGenderConverterArrayValues();
		assertEquals("man!", conversor.getGenderConverterArray().get(0));
		assertEquals("woman!", conversor.getGenderConverterArray().get(1));
		assertEquals("person!", conversor.getGenderConverterArray().get(2));
	}
	/*
	@Test
	public void testGetGenderConverterArrayValues(){
		if(conversor.getGenderConverterArray().add("anna")){
			for(int i = 0; i < conversor.getGenderConverterArray().size(); i++){
				System.out.println(conversor.getGenderConverterArray().get(i));
			}
			fail("text was added to array");
		}
	}
	*/
	@Test
	public void testGetSetAgeConverterArrayValues(){
		conversor.setAgeConverterArrayValues();
		assertEquals("You are young and talented! Things will come your way soon enough! ",
				conversor.getAgeConverterArray().get(0));
		assertEquals("You are experienced and talented! Things will come your way soon enough!",
				conversor.getAgeConverterArray().get(1));
	}
	/*
	@Test
	public void testGetAgeConverterArrayValues(){
		if(conversor.getAgeConverterArray().add("anna")){
			for(int i = 0; i < conversor.getAgeConverterArray().size(); i++){
				System.out.println(conversor.getAgeConverterArray().get(i));
			}
			fail("text was added to array");
		}
	}
	*/
	@Test
	public void testGetSetCityConverterArrayValues(){
		conversor.setCityConverterArrayValues();
		assertEquals(11, conversor.getCityConverterArray().size());
		assertEquals(" B, ", conversor.getCityConverterArray().get(1));
	}
	/*
	@Test
	public void testGetCityConverterArray(){
		if(conversor.getCityConverterArray().add("anna")){
			for (int i = 0; i < conversor.getCityConverterArray().size(); i++){
				System.out.println(conversor.getCityConverterArray().get(i));
			}
			fail("text was added to array");
		}
	}
	*/



}
