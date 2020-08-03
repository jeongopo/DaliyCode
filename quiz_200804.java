package daliycoding;

import java.util.Scanner;

//200803 코딩
//간단한 약수 구하기

public class quiz_200804 {
	static int n, s, d;
	
	public static void main(String[] args) {
	System.out.println("숫자를 입력하세요");
	Scanner scan=new Scanner(System.in);

	n=scan.nextInt();

	FindNum(n);
	
	}

	public static void FindNum(int n) {
		int i=0;
		if(n==1) {
			System.out.print("1");
		}else {
		for(i=n;i>0;i--) {
			if(n%i==0) System.out.print(n/i+" ");
		}
		}
	}
	
	
	
	
}
