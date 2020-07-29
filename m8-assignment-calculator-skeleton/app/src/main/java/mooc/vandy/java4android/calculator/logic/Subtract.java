package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract<T extends Number> {
    private T mArgumentOne;
    private T mArgumentTwo;
    public Subtract(T argumentOne, T argumentTwo) {
        mArgumentOne = argumentOne;
        mArgumentTwo = argumentTwo;
    }

    @Override
    public String toString() {
        return String.valueOf(mArgumentOne.doubleValue()-mArgumentTwo.doubleValue());
    }
}
