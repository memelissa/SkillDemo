import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void returnSquared() {
        assertEquals(2 * 2, SkillDemo.Squared(2));
    }
}