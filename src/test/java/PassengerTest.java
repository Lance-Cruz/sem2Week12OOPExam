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
        newPass.setTitle("Mr");
        assertEquals("Mr", newPass.getTitle());
    }

    @Test
    void getTitleFailure(){
        newPass.setTitle("abc");
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            newPass.getTitle();});
        assertEquals("Must be Mr, Mrs or Ms", ex.getMessage());
    }

    @Test
    void getFirstNameSuccess(){
        newPass.setFirst_name("Mark");
        assertEquals("Mark", newPass.getFirst_name());
    }

    @Test
    void getFirstNameFailure(){
        newPass.setFirst_name("ac");
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            newPass.getFirst_name();});
        assertEquals("Can't be less then 3 characters", ex.getMessage());
    }

}
