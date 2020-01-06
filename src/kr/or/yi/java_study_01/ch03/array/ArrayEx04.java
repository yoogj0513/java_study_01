package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx04 {

	public static void main(String[] args) {
		Random rnd = new Random(1234567); // 고정된 랜덤값 출력
		int[] arr = new int[6];
		
		generate_number();
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
		
		init_lotto(rnd, arr);
		
		//간단한 배열 출력
		System.out.println(Arrays.toString(arr));
		
		bubble_sort(arr);
		
		System.out.println(Arrays.toString(arr)); // 15, 17, 27, 33, 36, 43
		
		int searchKey = 9;
		int findIdx = findSearch(arr, searchKey);
		System.out.printf("%s 배열에서 %d 의 위치는 %d 입니다.%n", Arrays.toString(arr), searchKey, findIdx);
		
		findIdx = binarySearch(arr, searchKey);
		System.out.printf("%s 배열에서 %d 의 위치는 %d 입니다.", Arrays.toString(arr), searchKey, findIdx);
		
		
	}
	
	

	private static int binarySearch(int[] arr, int searchKey) {
		int left = 0;
		int right = arr.length-1;
		int mid;
		
		while(left <= right) {
			mid = (left + right) / 2;
			if(arr[mid] == searchKey) {
				return mid;
			}
			if(arr[mid] < searchKey) {
				left = mid + 1;
			}
			if(arr[mid] > searchKey) {
				right = mid - 1;
			}
		}
		
		return -1;
	}



	/*
	 * Linear Search(선형 검색) -> 최악일 경우 비교 횟수 n
	 * binary Search(이분 검색)
	 *
	 */

	private static int findSearch(int[] arr, int searchKey) {
		//arr 배열에서 searchKey가 존재하는 위치(index) 리턴, 만약 존재하지 않을 경우 -1을 리턴
		// 선형 탐색(Linear Search)
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == searchKey) {
				return i;
			}
		}
		
		return -1;
	}

	private static void bubble_sort(int[] arr) {
		System.out.println("=== bubble sort ===");
		int temp;
		
		for(int cnt=0; cnt<arr.length-1; cnt++) {
			for(int i=0; i<arr.length-(cnt+1); i++) {
//				int temp = arr[i+1];
//				if(arr[i] > temp) {
				
				if(arr[i] > arr[i+1]) {
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			System.out.println((cnt+1) + "회 => "+ Arrays.toString(arr));
		}
	}

	private static void init_lotto(Random rnd, int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = rnd.nextInt(46)+1;
		}
	}

	private static void generate_number() {
		Random rnd = new Random();
		rnd.setSeed(1234);// 
		for (int i=0; i<6; i++) {			
			System.out.print(rnd.nextInt(45) + 1 + " "); // 0 <= rnd.nextInt(45) < 45 // Random.nextInt(int bound) : 0~n
		}
	}

}
