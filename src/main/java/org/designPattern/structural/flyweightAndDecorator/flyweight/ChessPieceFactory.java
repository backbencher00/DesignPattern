package org.designPattern.structural.flyweightAndDecorator.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessPieceFactory {

    private static final Map<String, ChessPiece> pieces = new HashMap<>();

    public static ChessPiece getPiece(String pieceType) {

        if (!pieces.containsKey(pieceType)) {
            switch (pieceType) {
                case "King"   -> pieces.put(pieceType, new ConcreteChessPiece("King",   "K"));
                case "Queen"  -> pieces.put(pieceType, new ConcreteChessPiece("Queen",  "Q"));
                case "Rook"   -> pieces.put(pieceType, new ConcreteChessPiece("Rook",   "R"));
                case "Bishop" -> pieces.put(pieceType, new ConcreteChessPiece("Bishop", "B"));
                case "Knight" -> pieces.put(pieceType, new ConcreteChessPiece("Knight", "N"));
                case "Pawn"   -> pieces.put(pieceType, new ConcreteChessPiece("Pawn",   "P"));
                default       -> throw new IllegalArgumentException("Unknown piece type");
            }
        }

        return pieces.get(pieceType);
    }
}