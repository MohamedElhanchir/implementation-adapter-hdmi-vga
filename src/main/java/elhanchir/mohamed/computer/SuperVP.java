package elhanchir.mohamed.computer;

public class SuperVP implements Vga, Hdmi {
    @Override
    public void display(String message) {
        System.out.println("..........SuperVP VGA.............");
        System.out.println(message);
        System.out.println("...........SuperVP VGA............");
    }

    @Override
    public void view(byte[] message) {
        System.out.println("..........SuperVP HDMI.............");
        System.out.println(new String(message));
        System.out.println("...........SuperVP HDMI............");
    }
}
