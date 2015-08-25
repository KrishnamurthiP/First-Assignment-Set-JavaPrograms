
import java.io.*;
import java.util.Scanner;			//The First two lines tells about importing required packages


class UserInfo					//class definition of UserInfo class begins
 {

   public static void main(String args[])	//main method definition begins
    {

      
        //declaring variables
  
	String name;
	short age;
	float height;


        System.out.println("\n This program accepts Name, Age, Height from user & prints it. ");
           System.out.println(" ------------------------------------------------------------- ");

	Scanner in = new Scanner(System.in);


	System.out.println("\n Enter your name: ");

	name=in.nextLine();							//Getting Name

	System.out.println("Enter your age: ");
	
	age=in.nextShort();							//Getting Age

	System.out.println("Enter your height: ");
	
	height=in.nextFloat();							//Getting Height

        	
        System.out.println("\n-------------------------------------------------------------- ");

        System.out.println("\n Output: ");					//displaying output
        System.out.println(" ------- ");

        System.out.println("\n Your Name: "+name);
        System.out.println("\n Your Age: "+age);
	System.out.println("\n Your Height: "+height);

        System.out.println("\n-------------------------------------------------------------- ");


     }	//end of main method


 }    //end of class UserInfo
