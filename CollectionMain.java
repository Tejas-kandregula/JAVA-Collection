package colliction;

import java.util.Collection;
import java.util.Scanner;

public class CollectionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Choose the data type");
		System.out.println("1 for int ");
		System.out.println("2 for float");
		System.out.println("3 for double");
		System.out.println("4 for char");
		System.out.println("5 for String");
		int type = sc.nextInt();
		switch (type) {
		case 1:{
			 CollectionUtil<Integer> util = new CollectionUtil<Integer>();
				Collection<Integer> col = new CollectionUtil<Integer>().chooseCollectionType();
				do {
					System.out.println("Enter 1 for Add an eleent");
					System.out.println("Enter 2 for Remove an element");
					System.out.println("Enter 3 for Display all elements");
					System.out.println("Enter 4 for size");
					System.out.println("Enter 5 to check empty or not");
					System.out.println("Enter 6 for particular element ");
					System.out.println("Enter 7 to clear ");
					System.out.println("Enter 8 for array type");
					int choice = sc.nextInt();
					switch(choice)
					{
					case 1 : {System.out.println("Enter the num of elements");
								int size = sc.nextInt();
								for(int i=1;i<=size;i++)
								{
									System.out.println("Enter the element");
									int ele = sc.nextInt();
									col.add(ele);
								}
					
						break;
					}
					case 2 : {	System.out.println("Enter the element to remove");
								int ele = sc.nextInt();
								col.remove(ele);
						break;
					}
					case 3 : {	System.out.println(col);
					
						break;
					}
					case 4 : { System.out.println(col.size());
						break;
					}
					case 5 : { System.out.println(col.isEmpty());
						break;
					}
					case 6 : { 	System.out.println("Enter the element to search");
								int ele = sc.nextInt();
								System.out.println(col.contains(ele));
						break;
					}
					case 7 : { col.clear();
						break;
					}
					case 8 : { Object[] a = col.toArray();
								System.out.println(a);
						break;
					}
					
					}
					System.out.println("Press Y to continue");
					System.out.println("Press N to Stop");
				} while (sc.next().charAt(0)=='Y');
		}
			break;
	
		case 2:	{
			CollectionUtil<Float> util = new CollectionUtil<Float>();
			Collection<Float> col = new CollectionUtil<Float>().chooseCollectionType();
			do {
				System.out.println("Enter 1 for Add an eleent");
				System.out.println("Enter 2 for Remove an element");
				System.out.println("Enter 3 for Display all elements");
				System.out.println("Enter 4 for size");
				System.out.println("Enter 5 to check empty or not");
				System.out.println("Enter 6 for particular element ");
				System.out.println("Enter 7 to clear ");
				System.out.println("Enter 8 for array type");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1 : { System.out.println("Enter the num of elements");
							int size = sc.nextInt();
							for(int i=1;i<=size;i++)
							{
								System.out.println("Enter the element");
								float ele = sc.nextFloat();
								col.add(ele);
				}
					break;
				}
				case 2 : { System.out.println("Enter the element to remove");
							float ele = sc.nextFloat();
							col.remove(ele);
					break;
				}
				case 3 : { System.out.println(col);
					break;
				}
				case 4 : { System.out.println(col.size());
					break;
				}
				case 5 : { System.out.println(col.isEmpty());
					break;
				}
				case 6 : { System.out.println("Enter the element to search");
							float ele = sc.nextFloat();
							System.out.println(col.contains(ele));
					break;
				}
				case 7 : { col.clear();
					break;
				}
				case 8 : { Object[] a = col.toArray();
							System.out.println(a);
					break;
				}
				
				}
				System.out.println("Press Y to continue");
				System.out.println("Press N to Stop");
			} while (sc.next().charAt(0)=='Y');
		break;
		}
		case 3: {
			CollectionUtil<Double> util = new CollectionUtil<Double>();
			Collection<Double> col = new CollectionUtil<Double>().chooseCollectionType();
			do {
				System.out.println("Enter 1 for Add an eleent");
				System.out.println("Enter 2 for Remove an element");
				System.out.println("Enter 3 for Display all elements");
				System.out.println("Enter 4 for size");
				System.out.println("Enter 5 to check empty or not");
				System.out.println("Enter 6 for particular element ");
				System.out.println("Enter 7 to clear ");
				System.out.println("Enter 8 for array type");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1 : { System.out.println("Enter the num of elements");
							int size = sc.nextInt();
							for(int i=1;i<=size;i++)
							{
								System.out.println("Enter the element");
								double ele = sc.nextDouble();
								col.add(ele);
				}
					break;
				}
				case 2 : { System.out.println("Enter the element to remove");
							double ele = sc.nextDouble();
							col.remove(ele);
					break;
				}
				case 3 : { System.out.println(col);
					break;
				}
				case 4 : { System.out.println(col.size());
					break;
				}
				case 5 : { System.out.println(col.isEmpty());
					break;
				}
				case 6 : { System.out.println("Enter the element to search");
							double ele = sc.nextDouble();
							System.out.println(col.contains(ele));
					break;
				}
				case 7 : { col.clear();
					break;
				}
				case 8 : { Object[] a = col.toArray();
							System.out.println(a);
					break;
				}
				
				}
				System.out.println("Press Y to continue");
				System.out.println("Press N to Stop");
			} while (sc.next().charAt(0)=='Y');
		break;
		}
		case 4: {
			CollectionUtil<Character> util = new CollectionUtil<Character>();
			Collection<Character> col = new CollectionUtil<Character>().chooseCollectionType();
			do {
				System.out.println("Enter 1 for Add an eleent");
				System.out.println("Enter 2 for Remove an element");
				System.out.println("Enter 3 for Display all elements");
				System.out.println("Enter 4 for size");
				System.out.println("Enter 5 to check empty or not");
				System.out.println("Enter 6 for particular element ");
				System.out.println("Enter 7 to clear ");
				System.out.println("Enter 8 for array type");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1 : { System.out.println("Enter the num of elements");
						    int size = sc.nextInt();
							for(int i=0;i<=size-1;i++)
							{
								System.out.println("Enter the element");
								char ele = sc.next().charAt(0);
								col.add(ele);
							}
					break;
				}
				case 2 : { System.out.println("Enter the element to remove");
							char ele = sc.next().charAt(0);
							col.remove(ele);
					break;
				}
				case 3 : { System.out.println(col);
					break;
				}
				case 4 : { System.out.println(col.size());
					break;
				}
				case 5 : { System.out.println(col.isEmpty());
					break;
				}
				case 6 : { System.out.println("Enter the element to search");
							char ele = sc.next().charAt(0);
							System.out.println(col.contains(ele));
					break;
				}
				case 7 : { col.clear();
					break;
				}
				case 8 : { Object[] a = col.toArray();
							System.out.println(a);
					break;
				}
				
				}
				System.out.println("Press Y to continue");
				System.out.println("Press N to Stop");
			} while (sc.next().charAt(0)=='Y');
		break;
		}
		case 5: CollectionUtil<String> util = new CollectionUtil<String>();
				Collection<String> col = new CollectionUtil<String>().chooseCollectionType();
				do {
					System.out.println("Enter 1 for Add an eleent");
					System.out.println("Enter 2 for Remove an element");
					System.out.println("Enter 3 for Display all elements");
					System.out.println("Enter 4 for size");
					System.out.println("Enter 5 to check empty or not");
					System.out.println("Enter 6 for particular element ");
					System.out.println("Enter 7 to clear ");
					System.out.println("Enter 8 for array type");
					int choice = sc.nextInt();
					switch(choice)
					{
					case 1 : { System.out.println("Enter the num of elements");
								int size = sc.nextInt();
								for(int i=1;i<=size;i++)
								{
									System.out.println("Enter the element");
									String ele = sc.next();
									col.add(ele);
								}
						break;
					}
					case 2 : { System.out.println("Enter the element to remove");
								String ele = sc.next();
								col.remove(ele);
						break;
					}
					case 3 : { System.out.println(col);
						break;
					}
					case 4 : { System.out.println(col.size());
						break;
					}
					case 5 : { System.out.println(col.isEmpty());
						break;
					}
					case 6 : { System.out.println("Enter the element to search");
								String ele = sc.next();
								System.out.println(col.contains(ele));
						break;
					}
					case 7 : { col.clear();
						break;
					}
					case 8 : { Object[] a = col.toArray();
								System.out.println(a);
						break;
					}
					
					}
					System.out.println("Press Y to continue");
					System.out.println("Press N to Stop");
				} while (sc.next().charAt(0)=='Y');
			
		}
		
		
	}

}
// add(ele)
// remove(ele)
// display all elements
// size() : int
// isEmpty() : boolean
// contains(ele) : boolean
// clear() : void
// toArray() : Object[]
