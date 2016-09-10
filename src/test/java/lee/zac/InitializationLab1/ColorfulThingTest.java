package lee.zac.InitializationLab1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by zaclee on 9/9/16.
 */
public class ColorfulThingTest {

    @Test
    public void getColorTest() {
        ColorfulThing colorfulThing = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing.Color expectedColor = ColorfulThing.Color.GREEN;
        ColorfulThing.Color actualColor = colorfulThing.getColor();
        assertEquals("The color should be yellow",expectedColor,actualColor);

    }


}
