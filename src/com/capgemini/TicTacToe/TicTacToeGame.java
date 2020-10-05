package com.capgemini.ticTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
	public static final Scanner SC = new Scanner(System.in);

	public static char b[][] = new char[3][3];
	
	private static void fillBoard() {
		for(int i =0 ;i<3; i++)
			for(int j=0;j<3;j++)
				b[i][j] ='X';
	}
	
	public static char[] createBoard() {
		char board[] = new char[10];
		Arrays.fill(board, ' ');
		return board;
	}

	public static char[] userInput() {
		char[] ch = new char[2];
		ch[0] = SC.next().charAt(0);
		ch[1] = ' ';
		ch[1] = ch[0] == 'X' ? 'O' : 'X';
		SC.close();
		return ch;

	}

	public static void showBoard() {
		fillBoard();
		System.out.print(b[0][0] + " | "+ b[0][1]+" | "+b[0][2]);
		System.out.println();
		System.out.print(b[1][0] + " | "+ b[1][1]+" | "+b[1][2]);
		System.out.println();
		System.out.print(b[2][0] + " | "+ b[2][1]+" | "+b[2][2]);
		System.out.println();
	}
}
