import java.util.ArrayList;

public class Main {

    private static void findDuplicationNumber(int[] numbers) {
        ArrayList<Integer> hasil = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            boolean duplikasi = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplikasi = true;
                    break;
                }
            }
            if (duplikasi && !hasil.contains(numbers[i])) {
                hasil.add(numbers[i]);
            }
        }
        System.out.println(hasil);
    }

    public static void main(String[] args) {
        int[] input1 = {1,1};
        findDuplicationNumber(input1); // [1]

        int[] input2 = {1,2,3,4};
        findDuplicationNumber(input2); // []

        int[] input3 = {1, 2, 1, 2, 2, 3, 4, 5, 5, 5, 5};
        findDuplicationNumber(input3); // [1, 2, 5]
    }
}
