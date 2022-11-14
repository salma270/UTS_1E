import java.util.Random;
import java.util.Scanner;

public class JawabanNoTiga {
    int jumlahBus = 4; //Top Level, Middle Level, Regular Staf, Staff
    static int totalJumlahPenumpangBus = 240;
    public static String[] TopLevel = new String[90];
    public static String[] MiddleLevel = new String[30];
    public static String[] RegularStaff = new String[50];
    public static String[] Staff = new String[70];

    public static void PrintInfoPenumpangBus(){
        int totalTopLevel=0;
        int totalsisakuota=0;
        for (int index=0;index<TopLevel.length;index++){
            if (TopLevel[index] != null){
                totalTopLevel++;
            }
        }
        int totalMiddleLevel=0;
        for (int index=0;index<MiddleLevel.length;index++) {
            if (MiddleLevel[index] != null) {
                totalTopLevel++;
            }
        }
        int totalRegularStaff=0;
        for (int index=0;index<RegularStaff.length;index++) {
            if (RegularStaff[index] != null) {
                totalTopLevel++;
            }
        }
        int totalStaff=0;
        for (int index=0;index<Staff.length;index++) {
            if (Staff[index] != null) {
                totalTopLevel++;
            }
        }
        totalsisakuota = totalJumlahPenumpangBus - totalTopLevel - totalMiddleLevel - totalRegularStaff - totalStaff;
        System.out.println("Total Penumpang bus Top Level : " + totalTopLevel + " | Total Penumpang bus Middle Level: " + totalMiddleLevel + " | Total Penumpang bus Regular Staff " + totalRegularStaff +" | Total Penumpang bus Staff " + totalStaff);
        System.out.println("Jumlah Seluruh Penumpang Bus : " + totalJumlahPenumpangBus + " | Total Sisa Kuota: " + totalsisakuota);
        System.out.println();
    }
    public static void CheckIndexArray(String[] myArray,String penumpang){
        int indexNow = 0;
        for(int index=0; index<myArray.length;index++){
            if(myArray[index] != null){
                indexNow = index+1;
            }
        }
        if(indexNow < myArray.length){
            myArray[indexNow] = penumpang;
        }
    }
    public static void simpanPenumpang(int angkaRandom, String penumpang){
        switch (angkaRandom){
            case 1:
                CheckIndexArray(TopLevel,penumpang);
                System.out.println("Anda Mendapatkan Bus Top Level");
                PrintInfoPenumpangBus();
                break;
            case 2:
                CheckIndexArray(MiddleLevel,penumpang);
                System.out.println("Anda Mendapatkan Bus Middle Level");
                PrintInfoPenumpangBus();
                break;
            case 3:
                CheckIndexArray(RegularStaff,penumpang);
                System.out.println("Anda Mendapatkan Bus Regular Staff");
                PrintInfoPenumpangBus();
                break;
            case 4:
                CheckIndexArray(Staff,penumpang);
                System.out.println("Anda Mendapatkan Bus Staff");
                PrintInfoPenumpangBus();
                break;
        }
    }
    public static void inputPenumpang(){
        Scanner inputData = new Scanner(System.in);
        while (true){
            System.out.println("Nama Penumpang = ");
            String namaPenumpang = inputData.nextLine();
            if (namaPenumpang.isBlank()){
                System.out.println("Nama Penumpang wajib diisi ");
                inputPenumpang();
            }else {
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3)+1;
                simpanPenumpang(JenisRandom,namaPenumpang);
            }
        }
    }

    public static void main(String[] args) {
        inputPenumpang();
    }

}
