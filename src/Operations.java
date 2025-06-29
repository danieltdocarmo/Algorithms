public class Operations{

    public static int sum(int[] array, int index) {

        if (index < 0) {
            index = 0;
        }

        int result = array[index];

        if (index == 0) {
            return result;
        } else {
            return result + sum(array, index - 1);
        }
    }
}