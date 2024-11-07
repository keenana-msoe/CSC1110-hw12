/*
 * Course: CSC 1110 131
 * Term: Fall 2023
 * Assignment: HW 12
 * Name: Andrew Keenan
 * Created: 11-15-23
 */
package keenana;

/**
 * the color codes returned in string form
 */
public enum Color {
    /**
     * reset to black
     * the color Black
     * the color Red
     */
    RESET("\u001B[0m"), BLACK("\u001B[30m"), RED("\u001B[31m"),
    /**
     * the color Green
     * the color Yellow
     * the color Blue
     */
    GREEN("\u001B[32m"), YELLOW("\u001B[33m"), BLUE("\u001B[34m"),
    /**
     * the color Magenta
     * the color Cyan
     * the color White
     */
    MAGENTA("\u001B[35m"), CYAN("\u001B[36m"), WHITE("\u001B[37m");
    String color;
    Color(final String color){
        this.color = color;
    }

    /**
     *returns the string of the color
     * @return the string code for the color
     */
    public String toString(){
        return this.color;
    }
}

