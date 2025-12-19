package org.designPattern.structural.flyweightAndDecorator.flyweight;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Kings
        ChessPiece whiteKing = ChessPieceFactory.getPiece("King");
        whiteKing.draw(0, 4, "White");

        ChessPiece blackKing = ChessPieceFactory.getPiece("King");
        blackKing.draw(7, 4, "Black");

        // Queens
        ChessPiece whiteQueen = ChessPieceFactory.getPiece("Queen");
        whiteQueen.draw(0, 3, "White");
    }
}
