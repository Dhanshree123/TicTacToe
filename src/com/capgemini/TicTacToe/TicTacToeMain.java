package com.capgemini.TicTacToe;

import java.util.Scanner;

public class TicTacToeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to game");
		char board[] = TicTacToeGame.createBoard();
		System.out.println("User enter the input");
		char inputs[] = TicTacToeGame.userInput();
		System.out.println("User input "+inputs[0]);
		System.out.println("Computer input "+inputs[1]);
		
	}
}
