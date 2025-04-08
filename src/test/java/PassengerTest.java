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

    @Test
    void getLastNameSuccess(){
        newPass.setLast_name("Towney");
        assertEquals("Towney", newPass.getLast_name());
    }

   @Test
    void getLastNameFailure(){
        newPass.setLast_name("ab");
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            newPass.getLast_name();});
       assertEquals("Can't be less then 3 characters", ex.getMessage());
   }

   @Test
    void getAgeSuccess(){
        newPass.setAge(19);
        assertEquals(19, newPass.getAge());
   }

   @Test
    void getAgeFailure(){
        newPass.setAge(10);
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            newPass.getAge();});
        assertEquals("Must be 18 or older", ex.getMessage());
   }

   @Test
    void getIDCodeSuccess(){
        newPass.setID_Code("abcdef");
        assertEquals("abcdef", newPass.getID_Code());
   }

   @Test
    void getIDCodeFailure(){
        newPass.setID_Code("abc");
        Exception ex = assertThrows(IllegalArgumentException.class, () ->{
            newPass.getID_Code();});
        assertEquals("Must be at least 6 characters", ex.getMessage());
   }

}
