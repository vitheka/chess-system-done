package application;

import Chess.ChessMatch;
import boardgame.Board;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessmatch = new ChessMatch();
		UI.printBoard(chessmatch.getPieces());

	}

}
