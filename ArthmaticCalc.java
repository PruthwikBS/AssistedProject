package com.pruthwik.assistedProject;
import java.util.Scanner;
public class ArthmaticCalc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the two numbers");
		int firstnum=sc.nextInt();
		int secondnum= sc.nextInt();
		System.out.println("Enter the operator ");
		char op=sc.next().charAt(0);
		double Ans=0;

		switch(op){
		case '+': Ans=firstnum+secondnum;
		break;
		case '-':Ans=firstnum-secondnum;
		break;
		case '*': Ans=firstnum*secondnum;
		break;
		case '/':Ans=firstnum/secondnum;
		break;
		}
		System.out.println("the answer is " +Ans);
	}

}
