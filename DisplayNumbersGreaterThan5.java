

import java.io.*;       
import java.util.Scanner;				//The First two lines tells about importing required package




class DisplayNumbersGreaterThan5					//class definition of DisplayNumbersGreaterThan5 class begins
 {

   public static void main(String args[])		//main method definition begins
    {



	//In this program, some integer values are accepted from user & assigned to an integer array.


        //To display Numbers in the integer array that are greater than 5 as output.

      
        //declaring variables
  
	int numbersArray[]=new int[20];		//this array can hold upto 20 integer values.
	short size=0;

	

        System.out.println("\n Program Description: This program displays numbers of the integer array \n that is/are greater than 5. ");

       

	Scanner in = new Scanner(System.in);

        	
	System.out.println(" Enter the size of the array(maximum size is 20) : ");
	
	size=in.nextShort();							 //getting size of array. value can be upto 20.



	System.out.println("\n Enter the Values: ");
        
	for(int i=0;i<size;i++)
         {

	   numbersArray[i]=in.nextInt();           				//accepting Integer Values for the array. 

         }


        System.out.println("\n Output: ");					//displaying output
        System.out.println(" ------- ");

	
	System.out.println("\n The integer numbers that have been assigned to the array are as follows: \n");


        for(int i=0;i<size;i++)						//for loop begins
         {

           System.out.println("Index Position of the Number: "+i+", Number Value: "+numbersArray[i]);

	
	 }								//for loop ends




	
        System.out.println("\n Following is/are the Number(s) greater than 5 in the integer array:  \n\n");





        for(int i=0;i<size;i++) 					//for loop begins. It checks for numbers that is/are greater than 5.
         {


	   if((numbersArray[i]>5))					//if condition statement begins
            {
        
             System.out.println(" "+numbersArray[i]+".");

	    }								//if condition statement ends
	   

         }								//for loop ends


      	
        
        System.out.println("\n\n-------------------------------------------------------------- ");


     }	//end of main method


 }    //end of class DisplayNumbersGreaterThan5
