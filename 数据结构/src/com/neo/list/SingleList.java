package com.neo.list;
/**
 * 链式存储结构定义
 */
class Node{
	//指针
	Node next;
	//数据域
	int data;
	Node(){}
	Node(int data){
		this.data = data;
	}
}
/**
 * 单链表的实现
 * @author le
 */
public class SingleList {
	
	private Node head = null;
	private int size = 0;
	SingleList(int n){
		head = new Node(n);
		size++;
	}
	//头插法建立单链表,每次插入时，插入到头结点后面，从头开始，先插入的后被访问
	public void inser_Head(int n){
		Node newNode = new Node(n);
		newNode.next = head.next;
		head.next = newNode;
		size++;
	}

	//尾插法,每次插入时，都直接插在离头结点最远的结点后面，从头开始，先插入的先被访问
	public void insert_Tail(int n){
		//记录当前指向的结点
		Node curNode= head;
		Node newNode = new Node(n);
		if( curNode.next == null ){	//第一次插入
			newNode.next = curNode.next;
			curNode.next = newNode;
			size++;
			return;					//结束，这个自己写会容易忘得
		}
		while( curNode.next != null ){
			curNode = curNode.next;
		}
		newNode.next = curNode.next;
		curNode.next = newNode;
		size++;
	}
	/**
	 * 在带头结点单链表中查找第i个元素,找到则返回该结点，否则为空
	 * @param index	链表中的位置
	 * @return
	 */
	public Node get(int index){
		Node curNode = head;
		int i = 0;
		while( i < index && curNode != null){
			curNode = curNode.next;
			i++;
		}
		return curNode;
	}
	/**
	 * 
	 * @param index 删除第index个结点
	 * @return	成功返回true,失败返回false
	 */
	public Boolean delete(int index){
		if( index < 1 || index > Size() ){
			return false;
		}
		if( index == 1 ){
			head = head.next;
			size--;
			return true;
		}
		Node curNode = get(index);
		Node preNode = get(index - 1);
		preNode.next = curNode.next;
		curNode = null;
		size--;
		return true;
	}
	/**
	 * 
	 * @return	链表的长度
	 */
	public int Size(){
		return size;
	}
	public void displayAllNodes() {  
		Node current = head;  
		while (current.next != null) {  
			System.out.println(current.next.data);
			current = current. next;  
		}  
	}  
}
