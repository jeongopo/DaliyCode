package daliycoding;

import java.util.Scanner;

//200803 �ڵ�
//������ ��� ���ϱ�

public class quiz_200804 {
	static int n, s, d;
	
	public static void main(String[] args) {
	System.out.println("���ڸ� �Է��ϼ���");
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
