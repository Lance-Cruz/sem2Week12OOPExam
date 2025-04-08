import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

    Passenger newPass;
    @BeforeEach
    void setUp(){
        newPass = new Passenger();
    }

    @Test
    void getTitleSuccess(){
        assertEquals("Mr", newPass.getTitle());
    }

    @Test
    void getTitleFailure(){
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            newPass.getTitle();});
        assertEquals("Must be Mr, Mrs or Ms", ex.getMessage());
    }

}
