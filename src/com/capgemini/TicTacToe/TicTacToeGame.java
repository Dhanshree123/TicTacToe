package com.capgemini.ticTacToe;

import java.util.Scanner;

public class TicTacToeGame {
	public static final Scanner SC = new Scanner(System.in);
	public static char b[] = new char[10];

	private static void fillBoard() {
		b[0] = ' ';
		for (int i = 1; i < 10; i++)
			b[i] = ' ';
	}

	// UC 1 - Create Board
	public static char[] createBoard() {
		fillBoard();
		return b;
	}

	// UC 2 - Check user and computer inputs
	public static char[] userInput() {
		char[] ch = new char[2];
		ch[0] = SC.next().charAt(0);
		ch[1] = ' ';
		ch[1] = ch[0] == 'X' ? 'O' : 'X';
		return ch;

	}

	// UC 3 - Show Board
	public static void showBoard() {
		for (int i = 1; i < 10; i++) {
			System.out.print(b[i++] + " | " + b[i++] + " | " + b[i]);
			System.out.println();
		}
	}

	// UC 4 - Check index to Make move
	public static boolean isIndexEmpty(int index) {
		if (index <= 9 && index > 0 && b[index] == ' ') {
			return true;
		} else
			return false;

	}

	// UC 5 - Make move
	public static void makeMove(int index, char move) {
		if (isIndexEmpty(index)) {
			b[index] = move;
			showBoard();
		} else
			System.out.println("The index is already filled");

	}

	// U 6 - Do Toss
	public static void doToss(String toss) {
		if (toss.equalsIgnoreCase("head") || toss.equalsIgnoreCase("tail")) {
			int t;
			if (toss.equalsIgnoreCase("head"))
				t = 0;
			else
				t = 1;
			int tossResult = (int) Math.floor(Math.random() * 10) % 2;
			if (tossResult == t) {
				System.out.println("User Plays First");
			} else
				System.out.println("Computer plays first");
		} else
			System.out.println("Wrong input");

	}

}
