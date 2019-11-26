package com.bridgelabz.data_structure_programs.unordered_list;

import java.io.FileWriter;
import java.io.IOException;

public class LinkedList {
	static Node head;
	public static Node push(String data) {
		Node newNode=new Node(data);
		if(head == null){
			head = newNode;
		}
		else {
		newNode.next=head;
		head = newNode;
		}
		return head;
	}
	public static void search(String string){
		Node current = head;
		while(current!= null){
			
			if(current.data.equals(string)){
				System.out.println("value found");
				break;
			}
			current = current.next;
		}
	}
	


}
