package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply<T extends Number> {
    private T mArgumentOne;
    private T mArgumentTwo;

    public  Multiply(T argumentOne, T argumentTwo) {
        mArgumentOne = argumentOne;
        mArgumentTwo = argumentTwo;
    }
    // TODO -- start your code here
    public String toString() {
        return String.valueOf(mArgumentOne.doubleValue()*mArgumentTwo.doubleValue());
    }
}
