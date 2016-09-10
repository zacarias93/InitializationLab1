package lee.zac.InitializationLab1;

/**
 * Created by zaclee on 9/9/16.
 */
public class InitializationLab1 {

    public static void main(String[] args) {

        BoringThing boringThing1 = new BoringThing();
        BoringThing boringThing2 = new BoringThing();
        BoringThing boringThing3 = new BoringThing();
        BoringThing boringThing4 = new BoringThing();
        BoringThing boringThing5 = new BoringThing();

        ColorfulThing colorfulThing1 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing colorfulThing2 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing3 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing colorfulThing4 = new ColorfulThing(ColorfulThing.Color.BLUE);
        ColorfulThing colorfulThing5 = new ColorfulThing(ColorfulThing.Color.RED);

        //Gives error - needs argument
        // ColorfulThing colorfulThing6 = new ColorfulThing();

        System.out.println(colorfulThing1.getColor());
        System.out.println(colorfulThing2.getColor());
        System.out.println(colorfulThing3.getColor());
        System.out.println(colorfulThing4.getColor());
        System.out.println(colorfulThing5.getColor());


    }
}
