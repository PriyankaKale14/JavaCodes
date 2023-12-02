/* Write a java program to display the Hotel Menu Card.And take input from user.*/

import java.util.Scanner;

public class HotelMenuCard 
{
	public static void main(String[] args) 
	{
		int choice,choice1=0,bill=0,quantity=0,i=0;
		String[] item_name=new String[20];
		int item_quantity[]=new int[20];
		int amount[]=new int[20];
		char answer =' ',answer1=' ';
		Scanner input=new Scanner(System.in);
		System.out.println("******Welcome to PRIYA'S Hotel******\n");
		do
		{
			System.out.println("******MENU******\n"  // display main menu
					+ "1: Starters \n"
					+ "2: Vegeterian \n"
					+ "3: Non-Vegeterian \n"
					+ "4: Cold Drinks \n"
					+ "Enter your choice=");
			choice=input.nextInt();
			switch(choice)
			{
				case 1:
					do
					{
						System.out.print("!!!!!!!!!Select Starters!!!!!!!!\n" // display sub menu
								+ "1) Fried Pickles\t 80Rs\n"
								+ "2) Pasta \t\t 45Rs\n"
								+ "3) Masala Papad \t 30Rs\n"
								+ "Enter your choice=");
						choice1=input.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.print("Enter quantity of Fried Pickles plates:");
								quantity=input.nextInt();
								bill+=80*quantity;
								item_name[i]="Fried Pickles \t\t 80Rs";
								item_quantity[i]=quantity;
								amount[i]=80*quantity;
								i++;
								break;
								
							case 2:
								System.out.print("Enter quantity of Pasta plates:");
								quantity=input.nextInt();
								bill+=65*quantity;
								item_name[i]="Pasta \t\t 45Rs";
								item_quantity[i]=quantity;
								amount[i]=45*quantity;
								i++;
								break;
								
							case 3:
								System.out.print("Enter quantity of Masala Papad plates:");
								quantity=input.nextInt();
								bill+=70*quantity;
								item_name[i]="Masala Papad \t\t 30Rs";
								item_quantity[i]=quantity;
								amount[i]=30*quantity;
								i++;
								break;
								
							default:
								System.out.println("Select Proper Menu\n");
						}
						System.out.print(">>>>>>>> Have more order with Starters (Y/N):");
						answer1=input.next().charAt(0);
						
					}while(answer1=='Y' || answer1=='y');
					break;
					
				case 2:
					do
					{
						System.out.println("!!!!!!!!!!Select Vegeterian!!!!!!!!\n" // display sub menu
								+ "1)Paneer Masala \t 130Rs\n"
								+ "2)Paneer Pulav \t\t 130Rs\n"
								+ "3)Soyabean Chilli \t 80Rs\n"
								+ "4)Paneer Makhni \t 120Rs\n"
								+ "Enter your choice=");
						choice1=input.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.print("Enter quantity of Paneer Masala:");
								quantity=input.nextInt();
								bill+=130*quantity;
								item_name[i]="Paneer Masala\t 130Rs";
								item_quantity[i]=quantity;
								amount[i]=130*quantity;
								i++;
								break;
								
							case 2:
								System.out.print("Enter quantity of Paneer Pulav:");
								quantity=input.nextInt();
								bill+=130*quantity;
								item_name[i]="Paneer Pulav \t 130Rs";
								item_quantity[i]=quantity;
								amount[i]=130*quantity;
								i++;
								break;
								
							case 3:
								System.out.print("Enter quantity of Soyabean Chilli :");
								quantity=input.nextInt();
								bill+=80*quantity;
								item_name[i]="Soyabean Chilli \t\t 80Rs";
								item_quantity[i]=quantity;
								amount[i]=80*quantity;
								i++;
								break;
								
							case 4:
								System.out.print("Enter quantity of Paneer Makhni :");
								quantity=input.nextInt();
								bill+=120*quantity;
								item_name[i]="Paneer Makhni \t\t 120Rs";
								item_quantity[i]=quantity;
								amount[i]=120*quantity;
								i++;
								break;
								
							default:
								System.out.println("Select Proper Menu\n");
						}
						System.out.print(">>>>>>>> Have more order with Vegeterian (Y/N):");
						answer1=input.next().charAt(0);
						
					}while(answer1=='Y' || answer1=='y');
					break;
					
				case 3:
					do
					{
						System.out.println("!!!!!!!!!Select Non-Vegeterian!!!!!!!!!\n" // display sub menu
								+ "1)Chiken Masala \t 150Rs\n"
								+ "2)Fish Fry\t\t 130Rs\n"
								+ "3)Egg Curry\t\t 80Rs\n"
								+ "Enter your choice=");
						choice1=input.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.print("Enter quantity of Chiken Masala:");
								quantity=input.nextInt();
								bill+=50*quantity;
								item_name[i]="Chiken Masala \t\t 150Rs";
								item_quantity[i]=quantity;
								amount[i]=150*quantity;
								i++;
								break;
								
							case 2:
								System.out.print("Enter quantity of Fish Fry:");
								quantity=input.nextInt();
								bill+=70*quantity;
								item_name[i]="Fish Fry \t\t 130Rs";
								item_quantity[i]=quantity;
								amount[i]=130*quantity;
								i++;
								break;
								
							case 3:
								System.out.print("Enter quantity of Egg Curry:");
								quantity=input.nextInt();
								bill+=140*quantity;
								item_name[i]="Egg Curry \t\t 140Rs";
								item_quantity[i]=quantity;
								amount[i]=80*quantity;
								i++;
								break;
								
							default:
								System.out.println("Select Proper Menu\n");
						}
						System.out.print(">>>>>>>> Have more order with Non-Vegeterian (Y/N):");
						answer1=input.next().charAt(0);
						
					}while(answer1=='Y' || answer1=='y');
					break;
					
				case 4:
					do
					{
						System.out.println("!!!!!!!Select Cold Drinks!!!!!!!\n" // display sub menu
								+ "1) Rose Milk Shake \t\t 60Rs\n"
								+ "2) Cold Coffee \t\t\t 60Rs\n"
								+ "3) Pineapple Milk Shake \t 50Rs\n"
								+ "4) Mango Milk Shake \t\t 70Rs \n"
								+ "5) Chocalate Milk Shake \t 50Rs \n"
								+ "Enter your choice=");
						choice1=input.nextInt();
						switch(choice1)
						{
							case 1:
								System.out.print("Enter quantity of Rose Milk Shake :");
								quantity=input.nextInt();
								bill+=60*quantity;
								item_name[i]="Rose Milk Shake \t\t 60Rs";
								item_quantity[i]=quantity;
								amount[i]=60*quantity;
								i++;
								break;
								
							case 2:
								System.out.print("Enter quantity of Cold Coffee :");
								quantity=input.nextInt();
								bill+=60*quantity;
								item_name[i]="Cold Coffee \t\t 60Rs";
								item_quantity[i]=quantity;
								amount[i]=60*quantity;
								i++;
								break;
								
							case 3:
								System.out.print("Enter quantity of Pineapple Milk Shake :");
								quantity=input.nextInt();
								bill+=30*quantity;
								item_name[i]="Pineapple Milk Shake \t\t 50Rs";
								item_quantity[i]=quantity;
								amount[i]=50*quantity;
								i++;
								break;
								
							case 4:
								System.out.print("Enter quantity of Mango Milk Shake :");
								quantity=input.nextInt();
								bill+=70*quantity;
								item_name[i]="Mango Milk Shake \t\t 70Rs";
								item_quantity[i]=quantity;
								amount[i]=70*quantity;
								i++;
								break;
								
							case 5:
								System.out.print("Enter quantity of Chocalate Milk Shake :");
								quantity=input.nextInt();
								bill+=80*quantity;
								item_name[i]="Chocalate Milk Shake \t 50Rs";
								item_quantity[i]=quantity;
								amount[i]=50*quantity;
								i++;
								break;
								
							default:
								System.out.println("Select Proper Menu\n");
						}
						System.out.print(">>>>>>>> Have more order with Cold Drinks (Y/N):");
						answer1=input.next().charAt(0);
						
					}while(answer1=='Y' || answer1=='y');
					break;
					
				default:
					System.out.println("Select Proper Menu\n");
			}
			
			System.out.print("<<<<<<<< Do you have more order (Y/N):");
			answer=input.next().charAt(0);
			
		}while(answer=='Y' || answer=='y');
		
		System.out.println("\t\t=*=*=*=*=*=*=*=* Your BILL =*=*=*=*=*=*=*=*");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Sr.No \t\t "
				+ "Item Name \t\t "
				+ "Rate \t\t "
				+ "Quantity \t\t"
				+ "Amount \n");
		System.out.println("--------------------------------------------------------------------------------------");
		for(int j=0;j<i;j++)
		{
			System.out.println(+(j+1)+"\t\t "+item_name[j]+"\t\t "+item_quantity[j]+"\t\t\t"+amount[j]+"Rs"); // Printing bill
		}
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("\n\t\t Total amount \t\t\t\t\t\t\t"+bill+"Rs");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Thank you for coming \n");
	}
}

    

