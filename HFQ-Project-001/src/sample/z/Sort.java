package sample.z;

import java.util.Random;

public class Sort {

	// 目的排序
	public static void main(String[] args) {

//		int[] initArr = Sort.init(20,80);

		int[] initArr = {-66, 44, -99, 2,-5,-99,77};

		print(iSort(initArr));
		
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
		
		int[] newArr = new int[initArr.length];
		
		for (int i = 0; i < initArr.length; i++) {
			int tmp = initArr[i];
			//初始化
			if(i == 0){
				newArr[0] = tmp;
				continue;
			}
			//记录下标值
			int subScript = 0;
			//需要插入标识
			boolean ifInsert= false;
			//插入数据;
			int iTmp = 0;
			
			for (int j = 0; j < newArr.length; j++) {
				
				//1.寻找插入下标值；
				int tmp2 = newArr[j];
				
				//插入标识为true 时，需将后续数据往后移动1下标值
				if(ifInsert){
					newArr[subScript] = iTmp;
					iTmp = tmp2;
					subScript++;
				}
				//寻找到时，记录当前下标值
				else if(tmp < tmp2){
					iTmp = tmp;
					subScript = j;
					ifInsert = true;
					j--;
					continue;
				}
				//当前数据为最大值处理方式
				else if(i==j){
					iTmp = tmp;
					subScript = j;
					ifInsert = true;
					j--;
					continue;
				}
				else{
					//nothing
				}
			}
		}
		return newArr;
	}
}
