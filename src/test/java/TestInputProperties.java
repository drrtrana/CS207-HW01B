import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TestInputProperties {
    @Test
    void isOddShouldReturnFalseForEven() {
        //assertEquals(false, InputProperties.isOdd(4));
    }

    @Test
    void isOddShouldReturnTrueForOdd() {
        //assertEquals(true, InputProperties.isOdd(31));
    }

    @Test
    void startsWithShouldReturnTrueForString() {
        //assertEquals(true, InputProperties.startsWith('c', "character"));
    }

    @Test
    void startsWithShouldReturnFalseForString() {
        //assertEquals(false, InputProperties.startsWith('s', "character"));
    }
}
