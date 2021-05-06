package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a = ");
		int a = sc.nextInt();
		if (a<0) {System.out.print("a la so nguyen am");}
		else {System.out.print("a la so nguyen duong");}
		System.out.println("Nhap n = ");
		int n = sc.nextInt();
		if (n%3==0) { System.out.print("n chia het cho 3");
		}else if (n%5==0) System.out.print("n chia het cho 5");
		
	}

}
