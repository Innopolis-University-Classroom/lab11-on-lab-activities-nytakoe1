public class Main {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Android android= new Android();
        Android android2= new Adapter(iphone);

        iphone.chargeByLightning();
        android.chargeByUSB();
        android2.chargeByUSB();

    }
}

interface LightningPort{
    public void chargeByLightning();
}

class Iphone implements LightningPort{

    @Override
    public void chargeByLightning() {
        System.out.println("your Phone is charging by Lightning");
    }
}

interface USBPort{
    public void chargeByUSB();
}

class Android implements USBPort{

    @Override
    public void chargeByUSB() {
        System.out.println("your Phone is charging by USB");

    }
}

class Adapter extends Android implements USBPort{
    LightningPort lightningPort;

    public Adapter(LightningPort lp){
        this.lightningPort=lp;
    }

    @Override
    public void chargeByUSB() {
        lightningPort.chargeByLightning();
    }
}
