package highgrade;

import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;

public class hgrade {

	public static void main(String[] args) {
		ArrayList<Integer> grades = new ArrayList<Integer>();
		
		System.out.println("Enter 5 student grades between 0 and 100: ");
		Scanner input = new Scanner(System.in);
		grades.add(0, input.nextInt());
		grades.add(1, input.nextInt());
		grades.add(2, input.nextInt());
		grades.add(3, input.nextInt());
		grades.add(4, input.nextInt());
	
		

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < grades.size()-1; j++) {
				if (grades.get(j).compareTo(grades.get(j+1)) < 0) {
					int grade1 = grades.get(j);
					int grade2 = grades.get(j+1);
					grades.set(j, grade2);
					grades.set(j+1, grade1);
				}
			}
		}
		int print = 0 ;
		System.out.println("The highest grade is: " + grades.get(print));
	input.close();
		}
}

