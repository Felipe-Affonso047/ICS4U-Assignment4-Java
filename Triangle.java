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
    * Constant.
    */
    private static final double HALF_PIE = 1.5707963267948966;

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
    * @throws ArithmeticException error
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
    * Is valid?.
    *
    * @return true or false.
    */
    private boolean isValid() {
        final boolean returnVal;
        if (side1 + side2 > side3
            && side1 + side3 > side2
            && side2 + side3 > side1) {
            returnVal = true;
        } else {
            returnVal = false;
        }
        return returnVal;
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
    public String getType() {
        String returnVal = "";
        if (this.side1 == this.side2 && this.side1 == this.side3) {
            returnVal = "Equilateral";
        } else if (this.side1 == this.side2
                   || this.side2 == this.side3
                   || this.side1 == this.side3) {
            returnVal = "Isoceles";
        } else {
            returnVal = "Scalene";
        }

        if (this.getAngle1() == HALF_PIE
            || this.getAngle2() == HALF_PIE
            || this.getAngle3() == HALF_PIE) {
            returnVal = returnVal + " Square";
        } else if (this.getAngle1() > HALF_PIE
                   || this.getAngle2() > HALF_PIE
                   || this.getAngle3() > HALF_PIE) {
            returnVal = returnVal + " Obituse";
        } else {
            returnVal = returnVal + " Acute";
        }
        return returnVal;
    }

    /**
    * Get Angle.
    *
    * @return angle
    */
    public double getAngle1() {
        return Math.acos((Math.pow(this.side2, 2)
                          + Math.pow(this.side3, 2)
                          - Math.pow(this.side1, 2))
                          / (2 * this.side2 * this.side3));
    }

    /**
    * Get Angle.
    *
    * @return angle
    */
    public double getAngle2() {
        return Math.acos((Math.pow(this.side1, 2)
                          + Math.pow(this.side3, 2)
                          - Math.pow(this.side2, 2))
                          / (2 * this.side3 * this.side1));
    }

    /**
    * Get Angle.
    *
    * @return angle
    */
    public double getAngle3() {
        return Math.acos((Math.pow(this.side2, 2)
                          + Math.pow(this.side1, 2)
                          - Math.pow(this.side3, 2))
                          / (2 * this.side2 * this.side1));
    }

    /**
    * Get height.
    *
    * @return hight
    */
    public double getHeight1() {
        final double height = (2 * this.getArea()) / this.side1;
        return height;
    }

    /**
    * Get height.
    *
    * @return hight
    */
    public double getHeight2() {
        final double height = (2 * this.getArea()) / this.side2;
        return height;
    }

    /**
    * Get height.
    *
    * @return hight
    */
    public double getHeight3() {
        final double height = (2 * this.getArea()) / this.side3;
        return height;
    }

    /**
    * Inner circle Radius.
    *
    * @return radius
    */
    public double getInnerCircleRadius() {
        return this.getArea() / this.getSemiPerimeter();
    }

    /**
    * Circucile radius.
    *
    * @return radius
    */
    public double getCircumsicleRadius() {
        final double radius = (this.side1 * this.side2 * this.side3)
                              / (this.getArea() * 4);
        return radius;
    }
}
