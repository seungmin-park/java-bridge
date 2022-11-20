package bridge.utils.validator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidatorTest {

    private static final String ERROR_MESSAGE = "[ERROR]";

    @ParameterizedTest
    @ValueSource(strings = {"q","@","ㅂ","2","21"})
    void InputBridgeSizeNotNumberOrOutRangeNumber(String input) {
        assertThatThrownBy(() -> BridgeValidator.validSize(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(ERROR_MESSAGE);
    }
}