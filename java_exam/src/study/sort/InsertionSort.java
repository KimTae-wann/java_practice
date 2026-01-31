package study.sort;

public class InsertionSort {

	/*
	 * Insertion Sort (삽입 정렬)
	 * 삽입 정렬: "이미 정렬된 부분"과 "아직 정렬되지 않은 부분"으로 나누어,
	 * 정렬되지 않은 부분의 데이터를 뽑아 정렬된 부분의 적절한 위치에 "삽입"하는 방식
	 * 
	 * 정렬 순서
	 * 1. 두 번째 데이터부터 시작 (첫 번째 데이터는 이미 정렬되어 있다고 가정)
	 * 2. 현재 선택된 데이터(Key)를 앞쪽의 정렬된 데이터들과 비교
	 * 3. Key보다 큰 데이터들을 한 칸식 뒤로 밀어내고, Key가 들어갈 수 있는 빈자리를 찾음
	 * 4. 적절한 위치를 찾으면 그 자리에 Key를 삽입
	 * 5. 반복
	 * 
	 * 최적 상황: O(N)
	 * 최악 상황: 역순 정렬 O(N^2)
	 */
	
	private static void insertionSort(int[] arr) {
		int length = arr.length;
		
		for (int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 7, 6, 2, 9, 10, 3, 4, 1, 8};
		insertionSort(arr);
		
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
