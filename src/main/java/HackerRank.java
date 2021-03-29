
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class HackerRank {

        // Complete the beautifulDays function below.
        static int beautifulDays(int i, int j, int k) {
            String[] daysAsStr = new String[j - i + 1];
            for (int d = 0; d < daysAsStr.length; d++) {
                daysAsStr[d] = String.valueOf(i+d);
            }

            StringBuilder sb = new StringBuilder();
            int beautifulDaysCount = 0;
            for (String str: daysAsStr) {
                sb.setLength(0);
                long orig = Long.parseLong(str);
                long reversed = Long.parseLong(sb.append(str)
                        .reverse()
                        .toString());

                if ((reversed - orig) % k == 0) beautifulDaysCount++;
            }
            return beautifulDaysCount;

        }

        static int viralAdvertisiint groupSize = 5;
        int liked, cumulativeLiked = 0;
            for (int i = 1; i <=n; i++) {
            liked = (groupSize/2);
            groupSize = liked*3;
            cumulativeLiked += liked;
        }
            return cumulativeLiked;ng(int n) {
            int groupSize = 5;
            int liked, cumulativeLiked = 0;
            for (int i = 1; i <=n; i++) {
                liked = (groupSize/2);
                groupSize = liked*3;
                cumulativeLiked += liked;
            }
            return cumulativeLiked;

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] ijk = scanner.nextLine().split(" ");

            int i = Integer.parseInt(ijk[0]);

            int j = Integer.parseInt(ijk[1]);

            int k = Integer.parseInt(ijk[2]);

            int result = beautifulDays(i, j, k);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }

