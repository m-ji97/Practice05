package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");
			
		}
		Friend friend = new Friend("정우성", "010-1111-1111", "서울초등학교");
		Friend friend1 = new Friend("이효리", "010-2222-2222", "제주중학교");
		Friend friend2 = new Friend("유재석", "010-3333-3333", "강남고등학교");
		
		friendArray[0] = fr1;
		
		//for문 시작
		//친구정보 3명 입력 로직 --> 반복문 사용
	


		//for문 끝


		// 친구정보 출력
		int num = 0;
		for (int i = 0; i < friendArray.length; i++) {
			//친구정보 출력 메소드 호출
			num=num+1;
		}
		sc.close();
	}
}
