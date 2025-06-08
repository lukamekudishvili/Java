import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class ContactData {
    private static final String phoneData = """
            Charlie Brown, 3334445555
            Maid Marion, 1234567890
            Mickey Mouse, 9998887777
            Mickey Mouse, 1247489758
            Minnie Mouse, 4567805666
            Robin Hood, 5647893000
            Robin Hood, 7899028222
            Lucy Van Pelt, 5642086852
            Mickey Mouse, 9998887777
            """;

    private static final String emailData = """
            Mickey Mouse, mckmouse@gmail.com
            Mickey Mouse, micky1@aws.com
            Minnie Mouse, minnie@verizon.net
            Robin Hood, rhood@gmail.com
            Linus Van Pelt, lvpelt2015@gmail.com
            Daffy Duck, daffy@google.com
            """;

    public static List<Contact> getData(String dataType) {
        List<Contact> dataList = new ArrayList<>();
        Scanner scanner = new Scanner(dataType.equalsIgnoreCase("phone") ? phoneData : emailData);
        while (scanner.hasNext()) {
            String[] data = scanner.nextLine().split(",");
            Arrays.asList(data).replaceAll(String::trim);
            if (dataType.equalsIgnoreCase("phone")) {
                dataList.add(new Contact(data[0], Long.parseLong(data[1])));
            } else if (dataType.equalsIgnoreCase("email")) {
                dataList.add(new Contact(data[0], data[1]));
            }

        }

        return dataList;
    }


}
