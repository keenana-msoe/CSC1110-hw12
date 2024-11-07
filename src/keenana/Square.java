/*
 * Course: CSC 1110 131
 * Term: Fall 2023
 * Assignment: HW 12
 * Name: Andrew Keenan
 * Created: 11-15-23
 */
package keenana;

/**
 * class for the Square object
 */
public class Square extends Rectangle {
    /**
     * constructor for the Square
     * @param side the side of the Square
     */
    public Square(double side){
        super(side, side);
    }
    /**
     * The override of the object's to string method
     * @return the string to be formatted for toString
     */
    public String toString(){
        return Color.CYAN.color+"Square:\n"+"Side: "+ FORMATTER.format(sideA)+
                "\nArea: "+FORMATTER.format(getArea());
    }
}
