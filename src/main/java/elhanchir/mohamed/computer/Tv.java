package elhanchir.mohamed.computer;

public class Tv implements Hdmi {

    @Override
    public void view(byte[] message) {
        System.out.println("********** TV **********");
        System.out.println(new String(message));
        System.out.println("********** TV **********");
    }
}
