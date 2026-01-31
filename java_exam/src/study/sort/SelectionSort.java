package study.sort;

public class SelectionSort {

	/*
	 * Selection Sort (선택 정렬)
	 * 선택 정렬: "가장 작은 것을 선택해서 앞으로 보낸다"
	 * 
	 * 정렬 순서
	 * 1. 주어진 배열 중 최솟값을 찾는다
	 * 2. 그 최솟값을 맨 앞에 있는 값과 교체함(Swap)
	 * 3. 맨 처음 위치를 제외한 나머지 배열을 같은 방법으로 반복
	 * 
	 * 최선, 평균, 최악 모두 O(N^2)
	 */
	
	private static void selectionSort(int[] arr) {
		int length = arr.length;
		
		for (int i = 0; i < length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 7, 6, 2, 9, 10, 3, 4, 1, 8};
		selectionSort(arr);
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
