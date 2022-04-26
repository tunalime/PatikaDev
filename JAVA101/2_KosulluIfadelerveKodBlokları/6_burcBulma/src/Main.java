import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("########## BURÇ BULMA ##########");

        /*
        Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 KasıM
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
         */
        Scanner scanner = new Scanner(System.in);

        boolean isError = true;

        System.out.print("Doğduğunuz Ay: ");
        String ay = scanner.nextLine();

        System.out.print("Doğduğunuz Gün: ");
        int gun = scanner.nextInt();

        String burc = null;

        if (ay.equals("Ocak")){
            if (gun >= 1 && gun <= 21){
                burc = "Oğlak";
                isError = false;
            }
            else if (gun >= 22 && gun <= 31){
                burc = "Kova";
                isError = false;
            }
        }
        else if (ay.equals("Şubat")){
            if (gun >= 1 && gun <= 19){
                burc = "Kova";
                isError = false;
            }
            else if (gun >= 20 && gun <= 29){
                burc = "Balık";
                isError = false;
            }
        }
        else if (ay.equals("Mart")){
            if (gun >= 1 && gun <= 20){
                burc = "Balık";
                isError = false;
            }
            else if (gun >= 21 && gun <= 31){
                burc = "Koç";
                isError = false;
            }
        }
        else if (ay.equals("Nisan")){
            if (gun >= 1 && gun <= 20){
                burc = "Koç";
                isError = false;
            }
            else if (gun >= 21 && gun <= 30){
                burc = "Boğa";
                isError = false;
            }
        }
        else if (ay.equals("Mayıs")){
            if (gun >= 1 && gun <= 21){
                burc = "Boğa";
                isError = false;
            }
            else if (gun >= 22 && gun <= 31){
                burc = "İkizler";
                isError = false;
            }
        }
        else if (ay.equals("Haziran")){
            if (gun >= 1 && gun <= 22){
                burc = "İkizler";
                isError = false;
            }
            else if (gun >= 23 && gun <= 30){
                burc = "Yengeç";
                isError = false;
            }
        }
        else if (ay.equals("Temmuz")){
            if (gun >= 1 && gun <= 22){
                burc = "Yengeç";
                isError = false;
            }
            else if (gun >= 23 && gun <= 31){
                burc = "Aslan";
                isError = false;
            }
        }
        else if (ay.equals("Ağustos")){
            if (gun >= 1 && gun <= 22){
                burc = "Aslan";
                isError = false;
            }
            else if (gun >= 23 && gun <= 31){
                burc = "Başak";
                isError = false;
            }
        }
        else if (ay.equals("Eylül")){
            if (gun >= 1 && gun <= 22){
                burc = "Başak";
                isError = false;
            }
            else if (gun >= 23 && gun <= 30){
                burc = "Terazi";
                isError = false;
            }
        }
        else if (ay.equals("Ekim")){
            if (gun >= 1 && gun <= 22){
                burc = "Terazi";
                isError = false;
            }
            else if (gun >= 23 && gun <= 31){
                burc = "Akrep";
                isError = false;
            }
        }
        else if (ay.equals("Kasım")){
            if (gun >= 1 && gun <= 21){
                burc = "Akrep";
                isError = false;
            }
            else if (gun >= 22 && gun <= 30){
                burc = "Yay";
                isError = false;
            }
        }
        else if (ay.equals("Aralık")){
            if (gun >= 1 && gun <= 21){
                burc = "Yay";
                isError = false;
            }
            else if (gun >= 22 && gun <= 31){
                burc = "Oğlak";
                isError = false;
            }
        }

        if (isError){
            System.out.println("Hatalı giriş yaptınız.");
        }
        else {
            System.out.println("Burcunuz: "+burc);
        }
    }
}
