import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeServiceTest {

    @Test
    void canIGetIn() {
        //Arrange
        AgeService service = new AgeService();

        //Act
        boolean result = service.canIGetIn(18);

        //Asserte
        assertEquals(true, result);
    }

    @Test
    void canIGetInNegative() {
        //Arrange
        AgeService service = new AgeService();

        //Act
        boolean result = service.canIGetIn(17);

        //Asserte
        assertEquals(false, result);
    }
}