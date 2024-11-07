/*
 * Course: CSC 1110 131
 * Term: Fall 2023
 * Assignment: HW 12
 * Name: Andrew Keenan
 * Created: 11-15-23
 */
package keenana;

/**
 * class for the Parallelogram quadrilateral
 */
public class Parallelogram extends Quadrilateral {
    /**
     * constructor for the shape using the attributes of
     * quadrilateral
     * @param longerSide the longer side of the shape
     * @param shorterSide the shorter side
     * @param angle the acute angles
     */
    public Parallelogram(double longerSide, double shorterSide, double angle){
        final double obtuse = 180;
        sideA = longerSide;
        sideC = longerSide;
        sideB = shorterSide;
        sideD = shorterSide;
        angleBC = obtuse-angle;
        angleCD = angle;
        angleAB = angle;
        angleDA = obtuse-angle;
    }

    @Override
    public double getArea() {
        return sideC * getHeight();
    }

    /**
     * The override of the object's to string method
     * @return the string to be formatted for toString
     */
    public String toString(){
        return Color.BLUE.color+"Parallelogram: \n"+"Longer side: "
                + FORMATTER.format(sideA)+"\nShorter side: "+ FORMATTER.format(sideB)+
                "\nAcute angle: "+ FORMATTER.format(angleAB)+"\nObtuse angle: "
                + FORMATTER.format(angleBC)+"\nArea: "+ FORMATTER.format(getArea());
    }

    /**
     * compares another object to this object
     * @param o the object to compare
     * @return if it is the same
     */
    public boolean equals(Object o){
        if(!(o instanceof Parallelogram)){
            return false;
        } else if (o == this){
            return true;
        } else {
            return sideA == ((Parallelogram)o).sideA &&
                   sideB == ((Parallelogram)o).sideB &&
                   sideC == ((Parallelogram)o).sideC &&
                   sideD == ((Parallelogram)o).sideD &&
                   angleAB == ((Parallelogram)o).angleAB &&
                   angleBC == ((Parallelogram)o).angleBC &&
                   angleCD == ((Parallelogram)o).angleCD &&
                   angleDA == ((Parallelogram)o).angleDA;
        }
    }
    private double getHeight(){
        double rads = Math.toRadians(angleCD);
        return Math.sin(rads) * sideD;
    }
}
