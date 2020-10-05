package com.capgemini.ticTacToe;

import java.util.Scanner;

public class TicTacToeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to game");
		while (true) {
			System.out.println("Enter the choice");
			System.out.println("1.Create Board");
			System.out.println("2.Enter User input");
			System.out.println("3.Show Board");
			System.out.println("4.Make Move User");
			System.out.println("5.Exit");

			int choice = sc.nextInt();
			if (choice == 5)
				break;

			switch (choice) {
			case 1:
				char board[] = TicTacToeGame.createBoard();
				break;

			case 2:
				System.out.println("User enter the input");
				char inputs[] = TicTacToeGame.userInput();
				System.out.println("User input " + inputs[0]);
				System.out.println("Computer input " + inputs[1]);
				break;

			case 3:
				System.out.println("Show board");
				TicTacToeGame.showBoard();
				break;
				
			case 4:
				System.out.println("User Make Your move");
				System.out.println("Enter index you want from 1 to 9");
				int index = sc.nextInt();
				char move = sc.next().charAt(0);
				TicTacToeGame.makeMove(index,move);
				break;

			default:
				break;

			}
		}
		sc.close();
	}
}
