/*
 * This program calculate wage of employee for one day using method
 */
package com.employeewageoops;

/**
 * 
 * @author Kaif
 *
 */

public class WageCalculation {

	/*
	 * To define function which calculate daily wage
	 */
	public static void toCalculateWage(int a, int b) {

		System.out.println("Daily wage of employee is " + a * b);

	}

	public static void main(String[] args) {

		int wageperHour = 20;
		int fulldayHour = 8;

		toCalculateWage(wageperHour, fulldayHour);

	}
}
