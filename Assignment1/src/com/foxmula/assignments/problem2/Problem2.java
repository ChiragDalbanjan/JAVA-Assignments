/**
 * 
 */
package com.foxmula.assignments.problem2;

/**
 * @author Chirag Dalbanjan
 *
 */
import java.util.*;

public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int choice, data;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		Stack st1 = new Stack();
		Stack st2 = new Stack();

		System.out.println(
				"\nEnter \n\t1 for Push in stack1,\n\t2 for Push in stack2 ,\n\t3 for Pop in stack1,\n\t4 for Pop in stack2,\n\t5 for exit.");
		System.out.print("\nChoose action from given above: ");

		while (flag) {
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter integer data to be pushed");
				data = sc.nextInt();
				st1.push(data);

				break;

			case 2:
				System.out.print("Enter integer data to be pushed: ");
				data = sc.nextInt();
				st2.push(data);

				break;
			case 3:
				st1.pop();
				break;
			case 4:
				st2.pop();
				break;
			case 5:
				flag =false;
			default:
				System.out.println("Please choose correct option...");
				break;

			}
			if (st1.getCount() == st2.getCount()) {
				System.out.println("size of stack became same, size is: " + (st1.getCount()));
			}

			System.out.print("Choose option: ");

		}
		
		sc.close();

	}

}
