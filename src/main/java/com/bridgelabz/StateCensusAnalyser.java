package com.bridgelabz;

import java.io.*;
import com.opencsv.*;
import com.opencsv.exceptions.CsvValidationException;

public class StateCensusAnalyser {

	public static int validateCensusCounts() throws CsvValidationException, IOException {
		int count = 0;
		CSVReader reader = new CSVReader(new FileReader(
				"E:\\Notepad++ java code\\Eclipse Workspace\\IndianStateCensusAnalyzer\\src\\main\\java\\com\\bridgelabz\\IndiaStateCensusData.csv"));
		String line[] = reader.readNext();
		while (line != null) {
			for (String cell : line) {
				System.out.print(cell + "\t");
			}
			count++;
			System.out.println();
			line = reader.readNext();
		}
		return count;
	}
	public static void validateCsvFile() {
	
		
	}

	public static void main(String[] args) throws IOException, CsvValidationException {

		CSVReader reader = new CSVReader(new FileReader(
				"E:\\Notepad++ java code\\Eclipse Workspace\\IndianStateCensusAnalyzer\\src\\main\\java\\com\\bridgelabz\\IndiaStateCensusData.csv"));
		String line[] = reader.readNext();
		while (line != null) {
			for (String cell : line) {
				System.out.print(cell + "\t");
			}
			System.out.println();
			line = reader.readNext();
		}
	}

}
