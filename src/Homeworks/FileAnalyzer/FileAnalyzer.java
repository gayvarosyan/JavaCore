package Homeworks.FileAnalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FileAnalyzer {

    private List<String> readWords(String path) throws IOException {
        return Files.readAllLines(Paths.get(path))
                .stream()
                .flatMap(line -> Arrays.stream(line.split("\\W+")))
                .filter(s -> !s.isBlank())
                .map(String::toLowerCase)
                .collect(Collectors.toList());
    }

    public Map<String, Integer> wordMap(String path) throws IOException {
        List<String> words = readWords(path);
        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        return map;
    }

    public int totalWordCount(String path) throws IOException {
        return readWords(path).size();
    }

    public int uniqueWordCount(String path) throws IOException {
        return new HashSet<>(readWords(path)).size();
    }

    public Map<String, Integer> topFrequentWords(String path, int n) throws IOException {
        Map<String, Integer> map = wordMap(path);

        return map.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(n)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
    }

    public int countWordOccurrences(String path, String word) throws IOException {
        Map<String, Integer> map = wordMap(path);
        return map.getOrDefault(word.toLowerCase(), 0);
    }
}