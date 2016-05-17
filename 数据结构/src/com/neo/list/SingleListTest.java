package com.neo.list;

public class SingleListTest {
	public static void main(String []args){
		System.out.println("==========头插法===========");
		SingleList list = new SingleList(0);
		list.inser_Head(1);
		list.inser_Head(2);
		list.inser_Head(3);
		System.out.println("===before delete===");
		list.displayAllNodes();
		
		System.out.println("===after delete====");
		System.out.println(list.delete(2));
		list.displayAllNodes();
		
		System.out.println("===========尾插法==========");
		SingleList list1 = new SingleList(0);
		list1.insert_Tail(1);
		list1.insert_Tail(2);
		list1.insert_Tail(3);
		list1.displayAllNodes();
	}
}
