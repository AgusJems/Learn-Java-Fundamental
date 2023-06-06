import java.io.*;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        //Buffered Read and Write
        BufferedReader reader;
        BufferedWriter writer;
        String csvKaryawan = "C://dataKaryawan/dataKaryawan.csv";
        String txtKaryawan = "C://dataKaryawan/dataKaryawan.txt";
        File csvFile = new File(csvKaryawan);
        File txtFile = new File(txtKaryawan);
        String csvTraining = "C://dataTraining/dataTraining.csv";
        String txtTraining = "C://dataTraining/dataTraining.txt";
        File csvFileTrain = new File(csvTraining);
        File txtFileTrain = new File(txtTraining);
        int pilih;
        do {
            System.out.println("===MENU===");
            System.out.println("1. Generate File txt dari data Karyawan");
            System.out.println("2. Generate File txt dari data Training");
            System.out.println("3. Generate File txt dari keduanya");
            System.out.println("0. EXIT");
            System.out.println("Pilih : ");
            Scanner scanner = new Scanner(System.in);
            pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    if (!csvFile.exists()) {
                        System.out.println("File data Karyawan.csv tidak ditemukan");
                        break;
                    }
                    try {
                        reader = new BufferedReader(new FileReader(csvFile));
                        writer = new BufferedWriter(new FileWriter(txtFile));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] data = line.split(",");
                            String nama = data[0];
                            String nik = data[1];
                            String gender = data[2];
                            String status = data[3];
                            String text = String.format("Nama: %s, Nik: %s, Gender: %s, Status: %s%n", nama, nik, gender, status);
                            writer.write(text);
                        }
                        writer.close();
                        System.out.println("File berhasil di-generate di direktori " + txtKaryawan);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    if (!csvFileTrain.exists()) {
                        System.out.println("File data Training.csv tidak ditemukan");
                        break;
                    }
                    try {
                        reader = new BufferedReader(new FileReader(csvFileTrain));
                        writer = new BufferedWriter(new FileWriter(txtFileTrain));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] data = line.split(",");
                            String pengajar = data[0];
                            String tema = data[1];
                            String judul = data[2];
                            String durasi = data[3];
                            String text = String.format("Pengajar: %s, Tema: %s, Judul: %s, Durasi: %s%n", pengajar, tema, judul, durasi);
                            writer.write(text);
                        }
                        writer.close();
                        System.out.println("File berhasil di-generate di direktori " + txtTraining);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    String csvFilePathK = "C://dataKaryawan/dataKaryawan.csv";
                    String csvFilePathT = "C://dataTraining/dataTraining.csv";
                    String txtFilePathB = "C://dataBoth/bothtxt.txt";
                    File csvFileK = new File(csvFilePathK);
                    File csvFileT = new File(csvFilePathT);
                    File txtFileB = new File(txtFilePathB);
                    if (!csvFileK.exists() || !csvFileT.exists()) {
                        System.out.println("File dataKaryawan.csv atau dataTraining.csv tidak ditemukan di folder " + csvFilePathK + " atau " + csvFilePathT);
                        break;
                    }
                    try {
                        writer = new BufferedWriter(new FileWriter(txtFileB));
                        reader = new BufferedReader(new FileReader(csvFileK));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] data = line.split(",");
                            String nama = data[0];
                            String nik = data[1];
                            String gender = data[2];
                            String status = data[3];
                            String text = String.format("Nama: %s, NIK: %s, Gender: %s, Status: %s%n", nama, nik, gender, status);
                            writer.write(text);
                        }
                        reader.close();
                        reader = new BufferedReader(new FileReader(csvFileT));
                        while ((line = reader.readLine()) != null) {
                            String[] data = line.split(",");
                            String pengajar = data[0];
                            String tema = data[1];
                            String judul = data[2];
                            String durasi = data[3];
                            String text = String.format("Pengajar: %s, Tema: %s, Judul: %s, Durasi: %s%n", pengajar, tema, judul, durasi);
                            writer.write(text);
                        }
                        writer.close();
                        System.out.println("File berhasil di-generate di direktori " + txtFilePathB);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    System.out.println("Keluar dari aplikasi...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan pilih lagi.");
            }
        } while (pilih != 0);
    }
}