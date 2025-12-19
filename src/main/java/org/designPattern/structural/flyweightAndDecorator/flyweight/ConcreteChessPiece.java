package org.designPattern.structural.flyweightAndDecorator.flyweight;

//concrete class with same properties
public class ConcreteChessPiece implements ChessPiece {
    private final String icon;
    private final String pieceType;
    ConcreteChessPiece(String pt, String i){
        this.icon = i;
        this.pieceType = pt;
    }

    @Override
    public void draw(int row, int column, String color) {
        System.out.println("drawing chess piece " + pieceType + " at positions { row : " + row + " } , " +
                "{ column : " + column + " } with icon : " + icon);
    }
}
