package com.xadrez.chess;

import com.xadrez.boardgame.Piece;
import com.xadrez.boardgame.Position;
import com.xadrez.boardgame.Board;

public abstract class ChessPiece extends Piece {

    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    } 

    public Color getColor(){
        return color;
    }

    public void increaseMoveCount(){
        moveCount++;
    }

    public void decreaseMoveCount(){
        moveCount--;
    }

    public int getMoveCount(){
        return moveCount;
    }

    public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
