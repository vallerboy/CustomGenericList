/**
 * Created by Lenovo on 10.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        CustomList<Integer> integerList = new CustomList<>(1,2,3,5,6,412,3,123,23,1231);

        System.out.println("Random: " + integerList.getRandom());
        System.out.println("Pierwszy element: " + integerList.getFrist());
        System.out.println("Ostatni element: " + integerList.getLast());


        System.out.println("---------------------------");

        while(integerList.hasNext()){
             System.out.println(integerList.next());
        }
    }
}
