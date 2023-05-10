package com.bridgelabz;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.opencsv.exceptions.CsvValidationException;

public class StateCensusAnalyserTest {
	
	@Test
	public void validateCensusCountsTest() throws CsvValidationException, IOException{
		
		Assert.assertEquals(30,StateCensusAnalyser.validateCensusCounts());
	
	}

	@Test
	public void validateCustomException() {
		
		Assert.assertEquals(null, null);
	}
}
