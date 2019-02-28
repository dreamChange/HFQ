package sample.z;

import java.util.Random;

public class Sort {

	// 目的排序
	public static void main(String[] args) {

//		int[] initArr = Sort.init(20,80);

		int[] initArr = {-66, 44, -99, 22, -11, -55 };
		
		

//		print(mSort(initArr));
	}
	
	// 随机数组
	public static int[] init(int initNum,int nextNum) {
		Random random = new Random();
		
		int[] initArr = new int[initNum];
		
		for (int i = 0; i < initArr.length; i++) {
			
			initArr[i] = (random.nextInt(nextNum) + 1);
			
		}
		return initArr;
	}
	
		
	/**
	 *	迭代数组 
	 */
	public static void print(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
			if ((i+1) % 10 == 0 ) {
				System.out.println("\n");
			}
		}		
	}
	
	/**
	 * 冒泡排序，i=min. j++, next比较；
	 */
	public static int[] mSort(int[] initArr) {
		
		for (int i = 0; i < initArr.length; i++) {
			//变不变都是最小值做比较；
			for (int j = i + 1; j < initArr.length; j++) {
				
				int tmp1 = initArr[i];
				int tmp2 = initArr[j];
				
				if (tmp2 < tmp1) {
					initArr[i] = tmp2;
					initArr[j] = tmp1;
				}
			}
		}
		return initArr;
	}
	
	/**
	 * 直接插入排序
	 */
	public static int[] iSort(int[] initArr) {
		
		return initArr;
	}
}
