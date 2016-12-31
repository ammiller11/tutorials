/**
 * Created by Alyssa Miller on 12/12/2016.
 */
public class Main {
    public static void main(String[] args){
        //int has a width of 32
        int myMinValue= -2147483648;
        int minMaxValue = 2147483647;

            // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue= (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has a width of 16
        short myShortValue = 32767;

        byte myByte = 18;
        short myShort = 400;
        int myInt = 23;
        long myLong = 50000 + (10)*((myByte) + (myShort)+(myInt));

        System.out.println(myLong);

    }
}
