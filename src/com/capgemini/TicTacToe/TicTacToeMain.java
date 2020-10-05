package com.capgemini.ticTacToe;

import java.util.Scanner;

public class TicTacToeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to game");
		TicTacToeGame.createBoard();

		System.out.println("User enter the input");
		char inputs[] = TicTacToeGame.userInput();
		System.out.println("User input " + inputs[0]);
		System.out.println("Computer input " + inputs[1]);

		System.out.println("User enter your choice(head/tail)");
		String toss = sc.next();
		System.out.println(TicTacToeGame.doToss(toss) + " won the toss");

		System.out.println("Show board");
		TicTacToeGame.showBoard();

		while (true) {
			System.out.println("User Make Your move");
			System.out.println("Enter index you want from 1 to 9");
			int index_move = sc.nextInt();
			System.out.println("Enter your move");
			char move = sc.next().charAt(0);
			TicTacToeGame.makeMove(index_move, move);

			System.out.println("Do you want to enter again(Y/N)");
			String ans = sc.next();
			if (ans.equalsIgnoreCase("N"))
				break;
		}

		boolean result = TicTacToeGame.viewWiningConditions(inputs[0]);
		if (result == true)
			System.out.println("User won");
		else
			System.out.println("Computer won");
		sc.close();
	}
}
