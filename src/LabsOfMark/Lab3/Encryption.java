package LabsOfMark.Lab3;
import java.util.*;

public class Encryption {
    // phrase = УЯЗВИМОСТЬ(10) КОМПЬЮТЕРНОЙ(12) СИСТЕМЫ(7) - ЭТО(3) НЕКАЯ(5) ЕЕ(2) НЕУДАЧНАЯ(9) ХАРАКТЕРИСТИКА(14), КОТОРАЯ(7)
    // ДЕЛАЕТ(6) ВОЗМОЖНЫМ(9) ВОЗНИКНОВЕНИЕ(13) УГРОЗЫ(6) = 103
    // key = ОТНОШЕНИЕ(9)

    public static void main(String[] args) {
        String alphabet = "АБВГДЕЖ3ИЙКЛМНОПРСТУФКЦЧШЩЬЫЪЭЮЯ";
        String phrase = "УЯЗВИМОСТЬ КОМПЬЮТЕРНОЙ СИСТЕМЫ - ЭТО НЕКАЯ ЕЕ НЕУДАЧНАЯ " +
                "ХАРАКТЕРИСТИКА, КОТОРАЯ ДЕЛАЕТ ВОЗМОЖНЫМ ВОЗНИКНОВЕНИЕ УГРОЗЫ";
        String key = "ОТНОШЕНИЕ";  // (6,8,4,7,9,1,5,3,2)
        System.out.println(phrase);
        phrase = cleanInputPhrase(phrase, key);
        List<List<String>> lists = createTable(phrase, key);
        int[] keys = new int[key.length()];
        int index;
        int counter = 1;
        while (!key.trim().isEmpty()) {
            for (String letter : alphabet.split("")) {
                if (key.contains(letter)) {
                    index = key.indexOf(letter);
                    key = key.replaceFirst(letter, " ");
                    keys[index] = counter++;
                    break;
                }
            }
        }
        Map<Integer, List<String>> map = new TreeMap<>();
        for (int i = 0; i < key.length(); i++) {
            map.put(keys[i], lists.get(i));
        }
        output(map);
    }

    public static String cleanInputPhrase(String phrase, String key) {
        phrase = phrase.replaceAll(" ","")
                .replaceAll(",","")
                .replaceAll("-","")
                .replaceAll("\\.", "")
                .replaceAll("\\?", "")
                .replaceAll("!","");
        int spaces = phrase.length() % key.length();
        for (int i = 0; i <= spaces; i++) {
            phrase += " ";
        }
        return phrase;
    }

    public static List<List<String>> createTable(String phrase, String key) {
        int rows = phrase.length() / key.length();
        int columns = key.length();
        String[][] table = new String[rows][columns];
        int counter = 0;
        List<List<String>> lists = new ArrayList<>();
        List<String> list;
        for (int j = 0; j < columns; j++) {
            list = new ArrayList<>();
            for (int i = 0; i < rows; i++) {
                list.add(String.valueOf(phrase.charAt(counter++)));
            }
            lists.add(list);
        }
        return lists;
    }

    public static void output(Map<Integer, List<String>> encrypted) {
        int counter = 0;
        for (List<String> value : encrypted.values()) {
            for (String s : value) {
                System.out.printf("%s", s);
                counter++;
                if (counter == 5) {
                    System.out.print(" ");
                    counter = 0;
                }
            }
        }
    }
}
