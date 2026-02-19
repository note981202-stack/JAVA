package chapter11;

import java.io.IOException;

public class StringClass {

	public static void main(String[] args) throws IOException {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		byte[] bytes2 = {76, 79, 86, 69};
		byte[] bytes3 = {108, 111, 118, 101};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		String str3 = new String(bytes3);
		System.out.println(str3);
		
		
//		byte[] inputs = new byte[100];
//		System.out.println("입력:>> ");
//		int byteNo = System.in.read(inputs);
		
//		String str4 = new String(inputs, 0, byteNo, -2);
//		System.out.println(str4);
		
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str5 = new String(bytes1);
		System.out.println("bytes1 -> String: " + str5);
		
		
		byte[] bytes6 = str.getBytes("EUC-KR");
		System.out.println("bytes1.length: " + bytes6.length);
		String str6 = new String(bytes6,"EUC-KR");
		System.out.println(str6);
		
		byte[] bytes7 = str.getBytes();
		System.out.println("bytes1.length: " + bytes7.length);
		String str7 = new String(bytes7);
		System.out.println("bytes1 -> String: " + str7);
		
		//문자 대체 -> 새로운 문자열 생성
	  String newStr1 = str1.replace("Java", "자바");
	  System.out.println(newStr1);
	  
	  //주민번호 성별 뒷자리 이후번호를 * 표로 만들기
	  String ssn = "880815-1234567";
	  String newSecondNum = ssn.replace(ssn.substring(8), "******");
	  System.out.println(newSecondNum);
	  
	  //
	}

}
