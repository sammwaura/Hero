import org.junit.*;
import static org.junit.Assert.*;


public class HeroTest {

    @Test 
    public void hero_instantiatesAppropriately_true() {
        Hero testHero = new Hero("Batman", 38,"immortal", "beast");
        assertEquals(true, testHero instanceof Hero);
    }

    @Test
    public void getName_instantiatesTheNameProperty_true(){
        Hero testHero = new Hero("Batman",38,"immortal", "beast");
        assertEquals("Batman", testHero.getName());
    }

    @Test
    public void getAge_instantiatesTheAgeProperty_String() {
        Hero testHero = new Hero("Batman", 38, "immortal", "beast");
        assertEquals(38, testHero.getAge());
    }

    @Test
    public void getAge_instantiatesTheStrengthArray_String() {
        Hero testHero = new Hero("Batman", 38, "immortal", "beast");
        assertEquals("immortal", testHero.getSuperPower());
    }

    @Test
    public void getAge_instantiatesTheWeaknessArray_String() {
        Hero testHero = new Hero("Batman", 38, "immortal", "beast");
        assertEquals("beast", testHero.getWeakness());
    }
}