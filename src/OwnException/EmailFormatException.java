package OwnException;

/**
 * Придумать свое исключение и написать соответствующий класс
 и использующий его код.
 */
public class EmailFormatException extends IllegalArgumentException{

    public EmailFormatException(String s) {
    super(s);
}
    public static void emailFormat(String s) throws EmailFormatException {
        if (!s.contains("@") || !s.contains(".")) {
            throw new EmailFormatException("Wrong email format");
        }
    }

    public static void main(String[] args) {
        try {
            emailFormat("name@gmailcom");
        } catch (EmailFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
