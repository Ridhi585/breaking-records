import java.util.*;

public class breakingrecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of games
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        int maxRecord = scores[0];
        int minRecord = scores[0];
        int maxCount = 0;
        int minCount = 0;

        for (int i = 1; i < n; i++) {
            if (scores[i] > maxRecord) {
                maxRecord = scores[i];
                maxCount++;
            } else if (scores[i] < minRecord) {
                minRecord = scores[i];
                minCount++;
            }
        }

        System.out.println(maxCount + " " + minCount);

    }
}

