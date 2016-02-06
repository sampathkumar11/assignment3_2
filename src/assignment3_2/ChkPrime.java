package assignment3_2;
//finding a given number prime or not
import java.util.Scanner;
public class ChkPrime {
	static String pc(String c){
	//System.out.println("Hello World");
		String chk_result;//="not run";
		Float i=Float.parseFloat(c);
	//logic to check whether c is a prime no
		int cnt=0;
		if(i%2!=0){cnt++;}
		if(i%3!=0){cnt++;}
		if(i%5!=0){cnt++;}
		if(i%6!=0){cnt++;}
		if(i%7!=0){cnt++;}
		if((i==2)||(i==3)||(i==5)||(i==7)){cnt++;}
		if(cnt>4){
			//System.out.println(i);
			chk_result="Prime number.";
		}else{
			chk_result="Not a Prime number.";
		}
		return chk_result;
	}
	
	public static void main(String args[]){
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter the number which has to be checked for Prime :");
		String c = scnr.nextLine();
		//String c="10";// Given number
		String out=pc(c);	
		System.out.println("Given Number "+c+" is "+out);
		System.out.println("You want to try again ?\n (Enter y for Yes and n for No)");
		String retry=scnr.nextLine();
		if((retry=="y")||(retry=="Y")){
			System.out.println("Enter the number which has to be checked for Prime :");
			c = scnr.nextLine();
			out=pc(c);	
			}else{
				System.out.println("Thanks for using. "+retry);
			}
		scnr.close();
		}
	}