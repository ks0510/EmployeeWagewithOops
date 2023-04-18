/*
 * This java program calculate the monthly wage of employee for one month.
 */
package com.employeewageoops;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class EmpWageMonth {

	/*
	 * To define method which calulate employee wage for a month
	 */
	public static void toCalculateWage(int days) {

		int wagePerHour = 20;
		int empWorkHour = 0;
		int sumofSalary = 0;

		/*
		 * To calculate wage for number of days
		 */
		for (int i = 1; i <= days; i++) {

			int salary = 0;

			/*
			 * 1)To Calculate the random number
			 */

			double ispresent = Math.random() * 3;

			/*
			 * 2) To convert random number into integer to use in switch case
			 */

			Double newData = new Double(ispresent);
			int value = newData.intValue();

			/*
			 * 3) To check the attendance of employee used switch case
			 */

			switch (value) {
			case 1:
				/*
				 * 4) To calculate full day wage if employee is present
				 */

				empWorkHour = 8;
				salary = empWorkHour * wagePerHour;

				break;
			case 2:
				/*
				 * 5) To calculate part time wage if employee is partialy present
				 */

				empWorkHour = 4;
				salary = empWorkHour * wagePerHour;

				break;
			default:
				continue;
			}
			sumofSalary += salary;
		}
		System.out.println("Monthly wage of employee is " + sumofSalary);
		System.out.println("Number of days in month is " + days);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * To take input for days in month in Problem statement it is suggest that
		 * assume number of days 20
		 */
		System.out.println("Enter number of days");

		int numberofDays = sc.nextInt();

		toCalculateWage(numberofDays);

	}
}
