package com.Bridgelabz;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
        double empCheck = Math.floor (Math.random() * 10) % 2;
        if(emp.checkIsPresent(empCheck)){
            
            System.out.println("Daily Employee Wage :" +  emp.calcDailyEmpWage());
        }
        else{
            System.out.println("Employee is absent");
        }
	}

}	