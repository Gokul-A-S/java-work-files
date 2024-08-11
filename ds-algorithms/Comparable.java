import java.util.*;

public class Comparable {
    public static void main(String[] args) {
        List<Laptop> laps=new ArrayList<Laptop>();
        laps.add(new Laptop("Dell",23000,4));
        laps.add(new Laptop("Asus",28000,8));
        laps.add(new Laptop("Lenovo",30000,16));

        Comparator<Laptop> cm =new Comparator<Laptop>() {
            @Override
            public int compare(Laptop l1, Laptop l2) {
                if (l1.price > l2.price) {
                    return 1;
                } else if (l1.price < l2.price) {
                    return -1;
                }
                return 0;
            }
        };
        Collections.sort(laps,cm);
        for (Laptop lap : laps) {
            System.out.println(lap.name+' '+lap.price+' '+lap.ram);
        }
    }


}
