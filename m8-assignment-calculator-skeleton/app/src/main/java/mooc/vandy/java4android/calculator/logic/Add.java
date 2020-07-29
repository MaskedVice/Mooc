package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add<T extends Number> {
    private T mArgumentOne;
    private T mArgumentTwo;
    public Add(T argumentOne, T argumentTwo) {
        mArgumentOne = argumentOne;
        mArgumentTwo = argumentTwo;
    }

    @Override
    public String toString() {
        return String.valueOf(mArgumentOne.doubleValue()+mArgumentTwo.doubleValue());
    }
}
