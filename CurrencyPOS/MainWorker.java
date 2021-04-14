import java.io.*;
import java.util.*;

public class MainWorker {

	static Scanner uI = new Scanner (System.in);
	static int [] bases = new int [8];
	static int [] currents = new int [8];
	
	public static void main(String[]args)
	{
		readFromFile();
		work(0);
	}
	private static void work(int num) {
		
		if(num ==9)
		{
			result();
		}
		else
		{
		int cur = currents[num];
		
		work(num++);
		}
	}
	private static void result() {
		// TODO Auto-generated method stub
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
