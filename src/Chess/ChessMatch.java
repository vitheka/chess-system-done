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
	
	public void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePiece(new Rook(board, Color.BLACK), new Position(2,1));
	}

}
