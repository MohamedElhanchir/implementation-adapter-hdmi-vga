package elhanchir.mohamed.computer;

public class Ecran implements Vga {
    @Override
    public void display(String message) {
        System.out.println("=========Ecran==============");
        System.out.println(message);
        System.out.println("=========Ecran==============");
    }
}
