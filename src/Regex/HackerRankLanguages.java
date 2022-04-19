package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankLanguages {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String input = "43\n" +
                "80104 S\n" +
                "93084 IF\n" +
                "79484 NKTD\n" +
                "50466 WFC\n" +
                "39820 GX\n" +
                "19613 LUA\n" +
                "82326 D\n" +
                "44340 C\n" +
                "29142 JAVASCRIPT\n" +
                "84114 D\n" +
                "63530 K\n" +
                "42780 AI\n" +
                "30889 T\n" +
                "97555 HASKELL\n" +
                "18736 SBCL\n" +
                "25291 DHFJMI\n" +
                "10634 TUQD\n" +
                "39182 YTIU\n" +
                "71035 MFICHIEU\n" +
                "13610 HASKELL\n" +
                "14001 VQNL\n" +
                "91252 JGNJXCVS\n" +
                "43264 OBJECTIVEC\n" +
                "95565 PHP\n" +
                "39130 MPBQY\n" +
                "84735 R\n" +
                "14693 OKKNCGRBG\n" +
                "76643 CPP\n" +
                "19146 MBMVVQX\n" +
                "38164 ZXTGR\n" +
                "37867 BHKQSLHJNE\n" +
                "93399 M\n" +
                "15681 ERLANG\n" +
                "88309 HTHIHY\n" +
                "86597 GB\n" +
                "29177 CLOJURE\n" +
                "31059 BRAINFUCK\n" +
                "35407 YVXHGUCMX\n" +
                "93764 YXIKMIAMGR\n" +
                "94531 SCALA\n" +
                "30812 BASH\n" +
                "11038 BASH\n" +
                "78556 PYTHON";
        String str = "C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA:ERLANG:CLISP:LUA:BRAINFUCK:JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART:GROOVY:OBJECTIVEC";
        str = str.replaceAll(":", "\\$)|(");
        str = "(" + str + "$)";
        Scanner scanner = new Scanner(input);
        int N = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile(String.format("^\\d{5}\\s+(%s)", str));
        Matcher matcher;
        for (int i = 0; i < N; i++) {
            boolean valid = false;
            String req = scanner.nextLine();
            matcher = pattern.matcher(req);
            while (matcher.find()) {
                String language = matcher.group(1);
                if (str.contains(language)) {
                    valid = true;
                }
            }
            if (valid) {
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        }
        scanner.close();
        System.out.println(System.currentTimeMillis() - start);
    }
}
