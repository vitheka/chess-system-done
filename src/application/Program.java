package application;

import java.util.Scanner;

import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessmatch = new ChessMatch();

		while (true) {
			UI.printBoard(chessmatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);

			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
		}

	}

}
