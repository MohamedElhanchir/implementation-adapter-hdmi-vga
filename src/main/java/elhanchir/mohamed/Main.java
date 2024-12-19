package elhanchir.mohamed;

import elhanchir.mohamed.adapter.HdmiVgaAdapter;
import elhanchir.mohamed.adapter.HdmiVgaAdapterHeritage;
import elhanchir.mohamed.computer.*;

public class Main {
    public static void main(String[] args) {
        UniteCentrale uniteCentrale = new UniteCentrale();
        uniteCentrale.setVga(new Ecran());
        uniteCentrale.display("Ecran");
        uniteCentrale.setVga(new VideoProjecteur());
        uniteCentrale.display("VP");
       // uniteCentrale.setVga(new Tv()); //error : Tv is not a Vga
        /* ******************** */

        System.out.println("xoxoxoxoxoxoxoxoxo");
        //using adapter
        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new Tv());
        uniteCentrale.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.display("DP Adapter - GLSID 3");
        System.out.println("xoxoxoxoxoxoxoxoxo");

        /*******************************/
        uniteCentrale.setVga(new SuperVP());
        uniteCentrale.display("Supper VP");



        HdmiVgaAdapter hdmiVgaAdapter2 = new HdmiVgaAdapter();
        hdmiVgaAdapter2.setHdmi(new SuperVP());
        uniteCentrale.setVga(hdmiVgaAdapter2);
        uniteCentrale.display("video projecteur => hdmi vga adapter => unite centrale");

        HdmiVgaAdapterHeritage hdmiVgaAdapterHeritage = new HdmiVgaAdapterHeritage();
        uniteCentrale.setVga(hdmiVgaAdapterHeritage);
        hdmiVgaAdapterHeritage.display("test");
    }
}