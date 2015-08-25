

import java.io.*;       //The First line tells about importing required package




class SumOfFirstAndLastNumbers					//class definition of SumOfFirstAndLastNumbers class begins
 {

   public static void main(String args[])		//main method definition begins
    {



	//In this program, a sample of 10 integer values are assigned to an integer array.

        //The Sum of First and Last Numbers in the integer array is calculated and printed as output.

      
        //declaring variables
  
	
	int numbersArray[]={10,20,30,40,50,60,70,80,90,100};
	int sumOfNumbers=0;


        System.out.println("\n This program sums up First & Last numbers in an integer array & prints it. ");
        System.out.println(" -------------------------------------------------------------------------- ");

       

	System.out.println("\n-------------------------------------------------------------- ");

        System.out.println("\n Output: ");					//displaying output
        System.out.println(" ------- ");

	
	System.out.println("\n 10 integer numbers that have been assigned to the array are as follows: \n");


        for(int i=0;i<10;i++)						//for loop begins
         {

           System.out.println(" "+numbersArray[i]);

	   if((i==0)||(i==9))					        //if condition statement begins
            {

              sumOfNumbers+=numbersArray[i];

	    }								//if condition statement ends

         }								//for loop ends


	System.out.println("\n\n The Sum of First and Last numbers in the integer array is :  "+sumOfNumbers);	
	
      	
        
        System.out.println("\n\n-------------------------------------------------------------- ");


     }	//end of main method


 }    //end of class SumOfFirstAndLastNumbers
