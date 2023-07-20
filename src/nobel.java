import java.util.Arrays;

public class nobel {
    public static int noblesnumber(int arr[]) {
        Arrays.sort(arr);
        int countSe = 0, countNe = 0;
        if (arr[0] == 0) {
            countNe++;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                countSe = i;
            }
            if (countSe == arr[i]) {
                countNe++;
            }
        }
        return countNe++;
    }
}
