/*
 * Course: CSC 1110 131
 * Term: Fall 2023
 * Assignment: HW 12
 * Name: Andrew Keenan
 * Created: 11-15-23
 */
package keenana;

/**
 * the object class for a Right Triangle
 */
public class RightTriangle extends Triangle {
    /**
     * constructor for a right trianle
     * @param height the height of the triangle
     * @param base the base of the trianlge
     */
    public RightTriangle(double height, double base){
        super(height, Math.sqrt(Math.pow(height, 2)+Math.pow(base, 2)), base);
    }
    /**
     * The override of the object's to string method
     * @return the string to be formatted for toString
     */
    public String toString(){
        return Color.YELLOW.color+"Right Triangle:\nSide A:"+ FORMATTER.format(sideA)+"\nSide B: "+
                FORMATTER.format(sideB)+"\nBase: "+ FORMATTER.format(base)+"\nAngleAB: "+
                FORMATTER.format(angleAB)+ "\nAngleBaseB: "+FORMATTER.format(angleBaseB)+
                "\nAngleBaseA: "+ FORMATTER.format(angleBaseA)+"\nArea: "+
                FORMATTER.format(getArea());
    }
    public double getArea(){
        return (base * sideA) / 2;
    }
}
