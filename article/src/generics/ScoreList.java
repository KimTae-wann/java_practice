package generics;

public class ScoreList<T, SUM_RESULT> {
	
	// ScoreList에서 사용할 멤버변수
	// 점수들의 배열
	private Object[] scoreArray;
	private int size;
	private int curIndex;
	
	public ScoreList() {
		this.scoreArray = new Object[2];
		this.size = scoreArray.length;
		this.curIndex = 0;
	}

	public void add(T score) {
		if (curIndex >= size) {
			// 배열 크기는 2씩 늘림
			Object[] newArray = new Object[size *= 2];
			System.arraycopy(this.scoreArray, 0, newArray, 0, curIndex);
			this.scoreArray = newArray;
		}
		
		this.scoreArray[this.curIndex++] = score;
	}
	
	@SuppressWarnings("unchecked")
	public T getScore(int index) {
		if (index >= size) {
			throw new IndexOutOfBoundsException(index + "에 접근할 수 없습니다.");
		}
		return (T) this.scoreArray[index];
	}
	
	@SuppressWarnings("unchecked")
	public SUM_RESULT sum(Reducer<T, SUM_RESULT> reducer, 
							SUM_RESULT defaultValue) {
		SUM_RESULT result = defaultValue;
		for (int i = 0; i < curIndex; i++) {
			T t = (T) this.scoreArray[i];
			result = reducer.reduce(t, result);
		}
		return result;
	}
}
