package mooc.vandy.java4android.calculator.logic;

/**
 * Defines the interface for processing user calculations.
 */
public interface LogicInterface<T extends  Number> {
    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(T argumentOne,
                        T argumentTwo,
                        int operation);
}
