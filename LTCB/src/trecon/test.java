package trecon;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
//		System.out.println("adudaduauddnuaduauda");
//		System.out.println("hhj"); 
//		System.out.println(1 == 1); //in ra kieu logic
//		int a;
//		int b;
//		
//		Integer aa = null;
//		Long bb;
//		
//		String s = "Hello";
//		String h = "Hello";
//		System.out.println(s == h);
//		//Ep kieu du lieu
//		int a =3;
//		int b1 = 2;
		
//		System.out.println( (double) a / b1 );
		Scanner scanner = new Scanner(System.in) ;
//		int a = scanner.nextInt();
//		int b = scanner.nextInt();
//		double c = scanner.nextDouble();
//		long d = scanner.nextLong();
//		
		//Scanner.next()  nhap cho string nhung k xuong dong 
		//Scanner.nextLine() nhap cho string bao gom ca xuong dong
		// ++i cong bien len 1 sau do thuc hien lenh
		// i++ thuc hien phep tinh sau do cong bien len 1
		
		int arr[] = new int [10];
		int b[][] = new int [10] [10];
		for(int i = 0; i < 5; i++)
		{
			arr[i] = scanner.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}
		for(int i = 0; i < 2; ++i) {
		
			for(int j = 0; j < 2; ++j) {
				b[i][j] = scanner.nextInt();				
			}
		}
		for(int i = 0; i < 2; ++i) {
			
			for(int j = 0; j < 2; ++j) {
				System.out.print(b[i][j] + " ");
			  }
		}
		
		
	}
}

