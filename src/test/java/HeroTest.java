import org.junit.*;
import static org.junit.Assert.*;


public class HeroTest {

    @Test 
    public void Hero_CorrectlyInsatiates_True(){
        Hero newHero = new Hero("Batman");
        assertEquals(true,newHero insatnceof Hero);
    }

    @Test
    public void Hero_instatiatesWithName_String(){
        Hero newHero = new Hero("Batman");
        assertEquals("Batman", newHero.getName());
    }
}