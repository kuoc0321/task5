import java.util.*;

public class WorkBreak {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        Map<String, List<String>> memo = new HashMap<>();
        return backtrack(s, wordSet, memo);
    }

    private List<String> backtrack(String s, Set<String> wordSet, Map<String, List<String>> memo) {
        if (memo.containsKey(s)) {
            return memo.get(s);
        }

        List<String> result = new ArrayList<>();
        if (s.isEmpty()) {
            result.add("  ");
            return result;
        }

        for (int end = 1; end <= s.length(); end++) {
            String word = s.substring(0, end);
            if (wordSet.contains(word)) {
                List<String> sublist = backtrack(s.substring(end), wordSet, memo);
                for (String sub : sublist) {
                    result.add(word + (sub.isEmpty() ? "" : " ") + sub);
                }
            }
        }

        memo.put(s, result);
        return result;
    }
}
