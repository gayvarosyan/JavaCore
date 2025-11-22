package Homeworks.FileAnalyzer;

import java.io.IOException;

public class FileAnalyzerMain {
    public static void main(String[] args) {
        FileAnalyzer analyzer = new FileAnalyzer();

        String path = "C:\\Users\\User\\Date\\lessons\\Java\\JavaCore\\src\\Homeworks\\FileAnalyzer\\test.txt";

        try {
            System.out.println("Word map: " + analyzer.wordMap(path));
            System.out.println("Total words: " + analyzer.totalWordCount(path));
            System.out.println("Unique words: " + analyzer.uniqueWordCount(path));
            System.out.println("Top 3 frequent words: " + analyzer.topFrequentWords(path, 3));
            System.out.println("Occurrences of 'java': " + analyzer.countWordOccurrences(path, "java"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
