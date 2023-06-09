package com.skillstorm.general;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class JobListings {

	
public static  List<Jobs> readerJobs(){
	List<Jobs> jobListing = new ArrayList<>();
	String csvFile = "Listings.csv";
	try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
		String line;
		
		line = br.readLine(); // this is the header row, the first thing in the file
		
		while ((line = br.readLine()) != null) {
			// CSV is a comma separated value file
			// I know the delimiters (the comma) and I know what order the data is in
			// because I have the file infront of me
			String[] vals = line.split(",");
			String id = vals[0];
            String title = vals[1];
            String description = vals[2];
            String streetAddress = vals[3];
            String city = vals[4];
            String state = vals[5];
            String zipcode = vals[6];
            double salary = Double.parseDouble(vals[7]);
            String field = vals[8];
            String email = vals[9];

			// first thing is the name
			// second thing is the age
			// third thing is the hair color
			// every time
			Jobs jobs = new Jobs(id, title, description, streetAddress, city, state, zipcode, salary, field, email);
			
			
		}
	} catch (FileNotFoundException ex) {
		ex.printStackTrace();
	} catch (IOException ex) {
		ex.printStackTrace();
	}
	
	return jobListing;
	}
public static List<Jobs> filterJobListings(List<Jobs> jobListings, String keyword) {
    List<Jobs> filteredListings = new ArrayList<>();
    for (Jobs jobListing : jobListings) {
        if (jobListing.getTitle().toLowerCase().contains(keyword.toLowerCase())
                || jobListing.getDescription().toLowerCase().contains(keyword.toLowerCase())
                || jobListing.getField().toLowerCase().contains(keyword.toLowerCase())) {
            filteredListings.add(jobListing);
        }
    }
    return filteredListings;
}
}
