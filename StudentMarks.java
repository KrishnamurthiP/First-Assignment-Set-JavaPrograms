
import java.io.*;
import java.util.Scanner;			//The First two lines tells about importing required packages


class StudentMarks				//class definition of StudentMarks class begins
 {

   public static void main(String args[]) throws java.io.IOException	//main method definition begins
    {

      
	//declaring variables

		

        String studentName[]=new String[15];
	short religionStudyMarks[] = new short[15];
	short tamilMarks[] = new short[15];
	short englishMarks[] = new short[15];
	short mathsMarks[] = new short[15];
	short socialMarks[] = new short[15];

        short totalMarks[] = new short[15];
	float averageOfMarks[] = new float[15];

	short indexValue=0;

        short choice=1;



        System.out.print("\n Program Description: This program accepts Student Name & Marks \n\n of 5 Subjects from Student;");
        System.out.println(" calculates total marks and average, prints them. ");


	System.out.print("\n\n Note: Name and Marks for Maximum 15 Students can be entered! \n\n");

	Scanner in = new Scanner(System.in);



	do								//do while loop begins
	 {


	   
 	   System.out.println("\n Enter your name: ");

	   studentName[indexValue]=in.nextLine();			//Getting Student Name




	   for(int i=1;i<=5;i++)				//For Loop Begins
	    {

	     switch(i)					//Switch Statement begins which is nested inside For Loop 
	     {

               case 1:

  	           System.out.println("Enter your Religious Studies Marks: ");
	
	           religionStudyMarks[indexValue]=in.nextShort();

        	   break;

	       case 2:

		   System.out.println("Enter your Tamil Marks: ");
	
	           tamilMarks[indexValue]=in.nextShort();

                   break;

	
	       case 3:

		   System.out.println("Enter your English Marks: ");
	
		   englishMarks[indexValue]=in.nextShort();

                   break;


	       case 4:

		   System.out.println("Enter your Maths Marks: ");
	
	           mathsMarks[indexValue]=in.nextShort();

                   break;


	       case 5:

		   System.out.println("Enter your Social Marks: ");
	
	           socialMarks[indexValue]=in.nextShort();

                   break;


              }							//switch Statement Ends


           }							//For Loop Ends


	  totalMarks[indexValue]=(short)(religionStudyMarks[indexValue]+tamilMarks[indexValue]+englishMarks[indexValue]+mathsMarks[indexValue]+socialMarks[indexValue]);		//calculates total marks

          averageOfMarks[indexValue]=((float)totalMarks[indexValue]/5);								//calculates average of total marks


	  System.out.println("\n Total Marks obtained in 5 Subjects: "+totalMarks[indexValue]);					//displays total marks

          System.out.println("\n Average of Marks obtained in 5 Subjects: "+averageOfMarks[indexValue]);		        //displays average of total marks


	  System.out.println("\n-------------------------------------------------------------- ");



	  System.out.println("\n Would you like to continue ? Press \'1\' to continue or Press any other number to Quit...");
	  choice=in.nextShort();

	  indexValue++;

	  in.nextLine();	  


        }while((indexValue<15)&&(choice==1));							//do while loop ends




     }	//end of main method


 }    //end of class StudentMarks
