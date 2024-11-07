/*
 * Course: CSC 1110 131
 * Term: Fall 2023
 * Assignment: HW 12
 * Name: Andrew Keenan
 * Created: 11-15-23
 */
package keenana;

/**
 * class for the circle object
 */
public class Circle implements Shape {
    private final double radius;

    /**
     * constructor for the circle given the radius
     * @param radius the radius for the circle being constructed
     */
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
    /**
     * The override of the object's to string method
     * @return the string to be formatted for toString
     */
    public String toString(){
        return Color.BLACK.color+"Circle:\n"+"Radius: "+ FORMATTER.format(radius)+
                "\nArea: "+FORMATTER.format(getArea());
    }
    /**
     * compares another object to this object
     * @param o the object to compare
     * @return if it is the same
     */
    public boolean equals(Object o){
        if(!(o instanceof Circle)){
            return false;
        } else if (o == this){
            return true;
        } else {
            return radius == ((Circle) o).radius;
        }
    }
}
