package com.swiggy.order_management;

import java.util.*;
public class Swiggy_order {

	public static void main(String[] args) 
	{
		System.out.println("        ***********  Hotel Management Swiggy  ***********      ");
		hotel();
	}
	static Scanner sc=new Scanner(System.in);
	static int hotel_num,food_num,quantity,total=0,pay_num,amount,otp_check,count=0,res;
	static int cb,mb,c65,parota,meals,curd_rice,lemon,grill;
	static String another;
	static int dish;
	static ArrayList<Integer> food=new ArrayList<>();
	static ArrayList<String> food_name=new ArrayList<>();
	public static void hotel()
	{
		System.out.println("List of Hotels");
		System.out.println(" 1.Ambur Star Briyani  \n 2.Dindigul Thalappakatti  \n 3.Salem RR Briyani  \n 4.A2B Restaurant  \n 5.Exit");
		System.out.println(" Enter the Hotel Number:");
		hotel_num=sc.nextInt();
		switch(hotel_num)
		{
		case 1: ambur();
				break;
		case 2: dindigul();
				break;
		case 3: salem();
				break;
		case 4: a2b();
				break;  
		case 5: exit();
				break;
		default: System.out.println("Enter the correct Option:");
				 hotel();
		}
	}
	
//	ambur star briyani hotel
	
	public static void ambur()
	{
		cb=180;
		mb=350;
		c65=120;
		System.out.println(" welcome to Ambur Star Briyani Hotel");
		System.out.println("       ***** Food Menu *****        ");
		System.out.println(" 1.Chicken Briyani ---> "+cb+"₹  \n 2.Mutton Briyani  ---> "+mb+"₹ \n 3.Chicken 65      ---> "+c65+"₹ \n 4.exit");
		System.out.println(" Enter The Food Number:");
		food_num=sc.nextInt();
		switch(food_num)
		{
		case 1: System.out.println(" Chicken Briyani");
				Quantity();
				System.out.println(" Chicken Briyani Added");
				dish=cb*quantity;
				food_name.add(" Chicken Briyani        "+cb+"         "+quantity+"                 "+dish);
				food.add(dish);
				System.out.println(" Do you want to add Another Dish Enter Yes (OR) No");
				another=sc.next();
				if(another.equals("yes"))
				{
					ambur();
				}
				else
				{
					cart();
				}
				break;
				
		case 2: System.out.println(" Mutton Briyani");
				Quantity();
				System.out.println(" Mutton Briyani Added");
				dish=mb*quantity;
				food.add(dish);
				food_name.add(" Mutton Briyani         "+mb+"         "+quantity+"                 "+dish);
				System.out.println(" Do you want to add Another Dish Enter Yes (OR) No");
				another=sc.next();
				if(another.equals("yes"))
				{
					ambur();
				}
				else
				{
					cart();
				}
				break;
						
		
		case 3: System.out.println(" Chicken 65");
				Quantity();
				System.out.println(" Chicken 65 Added");
				dish=c65*quantity;
				food_name.add(" Chicken 65             "+c65+"         "+quantity+"                 "+dish);
				food.add(dish);
				System.out.println(" Do you want to add Another Dish Enter Yes (OR) No");
				another=sc.next();
				if(another.equals("yes"))
				{
					ambur();
				}
				else
				{
					cart();
				}
				break;
				
		case 4:
				food.clear();
				food_name.clear();
				total=0;
				hotel();
				break;
		
		default: System.out.println("Enter the correct Option:");
				 ambur();
		}
	}
	
//	dindigul thalappakatti hotel
	
	public static void dindigul()
	{
		cb=200;
		mb=380;
		grill=120;
		System.out.println("welcome to Dindigul Thalappakatti Hotel");
		System.out.println("       ***** Food Menu *****        ");
		System.out.println(" 1.Chicken Briyani ---> "+cb+"₹  \n 2.Mutton Briyani  ---> "+mb+"₹ \n 3.Grill           ---> "+grill+"₹ \n 4.exit");
		System.out.println(" Enter The Food Number:");
		food_num=sc.nextInt();
		switch(food_num)
		{
		case 1: System.out.println(" Chicken Briyani");
				Quantity();
				System.out.println(" Chicken Briyani Added");
				dish=cb*quantity;
				food_name.add(" Chicken Briyani        "+cb+"         "+quantity+"                 "+dish);
				food.add(dish);
				System.out.println(" Do you want to add Another Dish Enter Yes (OR) No");
				another=sc.next();
				if(another.equals("yes"))
				{
					dindigul();
				}
				else
				{
					cart();
				}
				break;
				
		case 2: System.out.println(" Mutton Briyani");
				Quantity();
				System.out.println(" Mutton Briyani Added");
				dish=mb*quantity;
				food.add(dish);
				food_name.add(" Mutton Briyani         "+mb+"         "+quantity+"                 "+dish);
				System.out.println(" Do you want to add Another Dish Enter Yes (OR) No");
				another=sc.next();
				if(another.equals("yes"))
				{
					dindigul();
				}
				else
				{
					cart();
				}
				break;
						
		
		case 3: System.out.println(" Grill");
				Quantity();
				System.out.println(" Grill Added");
				dish=grill*quantity;
				food_name.add(" Grill                  "+grill+"         "+quantity+"                 "+dish);
				food.add(dish);
				System.out.println(" Do you want to add Another Dish Enter Yes (OR) No");
				another=sc.next();
				if(another.equals("yes"))
				{
					dindigul();
				}
				else
				{
					cart();
				}
				break;
				
		case 4:
				food.clear();
				food_name.clear();
				total=0;
				hotel();
				break;
		
		default: System.out.println("Enter the correct Option:");
				 dindigul();
		}
	}
	
//	salem RR biriyani hotel
	
	public static void salem()
	{
		cb=220;
		mb=400;
		parota=50;
		System.out.println("welcome to Salem RR Briyani Hotel");
		System.out.println("       ***** Food Menu *****        ");
		System.out.println(" 1.Chicken Briyani ---> "+cb+"₹  \n 2.Mutton Briyani  ---> "+mb+"₹ \n 3.Parotta         ---> "+parota+"₹ \n 4.exit");
		System.out.println(" Enter The Food Number:");
		food_num=sc.nextInt();
		switch(food_num)
		{
		case 1: System.out.println(" Chicken Briyani");
				Quantity();
				System.out.println(" Chicken Briyani Added");
				dish=cb*quantity;
				food_name.add(" Chicken Briyani        "+cb+"         "+quantity+"                 "+dish);
				food.add(dish);
				System.out.println(" Do you want to add Another Dish Enter Yes (OR) No");
				another=sc.next();
				if(another.equals("yes"))
				{
					salem();
				}
				else
				{
					cart();
				}
				break;
				
		case 2: System.out.println(" Mutton Briyani");
				Quantity();
				System.out.println(" Mutton Briyani Added");
				dish=mb*quantity;
				food.add(dish);
				food_name.add(" Mutton Briyani         "+mb+"         "+quantity+"                 "+dish);
				System.out.println(" Do you want to add Another Dish Enter Yes (OR) No");
				another=sc.next();
				if(another.equals("yes"))
				{
					salem();
				}
				else
				{
					cart();
				}
				break;
						
		
		case 3: System.out.println(" Parotta");
				Quantity();
				System.out.println(" Parotta Added");
				dish=parota*quantity;
				food_name.add(" Parotta                "+parota+"          "+quantity+"                 "+dish);
				food.add(dish);
				System.out.println(" Do you want to add Another Dish Enter Yes (OR) No");
				another=sc.next();
				if(another.equals("yes"))
				{
					salem();
				}
				else
				{
					cart();
				}
				break;
				
		case 4:
				food.clear();
				food_name.clear();
				total=0;
				hotel();
				break;
		
		default: System.out.println("Enter the correct Option:");
				 salem();
		}
	}
	
//	a2b restaurant
	
	public static void a2b()
	{
		meals=150;
		curd_rice=100;
		lemon=80;
		System.out.println("welcome to A2B Restaurant");
		System.out.println("       ***** Food Menu *****        ");
		System.out.println(" 1.Meals           ---> "+meals+"₹  \n 2.Curd Rice       ---> "+curd_rice+"₹ \n 3.Lemon Rice      ---> "+lemon+"₹ \n 4.exit");
		System.out.println(" Enter The Food Number:");
		food_num=sc.nextInt();
		switch(food_num)
		{
		case 1: System.out.println(" Meals");
				Quantity();
				System.out.println(" Meals Added");
				dish=meals*quantity;
				food_name.add(" Meals                  "+meals+"         "+quantity+"                 "+dish);
				food.add(dish);
				System.out.println(" Do you want to add Another Dish Enter Yes (OR) No");
				another=sc.next();
				if(another.equals("yes"))
				{
					a2b();
				}
				else
				{
					cart();
				}
				break;
				
		case 2: System.out.println(" Curd Rice");
				Quantity();
				System.out.println(" Curd Rice Added");
				dish=curd_rice*quantity;
				food.add(dish);
				food_name.add(" Curd Rice              "+curd_rice+"         "+quantity+"                 "+dish);
				System.out.println(" Do you want to add Another Dish Enter Yes (OR) No");
				another=sc.next();
				if(another.equals("yes"))
				{
					a2b();
				}
				else
				{
					cart();
				}
				break;
						
		
		case 3: System.out.println(" Lemon Rice");
				Quantity();
				System.out.println(" Lemon Rice Added");
				dish=lemon*quantity;
				food_name.add(" Lemon Rice             "+lemon+"          "+quantity+"                 "+dish);
				food.add(dish);
				System.out.println(" Do you want to add Another Dish Enter Yes (OR) No");
				another=sc.next();
				if(another.equals("yes"))
				{
					a2b();
				}
				else
				{
					cart();
				}
				break;
				
		case 4:
				food.clear();
				food_name.clear();
				total=0;
				hotel();
				break;
		
		default: System.out.println("Enter the correct Option:");
				 a2b();
		}
		
	}
	
//	exit
	
	public static void exit()
	{
		System.out.println("Thank You..! Visit Again..!");
	}
	
//	quantity of the food
	
	public static void Quantity()
	{
		System.out.println(" Enter the Quantity of the food:");
		quantity=sc.nextInt();
	}

//	cart to display
	
	public static void cart()
	{
		System.out.println("------------------------------------------------------------------");
		System.out.println(" Food Name             Price     Quantity            Total");
		System.out.println("------------------------------------------------------------------");
		for(int i=0;i<food_name.size();i++)
		{
			System.out.println(food_name.get(i));
		}
		for(int j=0;j<food.size();j++)
		{
			 total+=food.get(j);
		}
		System.out.println("------------------------------------------------------------------");
		System.out.println("                                      Total Amount:   "+total+" ₹");
		System.out.println("------------------------------------------------------------------");
		payment();
	}
	
//	payment
	
	public static void payment()
	{
		System.out.println(" Payment Methods");
		System.out.println(" 1.Gpay   \n 2.Paytm   \n 3.Phonepe  \n 4.exit");
		System.out.println(" Enter the Payment Method Number:");
		pay_num=sc.nextInt();
		switch(pay_num)
		{
		case 1: System.out.println(" ***** Welcome to Gpay *****");
				System.out.println(" The Total Amount is: "+total+" \n Enter the Amount:");
				amount=sc.nextInt();
				if(amount==total)
				{
					System.out.println(" Payment is Processing.......");
					try {
						Thread.sleep(10000);
						System.out.println(" Payment Successfully...!");
						otp();
					} 
					catch (InterruptedException e) 
					{
						System.out.println(" Try Again");
					}
				}
				else
				{
					System.out.println(" Payment Faild Enter the Currect Amount");
					payment();
				}
				break;
				
		case 2: System.out.println(" ***** Welcome to Paytm *****");
				System.out.println(" The Total Amount is: "+total+" \n Enter the Amount:");
				amount=sc.nextInt();
				if(amount==total)
				{
					System.out.println(" Payment is Processing.......");
					try {
						Thread.sleep(10000);
						System.out.println(" Payment Successfully...!");
						otp();
					} 
					catch (InterruptedException e) 
					{
						System.out.println(" Try Again");
					}
				}
				else
				{
					System.out.println(" Payment Faild Enter the Currect Amount");
					payment();
				}
				break;
		
		case 3: System.out.println(" ***** Welcome to Phonepe *****");
				System.out.println(" The Total Amount is: "+total+" \n Enter the Amount:");
				amount=sc.nextInt();
				if(amount==total)
				{
					System.out.println(" Payment is Processing.......");
					try {
						Thread.sleep(10000);
						System.out.println(" Payment Successfully...!");
						otp();
					} 
					catch (InterruptedException e) 
					{
						System.out.println(" Try Again");
					}
					
				}
				else
				{
					System.out.println(" Payment Faild Enter the Currect Amount");
					payment();
				}
				break;
				
		case 4: hotel();
				break;
				
		default: System.out.println(" Enter the correct Option:");
				 payment();
				
		}
	}
	
//	otp generation
	
	public static void otp()
	{
		double otps=Math.random()*999+999;
		res=(int)otps;
		otpcheck();
	}
	
//	otp check
	
		public static void otpcheck()
		{
			System.out.println(" One Time Password: "+res);
			System.out.println(" Enter the OTP: ");
			otp_check=sc.nextInt();
			if(otp_check==res)
			{
				System.out.println(" Your order is Recived");
				System.out.println(" Thank You ..! Visit Again ..!");
			}
			else
			{
				count++;
				if(count>2)
				{
					payment();
				}
				else
				{
					System.out.println(" Wrong OTP Enter the Correct OTP:");
					otpcheck();
				}		
			}
			
		}
}
