package mani.test.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {
    @Test
    public void TestArea(){

        Rectangle r = new Rectangle(4,5);
        Assert.assertEquals(r.area(), 20);
    }
}
