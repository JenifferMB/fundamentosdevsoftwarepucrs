import java.beans.Transient;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {
    
    //Test
    @Test
    public void manyDigits(){
        RomanNumeral n = new RomanNumeral();
        int result = n.convert("MMXXII");
        Assertions.assertEquals(2022, result);
    }
}
