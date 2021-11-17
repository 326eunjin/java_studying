import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class SortNum2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i < len; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        for (int i : arr) {
            bw.write(Integer.toString(i));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}