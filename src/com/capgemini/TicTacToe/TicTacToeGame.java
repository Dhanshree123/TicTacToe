package com.capgemini.ticTacToe;

import java.util.Scanner;

public class TicTacToeGame {
	public static final Scanner SC = new Scanner(System.in);
	public static char b[][] = new char[3][3];

	private static void fillBoard() {
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				b[i][j] = 'X';
	}

	
	//UC 1 - Create Board
	public static char[][] createBoard() {
		fillBoard();
		return b;
	}

	//UC 2 - Check user and computer inputs
	public static char[] userInput() {
		char[] ch = new char[2];
		ch[0] = SC.next().charAt(0);
		ch[1] = ' ';
		ch[1] = ch[0] == 'X' ? 'O' : 'X';
		return ch;

	}
	
   //UC 3 - Show Board
	public static void showBoard() {
		for (int i = 0; i < 3; i++) {
			System.out.print(b[i][0] + " | " + b[i][1] + " | " + b[i][2]);
			System.out.println();
		}
	}

}
