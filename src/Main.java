import java.util.*;

public class Main {

    public static void main(String[] args) {
        String s = "catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        WorkBreak wb = new WorkBreak();
        List<String> result = wb.wordBreak(s, wordDict);
        System.out.println(result);
    }
}