/*
 * Course: CSC 1110 131
 * Term: Fall 2023
 * Assignment: HW 12
 * Name: Andrew Keenan
 * Created: 11-15-23
 */
package keenana;

import java.text.DecimalFormat;

/**
 * shape interface to clarify shapes
 */
public interface Shape {
    /**
     * formats the decimals for double values
     */
    DecimalFormat FORMATTER = new DecimalFormat("#.##");
    /**
     * the angle for a right angle is 90
     */
    double RIGHT_ANGLE = 90;

    /**
     * abstract method all shapes must use which is getitng
     * the area
     * @return the area as a double
     */
    public abstract double getArea();
}