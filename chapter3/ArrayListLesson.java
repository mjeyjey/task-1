package chapter3;
import java.util.*;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add('c');
        list1.add(true);
        list1.add("were");
        System.out.println(list1);
        System.out.println(list1.remove("were")); // boolean remove(Object object)
        System.out.println(list1.remove(1)); // boolean remove(int index)
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(21);
        list2.add(20);
        list2.add(15);
        list2.add(14);
        list2.add(11);
        System.out.println(list2.add(10)); // boolean add(E element)
        list2.add(0,1); // void add(int index, E element)
        System.out.println(list2);
        int q = 10;
        Integer w = 20;
        List nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        System.out.println(nums);
        nums.remove(1);
        System.out.println(nums);
        String[] array = {"one","two"};
        List<String> list = Arrays.asList(array);
        System.out.println(list.size()); //output 2
        List nums2 = Arrays.asList(9,6,5,7,3,1,4,2,8);
        Collections.sort(nums2); //aayusin yung pagkakasunodsunod
        List list3 = new ArrayList<>(nums2);
        System.out.println(nums2);
        Collections.reverse(nums2); // reverse
        System.out.println(nums2);
        Collections.shuffle(nums2);
        System.out.println(nums2);


    }
}
