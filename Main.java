package com.Bridgelabz;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
        double empCheck = Math.floor (Math.random() * 10) % 2;
        emp.checkIsPresent(empCheck);
	}

}
