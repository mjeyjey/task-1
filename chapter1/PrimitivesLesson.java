package chapter1;

public class PrimitivesLesson {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        byte b = 127; // 127 premitive value of byte
        short a = 3500; // premitive value of short
        long max = 3123456789l; // does not compile if no 'l'
        int i = 2147483647; // 2147483647 max value of intiger
        float f = 3.14f; //
        double d = 5.1d; //
        char c = 127; // char can also store intigers (ASCII list)
        char C = 'a'+3;
        System.out.println(c);

    }
}
