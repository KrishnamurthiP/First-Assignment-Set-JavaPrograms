
import java.io.*;
import java.util.Scanner;			//The First two lines tells about importing required packages


class StudentMarks				//class definition of StudentMarks class begins
 {

   public static void main(String args[])	//main method definition begins
    {

      
	//declaring variables

	String studentName;
	short religionStudyMarks=0,tamilMarks=0,englishMarks=0,mathsMarks=0,socialMarks=0;
	short totalMarks=0;
	float averageOfMarks;


        System.out.println("\n This program accepts Name & Marks of 5 Subjects from Student;");
	System.out.println(" -------------------------------------------------------------");
        System.out.println("	calculates total marks,average; prints them all. ");
        System.out.println("	------------------------------------------------ ");

	Scanner in = new Scanner(System.in);


	System.out.println("\n Enter your name: ");

	studentName=in.nextLine();			//Getting Student Name




	for(int i=1;i<=5;i++)				//For Loop Begins
	 {

	   switch(i)					//Switch Statement begins which is nested inside For Loop 
	    {

              case 1:

  	           System.out.println("Enter your Religious Studies Marks: ");
	
	           religionStudyMarks=in.nextShort();

        	   break;

	      case 2:

		   System.out.println("Enter your Tamil Marks: ");
	
	           tamilMarks=in.nextShort();

                   break;

	
	      case 3:

		   System.out.println("Enter your English Marks: ");
	
		   englishMarks=in.nextShort();

                   break;


	      case 4:

		   System.out.println("Enter your Maths Marks: ");
	
	           mathsMarks=in.nextShort();

                   break;


	      case 5:

		   System.out.println("Enter your Social Marks: ");
	
	           socialMarks=in.nextShort();

                   break;


            }							//switch Statement Ends


        }							//For Loop Ends



	totalMarks=(short)(religionStudyMarks+tamilMarks+englishMarks+mathsMarks+socialMarks);		//calculates total marks

        averageOfMarks=((float)totalMarks/5);								//calculates average of total marks

	
        	
        System.out.println("\n-------------------------------------------------------------- ");

        System.out.println("\n Output: ");							//displaying output
        System.out.println(" ------- ");

        System.out.println("\n Student Name: "+studentName);

        System.out.println("\n Marks: ");
	System.out.println("\n ------ ");

        System.out.println("\n Religious Studies: "+religionStudyMarks);
	System.out.println("\n             Tamil: "+tamilMarks);
	System.out.println("\n           English: "+englishMarks);
	System.out.println("\n             Maths: "+mathsMarks);
	System.out.println("\n            Social: "+socialMarks);


        System.out.println("\n Total Marks obtained in 5 Subjects: "+totalMarks);

        System.out.println("\n Average of Marks obtained in 5 Subjects: "+averageOfMarks);


        System.out.println("\n-------------------------------------------------------------- ");


     }	//end of main method


 }    //end of class StudentMarks
