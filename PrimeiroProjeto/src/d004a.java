
import java.util.Locale;


public class d004a {
    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        String language = currentLocale.getLanguage();
        System.out.println("Lingua do sistema: "+ language);
    }
}
