package factory;

public class TelefonFabrikası {

    public static Telefon getTelefon(String model, String batraya, int en, int boy) {

        Telefon telefon;

        if ("S8".equalsIgnoreCase(model)) {
            telefon = new S8(model, batraya, en, boy);
        } else if ("Note8".equalsIgnoreCase(model)) {
            telefon = new Note8(model, batraya, en, boy);
        } else {
            throw new RuntimeException("Geçerli bir model değildir!");
        }

        return telefon;
    }
}
