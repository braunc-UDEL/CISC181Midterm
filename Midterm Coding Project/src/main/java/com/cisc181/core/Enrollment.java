package com.cisc181.core;
import java.util.UUID;
//Enrollment has the following attributes: SectionID(UUID), StudentID (UUID),
//EnrollmentID(UUID) and Grade (double).  
//Enrollment should have its no-arg constructor private.
//Enrollment should have a two-arg constructor, with StudentID and SectionID as input 
//parameters.  EnrollmentID should be set in the constructor.
//SetGrade(double grade) should be defined as a procedure.

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment() {
		
	}
	
	public Enrollment(UUID StudentID, UUID SetionID)
	{
		this.EnrollmentID = EnrollmentID;
	}

	public void SetGrade(double grade) {
		Grade = grade;
	}
	
}
