

import java.io.*;       //The First line tells about importing required package




class SumOfEvenNumbers					//class definition of SumOfEvenNumbers class begins
 {

   public static void main(String args[])		//main method definition begins
    {



	//In this program, a sample of 10 integer values are assigned to an integer array.

        //The Sum of Even Numbers of the integer array is calculated and printed as output.

      
        //declaring variables
  
	
	int numbersArray[]={1,2,3,4,5,6,7,8,9,10};
	int sumOfNumbers=0;


        System.out.println("\n This program adds even numbers of the integer array & prints it. ");
        System.out.println(" ---------------------------------------------------------------- ");

       

	System.out.println("\n-------------------------------------------------------------- ");

        System.out.println("\n Output: ");					//displaying output
        System.out.println(" ------- ");

	
	System.out.println("\n 10 integer numbers that have been assigned to the array are as follows: \n");


        for(int i=0;i<10;i++)						//for loop begins
         {

           System.out.println("Index Position of the Number: "+i+", Number Value: "+numbersArray[i]);


	   if((numbersArray[i]%2)==0)					        	//if condition statement begins
            {
        
              sumOfNumbers+=numbersArray[i];

	    }								//if condition statement ends


         }								//for loop ends


	System.out.println("\n\n The Sum of even numbers of the integer array is :  "+sumOfNumbers);	
	
      	
        
        System.out.println("\n\n-------------------------------------------------------------- ");


     }	//end of main method


 }    //end of class SumOfEvenNumbers
