/*
 * Course: CSC 1110 131
 * Term: Fall 2023
 * Assignment: HW 12
 * Name: Andrew Keenan
 * Created: 11-15-23
 */
package keenana;

/**
 * class for the Rectangle object
 */
public class Rectangle extends Parallelogram {
    /**
     * constructor for the Rectangle clas
     * @param longerSide the longer side
     * @param shorterSide the shorter side
     */
    public Rectangle(double longerSide, double shorterSide){
        super(longerSide, shorterSide, RIGHT_ANGLE);
    }
    /**
     * The override of the object's to string method
     * @return the string to be formatted for toString
     */
    public String toString(){
        return Color.GREEN.color+"Rectangle: \n"+"Longer side: "+
                FORMATTER.format(sideA)+"\nShorter side: "+ FORMATTER.format(sideB)+"\nArea: "+
                FORMATTER.format(getArea());
    }
    public double getArea(){
        return sideA * sideB;
    }
}
