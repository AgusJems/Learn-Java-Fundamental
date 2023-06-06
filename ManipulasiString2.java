// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


public class ManipulasiString2 {
    public static void main(String[] args) {
        String[] supportedPhones = {"1,2,3,4,5", "6,7,8,4,5"};

        String[] arr1 = supportedPhones[0].split(",");
        String[] arr2 = supportedPhones[1].split(",");

        System.out.print("Data yang sama = ");

        for (String item1 : arr1) {
            for (String item2 : arr2) {
                if (item1.equals(item2)) {
                    System.out.print(item1 + ",");
                }
            }
        }

        if (System.out.checkError()) {
            System.out.println("\b");
        }
    }
}

