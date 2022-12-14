import java.util.*;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < (int) (Math.random() * 10 + 10); i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list);

        //Быстрый способ min и max
        System.out.println("Быстрый способ min и max");
        System.out.println("Минимальное значение: " + list.stream().min(Comparator.naturalOrder()).get());
        System.out.println("Максимальное значение: " + list.stream().max(Comparator.naturalOrder()).get());

        //Долгий способ min и max
        System.out.println();
        System.out.println("Долгий способ min и max");
        int max = list.get(0), min = list.get(0);
        for (int number : list){
            if (number >= max){
                max = number;
            }
            if(number < min){
                min = number;
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

        //Срденее значение элементов  в списке
        System.out.println();
        float sum = 0;
        for (int number : list) {
            sum += number;
        }
        System.out.println("Общее среднее: " + sum / list.size());
    }
}