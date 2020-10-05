package com.capgemini.TicTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
	

	public static char[] createBoard() {
		char board[] = new char[10];
		Arrays.fill(board, ' ');
		return board;
	}

	public static char[] userInput() {
		// TODO Auto-generated method stub
		char[] ch = new char[2];
		Scanner sc = new Scanner(System.in);
		ch[0] = sc.next().charAt(0);
		ch[1] = ' ';
		if(ch[0] == 'X')
			ch[1] = 'O';
		
		else
			ch[1] = 'X';
		
		return ch;
		
	}
}
