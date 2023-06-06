// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class ManipulasiString {
    public static void main(String[] args) {
        String[] sd = {"12345", "67845"};

        int count = 0;
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < sd[0].length(); i++) {
            if (sd[0].charAt(i) != sd[1].charAt(i)) {
                count++;
                message.append(i).append(", ");
            }
        }

        if (count > 0) {
            message.insert(0, "Total karakter tidak sama adalah " + count + " yaitu ");
            message.setLength(message.length() - 2);
            message.append(".");
        } else {
            message.append("Semua karakter sama.");
        }

        System.out.println(message.toString());
    }
}
