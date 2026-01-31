package study.sort;

public class BubbleSort {

	/*
	 * Bubble Sort (버블 정렬)
	 * 버블 정렬: "인접한 두 원소를 비교하여 정렬"하는 방식
	 * 두 원소를 하나의 버블로 생각하면 직관적이다.
	 * 
	 * 정렬 순서
	 * 1. 배열의 첫 번째 원소부터 인접한 다음 원소와 비교
	 * 2. 현재 원소가 다음 원소보다 크면 서로 자리를 바꿈(Swap)
	 * 3. 이 과정을 배열의 끝까지 반복하면, 가장 큰 원소가 맨 뒤에 고정됨
	 * 4. 정렬된 맨 뒤 원소를 제외하고, 다시 처음부터 끝까지 반복
	 * 
	 * 최적, 평균, 최악 모두 O(N^2)
	 */
	private static void bubbleSort(int[] arr) {
		int length = arr.length;
		
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 7, 6, 2, 9, 10, 3, 4, 1, 8};
		bubbleSort(arr);
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
