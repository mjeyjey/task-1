package chapter1;
//
public class ConstructorLesson1 {
    public static void main(String[] args) {
        System.out.println("ConstructorLesson1");
    }
}

class Swan{
    int numberEggs;
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 3;
        System.out.println("Swan number of eggs=");
        System.out.println(mother.numberEggs);
    }
}
class Name{
    String first ="Marc";
    String last = "Yim";
    String full = first+last;
    public static void main(String[] args) {
        Name name1 = new Name();
        System.out.println(name1.full);
        name1.first = "Anton";
        name1.last = "Racal";
        System.out.println(name1.full);
    }
}