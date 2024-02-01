package com.xadrez.chess;

import com.xadrez.boardgame.Piece;
import com.xadrez.boardgame.Position;
import com.xadrez.boardgame.Board;

public abstract class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    } 

    public Color getColor(){
        return color;
    }

    public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}