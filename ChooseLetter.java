package com.Bridgelabz.Workshop1;

import java.util.Scanner;

public class ChooseLetter {
	public static  void TickTac() {
		char[] board = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };    
	}
	public static  void TickTacLetter() {
		char player =' ';
		char computer =' ';

		System.out.println("Enter the Letter X or O");
		Scanner sc = new Scanner(System.in);
		char letter=sc.next().charAt(0);
		if (letter == 'X') {
			player=letter;
			computer='O';
			System.out.println("Player's letter is X");
			System.out.println("Computer's letter is O");
		}
		else if(letter == 'O') {
			player=letter;
			computer='X';
			System.out.println("Player's letter is O");
			System.out.println("Computer's letter is x");
		}
		else {
			System.out.println("Error. You have to choose X or O only.");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to tictaktoe game =");
		TickTac();
		TickTacLetter();
	}
}
