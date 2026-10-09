public class average {

    public static double averages(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не может быть null или пустым");
        }

        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return (double) sum / arr.length;
    }
}