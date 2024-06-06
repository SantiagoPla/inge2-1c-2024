package inge2.dataflow.zeroanalysis;

import java.util.Arrays;
import java.util.List;

/**
 * This enum represents the possible values of the zero analysis for a variable.
 */
public enum ZeroAbstractValue {

    /**
     * We don't have information about the variable.
     */
    BOTTOM("bottom"),

    /**
     * The variable is not zero.
     */
    NOT_ZERO("not-zero"),

    /**
     * The variable is zero.
     */
    ZERO("zero"),

    /**
     * The variable may be (or not) zero.
     */
    MAYBE_ZERO("maybe-zero");

    /**
     * The name of the ZeroAbstractValue.
     */
    private final String name;

    public boolean isValidValue() {
        List<String> validNames = Arrays.asList("zero", "not-zero", "maybe-zero", "bottom");
        return validNames.contains(this.name);
    }

    @Override
    public String toString() {
        return this.name;
    }

    ZeroAbstractValue(String name) {
        this.name = name;
    }

    /**
     * Returns the result of the addition between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the addition.
     */
    public ZeroAbstractValue add(ZeroAbstractValue another) {
        if (!(this.isValidValue() && another.isValidValue()))
            throw new UnsupportedOperationException();
        if (another == BOTTOM || this == BOTTOM)
            return BOTTOM;

        switch (another) {
            case ZERO:
                return this;
            case NOT_ZERO:
                return (this == ZERO) ? NOT_ZERO : MAYBE_ZERO;
        }
        return MAYBE_ZERO;
    }

    /**
     * Returns the result of the division between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the division.
     */
    public ZeroAbstractValue divideBy(ZeroAbstractValue another) {
        if (!(this.isValidValue() && another.isValidValue()))
            throw new UnsupportedOperationException();
        if (another == BOTTOM || this == BOTTOM || another == ZERO)
            return BOTTOM;
        if (this == ZERO)
            return ZERO;
        if (this == NOT_ZERO)
            return NOT_ZERO;

        return MAYBE_ZERO;
    }

    /**
     * Returns the result of the multiplication between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the multiplication.
     */
    public ZeroAbstractValue multiplyBy(ZeroAbstractValue another) {
        if (!(this.isValidValue() && another.isValidValue()))
            throw new UnsupportedOperationException();
        if (another == BOTTOM || this == BOTTOM)
            return BOTTOM;
        if (another == ZERO || this == ZERO)
            return ZERO;
        if (another == NOT_ZERO && this == NOT_ZERO)
            return NOT_ZERO;

        return MAYBE_ZERO;


    }

    /**
     * Returns the result of the subtraction between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the subtraction.
     */
    public ZeroAbstractValue subtract(ZeroAbstractValue another) {
        if (!(this.isValidValue() && another.isValidValue()))
            throw new UnsupportedOperationException();
        if (another == BOTTOM || this == BOTTOM)
            return BOTTOM;

        switch (another) {
            case ZERO:
                return this;
            case NOT_ZERO:
                return (this == ZERO) ? NOT_ZERO : MAYBE_ZERO;
        }
        return MAYBE_ZERO;
    }

    /**
     * Returns the result of the merge between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the merge.
     */
    public ZeroAbstractValue merge(ZeroAbstractValue another) {
        if (!(this.isValidValue() && another.isValidValue()))
            throw new UnsupportedOperationException();
        if (this == MAYBE_ZERO || another == MAYBE_ZERO)
            return MAYBE_ZERO;
        if (this == another)
            return another;
        if (this == BOTTOM)
            return another;
        if (another == BOTTOM)
            return this;
        return MAYBE_ZERO;
    }
}
