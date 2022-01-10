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

        System.out.println(testTri.getArea());

        System.out.println(testTri.getName());

        System.out.println(testTri.getHeight1());
        System.out.println(testTri.getHeight2());
        System.out.println(testTri.getHeight3());

        System.out.println(testTri.getInnerCircleRadius());
        System.out.println(testTri.getCircumsicleRadius());

        System.out.println("\nDone.");
    }
}
