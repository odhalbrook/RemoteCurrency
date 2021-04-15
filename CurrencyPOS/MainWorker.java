import java.io.*;
import java.util.*;

public class MainWorker {

	static Scanner uI = new Scanner (System.in);
	static int [] bases = new int [8];
	static int [] currents = new int [8];
	static int refinei = 0;
	
	public static void main(String[]args)
	{
		readFromFile();
		System.out.println("How much does the item cost?");
		int co = uI.nextInt();
		System.out.println("How much are you giving the cashier?");
		int ra = uI.nextInt();
		refinei = ra - co;
		work(0);
	}
	private static void work(int num) 
	{
		if(num ==8)
		{
			result();
		}
		else
		{
		int ba = bases[num];
		if(ba<=refinei)
		{
			currents[num] = refinei/ba;
			
			refinei = refinei % ba;
		}
		num++;
		work(num);
		}
	}
	private static void result() {
		for (int d = 0; d<8; d++)
		{
			System.out.println(bases[d] + " = " + currents[d]);
		}
		System.exit(0);
	}
	public static void readFromFile()
	{
		 try {
			final Scanner file = new Scanner( new File( "BaseStorage" ) );
			for (int i = 0; i < 8; i++)
			 {
				 bases [i] = file.nextInt();
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}
}
