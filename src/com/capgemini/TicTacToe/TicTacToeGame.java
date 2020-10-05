package com.capgemini.ticTacToe;

import java.util.Scanner;

public class TicTacToeGame {
	public static final Scanner SC = new Scanner(System.in);
	public static char b[] = new char[10];

	private static void fillBoard() {
		b[0] =' ';
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
			System.out.print(b[i++]+ " | " + b[i++]+ " | " + b[i]);
			System.out.println();
		}
	}
	
	
    // UC 4 - Make move
	public static void makeMove(int index,char move) {
		if(b[index] == ' ') {
			b[index] = move; 
			showBoard();
		}
		else
			System.out.println("The index is alreay filled");
		
	}

}
