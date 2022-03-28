package com.SecPack;

import com.FirstPack.Parent;

class Child extends Parent
{
	void display()
	{  
		System.out.println("Name="+name);
		//System.out.println("age="+age); default is not accessable
		System.out.println("accno="+accno);
		//System.out.println("sal ="+sal); //private is not accessable
	}
	}

public class MainApp{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child ob=new Child();
		//ob.input();//here the parent class is not extended this is independent class
		ob.display();
		//ob.printSal();//here the parent class is not extended this is independent class

	}

}
