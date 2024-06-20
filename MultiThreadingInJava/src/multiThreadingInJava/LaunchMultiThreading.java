package multiThreadingInJava;

import java.util.*;

class Son
{
	
	private String name;
	private int age;
	private String fatherName;
	private String motherName;
	private String address;
	
	public Son(String name, int age, String fatherName, String motherName, String address) 
	{
		this.name = name;
		this.age = age;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
	}

	public String getName() 
	{
		return name;
	}

	public int getAge() 
	{
		return age;
	}

	public String getFatherName() 
	{
		return fatherName;
	}

	public String getMotherName() 
	{
		return motherName;
	}

	public String getAddress() 
	{
		return address;
	}
	
}

class Father extends Thread
{
	public void run()
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the name: ");
		String name=scan.nextLine();
		
		System.out.println("Enter the age: ");
		int age=scan.nextInt();
		
		System.out.println("Enter father's name: ");
		String fatherName=scan.nextLine();
		
		System.out.println("Enter mother's name: ");
		String motherName=scan.nextLine();
		
		System.out.println("Enter address: ");
		String address=scan.nextLine();
		
		Son s=new Son(name, age, fatherName, motherName, address);
		
		System.out.println("Son's details:");
		System.out.println("**************");
		
		System.out.println("Name: " + s.getName());
		/*
		 * try { Thread.sleep(1000); } catch(Exception e) {
		 * System.out.println(e.getMessage()); }
		 */
		System.out.println("Age: " + s.getAge());
		System.out.println("Father's name: " + s.getFatherName());
		System.out.println("Mother's name: " + s.getMotherName());
		System.out.println("Address: " + s.getAddress());
		
	}
}

class Brother extends Thread
{
	public void run()
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter brother's name: ");
		String name=scanner.nextLine();
		
		System.out.println("Enter brothers age: ");
		int age=scanner.nextInt();
		
		System.out.println("Enter brothers father's name: ");
		String fatherName=scanner.nextLine();
		
		System.out.println("Enter brothers mother's name: ");
		String motherName=scanner.nextLine();
		
		System.out.println("Enter brothers address: ");
		String address=scanner.nextLine();
		
		Son s=new Son(name, age, fatherName, motherName, address);
		
		System.out.println("Son's details:");
		System.out.println("**************");
		
		System.out.println("Name: " + s.getName());		
		System.out.println("Age: " + s.getAge());
		System.out.println("Father's name: " + s.getFatherName());
		
		/*
		 * try { Thread.sleep(1000); } catch(Exception e) {
		 * System.out.println(e.getMessage()); }
		 */

		System.out.println("Mother's name: " + s.getMotherName());
		System.out.println("Address: " + s.getAddress());
	}
}

public class LaunchMultiThreading 
{

	public static void main(String[] args) 
	{
		Father f=new Father();
		
		try
		{
			Thread.sleep(1500);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		f.start();
	
		Brother b=new Brother();
		b.start();

	}

}
