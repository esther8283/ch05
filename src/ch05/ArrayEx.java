package ch05;

import java.util.Scanner;

public class ArrayEx {
	public void arrayEx1() {
		int[] intArr1; // 배열 선언만 진행
//		int[] intArr2; // 배열 선언 및 null로 초기화
		int intArr3[] = {1,2,3,4,5}; // 배열 선언과 동시에 데이터 입력
		int intArr4[] = new int[5]; // 배열의 크기도 5로 고정하고 데이터는 미입력
		
		intArr1 = new int[3];
		intArr1[0] = 1;
		intArr1[1] = 2;
		intArr1[2] = 3;
		System.out.println("배열 intArr1의 길이 : " + intArr1.length);

//		intArr2 = new int[3];
		intArr1[0] = 10;
		intArr1[1] = 20;
		intArr1[2] = 30;
		System.out.println("배열 intArr2의 길이 : " + intArr1.length);

		intArr3[4] = 500;
		System.out.println("배열 intArr3의 index 4번 값 출력 : " + intArr3[4]);
		
		intArr4[0] = 1000;
		System.out.println("배열 intArr4[0]의 값 : " + intArr4[0]);
	}
	public void arrayEx2() {
		System.out.println("\n----- arrayEx2 -----\n");
		
		int score[] = {80, 90, 75};
		
		System.out.println("배열 직접 출력");
		System.out.println("score[0] : " + score[0]);
		System.out.println("score[1] : " + score[1]);
		System.out.println("score[2] : " + score[2]);

		System.out.println("for문을 이용하여 배열 출력");
		for (int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "] :" + score[i]);
		}

	}
	
	public void arrayEx3() {
		System.out.println("\n----- arrayEx3 -----\n");
//		문제 3) 배열(크기 5)을 사용하여 점수를 총합과 평균을 구하는 프로그램을 작성하세요
//		사용자 점수 입력은 원할 경우 구현
				
		int num[] = {100, 90, 80, 70, 20}; 
		
		int sum = 0;
		float avg = 0f;
		System.out.println("점수의 합과 평균");
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		avg = sum / num.length;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
	}
	public void arrayEx4() {
		Scanner sc = new Scanner(System.in);
		
		int[] score = new int[5];
		int total = 0;
		double avg = 0;
		
		for (int i =0; i < score.length; i++) {
			System.out.print((i+1) + "번째 숫자를 입력하세요 : ");
			
			score[i] = sc.nextInt();
		}
		for (int i = 0; i < score.length; i++) {
			total += score[i];
		}
//		(double)total로 가제 형 변환을 진행하여 total값을 double형으로 변환
//		변환된 값과 정수를 연산하면 모두 double형으로 자동 형변화되어 연산이 진행됨
		avg = (double)total / score.length;
	
		System.out.println("총합은 " + total );
		System.out.println("평균은 " + avg);
		
		sc.close();
	}
	
}
