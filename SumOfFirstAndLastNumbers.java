

import java.io.*;       
import java.util.Scanner;				//The First two lines tells about importing required package





class SumOfFirstAndLastNumbers					//class definition of SumOfFirstAndLastNumbers class begins
 {

   public static void main(String args[])		//main method definition begins
    {



	//In this program, some integer values are accepted from user & assigned to an integer array.

        //The Sum of First and Last Numbers in the integer array is calculated and printed as output.

      
        //declaring variables
  
	
	int numbersArray[]=new int[20];		//this array can hold upto 20 integer values.
	int sumOfNumbers=0;
	short size=0;


        System.out.println("\n Program Description: This program sums up First & Last numbers in an \n integer array & prints it. ");

       

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

           System.out.println(" "+numbersArray[i]);

	   if((i==0)||(i==(size-1)))					        //if condition statement begins
            {

              sumOfNumbers+=numbersArray[i];

	    }								//if condition statement ends

         }								//for loop ends


	System.out.println("\n\n The Sum of First and Last numbers in the integer array is :  "+sumOfNumbers);	
	
      	
        
        System.out.println("\n\n-------------------------------------------------------------- ");


     }	//end of main method


 }    //end of class SumOfFirstAndLastNumbers
