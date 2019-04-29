package Random.Misc;

public class Blender implements Blendable {

    private String itemToBlend;
    private boolean isOn;

    public Blender(String item) {
        //check to see if the user entered an item to blend.
        if (item != null && item.length() != 0) {
            this.itemToBlend = item;
            isOn = true;
            System.out.println("Starting up...");
        } else {
            System.out.println("Blender is inoperable please check your owner's manual and try again.");
            isOn = false;
        }

    }


    @Override
    public void blending() throws InterruptedException {
        //check to see if the user entered an item to blend.
        if (itemToBlend != null && itemToBlend.length() != 0) {
            System.out.println("Now in progress: blending " + itemToBlend);
            Thread.sleep(5000);
            System.out.println("Your " + itemToBlend + " smoothie is ready.");
        } else {
            warning();
        }
        isOn = false;
    }

    @Override
    public void liquefying() throws InterruptedException {
        //check to see if the user entered an item to blend.
        if (itemToBlend != null && itemToBlend.length() != 0) {
            System.out.println("Now in progress: liquefying " + itemToBlend);
            Thread.sleep(5000);
            System.out.println("Your liquefied " + itemToBlend + " is ready.");
        } else {

            warning();

        }
        isOn = false;

    }

    @Override
    public void warning() {
        System.out.println("Please add water and try again.");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    public String toString() {
        return "Turning blender off.";
    }



}

