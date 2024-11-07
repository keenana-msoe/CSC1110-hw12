/*
 * Course: CSC 1110 131
 * Term: Fall 2023
 * Assignment: HW 12
 * Name: Andrew Keenan
 * Created: 11-15-23
 */
package keenana;

/**
 * the class for the Triangle object
 */
public class Triangle implements Shape {
    protected final double sideA;
    protected final double sideB;
    protected final double base;
    protected double angleAB;
    protected double angleBaseA;
    protected double angleBaseB;

    /**
     * constructor for the triangle given the sides
     * @param sideA the side A of the trianlge
     * @param sideB the side B of the triangle
     * @param base the base of the triangle
     */
    public Triangle(double sideA, double sideB, double base){
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
        setAngles();
    }
    /**
     * The override of the object's to string method
     * @return the string to be formatted for toString
     */
    public String toString(){
        return Color.MAGENTA.color+"Triangle:\nSide A: "+ FORMATTER.format(sideA)+"\nSide B: "
                + FORMATTER.format(sideB)+"\nBase: "+ FORMATTER.format(base)+"\nAngleAB: "
                +FORMATTER.format(angleAB)+ "\nAngleBaseB: "+FORMATTER.format(angleBaseB)+
                "\nAngleBaseA: "+ FORMATTER.format(angleBaseA)+"\nArea: "+
                FORMATTER.format(getArea());
    }
    /**
     * compares another object to this object
     * @param o the object to compare
     * @return if it is the same
     */
    public boolean equals(Object o){
        if(!(o instanceof Triangle)){
            return false;
        } else if (o == this){
            return true;
        } else {
            return sideA == ((Triangle)o).sideA &&
                    sideB == ((Triangle)o).sideB &&
                    base == ((Triangle)o).base &&
                    angleAB == ((Triangle)o).angleAB &&
                    angleBaseB == ((Triangle)o).angleBaseB &&
                    angleBaseA == ((Triangle)o).angleBaseA;
        }
    }
    private void setAngles(){
        angleAB = Math.toDegrees(Math.acos((Math.pow(sideA, 2)+Math.pow(sideB, 2)-
                Math.pow(base, 2))/(2*sideB*sideA)));
        angleBaseA = Math.toDegrees(Math.acos((Math.pow(sideA, 2)+Math.pow(base, 2)-
                Math.pow(sideB, 2)) /(2*base*sideA)));
        angleBaseB = Math.toDegrees(Math.acos((Math.pow(sideB, 2)+ Math.pow(base, 2)-
                Math.pow(sideA, 2)) /(2*sideB*base)));
    }
    @Override
    public double getArea() {
        double sp = (sideA+sideB+base)/2;
        return Math.sqrt(sp) * (sp-sideA) * (sp-sideB) * (sp-base);
    }
}
