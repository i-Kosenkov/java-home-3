import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < (int) (Math.random() * 10 + 10); i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            if (itr.next() % 2 == 0){
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
