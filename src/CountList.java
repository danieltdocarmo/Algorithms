import java.util.List;

public class CountList {

public static int countList(List<Integer> list, int count) {
  
  if (count < 0) {
    count = 0;
  }
  
  if (list.isEmpty()) {
     return count;
   } else {
    //metodo 1
    //return countList(list.subList(1, list.size()), count + 1);

    //metodo 2
    list.remove(0);
    return countList(list, count + 1);
   }

 }
}