package application;

import boardgame.Board;
import chess.ChessMatch;

public class Program {
    public static void main(String[] args) throws Exception {

        ChessMatch cm = new ChessMatch();
        UI.printBoard(cm.getPieces());

    }
}
