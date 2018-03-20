package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	private static double totalSalary = 0;
	private static double averageSalary;

	@BeforeClass
	public static void setup() {
		List Staff = new ArrayList();
		Date date = new Date(1900,12,12);
		Staff dylan = new Staff("Bob", "Francis", "Dylan",
				date, "address", "number", "bobdylan@gmail.com",
				"no office hours", 2, 10000, date,
				eTitle.MR);
		Staff dylan2 = new Staff("Bob", "Francis", "Dylan",
				date, "address", "number", "bobdylan@gmail.com",
				"no office hours", 2, 20000, date,
				eTitle.MR);
		Staff dylan3 = new Staff("Bob", "Francis", "Dylan",
				date, "address", "number", "bobdylan@gmail.com",
				"no office hours", 2, 30000, date,
				eTitle.MR);
		Staff dylan4 = new Staff("Bob", "Francis", "Dylan",
				date, "address", "number", "bobdylan@gmail.com",
				"no office hours", 2, 40000, date,
				eTitle.MR);
		Staff dylan5 = new Staff("Bob", "Francis", "Dylan",
				date, "address", "number", "bobdylan@gmail.com",
				"no office hours", 2, 50000, date,
				eTitle.MR);
		Staff.add(dylan);
		Staff.add(dylan2);
		Staff.add(dylan3);
		Staff.add(dylan4);
		Staff.add(dylan5);
		
		for(int i = 0; i < Staff.size(); i++)
	    {
			Object current = Staff.get(i);
	        totalSalary += ((Employee) Staff.get(i)).getSalary();
	    }
		averageSalary = totalSalary/Staff.size();
	}
	
	@Test
	public void test() {
		assertEquals(30000.0, averageSalary,.001);
	}
	
	@Test
	public void DOBandNumberTest() throws Exception{
	  boolean DOBthrown = true;
	  boolean Numberthrown = false;
	  Date date = new Date(1900,12,12);
	  Staff dylan5 = new Staff("Bob", "Francis", "Dylan",
				date, "address", "number", "bobdylan@gmail.com",
				"no office hours", 2, 50000, date,
				eTitle.MR);
	  if (dylan5.getDOB().getYear() < 15)
	  {
		  throw new PersonException(dylan5);
	  }
	  else
	  {
		  DOBthrown = false;  
	  }

	  assertTrue(DOBthrown);
	}
}
