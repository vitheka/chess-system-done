package Chess;

import Chess.pieces.Rook;
import boardgame.Board;
import boardgame.Position;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		 //dimensions of the chess game
		 board = new Board(8, 8);
		 initialSetup();
	}
	
	//retorna matriz de peças
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumns()];
		for(int i=0;i<board.getRow();i++) {
			for(int j=0;j<board.getColumns();j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
	public void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	public void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		board.placePiece(new Rook(board, Color.BLACK), new Position(3,1));
	}

}
