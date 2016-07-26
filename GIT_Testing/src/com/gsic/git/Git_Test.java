package com.gsic.git;

public class Git_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SOAB_Print soab = new SOAB_Print();
		soab.print();
		printNames("Gary Li; Paul");
		
	}
	
	public static void printNames(String m_input) {
		System.out.println("Here is the SOAB Team List");
		System.out.println("--" + m_input);
	}

}
