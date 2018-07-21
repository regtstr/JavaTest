package bdlogix.sendbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectTest {
    @Test
    public void testArea() {
        Rectangle r = new Rectangle(5, 7);
        Assert.assertEquals(r.area(), 35.0);
    }
}
