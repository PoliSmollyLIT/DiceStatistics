package bg.tuvarna.oop.core.api.newgame;

import bg.tuvarna.oop.core.api.base.Operation;
import bg.tuvarna.oop.core.api.base.OperationInput;
import bg.tuvarna.oop.core.api.base.OperationResult;
import lombok.*;

import static bg.tuvarna.oop.core.api.newgame.NewGame.*;

public interface NewGame extends Operation<NewGameInput, NewGameResponse> {
    @Builder
    @Getter
    @Setter(AccessLevel.PRIVATE)
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    class NewGameInput implements OperationInput {
        private Long player1Id;
        private Long player2Id;
        private int maxDiesRows;
    }

    @Builder
    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    class NewGameResponse implements OperationResult {
        private Long winningPlayerId;
    }
}
