package chapter05;

public class array208 {

	public static void main(String[] args) {
		//배열
		System.out.println(args[0]);
		System.out.println(args[1]);
//		System.out.println(args[2]);
		
		//1에서 100까지 난수 10개 발생해서 배열에 저장
		//배열의 값 합출력
		int[] nums = new int[10];
		int sum = 0;
		for(int i=0; i< nums.length; i++) {
			nums[i] = (int)(Math.random()*100)+1;
			sum += nums[i];
		}
		System.out.printf("배열의 합은 %d\n", sum);
		
		
		// 2차원 배열
		int[][] scores = new int[2][3];
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j < scores[i].length; j++)
			scores[i][j] = (int)(Math.random()*100)+1;
		}
//		//배열 출력
//		for(int i=0; i<=scores.length; i++) {
//			for(int j=0; j < scores[i].length; j++)
//			scores[i][j] = (int)(Math.random()*100)+1;
//			System.out.println(scores[i][j] +  "\t");
//	}
		//향상된 for문 - 값을 바로 가져올 수 있음
		for(int i=0; i<scores.length; i++) {
			for(int score : scores[i]) {
				System.out.print(score +  "\t");
			}
			System.out.println();
		}
		
		//배열 복사 - for문으로 요소 하나씩 복사
		int[] newArr = new int[15];
		for(int i=0; i<10; i++) {
			newArr[i] = nums[i];
		}
		for(int num : newArr) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		//배열복사2 - 1번과 동일
		int[] newArr2 = new int[15];
		System.arraycopy(newArr, 0, newArr2, 0, nums.length);
		for(int num : newArr2) {
			System.out.print(num + " ");
		}
		
	} // end main
}// end class
	


