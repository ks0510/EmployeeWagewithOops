/*
 * This program check the attendance of employee and report it
 */
package com.employeewageoops;

public class Employee {

	/*
	 * To define method for attendance check of employee
	 */

	public static void employeeCheck(double randomnumber) {
		if (randomnumber >= 2) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

	/**
	 * This is main method of program and starting point of program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * To generate random number
		 */
		double ispresent = Math.random() * 3;

		/*
		 * To call employee check method
		 */
		employeeCheck(ispresent);

	}
}
