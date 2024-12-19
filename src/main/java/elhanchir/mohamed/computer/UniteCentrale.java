package elhanchir.mohamed.computer;

public class UniteCentrale {
    private Vga vga;


    public void display(String message) {
        System.out.println("*************************");
        vga.display(message);
        System.out.println("*************************");
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
