/*
 * This java program calculate monthly wage of different companies with respect to
 * wage per hour,number of days in month and number of hours in month
 */
package com.employeewageoops;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class WageforMultipleCompanies {

	/*
	 * To define method which takes wage per hour,number of days and number of hours
	 * and compute monthly wage of employee
	 */

	public static void toCalculateWageMonthly(String company, int rateperHour, int daysinMonth, int hours) {

		int empWorkHour = 0, totalHours = 0, sumofSalary = 0, day = 1;

		while (day <= daysinMonth && totalHours <= hours) {

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

				break;
			case 2:
				/*
				 * 5) To calculate part time wage if employee is partialy present
				 */

				empWorkHour = 4;
				break;
			default:
				empWorkHour = 0;
			}
			/*
			 * To add up daily working hours to ensure limit and to compute total wage
			 */

			totalHours += empWorkHour;
			System.out.println("Day " + day + " Employee hours " + empWorkHour);
			day++;

		}
		/*
		 * To calculate total wage with total hours
		 */

		sumofSalary = totalHours * rateperHour;

		System.out.println("Total Employee Wage for Company " + company + " is " + sumofSalary);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Scanner s = new Scanner(System.in);

		/*
		 * To take parameters for first company
		 */

		System.out.println("Enter company name");

		String companyname1 = sc.nextLine();

		System.out.println("Enter wage per hour");

		int wageperHour1 = s.nextInt();

		System.out.println("Enter total days in month");

		int days1 = s.nextInt();

		System.out.println("Enter total hours in month");

		int monthlyhours1 = s.nextInt();

		/*
		 * To take parameters for second company
		 */

		System.out.println("Enter company name");

		String companyname2 = sc.nextLine();

		System.out.println("Enter wage per hour");

		int wageperHour2 = s.nextInt();

		System.out.println("Enter total days in month");

		int days2 = s.nextInt();

		System.out.println("Enter total hours in month");

		int monthlyhours2 = s.nextInt();

		/*
		 * To call method which calculate monthly wage according to number of days,hours
		 * and wage per hour
		 */

		toCalculateWageMonthly(companyname1, wageperHour1, days1, monthlyhours1);

		toCalculateWageMonthly(companyname2, wageperHour2, days2, monthlyhours2);
	}
}
