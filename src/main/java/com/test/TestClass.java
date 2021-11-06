package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

 class TestClassX {
	static int x=10;
	int l =0;
	private void call() {
		int x = 5;
		System.out.println(this.x);
		// TODO Auto-generated method stub
		class A {
			void decrease(){				
				l+=1;
			}
		}
		

	}
	public static void main(String[] args) {
		List<String> arrays = Arrays.asList("");
//		arrays.stream().map((x,y)->x.co)
//		Runtime.getRuntime().getRuntime().get
//		new BufferedReader(new InputStreamReader(in, cs)); 
//		new BufferedReader(new FileReader("")); 
	}
	
	static class Test{}
	
}

interface A{
	int x=0;
}
interface B extends A{
	int y=2;
}
class AX implements B{
	public static void main(String[] args) {
		System.out.println(B.x);
	
	}
}
