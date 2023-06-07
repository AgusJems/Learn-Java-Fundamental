package com.agussaf;

public class methodMhs {
    private static long Id=1;
    public static long simpanMhs(String nama,String alamat,String nik){
        System.out.println("Nama \t:" + nama);
        System.out.println("Alamat \t:" + alamat);
        System.out.println("NIK \t:" +nik);

        long id = Id++;
        return  id;

    }

    public static void main(String[] args) {
        long idMhs=simpanMhs("Leonel Messi","Argentina","2121211134");
        deleteMhs(idMhs);
    }
    public static void  deleteMhs(long id){
        System.out.println("data mahasiswa berhasil di Delete");

    }


}
