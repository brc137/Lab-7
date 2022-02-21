import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//Lab 7 Starter file
public class Lab7
{


	public static void main( String args[] ) throws Exception
	{
		if (args.length < 1 )
		{
			System.out.println("usage: $ java Lab7 Requires a filename to read from!");
			System.exit(0);
		}

		//Create your arraylist
		ArrayList<Integer> list = new ArrayList<Integer>();
		// Create a scanner to read from the keyboard
		Scanner keyboard = new Scanner(System.in);
		// Create a scanner to read from the file
		Scanner reader = new Scanner(new File(args[0]));
		//File Read Loop
		while (reader.hasNextInt())
			{
			// add item to arraylist
				list.add(reader.nextInt());
		// end loop
			}

		//call printArrayList
		System.out.println(list);
        //output a message including the length of the arraylist
		System.out.println("The Length of the Array List is "+list.size());
		//prompt user to enter the numeric value they would like to remove
		System.out.print("Enter a numeric value you would like to remove: ");
		Integer remove = keyboard.nextInt();
		//create a 'target' variable to hold the value user would like to remove
		int target = list.indexOf(remove);
		//remove item from arraylist, you will need to determine the indexOf of your 'target' first
		list.remove(remove);
		//call printArrayList;
		System.out.println(list);
		//output a message including the length of the arraylist
		System.out.println("The length of the Array List is " + list.size());

	} // END MAIN

	// ############################################################################################################



	static void printArrayList( ArrayList<Integer> array  )
    {
        // use an enhanced for loop to output each item of the arraylist
    }

} // END CLASS
