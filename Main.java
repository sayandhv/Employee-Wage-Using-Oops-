package com.Bridgelabz;

public class Main {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
        int empCheck = (int)(Math.random() * 10) % 2;
        int empType = (int)(Math.random() * 10) % 2;
        if(emp.checkIsPresent(empCheck)){
            emp.calcDailyEmpWage(empType);
        }
        else{
            System.out.println("Employee is absent");
        }
	}


}	