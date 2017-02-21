package ExceptionURL;

/**
 * Написать метод разбора списка параметров в формате URL:
 para1=value1&param2=value2&param3=value3. В случае ошибки в
 формате бросать исключение
 */

public class ExceptionUrl {

    public static void returnValue(String str) throws Exception {
        System.out.println();
        System.out.println("Return value: ");
        if (!str.contains("&")) {
            throw new Exception("Wrong parameter");
        }
        for (String retval : str.split("&")) {
            System.out.println(retval);
        }
    }

    public static void main(String args[]) {
        try {
            returnValue("para1=value1&param2=value2&param3=value3");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
