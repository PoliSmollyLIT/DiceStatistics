package bg.tuvarna.oop.core.api.base;

import bg.tuvarna.oop.core.api.base.OperationInput;
import bg.tuvarna.oop.core.api.base.OperationResult;

public interface Operation<I extends OperationInput, R extends OperationResult> {

    R process(I getInput);
}