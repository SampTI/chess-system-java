
package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;


public class Bishop extends ChessPiece{
    
    public Bishop(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "B";
    }
    
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        
        Position p = new Position(0,0);
        //NOROESTE
        p.setValue(position.getRow() - 1, position.getColumn() - 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValue(p.getRow() - 1, p.getColumn() - 1);
        }
        if(getBoard().positionExists(p) && IsThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        //NORDESTE
         p.setValue(position.getRow() - 1, position.getColumn() + 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
           p.setValue(p.getRow() - 1, p.getColumn() + 1);
        }
        if(getBoard().positionExists(p) && IsThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        //SUDOESTE
        p.setValue(position.getRow() + 1, position.getColumn()+1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValue(p.getRow() + 1, p.getColumn() + 1);
        }
        if(getBoard().positionExists(p) && IsThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
  
        //SUDOESTE
        p.setValue(position.getRow()+ 1, position.getColumn() - 1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setValue(p.getRow() + 1, p.getRow() - 1);
        }
        if(getBoard().positionExists(p) && IsThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }
        
        return mat;
     }
    
    
}
