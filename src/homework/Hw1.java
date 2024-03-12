package homework;

import java.util.Scanner;
public class Hw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("문장을 입력해주세요.");
			String sentence = sc.nextLine();
			System.out.println("찾을 단어를 입력해주세요.");
			String search = sc.nextLine();
			
			search(sentence, search); //search 메소드 호출
			
			System.out.println("계속하시겠습니까? (Y/N)");
			String yn = sc.nextLine().toUpperCase();
			if(yn.equals("N")) {
				System.out.println("종료합니다.");
				break;
			}
			else continue;
		}
		System.out.println("작업끝...");
		sc.close();
	}

	public static void search(String sentence, String search) {
		System.out.println("=======================");
		// 십의자리수 표시(위치를 확인하기 쉽게!!)
		for(int i=0 ; i<sentence.length() ; i++) {
			if(i%10 ==0 ) System.out.print(i/10);
			else System.out.print(" ");
		}
		System.out.println();
		// 일의자리수 표시(위치를 확인하기 쉽게!!)
		for(int i=0 ; i<sentence.length() ; i++) System.out.print(i%10);
		// 문장 출력
		System.out.println("\n"+sentence);
		System.out.println("=======================");
		
		int cnt=0, startIndex=0;
		while(true) {
			int searchIndex = sentence.indexOf(search, startIndex);
			if(searchIndex == -1) break;
			cnt++;
			System.out.println("찾으시는 단어는 "+searchIndex+"에 있습니다.");
			startIndex = searchIndex + search.length();
		}
		System.out.println("총 "+ cnt +"번 나왔습니다.");
	}
}
