package BTVN1;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		n = scanner.nextInt();
		int A[]= new int[n];
		for(int i=0;i<n;i++) {
			A[i]= scanner.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(i%2!=0) {
				if(i==n-1) {
					A[i]+=Math.abs(A[i-1]);
				}
				else {
				A[i]+=Math.abs(A[i-1]-A[i+1]);
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+" ");
		}
	}
}
