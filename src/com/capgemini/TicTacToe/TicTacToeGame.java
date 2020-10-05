package com.capgemini.TicTacToe;

import java.util.Arrays;

public class TicTacToeGame {

	
	public static char[] createBoard() {
		char board[] = new char[10];
		Arrays.fill(board,' ');
		return board;
	}
}
