/*
 * This following program solve the employee wage program using switch case 
 */

package com.employeewageoops;

/**
 * 
 * @author Kaif
 *
 */

public class EmployeeWageSwitch {

	/*
	 * To define method which calulate employee wage for a day
	 */
	public static void toCalculateWage() {

		int wagePerHour = 20;
		int empWorkHour = 0;
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
			 * 4) To compute full day wage if employee is present
			 */
			empWorkHour = 8;
			System.out.println("Employee full day wage is " + empWorkHour * wagePerHour);
			break;
		case 2:
			/*
			 * 5) To  compute  part time wage if employee is partialy present
			 */
			empWorkHour = 4;
			System.out.println("Employee part time wage is " + empWorkHour * wagePerHour);
			break;
		default:
			/*
			 * 6) To Print if employee is absent
			 */
			System.out.println("Employee is absent");
		}
	}
       
        /*
        *This is main method of program
        */

	public static void main(String[] args) {

		/*
		 * To call out calculate method to compute wage of day
		 */

		toCalculateWage();

	}
}
