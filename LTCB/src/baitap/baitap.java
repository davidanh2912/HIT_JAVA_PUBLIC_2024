package concho;

import java.util.Scanner;

public class baitap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A[] = new int [1000000];
		int n;
		System.out.println("nhap n: ");
		n = scanner.nextInt();
		for(int i = 0; i < n; i++)
		{
			A[i] = scanner.nextInt();
		}
		int max = A[0];
		for(int i = 0; i < n; i++)
		{
			if(A[i] > max)
			{
				max = A[i];
			}
		}
		System.out.println("max cua mang la: " + max);
	}
}
