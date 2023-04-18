/*
 * This program calculate wage of employee for one day and par time using method.
 */

package com.employeewageoops;

public class PartTimeEMp {

	/*
	 * To define function which calculate daily wage.
	 */

	public static void toCalculateWage(int a, int b) {

		System.out.println("Day wage of employee is " + a * b);

	}

	public static void main(String[] args) {

		int wagePerHour = 20;
		int fullDayHour = 14;

		/*
		 * To add part time hours.
		 */

		int partTimeHour = 8;

		/*
		 * To call method to calculate part time wage of employee.
		 */

		toCalculateWage(wagePerHour, partTimeHour);
	}
}
