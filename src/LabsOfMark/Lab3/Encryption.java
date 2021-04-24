package LabsOfMark.Lab3;

import java.util.*;

public class Encryption {
    // phrase = УЯЗВИМОСТЬ(10) КОМПЬЮТЕРНОЙ(12) СИСТЕМЫ(7) - ЭТО(3) НЕКАЯ(5) ЕЕ(2) НЕУДАЧНАЯ(9) ХАРАКТЕРИСТИКА(14), КОТОРАЯ(7)
    // ДЕЛАЕТ(6) ВОЗМОЖНЫМ(9) ВОЗНИКНОВЕНИЕ(13) УГРОЗЫ(6) = 103
    // key = ОТНОШЕНИЕ(9)

    private static String alphabet = "АБВГДЕЖ3ИЙКЛМНОПРСТУФКЦЧШЩЬЫЪЭЮЯ";
    private static String phrase = "УЯЗВИМОСТЬ КОМПЬЮТЕРНОЙ СИСТЕМЫ - ЭТО НЕКАЯ ЕЕ НЕУДАЧНАЯ ХАРАКТЕРИСТИКА, КОТОРАЯ " +
            "ДЕЛАЕТ ВОЗМОЖНЫМ ВОЗНИКНОВЕНИЕ УГРОЗЫ";
    private static String key = "ОТНОШЕНИЕ";  // (6,8,4,7,9,1,5,3,2)

    public static void main(String[] args) {
        System.out.println("Ключ: " + key);
        System.out.println("Исходный текст: " + phrase);
        phrase = cleanInputPhrase(phrase, key);
        List<List<String>> lists = createTable(phrase, key);
        int[] keys = getNums(key);
        Map<Integer, List<String>> map = new TreeMap<>();
        for (int i = 0; i < key.length(); i++) {
            map.put(keys[i], lists.get(i));
        }
        System.out.println("Зашифрованный текст: " + getEncryptionFromMap(map));
    }

    public static int[] getNums(String key) {
        int[] indexes = new int[key.length()];
        int index;
        int counter = 1;
        while (!key.trim().isEmpty()) {
            for (String letter : alphabet.split("")) {
                if (key.contains(letter)) {
                    index = key.indexOf(letter);
                    key = key.replaceFirst(letter, " ");
                    indexes[index] = counter++;
                    break;
                }
            }
        }
        return indexes;
    }

    public static String cleanInputPhrase(String phrase, String key) {
        phrase = phrase.replaceAll(" ", "")
                .replaceAll(",", "")
                .replaceAll("-", "")
                .replaceAll("\\.", "")
                .replaceAll("\\?", "")
                .replaceAll("!", "");
        int spaces = phrase.length() % key.length();
        for (int i = 0; i <= spaces; i++) {
            phrase += " ";
        }
        return phrase;
    }

    public static List<List<String>> createTable(String phrase, String key) {
        int rows = phrase.length() / key.length();
        int columns = key.length();
        int counter = 0;
        List<List<String>> lists = new ArrayList<>();
        List<String> list;
        for (int i = 0; i < columns; i++) {
            list = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                list.add(String.valueOf(phrase.charAt(counter++)));
            }
            lists.add(list);
        }
        return lists;
    }

    public static String getEncryptionFromMap(Map<Integer, List<String>> encrypted) {
        String[][] table = new String[encrypted.size()][encrypted.get(1).size()];
        StringBuilder out = new StringBuilder();
        int counter = 0;
        for (List<String> value : encrypted.values()) {
            String[] array = new String[encrypted.get(1).size()];
            table[counter++] = value.toArray(array);
        }
        for (int j = 0; j < encrypted.get(1).size(); j++) {
            for (int i = 0; i < encrypted.size(); i++) {
                out.append(table[i][j]);
            }
        }
        counter = 0;
        for (int i = 0; i < out.length(); i++) {
            counter++;
            if (counter == 6) {
                out.insert(i, " ");
                counter = 0;
            }
        }
        return out.toString();
    }
}
