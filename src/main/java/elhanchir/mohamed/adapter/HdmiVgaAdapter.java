package elhanchir.mohamed.adapter;

import elhanchir.mohamed.computer.Hdmi;
import elhanchir.mohamed.computer.Vga;

public class HdmiVgaAdapter implements Vga {

    private Hdmi hdmi;

    @Override
    public void display(String message) {
        System.out.println("*********Adapter ****************");
        byte[] bytes = message.getBytes();
        hdmi.view(bytes);
        System.out.println("*********Adapter /****************");
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
