import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class frameTest {

    
    @Test
    @DisplayName("Laat zien dat de variable's goed opgeslagen worden")
    void getNaam() {
        frame f = new frame("Test","Test",1,1,1,1);
        assertEquals("Test",f.getNaam());

    }
}
