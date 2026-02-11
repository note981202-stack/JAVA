package chapter05;

public class mission {

	public static void main(String[] args) {
		// 5-1과제
		
		//1번
		//배열 1-100까지의 난수(math.random) 에서 10개를 배열에 저장
		//배열값 출력
		//배열 값의 합계, 최대값, 최소값 출력
		
//		int[] nums = new int[10];
//		int sum = 0;
//		
//		for(int i=0; i<nums.length; i++) {
//			nums[i] = (int)(Math.random()*100)+1;
//			sum += nums[i];
//			System.out.print(nums[i] + " ");
//		}
//		
//		int max = nums[0];
//		int min = nums[0];
//		
//		for(int i = 1; i < nums.length; i++) {
//	    if(nums[i] > max) max = nums[i];
//	    if(nums[i] < min) min = nums[i];
//	}
//		
//		System.out.printf("\n배열의 합은 %d\n", sum);
//		System.out.println("\n최대값: " + max);
//		System.out.println("최소값: " + min);
		//---------------------------------------------------		
		
		
		//2번
		//2차원 배열 출력
		//배열= {{1,2,3}, {1,2}, {1}, {1,2,3}};
//		int[][] arr = {{1,2,3}, {1,2}, {1}, {1,2,3}};
//
//		for(int i = 0; i < arr.length; i++) {
//		    for(int j = 0; j < arr[i].length; j++) {
//		        System.out.print(arr[i][j]);
//		    }
//		    System.out.println();
//		}
		
    //--------------------------------------------------------
		
		//3번
		//현재 관객의 수 출력
		//관객있는 좌석은 1, 없는 좌석은0 - 난수 이용
		//극장의 자리는 1줄에 10좌석씩 3줄
		//3행 10열의 배열에 0또는 1 저장 - 값출력
		//관객의 수 계산하기 - 현재 관객 수는 00명
		
//		int[][] seat = new int[3][10];
//    int count = 0;
//		
// // 좌석에 난수로 0 또는 1 저장
//    for(int i = 0; i < seat.length; i++) {
//        for(int j = 0; j < seat[i].length; j++) {
//            seat[i][j] = (int)(Math.random() * 2); // 0 또는 1
//        }
//    }
//
//    // 좌석 상태 출력 + 관객 수 계산
//    for(int i = 0; i < seat.length; i++) {
//        for(int j = 0; j < seat[i].length; j++) {
//            System.out.print(seat[i][j] + " ");
//            if(seat[i][j] == 1) {
//                count++;
//            }
//        }
//        System.out.println();
//    }
//    
//    System.out.printf("\n현재 관객 수는 %d명입니다.\n", count);
		
	//--------------------------------------------------------
		
		//4번
		//학생 3명, 각 학생당 5번의 테스트 점수를 배열에 저장
		//50 <= 점수 <=100
		//학생별 평균 계산 출력
//		int[][] score = {
//        {53, 91, 65, 77, 77},
//        {87, 99, 90, 64, 69},
//        {63, 73, 96, 88, 52}
//    };
//
//    for(int i = 0; i < score.length; i++) {
//        int sum = 0;
//
//        for(int j = 0; j < score[i].length; j++) {
//            sum += score[i][j];
//        }
//
//        int avg = sum / score[i].length;
//        System.out.println((i + 1) + "번 학생평균 = " + avg);
//    }
		
	//--------------------------------------------------------
		
		//5번
    //카드 랜덤 선택해서 화면에 출력
		// 배열 : {"Clubs", "Diamonds", "Hearts", "Spades"}  
		// 배열 : {"2","3","4", "5", "6","7","8","9","10","Jack","Queen","King","Ace"} 
		// 각 카드를 랜덤하게 선택하는 코드 작성(5번) 

		
//    String[] shape = {"Clubs", "Diamonds", "Hearts", "Spades"};
//    String[] number = {"2","3","4","5","6","7","8","9","10",
//                       "Jack","Queen","King","Ace"};
//
//    for(int i = 0; i < 5; i++) {
//        int shapeIdx = (int)(Math.random() * shape.length);
//        int numberIdx = (int)(Math.random() * number.length);
//
//        System.out.println(shape[shapeIdx] + " " + number[numberIdx]);
//    }
//		
	//--------------------------------------------------------
		
		//6번
//		3*5 크기의 2차원 배열 생성하고 초기값은 0으로 초기화 
//		5개의 정수 1을 랜덤하게 배치 
//		최종 배열 출력 
		
//    int[][] arr = new int[3][5]; // 기본값 0으로 초기화
//    int count = 0;
//
//    // 1을 5개 랜덤 배치 (중복 방지)
//    while(count < 5) {
//        int r = (int)(Math.random() * 3);
//        int c = (int)(Math.random() * 5);
//
//        if(arr[r][c] == 0) {
//            arr[r][c] = 1;
//            count++;
//        }
//    }
//
//    // 최종 배열 출력
//    for(int i = 0; i < arr.length; i++) {
//        for(int j = 0; j < arr[i].length; j++) {
//            System.out.print(arr[i][j] + " ");
//        }
//        System.out.println();
//    }
		
	}

}
