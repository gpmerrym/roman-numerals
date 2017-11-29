package com.lmig.gfc.romanNumerals.services;

public class HinduToRomanNumeralConverter {

	public String convert(int num) {
		String result = "";
		

		// String numerals[] = {"C","XC","L","XL","X","IX","V","IV","I"};
		// int values[] = {100, 90, 50, 40, 10, 9, 5, 4, 1};

		while (num >= 1000) {
			result = result + "M";
			num = num - 1000;
		}

		while (num >= 900) {
			result = result + "CM";
			num = num - 900;
		}

		while (num >= 500) {
			result = result + "D";
			num = num - 500;
		}

		while (num >= 400) {
			result = result + "CD";
			num = num - 400;
		}

		while (num >= 100) {
			result = result + "C";
			num = num - 100;
		}

		while (num >= 90) {
			result = result + "XC";
			num = num - 90;
		}

		while (num >= 50) {
			result = result + "L";
			num = num - 50;
		}

		while (num >= 40) {
			result = result + "XL";
			num = num - 40;
		}

		while (num >= 10) {
			result = result + "X";
			num = num - 10;
		}

		while (num >= 9) {
			result = result + "IX";
			num = num - 9;
		}

		while (num >= 5) {
			result = result + "V";
			num = num - 5;
		}

		while (num >= 4) {
			result = result + "IV";
			num = num - 4;
		}

		for (int i = 0; i < num; i++) {
			result = result + "I";
		}
		return result;
		
		
	}
}
