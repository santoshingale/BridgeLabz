package com.bridgelabz.data_structure_programs.unordered_list;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.util.Util;


public class UnOrderedList {
	static Node head,prev = null;
	public static Node push(String data) {
		Node newNode=new Node(data);
		if(head == null){
			head = newNode;
		}
		else {
			System.out.println("newNode");
		newNode.next=head;
		head = newNode;
		}
		return head;
	}
	public static void pop(String key) {
		Node node = head;
		if (node != null && node.data == key) { 
            head = node.next;
            return; 
        }
	
		while(node != null && node.data != key) { 
			prev = node;
			node = node.next;
		}
		if(node == null ) {
			return;
		}
		prev.next = node.next;
	}
	public static void search(String string){
		Node current = head;
		int flag = 0;
		while(current!= null){
			
			if(current.data.equals(string)){
				flag++;
				System.out.println(current.data);
				pop(current.data);
				break;
				
			}
			current = current.next;
		}
		if(flag == 0)
		{
			head = push(string);
		}
	}
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
			head = push(stringArray[i]);
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
			while(head!=null){
				fileWriter.write(head.data);
				fileWriter.write(" ");
				head = head.next;
			}
			fileWriter.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		readFile();
		System.out.println("Enter key you want to search");
		Util util = new Util();
		
		search(util.getString());
		saveData(head);
		
		

	}

}
