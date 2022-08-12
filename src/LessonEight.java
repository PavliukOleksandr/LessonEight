import java.util.regex.Matcher;
import java.util.regex.Pattern;


    public class LessonEight {
        public static void main(String[] args) {
            String a = "qwerty";
            String b = "qwe";
            System.out.println("э підстрокою - " + a.startsWith(b));// true
            String line = "Pavliuk Oleksandr Georgiyovuch";
            String[] words = line.split(" ");
            for(String w: words) {
                System.out.println(w + " ");
            }
            System.out.println(words[1] + " " + words[2] + " " + words[0]);
            String[] emails = new String[5];
            emails[0] = "Mykola Ivanovich Boyko";
            emails[1] = "Mykola_Ivanovich_Bondarenko";
            emails[2] = "Vasyl Ivanovych Melnyk";
            emails[3] = "Oleksandr Ivanovych Shevchenko";
            emails[4] = "Mykola Mykolayovych Kovalenko";
            String regex = "[A-Za-z0-9+_](.+)";
            Pattern pattern = Pattern.compile(regex);

            for(String email : emails){
                Matcher matcher = pattern.matcher(email);
                System.out.println(email +" : "+ matcher.matches());
            }
        }
    }
