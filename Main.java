/*
* This program test vehicle class.
*
* @author  Felipe Garcia Affonso
* @version 1.0
* @since   2021-12-22
*/

/**
 * Main.
 */
final class Main {
    /**
    * Constant.
    */
    private static final String RAD = "rad.";

    /**
     * Prevent instantiation
     * Throw an exception IllegalStateException.
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        final Triangle testTri = new Triangle(3, 4, 5);
        System.out.println("Created a 3 by 4 by 5 Triangle.");

        System.out.println("Perimeter: " + testTri.getPerimeter());

        System.out.println("Semi perimeter: " + testTri.getSemiPerimeter());

        System.out.println("Area: " + testTri.getArea());

        System.out.println("Type: " + testTri.getType());

        System.out.println("Height1: " + testTri.getHeight1());
        System.out.println("Height2: " + testTri.getHeight2());
        System.out.println("Height3: " + testTri.getHeight3());

        System.out.println("Angle1: " + testTri.getAngle1() + RAD);
        System.out.println("Angle2: " + testTri.getAngle2() + RAD);
        System.out.println("Angle3: " + testTri.getAngle3() + RAD);

        System.out.println("Inner circle radius: "
                           + testTri.getInnerCircleRadius());
        System.out.println("Circumcircle radius: "
                           + testTri.getCircumsicleRadius());

        System.out.println();

        final Triangle testTri2 = new Triangle(4, 4, 4);
        System.out.println("Created a 4 by 4 by 4 Triangle.");

        System.out.println("Perimeter triangle2: " + testTri2.getPerimeter());

        System.out.println("Semi perimeter triangle2: "
                           + testTri2.getSemiPerimeter());

        System.out.println("Area triangle2: " + testTri2.getArea());

        System.out.println("Type triangle2: " + testTri2.getType());

        System.out.println("Height1 triangle2: " + testTri2.getHeight1());
        System.out.println("Height2 triangle2: " + testTri2.getHeight2());
        System.out.println("Height3 triangle2: " + testTri2.getHeight3());

        System.out.println("Angle1 triangle2: " + testTri2.getAngle1()
                           + RAD);
        System.out.println("Angle2 triangle2: " + testTri2.getAngle2()
                           + RAD);
        System.out.println("Angle3 triangle2: " + testTri2.getAngle3()
                           + RAD);

        System.out.println("Inner circle radius triangle2: "
                           + testTri2.getInnerCircleRadius());
        System.out.println("Circumcircle radius triangle2: "
                           + testTri2.getCircumsicleRadius());

        try {
            System.out.println("\nCreating 3 by 3 by 15 Triangle:");
            final Triangle testTri3 = new Triangle(3, 3, 15);
        } catch (ArithmeticException error) {
            System.out.println("Error: invalid triangle.");
        }

        System.out.println("\nDone.");
    }
}
