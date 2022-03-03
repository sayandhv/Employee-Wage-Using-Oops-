package com.Bridgelabz;

public class Employee {
		 
	 final int IS_PRESENT = 1;
	  final int FULLTIME = 1;
	  int WAGE_PER_HR = 20;
	  int FULL_DAY_HR = 16;  
	  
	  public boolean checkIsPresent(double empCheck){
	        if(empCheck == IS_PRESENT)
	            return true;
	        else
	            return false; 
	  }
	  public void calcDailyEmpWage(int empType){
	        int dailyEmpWage =  WAGE_PER_HR * FULL_DAY_HR;
	        switch(empType){
	            case  FULLTIME : 
	                System.out.println("Employee Type : Full time");
	                System.out.println("Daily Employee Wage :" + dailyEmpWage);
	            break;
	            default : 
	                System.out.println("Employee Type : Part time");
	                System.out.println("Daily Employee Wage :" + (dailyEmpWage / 2));
	        }
	  }
}
	
