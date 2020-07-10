package how.to.use.eclipse;

import java.util.Scanner;

public class Ticketing_System{

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		boolean [] flight = new boolean [10];
		int economy = 5;
		int firstClass =0;
		
		int Yes = 0;
		   for(int counter = 1; counter <= 10; counter++) {
			   System.out.println("Press code (1 = first class: , 2 = Economy)");
			   int reply = input.nextInt();
			   if(reply > 2 || reply < 1) {
			   System.out.println("Enter 1 or 2");
					}
			   
			   if(reply == 1 || reply == 2)
				if(reply ==1) {
				flight[firstClass] = true;
				firstClass++;
				System.out.printf(" FirstClass seat number is: %d%n", ( firstClass));
						}
			   
			else if(firstClass == 4) {
			System.out.println("First Class filled up,Economy:Available:YES||NO");
				if(reply != Yes)
				System.out.println("Next flight leaves in 3 hours time");
					 }
			   
			else if(reply == 2) {
			flight[economy] = true;
			economy++;
			System.out.printf("Economy Class seat number is: %d%n",( economy));
				}
			}	
			}
		}