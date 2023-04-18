/*
 * This program compute monthly wage of employee but make sure that total days of
 * working and total working hours should not exceed than 20 and 100
 */
package com.employeewageoops;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class MonthlyWageCalculation {

	/*
	 * To define method which insure number of days should 20 and hours 100 and
	 * calculate monthly wage.
	 */

	public static void toCalculateWageMonthly() {

		int wagePerHour = 20, empWorkHour = 0, sumofSalary = 0, totalHours = 0, days = 0;

		while (days <= 20 && totalHours <= 100) {
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
				empWorkHour = 0;
				salary = empWorkHour * wagePerHour;
			}
			if (totalHours <= 92) {
				sumofSalary += salary;
				totalHours += empWorkHour;
				days++;
			} else if (totalHours == 96 && empWorkHour == 4) {
				sumofSalary += salary;
				totalHours += empWorkHour;
				days++;
			}

		}
		System.out.println("Monthly Salary fo employee is " + sumofSalary);
		System.out.println("Total working hours are " + totalHours);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * To take input for days in month in Problem statement it is suggest that
		 * assume number of days 20
		 */

		/*
		 * To call method which calculate the monthly wage with concern of toatal
		 * working hours and number of days
		 */

		toCalculateWageMonthly();
	}
}
