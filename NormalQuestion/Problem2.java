package NormalQuestion;

public class Problem2 {
    public static void main(String[] args) {
        String demo = "aabcadbba";
        int size = demo.length();
        int count = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > 0; j--) {
                if (demo.charAt(i) == demo.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
        }
        System.out.println("Count : " + count);
    }
}
