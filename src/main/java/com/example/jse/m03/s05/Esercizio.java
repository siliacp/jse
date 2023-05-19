package com.example.jse.m03.s05;

public class Esercizio {
	static boolean hasX(String s) {
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur == 'x') {
				return true;
			}
		}
		return false;
	}

	static int countX(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur == 'x') {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String esempio = "jxjxjxjxjxjjx";
		boolean flag = hasX(esempio);
		System.out.println(flag);

		int count = countX("sdkjncoscinxoidnfxosdiniox");
		System.out.println(count);
		
		count = countX(esempio);
		System.out.println(count);
	}
}
