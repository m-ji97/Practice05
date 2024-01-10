package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		Member jws = new Member("정우성","jws",50000);
		Member yjs = new Member("유재석","yjs",30000);
		Member ihr = new Member("이효리","ihr",40000);
		
		jws.showinfo();
		yjs.showinfo();
		ihr.showinfo();

		
	}

}
