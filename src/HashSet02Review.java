import java.util.*;

public class HashSet02Review {
    public static void main(String[] args) {
/*
 İcinde degerleri olan bir array i arraylist e cevirecek
    return tipi arrayList olacak bir metod yaziniz.
    {"reha", "hakan", "haluk", "ipek", "ahsen"}

    main metod altinda metod ile gelen listeyi kullanarak
     HashSet, TreeSet ve linkedHashSet leri doldurun.
 */


        String arr[] = {"reha", "hakan", "haluk", "ipek", "ahsen"};
        System.out.println("Array = "+Arrays.toString(arr));

      List<String> arrList = arrayToArrayList(arr);     //array'ı methoda gönderip return eden listeyi atama yapıyorum
        System.out.println("ArrayList = "+arrList);

        HashSet<String> arrHashSet = new HashSet<String>(arrayToArrayList(arr));
        System.out.println("arrHashSet = " + arrHashSet);

        TreeSet<String> arrTreeSet = new TreeSet<String>(arrayToArrayList(arr));
        System.out.println("arrTreeSet = " + arrTreeSet);

        LinkedHashSet<String> arrLinkedHashSet = new LinkedHashSet<String>(arrayToArrayList(arr));
        System.out.println("arrLinkedHashSet = " + arrLinkedHashSet);

    }

    private static List arrayToArrayList(String[] arr) {
        List<String> arrList = Arrays.asList(arr);

        return arrList;
    }
}
