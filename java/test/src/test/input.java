package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class input {
	
	private static String inpuText = "absdflkjsd"; 
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
//		Scanner sc= new Scanner(new File("res/test.txt"));
		Scanner sc1= new Scanner(inpuText);
//		
//		String input = sc.next();
		String input1 = sc1.next();
//		
//		System.out.println(input);
		System.out.println(input1);

		BufferedReader br = new BufferedReader(new FileReader("res/test.txt"));
		
		String input2 = br.readLine();
		
		System.out.println(input2);
	}
	

}
