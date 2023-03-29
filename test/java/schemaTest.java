import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

class schemaTest {

    @Test
    @DisplayName("Laat zien dat dit ArrayList alleen spierGroep onthoudt")
    void lijst() {
        ArrayList<String> koen = new ArrayList<>();
        koen.add("Kuiten");
        koen.add("Borst");
        assertEquals("Kuiten",koen.get(0));
        assertEquals("Borst",koen.get(1));

    }
}
