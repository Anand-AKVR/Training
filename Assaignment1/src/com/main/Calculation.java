package com.main;

import java.util.Scanner;

import com.model.Circle;
import com.model.Rectangle;
import com.model.Square;

public class Calculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(  "    press 1 for Circle"+ "\n" + "    press 2 for Square"+ "\n" + "    press 3 for Rectangle"  + "\n"+"\n" + "    Enter the Shape :");
		
		
		
		int shape = sc.nextInt();
		
		if(shape == 1) {
		System.out.print("    Enter radius of Circle  :");
		int rad = sc.nextInt();

		Circle circle = new Circle("circle", rad);
		System.out.println("    Circle Area  :" + circle.calculateArea());
		}
		
		else if(shape == 2){
		System.out.print("    Enter Side of Square  :");
		int side1 = sc.nextInt();
		
		Square square = new Square("Square ", side1);
		System.out.println("    Square Area  :"+square.calculateArea());
		}
		else if(shape == 3){ 
		System.out.print("    Enter Leangth of Rectangle  :");
		int len = sc.nextInt();
		System.out.print("    Enter Breadth of Rectangle  :");
		int Breadth = sc.nextInt();
		
		Rectangle rectangle = new Rectangle("Rectangle", len, Breadth);
		System.out.println("    Area of Rectangle  :" + rectangle.calculateArea());
		}
		
		else {
			System.out.println("PLEASE SELECT CORRECT SHAPE ");
		}
		sc.close();

	}

}
