package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide<T extends Number> {
    private T mArgumentOne;
    private T mArgumentTwo;
    public Divide(T argumentOne, T argumentTwo) {
        mArgumentOne = argumentOne;
        mArgumentTwo = argumentTwo;
    }
    // TODO -- start your code here

    @Override
    public String toString() {
        String result = String.valueOf(mArgumentOne.intValue()/mArgumentTwo.intValue());
        result += " R:" + String.valueOf(mArgumentOne.intValue()%mArgumentTwo.intValue());
        return result;
    }
}
