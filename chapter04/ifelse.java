package chapter04;

public class ifelse {

	public static void main(String[] args) {
		//점수 3개, 총점, 평균, 등급
		//출력 총점, 평균, 등급 한줄에 출력
		int html = 100;
		int js = 99;
		int java = 88;
		
		int total = html + js + java;
		double avg = total / 3.0;
		
		String grade = "";
		if(avg>=90) {
			System.out.println("A등급입니다");
		} else if(avg>=80) {
			System.out.println("B등급입니다 ");
		} else if(avg>=70) {
			System.out.println("C등급입니다 ");
		} else if(avg>=60) {
			System.out.println("D등급입니다 ");
		} else {
			System.out.println("F등급입니다 ");
		};
		
		//switch문으로변경
		switch((int)avg/10) {
			case 10:
			case 9: grade = "A"; break;
			case 8: grade = "B"; break;
			case 7: grade = "C"; break;
			case 6: grade = "D"; break;
			default: grade = "F";
		}
		System.out.printf("총점=%d 평균=%.2f 등급%s\n", total, avg, grade);
	}

}
