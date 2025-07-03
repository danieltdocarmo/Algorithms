//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in 
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9};
        final var result = Sum.sum(array, array.length - 1);
        System.out.printf("Resultado da soma de todos os numeros do array: %d\n",result);

        //Algoritimo de recursao de uma lista
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        final var resultList = CountList.countList(list, 0);
        System.out.printf("Resultado da lista: %d\n", resultList);
    }
}