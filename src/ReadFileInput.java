import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFileInput {
    public static void main(String[] args) {
        try {
            File myObj = new File("src/input.txt");
            Scanner myReader = new Scanner(myObj);
            ArrayList<String> MDRList = new ArrayList<>();
            ArrayList<String> BNIList = new ArrayList<>();
            ArrayList<String> BTNList = new ArrayList<>();
            ArrayList<String> MTPList = new ArrayList<>();
            ArrayList<String> BCAList = new ArrayList<>();
            ArrayList<String> KASList = new ArrayList<>();
            ArrayList<String> TMYList = new ArrayList<>();
            ArrayList<String> CMBList = new ArrayList<>();
            ArrayList<String> NOBList = new ArrayList<>();
            ArrayList<String> BRIList = new ArrayList<>();
            ArrayList<String> BISList = new ArrayList<>();
            ArrayList<String> BSRList = new ArrayList<>();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String replace = data.replace(";", ",");
                String[] ary = replace.split(",");
                String msgAlert = "Envi "+ary[1] + " Port "+ary[2] +" Terpantau "+ary[4];

                if (ary[0].equals("MDR")) {
                    MDRList.add(msgAlert);
                } else if (ary[0].equals("BNI")) {
                    BNIList.add(msgAlert);
                } else if (ary[0].equals("BTN")) {
                    BTNList.add(msgAlert);
                } else if (ary[0].equals("MTP")) {
                    MTPList.add(msgAlert);
                } else if (ary[0].equals("BCA")) {
                    BCAList.add(msgAlert);
                } else if (ary[0].equals("KAS")) {
                    KASList.add(msgAlert);
                } else if (ary[0].equals("CMB")) {
                    CMBList.add(msgAlert);
                } else if (ary[0].equals("NOB")) {
                    NOBList.add(msgAlert);
                } else if (ary[0].equals("TMY")) {
                    TMYList.add(msgAlert);
                } else if (ary[0].equals("BIS")) {
                    BISList.add(msgAlert);
                } else if (ary[0].equals("BSR")) {
                    BSRList.add(msgAlert);
                } else if (ary[0].equals("BRI")) {
                    BRIList.add(msgAlert);
                }
            }

            if (MDRList.size() > 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("Selamat Siang Rekan Bank MDR");
                System.out.println("Mohon Bantuan Untuk Sign On pada Envi berikut : ");
                MDRList.forEach(System.out::println);
                System.out.println(" ");

            }

            if (BNIList.size() > 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("Selamat Siang Rekan Bank BNI");
                System.out.println("Mohon Bantuan Untuk Sign On pada Envi berikut : ");
                BNIList.forEach(System.out::println);
                System.out.println(" ");
            }

            if (BTNList.size() > 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("Selamat Siang Rekan Bank BTN");
                System.out.println("Mohon Bantuan Untuk Sign On pada Envi berikut : ");
                BTNList.forEach(System.out::println);
                System.out.println(" ");
            }

            if (MTPList.size() > 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("Selamat Siang Rekan Bank MTP");
                System.out.println("Mohon Bantuan Untuk Sign On pada Envi berikut : ");
                MTPList.forEach(System.out::println);
                System.out.println(" ");
            }

            if (BCAList.size() > 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("Selamat Siang Rekan Bank BCA");
                System.out.println("Mohon Bantuan Untuk Sign On pada Envi berikut : ");
                BCAList.forEach(System.out::println);
                System.out.println(" ");
            }

            if (KASList.size() > 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("Selamat Siang Rekan Bank KAS");
                System.out.println("Mohon Bantuan Untuk Sign On pada Envi berikut : ");
                KASList.forEach(System.out::println);
                System.out.println(" ");
            }

            if (CMBList.size() > 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("Selamat Siang Rekan Bank CMB");
                System.out.println("Mohon Bantuan Untuk Sign On pada Envi berikut : ");
                CMBList.forEach(System.out::println);
                System.out.println(" ");
            }

            if (NOBList.size() > 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("Selamat Siang Rekan Bank NOB");
                System.out.println("Mohon Bantuan Untuk Sign On pada Envi berikut : ");
                NOBList.forEach(System.out::println);
                System.out.println(" ");
            }

            if (TMYList.size() > 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("Selamat Siang Rekan Bank TMY");
                System.out.println("Mohon Bantuan Untuk Sign On pada Envi berikut : ");
                TMYList.forEach(System.out::println);
                System.out.println(" ");
            }
            if (BISList.size() > 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("Selamat Siang Rekan Bank BIS");
                System.out.println("Mohon Bantuan Untuk Sign On pada Envi berikut : ");
                BISList.forEach(System.out::println);
                System.out.println(" ");
            }

            if (BSRList.size() > 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("Selamat Siang Rekan Bank BSR");
                System.out.println("Mohon Bantuan Untuk Sign On pada Envi berikut : ");
                BSRList.forEach(System.out::println);
                System.out.println(" ");
            }
            if (BRIList.size() > 0) {
                System.out.println("-----------------------------------------------");
                System.out.println("Selamat Siang Rekan Bank BRI");
                System.out.println("Mohon Bantuan Untuk Sign On pada Envi berikut : ");
                BRIList.forEach(System.out::println);
                System.out.println(" ");
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("error.");
            e.printStackTrace();
        }
    }
}