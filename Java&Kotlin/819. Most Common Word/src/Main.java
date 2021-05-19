import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] arg) {

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = new String[] {"hit"};

        mostCommonWord(paragraph, banned);

        System.out.println(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath());

        String f = new File("819.%20Most%20Common%20Word/Test_File.txt").getAbsolutePath();
        System.out.println(f.toString());

    }

    private static String mostCommonWord(String paragraph, String[] banned) {

        // Convert original string to all lowercase
        paragraph = paragraph.toLowerCase();

        // Remove all special characters
        paragraph = paragraph.replaceAll("[^a-zA-z0-9 ]", " ");

        // Mapping each word
        Map<String, Integer> commonWordOccurrences = new HashMap<>();

        String[] words = paragraph.split("\\s+");

        for (String word : words) {
            if (commonWordOccurrences.containsKey(word)) {
                int occurrences = commonWordOccurrences.get(word);
                occurrences++;
                commonWordOccurrences.replace(word, occurrences);
            } else if (!commonWordOccurrences.containsKey(word) && word.length() != 0) {
                commonWordOccurrences.putIfAbsent(word, 1);
            }
        }

        String result = "";
        int max = 0;
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        for (Map.Entry<String, Integer> entry : commonWordOccurrences.entrySet()) {
            if (!bannedSet.contains(entry.getKey()) && max < entry.getValue()) {
                System.out.printf("entry.key: %s, entry.value: %d\n", entry.getKey(), entry.getValue());
                result = entry.getKey();
                max = entry.getValue();
            }
        }

        System.out.printf("result: %s\n", result);

        return result;

    }

    @Test
    private void testCases() {
        File f = new File(getClass().getResource("Test_File.txt").getFile());
        System.out.println(f.toString());
    }

}
