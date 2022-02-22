package com.Bridgelabz.Workshop1;

public class TicTacToe {
	static char[] board=new char[10];
	static int i;
		public static  char[] TickTac() {
			
	       for(i=0;i<9;i++) {
	    	 board[i]='-';
	       }
	       return board;
		}
		public static void main(String[] args) {
			System.out.println("Welcome to tictaktoe game =");
			TickTac();
		}
}
