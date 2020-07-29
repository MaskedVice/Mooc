package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic<T extends Number>
       implements LogicInterface {
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(Number argumentOne,
                        Number argumentTwo,
                        int operation) {
        // TODO -- start your code here
        {

            switch (operation) {
                case SUBTRACTION:
                    Subtract s = new Subtract(argumentOne, argumentTwo);
                    mOut.print(s.toString());
                    break;
                case MULTIPLICATION:
                    Multiply m = new Multiply(argumentOne, argumentTwo);
                    mOut.print(m.toString());
                    break;
                case DIVISION:
                    Divide d = new Divide(argumentOne, argumentTwo);
                    mOut.print(d.toString());
                    break;
                case ADDITION:
                    Add a = new Add(argumentOne, argumentTwo);
                    mOut.print(a.toString());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + operation);
            }
        }
    }
}
