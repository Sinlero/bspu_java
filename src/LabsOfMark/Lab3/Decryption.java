package LabsOfMark.Lab3;

import java.util.ArrayList;
import java.util.List;

public class Decryption {
    private static String alphabet = "АБВГДЕЖ3ИЙКЛМНОПРСТУФКЦЧШЩЬЫЪЭЮЯ";
    private static String phrase = "КЕВСА УЯМХА УОТЕЯ ЕПАКГ ЗЕТЗЕ ЬРОРН МВВНЮ АТОИЫ ОИЕТК ОЗКЭЗ МУЕТР ЫНТМО ДРЕА_ ОООСА НРЯ_В НЖТЧО ИД_ЕЕ НЬНЙС Е_НКЫ КАСТЛ _ИАМО ЯИИ";
    private static String key = "ОТНОШЕНИЕ"; // (6,8,4,7,9,1,5,3,2)

    public static void main(String[] args) {
        System.out.println("Ключ: " + key);
        System.out.println("Шифрованный текст: " + phrase);
        phrase = phrase.replaceAll(" ","");
        String[][] table = getTable(phrase);
        System.out.println("Дешифрованный текст: " + decrypt(table));
    }

    public static String decrypt(String[][] table) {
        StringBuilder out = new StringBuilder();
        int[] keys = Encryption.getNums(key);
        List<List<String>> lists = new ArrayList<>();
        for (int j = 0; j < key.length(); j++) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < phrase.length() / key.length(); i++) {
                list.add(table[i][j]);
            }
            lists.add(list);
        }
        int counter = 0;
        for (int i = 0; i < keys.length; i++) {
            for (String letter : lists.get(keys[i] - 1)) {
                if (counter == 5) {
                    out.append(" ");
                    counter = 0;
                }
                out.append(letter);
                counter++;
            }
        }
        return out.toString();
    }

    public static String[][] getTable(String phrase) {
        int rows = phrase.length() / key.length();
        int columns = key.length();
        int counter = 0;
        String[][] table = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                table[i][j] = String.valueOf(phrase.charAt(counter++));
            }
        }
        return table;
    }
}
