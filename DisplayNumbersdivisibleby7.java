

import java.io.*;       //The First line tells about importing required package




class DisplayNumbersdivisibleby7					//class definition of DisplayNumbersdivisibleby7 class begins
 {

   public static void main(String args[])		//main method definition begins
    {



	//In this program, a sample of 10 integer values are assigned to an integer array.

        //To display Numbers in the integer array that are divisible by 7 as output.

      
        //declaring variables
  
	
	int numbersArray[]={1,2,3,4,5,6,7,8,9,10};
	

        System.out.println("\n This program displays numbers of the integer array that is/are divisible by 7. ");
        System.out.println("\n ------------------------------------------------------------------------------ ");

       

	System.out.println("\n-------------------------------------------------------------- ");

        System.out.println("\n Output: ");					//displaying output
        System.out.println(" ------- ");

	
	System.out.println("\n 10 integer numbers that have been assigned to the array are as follows: \n");


        for(int i=0;i<10;i++)						//for loop begins
         {

           System.out.println("Index Position of the Number: "+i+", Number Value: "+numbersArray[i]);

	
	 }								//for loop ends




	System.out.println("\n\n -------------------------- ");


        System.out.println("\n Numbers that is/are divisible by 7 in the integer array is/are as follows:  \n\n");





        for(int i=0;i<10;i++) 						//for loop begins. It checks for numbers that is/are divisible by 7.
         {


	   if((numbersArray[i]%7==0))					//if condition statement begins
            {
        
             System.out.println(" "+numbersArray[i]+".");

	    }								//if condition statement ends
	
            

         }								//for loop ends


      	
        
        System.out.println("\n\n-------------------------------------------------------------- ");


     }	//end of main method


 }    //end of class DisplayNumbersdivisibleby7
