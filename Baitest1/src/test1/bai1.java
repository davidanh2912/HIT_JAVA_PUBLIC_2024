package test1;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			String input = sc.nextLine();
			int dem = 0;
			for (int j = 0; j < input.length(); j++) {
				if (input.charAt(j) == ' ' && input.charAt(j - 1) != ' ')
				{
					dem++;
				}
			}
			System.out.println(dem);
		}
		
	}

}
