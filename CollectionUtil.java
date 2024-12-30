package colliction;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionUtil<T>
{
	public Collection<T> chooseCollectionType()
	{
		Collection<T> col = null;
		Scanner sc = new Scanner (System.in);
		System.out.println("1 for Array List");
		System.out.println("2 for Linked List");
		System.out.println("3 for vector");
		System.out.println("4 for Priority queue");
		System.out.println("5 for array deque");
		System.out.println("6 for Tree Set");
		System.out.println("7 for Hash Set");
		System.out.println("8 for Linked Hash set");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1 : col = new ArrayList<T>();
					break;
		case 2 : col = new LinkedList<T>();
					break;
		case 3 : col = new Vector<T>();
					break;
		case 4 : col = new PriorityQueue<T>();
					break;
		case 5 : col = new ArrayDeque<T>();
					break;
		case 6 : col = new TreeSet<T>();
					break;
		case 7 : col = new HashSet<T>();
					break;
		case 8 : col = new LinkedHashSet<T>();
			
		}
		
		return col;
		
	}
	

}
