package ch07;

// [System.arraycopy( )로 배열 복사하기]
public class ArrayCopy {
	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		/* 
		  복사할 배열 : array1, 복사할 위치 : 0번, 
		  복사받을 대상 : array 2, 붙여넣을 위치 : 2, 
		  복사할 요소 개수 : 3 
		  -> 붙여넣을 위치부터 복사받은 요소의 개수가 기존 배열 길이를 넘어가면 오류 
		  -> 2번부터 array1 배열의 0~2번 요소까지 복사됨
		 */
		System.arraycopy(array1, 0, array2, 2, 3);
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}

}
