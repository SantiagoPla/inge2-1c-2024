package org.autotest.operators.conditionals;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtIf;
import spoon.reflect.declaration.CtElement;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#REMOVE_CONDITIONALS
 *
 * Este operador reemplaza los valores en las condiciones de guardas por true.
 */
public class TrueConditionalsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        return candidate instanceof CtIf;
    }

    @Override
    public void process(CtElement candidate) {
        CtIf if_ = (CtIf)candidate;
        CtExpression<Boolean> false_ = candidate.getFactory().Code().createLiteral(true);
        if_.setCondition(false_);
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtIf if_ = (CtIf) candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                if_.getCondition().toString() + " por " + "true" +
                " en la línea " + if_.getPosition().getLine() + ".";
    }
}
