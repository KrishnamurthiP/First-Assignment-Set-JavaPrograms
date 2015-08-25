

import java.io.*;       //The First line tells about importing required package




class SumOfNumbers					//class definition of SumOfNumbers class begins
 {

   public static void main(String args[])		//main method definition begins
    {



	//In this program, a sample of 10 integer values are assigned to an integer array.

        //The Sum of all 10 numbers in the integer array is calculated and printed as output.

      
        //declaring variables
  
	
	int numbersArray[]={10,20,30,40,50,60,70,80,90,100};
	int sumOfNumbers=0;


        System.out.println("\n This program sums up all numbers in an integer array & prints it. ");
        System.out.println(" ----------------------------------------------------------------- ");

       

	System.out.println("\n-------------------------------------------------------------- ");

        System.out.println("\n Output: ");					//displaying output
        System.out.println(" ------- ");

	
	System.out.println("\n 10 integer numbers that have been assigned to the array are as follows: \n");


        for(int i=0;i<10;i++)					//for loop begins
         {

           System.out.println(" "+numbersArray[i]);

           sumOfNumbers+=numbersArray[i];


         }							//for loop ends


	System.out.println("\n\n The Sum of all the 10 available numbers in the integer array is :  "+sumOfNumbers);	
	
      	
        
        System.out.println("\n\n-------------------------------------------------------------- ");


     }	//end of main method


 }    //end of class SumOfNumbers
