/*
* This program is a Triangle class.
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2022-01-08
*/

/**
 * Triangle.
 */
public class Triangle {
    /**
    * Side virables.
    */
    private int side1;
    /**
    * Side virables.
    */
    private int side2;
    /**
    * Side virables.
    */
    private int side3;

    /**
    * Constructor.
    *
    * @param newSide1 side
    * @param newSide2 side
    * @param newSide3 side
    */
    public Triangle(final int newSide1, final int newSide2,
                   final int newSide3) {
        this.side1 = newSide1;
        this.side2 = newSide2;
        this.side3 = newSide3;
        final boolean temp = this.isValid(this.side1, this.side2, this.side3);
        if (!temp) {
            throw new ArithmeticException();
        }
    }

    /**
    * Getter.
    *
    * @return side one.
    */
    public int getSide1() {
        return this.side1;
    }

    /**
    * Getter.
    *
    * @return side one.
    */
    public int getSide2() {
        return this.side2;
    }

    /**
    * Getter.
    *
    * @return side one.
    */
    public int getSide3() {
        return this.side3;
    }

    /**
    * Is valid.
    *
    * @param side1
    * @param side2
    * @param side3
    * @return true or false.
    */
    private boolean isValid(final int side1, final int side2, final int side3) {
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            return true;
        } else {
            return false;
        }
    }

    /**
    * Perimeter.
    *
    * @return perimeter.
    */
    public int getPerimeter() {
        final int perimeter = this.side1 + this.side2 + this.side3;
        return perimeter;
    }

    /**
    * Semi perimeter.
    *
    * @return semi perimeter.
    */
    public int getSemiPerimeter() {
        return this.getPerimeter() / 2;
    }

    /**
    * Area.
    *
    * @return Area.
    */
    public double getArea() {
        final int semiPerim = this.getSemiPerimeter();
        final double area = Math.sqrt(semiPerim * (
                                      semiPerim - this.side1) * (
                                      semiPerim - this.side2) * (
                                      semiPerim - this.side3));
        return area;
    }

    /**
    * Name of Triangle.
    *
    * @return name
    */
    public String getName() {
        String returnVal = "";
        if (this.side1 == this.side2 && this.side1 == this.side3) {
            returnVal = "Equilateral";
        } else if (this.side1 == this.side2 || this.side2 == this.side3 || this.side1 == this.side3) {
            returnVal = "Isoceles";
        } else {
            returnVal = "Scalene";
        }
        return returnVal;
    }

    /**
    * Get height
    *
    * @return hight
    */
    public double getHeight1() {
        final double height = (2 * this.getArea()) / this.side1;
        return height;
    }

    /**
    * Get height
    *
    * @return hight
    */
    public double getHeight2() {
        final double height = (2 * this.getArea()) / this.side2;
        return height;
    }

    /**
    * Get height
    *
    * @return hight
    */
    public double getHeight3() {
        final double height = (2 * this.getArea()) / this.side3;
        return height;
    }

    /**
    * inner circle Radius
    *
    * @return radius
    */
    public double getInnerCircleRadius(){
        return this.getArea() / this.getSemiPerimeter();
    }

    /**
    * Circucile radius.
    *
    * @return radius
    */
    public double getCircumsicleRadius(){
        final  double radius = (this.side1 * this.side2 * this.side3) / (this.getArea() * 4);
        return radius;
    }
}
