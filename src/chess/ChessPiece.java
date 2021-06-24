
package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;




public abstract class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    public ChessPosition gertChessPosition(){
        return ChessPosition.fromPosition(position); //retornar a posição lida e transformar em posição de xadrez
    }
    
    protected boolean IsThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

 
   
}
