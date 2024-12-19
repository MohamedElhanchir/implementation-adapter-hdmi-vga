package elhanchir.mohamed.computer;

public class VideoProjecteur implements Vga {
    @Override
    public void display(String message) {
        System.out.println("..........VP.............");
        System.out.println(message);
        System.out.println("...........VP............");
    }
}
