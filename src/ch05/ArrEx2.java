package ch05;

import java.util.Arrays;

public class ArrEx2 {
	public void arrEx2() {
		System.out.println("----- arrEx2 -----");
//		�迭�� �̸� ����
		int[]  arr1;
//		�ʿ�ÿ� ��� �����͸� �Է��Ͽ� ����ϱ�
		arr1 = new int[] {1,2,3,4,5};
//		�� �迭�� ���� �����ϰ� �ʿ�ÿ� ��� �����͸� �ѹ��� �Է��Ͽ� ����� ��� �ݵ�� new Ű���带 ����ϴ� ����� ����ؾ���
//		�ڵ���� �����͸� �����ؼ� ����ϴ� ����� ���� ����� ���ÿ� �Է��� ��쿡�� ����� ������
//		arr1 = {1,2,3,4,5} 
		
		System.out.println("�迭 arr1 ũ�� : " + arr1.length);
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
	}
	
	public void arrEx3() {
		System.out.println("----- arrEx3 -----");
//		�迭�� ����� ���ÿ� �����͸� �Է��Ͽ� ����ϱ� 1
//		int[] arr1 = new int[] {1,2,3,4,5};
		
//		�迭�� ����� ���ÿ� �����͸� �Է��Ͽ� ����ϱ� 2
		int[] arr1 = {1,2,3,4,5};
		
		System.out.println("�迭 arr1�� ũ�� : " + arr1.length);
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
	}
	
	public void arrEx4() {
		System.out.println("----- arrEx4 -----");
		
//		�迭�� �̸� �����ϰ� �ʿ� �ÿ� ũ�⸸ ����
		int[] arr1;
		arr1 = new int[5];
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
		
		int[] arr2 = null;
		arr2 = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;
		
//		���� ���� ���, �迭�� ���� �� new Ű���带 ����ϰ� �迭�� �� ũ�⸦ �����ϴ� ���
//		�����ʹ� �ʿ��� ��쿡 ���� �Է��ϴ� ���
		int[] arr3 = new int[5];
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;
		arr3[3] = 4;
		arr3[4] = 5;
		
		System.out.println("arr1�� ũ�� : " + arr1.length);
		
		for(int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
			}
		
		System.out.println("\narr2�� ũ�� : " + arr2.length);
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
			}
		
		System.out.println("\narr3�� ũ�� : " + arr3.length);
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
			}


	}
	
	public void arrEx5() {
		System.out.println("----- arrEx5 -----");
		
//		char�� ����1���� �����ϱ� ���� ������ Ÿ��
//		char �迭 ���� �� ũ�� ���� '\u0000'�� �⺻��
		char[] alphabets = new char[26];
		char ch = 'A';
		
//		������ ���
		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch;
			ch++; // char Ÿ���� ���� Ÿ���̸鼭 ���ڸ� �����ϴ� ������ Ÿ���̱� ������ ��� ������ ������
		}
		
		for (int i = 0; i < alphabets.length; i++) {
		System.out.println(alphabets[i] + " : " + (int)alphabets[i]);
		}
	}
	
	public void twoDimension1() {
		System.out.println("------ twoDimension1 ------");
		
//		����� ���ȣ �� 2�� - 2���� �迭
//		�迭�� ù��° ���ȣ�� �ۿ� �ִ� �迭�� ����
//		�迭�� �ι�° ���ȣ�� �ȿ� �ִ� �迭�� ����
		int [][] arr = new int[][] {
				{1,2,3},
				{4,5,6}
		};
//		arr[0][0]�� ù��° ���ȣ�� �ε�����ȣ 0�� ���� �迭�� 0�� ��Ҹ� ����
//		arr[0][0]�� �ι�° ���ȣ�� �ε��� ��ȣ 0�� ���� �迭�� 0�� ��Ҹ� ����
		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
	}

	public void twoDimension2() {
		System.out.println("------ twoDimension2 ------");

		int[][] arr = new int [2][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
		
		
	}

	public void twoDimension3() {
		System.out.println("------ ���� 1 ------");
//		���� 1) 2���� �迭�� �����ϰ� 1 ~ 25������ ���ڸ� �����ϴ� 2���� �迭�� �����ϼ���

		int[][] arr1 = new int[][] {
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14,15},
			{16,17,18,19,20},
			{21,22,23,24,25}
		};
		System.out.println(arr1[0][1]);
	
		System.out.println("------ ���� 2 ------");
//		���� 2) 2���� �迭�� �����ϰ�, 1 ~ 25������ ���ڸ� ���߿� �Է��ϴ� ������ �迭�� �����ϼ���
//		������ �߰� �κб��� �Է�
			
		int[][] arr2 = new int[5][5];
		
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[0][3] = 4;
		arr2[0][4] = 5;
		arr2[1][0] = 6;
		arr2[1][1] = 7;
		arr2[1][2] = 8;
		arr2[1][3] = 9;
		arr2[1][4] = 10;
		arr2[2][0] = 11;
		arr2[2][1] = 12;
		arr2[2][2] = 13;
		arr2[2][3] = 14;
		arr2[2][4] = 15;
		arr2[3][0] = 16;
		arr2[3][1] = 17;
		arr2[3][2] = 18;
		arr2[3][3] = 19;
		arr2[3][4] = 20;
		arr2[4][0] = 21;
		arr2[4][1] = 22;
		arr2[4][2] = 23;
		arr2[4][3] = 24;
		arr2[4][4] = 25;

		System.out.println("------ ���� 3 ------");
//		���� 3 ) 2���� �迭�� �����ϰ� 1 ~ 25������ ���ڸ� �ݺ����� ���Ͽ� �Է��ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���
			
//			arr3 : 2���� �迭, �迭 ����� ���� ����ϱ� ������ / int[5] : 1���� �迭�� ����
			int [][] arr3 = new int[5][5];
			int count = 1;
			
			for (int i = 0; i < arr3.length; i++) {
				for (int j = 0; j < arr3[i].length; j++) {
					arr3[i][j] = count;
					count++;
				}
			}
			
			for (int i = 0; i < arr3.length; i++) {
				for (int j = 0; j < arr3[i].length; j++) {
					System.out.println("arr3[" + i + "][" + j + "] : " + arr3[i][j]);
				}
			}
			
			System.out.println("------ ���� 4 ------");
//			���� 4 ) ���� 3���� Ȱ���Ͽ� 1 ~ 25������ ������ ���� ����ϴ� ���α׷��� �ۼ��ϼ���
			
			int total = 0; 
			
			for (int i = 0; i < arr3.length; i++) {
				for (int j = 0; j < arr3[i].length; j++) {
					total += arr3[i][j];
				}
			}
			System.out.println("1 ~ 25�� ���� : " + total);
	}
	
	public void arrayCopy1() {
		System.out.println("\n----- �迭 ���� 1 -----\n");
		
		int[] arr1 = new int[] {1,2,3};
		int[] arr2 = null;
		
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1,"arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2,"arr2");
		
		
		
		System.out.println("�迭 arr2�� �迭 arr1�� ���� ����\n");
		arr2 = arr1;
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1,"arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2,"arr2");
		
		
		System.out.println("�迭 arr[0]�� �� ����\n");
		arr1[0] = 100;
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1,"arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2,"arr2");
		
		System.out.println("�迭 arr[0]�� �� ����\n");
		arr1[2] = 3000;
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1,"arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2,"arr2");
		
	}
	
	public void arrayOutput(int[] array, String name) {
		if (array != null) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(name + "[" + i + "]" + array[i]);
		}
	}
		else {
			System.out.println(name +" �迭�� ������ϴ�.");
		}
	}
	
	public void arrayCopy2() {
		System.out.println("\n------ arrayCopy2 -----\n");
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = null;
		
		System.out.println("���� ���� ���� �迭");
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1,"arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2,"arr2");
		
		System.out.println("\nfor���� ���� ����\n");
		
		arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1,"arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2,"arr2");
		
		System.out.println("�迭 arr1[0]�� �� ����");
		arr1[0] = 100;
		
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1,"arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2,"arr2");
		
		System.out.println("�迭 arr2[2]�� �� ����");
		arr2[2] = 3000;
		
		System.out.println("�迭 arr1�� ������");
		arrayOutput(arr1,"arr1");
		System.out.println("�迭 arr2�� ������");
		arrayOutput(arr2,"arr2");
	}
	
	public void arrayCopy3() {
		System.out.println("\n------ arrayCopy3 -----\n");

//		System.arraycopy() �޼��带 �̿��Ͽ� �迭�� ����
//		System.arraycopy(����, �����������, �纻, ����޴�����, ������ ����);
		
		int[] arr1 = new int[]{1,2,3,4,5};
		int[] arr2 = new int[10];
		
		System.out.println("������ ���� �迭");
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("���� �� �迭");
		System.arraycopy(arr1, 0, arr2, 0, 5);
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("�迭 arr1[0] �� ����");
		arr1[0] = 100;
		
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("�迭 arr2[8] �� ����");
		arr2[8] = 9000;
		
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
	}
	
	public void arrayCopy4() {
		System.out.println("\n------ arrayCopy4 -----\n");
		
//		Arrays Ŭ���� : �ش� �迭�� �������� ����� ����� �� �ֵ��� �����ִ� Ŭ����
//		copyOf(����, ������ ����) : ���� �迭�� 0 index���� ������ ���̸�ŭ �����͸� ����
//		copyOfRange(����, ����index, ��index) : ���� �迭���� ������ ���� index���� ������ �� index���� �����͸� ���� 
		
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[5];
		
		System.out.println("���� �迭");
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("Arrays.copyOf ���� �� �迭");
		arr2 = Arrays.copyOf(arr1, arr1.length);
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
	}
	
	public void adFor() {
		System.out.println("------ ���� for�� -----");
		
		int[] scores = new int[] {95, 71, 84, 93, 87};
		
		int total = 0;
		System.out.println("�Ϲ����� for���� ����Ͽ� ���� ���ϱ�");
		
//		���� �迭�� ��Ҹ� �������
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
			System.out.println("total�� ��" + total);
		}
		System.out.println("���� for���� ����Ͽ� ���� ���ϱ�");
		
//		�迭�� ���ۺ��� ������ 
//		������ ����ϳ� ������ �ʱ�ȭ, ������ ������(���� �� ���)
		total = 0;
		for (int value : scores) {
			total += value;
			System.out.println("total�� ��" + total);
		}
		
	}
}
