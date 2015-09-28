
import java.io.*;
import java.util.Scanner;			//The First two lines tells about importing required packages


class UserInfo					//class definition of UserInfo class begins
 {

   public static void main(String args[]) throws java.io.IOException	//main method definition begins
    {

      
        //declaring variables
  
	String name;
	short age;
	float height;
	short choice=1;

        System.out.println("\n Program Description: This program accepts Name, Age, Height from \n user & prints it. ");

	Scanner in = new Scanner(System.in);
	
	
	
	while(choice==1)							//beginning of while loop
         {

   

	   System.out.println("\nEnter your name: ");	   

	   name=in.nextLine();							//Getting Name


	   System.out.println("Enter your age: ");
	
	   age=in.nextShort();							//Getting Age

	   System.out.println("Enter your height: ");
	
	   height=in.nextFloat();						//Getting Height

        	
        

           System.out.println("\n Output: ");					//displaying output
           System.out.println(" ------- ");


           System.out.println("\n Your Name: "+name+", age: "+age+", height: "+height);

           System.out.println("\n Would you like to continue ? Press \'1\' to continue or Press any other number to Quit...");

	   choice=in.nextShort();						//accept choice to continue or quit!

	   in.nextLine();   			                               

	   System.out.println(" ------- ");

        
         }									//end of while loop


     }	//end of main method


 }    //end of class UserInfo

