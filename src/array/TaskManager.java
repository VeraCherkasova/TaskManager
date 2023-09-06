package array;

import java.util.Scanner;
import java.util.ArrayList;

public class TaskManager {

	public static void main(String[] args) {
		String deals;
		String nameOfDeal;
		int dealNumber;
		String editName;
		int deleteDeal;
		
		System.out.println("Choose the action and write the command: \n LIST \n ADD \n EDIT \n DELETE");
		
		ArrayList <String> toDoList = new ArrayList<>(); 	
		toDoList.add("Go");
		toDoList.add ("Run");
		toDoList.add ("Fly");
			
		do{
		Scanner scanner = new Scanner(System.in);
		deals = scanner.nextLine();	
			
		if (deals.equals("LIST")) {
		for (String item : toDoList) {
			System.out.println(item);
			}
		}
		
		else if (deals.equals("ADD")) {
			System.out.println("Write the new task:");
			nameOfDeal = scanner.nextLine();
			toDoList.add(nameOfDeal);
			System.out.println("Choose the action and write the command: \n LIST \n ADD \n EDIT \n DELETE");
		}
		
		else if (deals.equals("EDIT")) {
			System.out.println("Enter case number of task which you want to change:");
			dealNumber = scanner.nextInt();
		    toDoList.remove(dealNumber);
			System.out.println("Enter a new task instead of the old one");
			Scanner scanner3 = new Scanner(System.in);
	        editName = scanner3.nextLine();
	        toDoList.add(dealNumber,editName);
	        System.out.println("Choose the action and write the command: \n LIST \n ADD \n EDIT \n DELETE");
		}
		
		else if (deals.equals("DELETE")) {
			System.out.println("Enter index number of task which you want to delete:");
			dealNumber = scanner.nextInt();
		    toDoList.remove(dealNumber);
		    System.out.println("Choose the action and write the command: \n LIST \n ADD \n EDIT \n DELETE");
	        
		}
		
		else if (deals.equals("FINISH")) {
			System.out.println("The editing is over");
			break;
		}
		
	  } while (true);
   } 
}

