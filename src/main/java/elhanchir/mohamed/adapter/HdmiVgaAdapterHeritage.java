package elhanchir.mohamed.adapter;

import elhanchir.mohamed.computer.Tv;
import elhanchir.mohamed.computer.Vga;

public class HdmiVgaAdapterHeritage extends Tv implements Vga {



    @Override
    public void display(String message) {
        System.out.println("*********Adapter ****************");
        byte[] bytes = message.getBytes();
        super.view(bytes);
        System.out.println("*********Adapter /****************");
    }


}
