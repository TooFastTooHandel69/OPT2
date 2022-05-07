import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class oefeningenTest {

@Test
@DisplayName("Dit laat zien dat dit niet mogelijk is zonder printschema methoden.")
    void checkOefeningerbijkomt(){
   oefeningen h = new oefeningen("Test");
    assertNotEquals("Test", h.initialiseerOefeningen().get(0));

   
}

}