import java.util.*;

public class Input {

	/**
	* class P3
	* This program takes in words and are sorted into ascending and descending 
	* order. Type char is used for the choice of whether to continue or not.
	* Type string is used for the words that the user inputs. Also type string is
	* used for tmpStrng which is used for bubblesort. This program will print out
	* the words in case insensitive order.
	**/

	/** 
	 * Displays the sorted words by calling the respective methods.
	**/
	  public static void main ( String [] args )
	  {
	     char choice;				//Repeats program
	     String str = "";				//Input sentence
	     String inputStr;				//This String reads input
	     Scanner scan = new Scanner ( System.in );	//Scans from keyboard
	     
	     do
	     {
		System.out.print ("Enter your words to (case insensitive) sort: ");
		inputStr = scan.nextLine();		//Reads user input

		ascendSortStr(inputStr);		//Ascending sorted words

		descendSortStr(inputStr);		//Descending sorted words

		System.out.print ("\nWant more sorting (y/n)? ");
		str = scan.next();			//Reads and assigns to string
		choice = str.charAt(0);
		if( scan.hasNextLine() );
		  str = scan.nextLine ();
	     }while( choice != 'n' && choice != 'N');	//Repeat until 'n' or 'N'

	     scan.close();				//Closes scanner
	     System.exit(0);

	  }

	/**
	 * Takes in the user input and sorts it in ascending order using bubble sort.
	 * i and j are declared to int and tmpStrg is declared to String.
	**/
	  public static void ascendSortStr (String words)
	  {
	     String tmpStrg = "";				//Used for swap
	     String [] a    = words.split(" +");		//Delimit mult space
	     String [] orig = words.split(" +");		//Original words

	     for ( int i = 0 ; i < a.length - 1 ; ++i )		//Compares two elements
	       for ( int j = a.length - 1 ; i < j ; --j )
		  if ( a[j].compareToIgnoreCase(a[j-1]) < 0 )	//If statement compare
		  {
		    tmpStrg = a[j-1];				//The swap with tmpStrg
		    a[j-1] = a[j];
		    a[j] = tmpStrg;
		  }
	     System.out.print("Ascending Sort: ");
	     for(int i = 0 ; i < a.length ; i++)		//For loop to print
	       {
	         System.out.print(" " + a[i]);			//Prints the array
	       }
	     System.out.println("");
	  }

	/**
	 * Takes in user input and sorts in descending order with bubble sort.
	 * i and j are declared to int and tmpStrg is declared to type String.
	**/
	  public static void descendSortStr (String words)
	  {
	    String tmpStrg = "";
	    String [] a    = words.split(" +");
	    String [] orig = words.split(" +");

	    for( int i = 0 ; i < a.length; i++) 		//Compares two elements
	        for( int j = 0; j < a.length - 1 - i; j++) 	
	            if( a[j].compareToIgnoreCase(a[j+1]) < 0)   //If statement compare
	            {
	                tmpStrg = a[j];				//The swap with tmpStrg
	                a[j] = a[j+1];
	                a[j+1] = tmpStrg;
		    }
	    System.out.print("Descending sort:");
	    for(int i = 0 ; i < a.length ; i++)			//For loop to print
	      {
	        System.out.print(" " + a[i]);			//Prints array
	      }
	    System.out.println("");
	  }
	}
