package six;

public class EncapsulMain {
    public static void main(String[] args) {


       EncapsulWrite write   =new EncapsulWrite();
        write.setNumber(200);

        EncapsulRead read=new EncapsulRead();
        System.out.println("Encapsulation Read " + read.getNumber());



        EncapsulWriteAndRead wr   =new EncapsulWriteAndRead();
        wr.setNumber(150);
        System.out.printf("Write And Read:"+wr.getNumber());

    }
}
