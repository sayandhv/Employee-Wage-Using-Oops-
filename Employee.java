package com.Bridgelabz;

public class Employee {
		 
	 int IS_PRESENT = 1;
	  int WAGE_PER_HR = 20;
	  int FULL_DAY_HR = 8;  
	  int FULLTIME = 1;
	  public boolean checkIsPresent(double empCheck){
	        if(empCheck == IS_PRESENT)
	            return true;
	        else
	            return false; 
	  }
	  public void calcDailyEmpWage(double emptype){
	        int dailyEmpWage =  WAGE_PER_HR * FULL_DAY_HR;
	        if(emptype == FULLTIME) {
	        	System.out.println("Employee type : Full time");
	        	System.out.println("Daily Employee wage :" +dailyEmpWage);
	        }
	        else {
	        	System.out.println("Employee type : Part time");
	        	System.out.println("Daily Employee Wage :" + (dailyEmpWage/2));
	        }
	  }
}
	
