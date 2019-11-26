package com.bridgelabz.data_structure_programs.unordered_list;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.util.Util;


public class UnOrderedList {
	static Node readFile() throws FileNotFoundException
	{
		Node head = null;
		String string = "";
		File file = new File("/Users/santoshingale/Desktop/jav1.txt") ;
		LinkedList linkedList = new LinkedList();
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()){
			string = string+scanner.nextLine();
			string += " ";
		}
		String[] stringArray = string.split(" ");
		for(int i = stringArray.length-1;i>=0;i--){
			head = linkedList.push(stringArray[i]);
		}
		return head;
	}
	public static void saveData(Node head) throws IOException
	{
		FileWriter fileWriter = new FileWriter("/Users/santoshingale/Desktop/jav1.txt");
		Node newNode = head;
		if(head == null){
			System.out.println("LinkedList is empty");
		}
		else{
			while(head!=null)
			{
				fileWriter.write(head.data);
				fileWriter.write(" ");
				head = head.next;
				
			}
			fileWriter.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		Node head = readFile();
		System.out.println("Enter key you want to search");
		Util util = new Util();
		
		LinkedList.search(util.getString());
		saveData(head);
		
		

	}

}
