package lee.zac.InitializationLab1;


import com.sun.tools.internal.xjc.reader.xmlschema.BindYellow;

public class ColorfulThing {

    private Color color;

    public ColorfulThing(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public enum Color {
        RED, BLUE, GREEN
    }

}

