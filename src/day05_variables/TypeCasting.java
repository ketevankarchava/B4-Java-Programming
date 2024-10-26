package day05_variables;

public class TypeCasting {

    public static void main(String[] args) {

        byte b = 40;
        int i = b; // the byte value will be converted automatically because byte is smaller than int

        int i2 = 100;
        // byte b2 = i2; // the int value canNot be automatically converted into byte
        byte bb2 = 100;

        byte b2 = (byte)i2; // Since we canNot automatically convert int into byte, we can use CASTING
        System.out.println(i2);
        System.out.println(b2);

        System.out.println();

        int i3 = 150;
        byte b3 = (byte)i3; // byte range is -128 to 127 ---- the DATA LOSS is happening
        System.out.println(i3);
        System.out.println(b3);

        System.out.println();

        double d1 = 34.6;
        int i4 = (int)d1; // after CASTING, it will keep the whole portion and loose the decimal
        System.out.println(d1);
        System.out.println(i4);

        System.out.println();

        int i9 = 46;
        double d5 = i9; // WIDENING CONVERSION
        System.out.println(i9);
        System.out.println(d5);


        int x;
        double y = 2.5;
       // x = y; // double is bigger than int


        int x2;
        short y2 = 4;
        x2 = y2; // short is smaller than int

    }


}
