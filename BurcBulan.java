import java.util.Scanner;
public class BurcBulan {
    public static void main(String[] args) {
        int month,day;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay :  ");
        month = input.nextInt();
        if(!(month<=12 && month>=1)){
            System.out.println("Geçersiz bir ay girdiniz.\n Program Sonlandırıldı.");
            return;
        }
        System.out.print("Doğduğunuz gün :  ");
        day = input.nextInt();

        if(month == 1){
            if(!((day>0) && (day<=31))) isError = true;
            if(day<=21) burc = "Oğlak";
            else  burc = "Kova";
        }

        if(month == 1){
            if(!((day>0) && (day<=31))) isError = true;
            if(day<=21) burc = "Oğlak";
            else  burc = "Kova";
        }

        if(month == 2){
            if(!((day>0) && (day<=31))) isError = true;
            if(day<=21) burc = "Oğlak";
            else  burc = "Kova";
        }

        if(month == 3){
            if(!((day>0) && (day<=31))) isError = true;
            if(day<=21) burc = "Oğlak";
            else  burc = "Kova";
        }

        if(month == 4){
            if(!((day>0) && (day<=31))) isError = true;
            if(day<=21) burc = "Oğlak";
            else  burc = "Kova";
        }

        if(month == 5){
            if(!((day>0) && (day<=31))) isError = true;
            if(day<=21) burc = "Oğlak";
            else  burc = "Kova";
        }

        if(month == 6){
            if(!((day>0) && (day<=31))) isError = true;
            if(day<=21) burc = "Oğlak";
            else  burc = "Kova";
        }

        if(month == 7){
            if(!((day>0) && (day<=31))) isError = true;
            if(day<=21) burc = "Oğlak";
            else  burc = "Kova";
        }

        if(month == 8){
            if(!((day>0) && (day<=31))) isError = true;
            if(day<=21) burc = "Oğlak";
            else  burc = "Kova";
        }

        if(month == 9){
            if(!((day>0) && (day<=31))) isError = true;
            if(day<=21) burc = "Oğlak";
            else  burc = "Kova";
        }

        if(month == 10){
            if(!((day>0) && (day<=31))) isError = true;
            if(day<=21) burc = "Oğlak";
            else  burc = "Kova";
        }

        if(month == 11){
            if(!((day>0) && (day<=31))) isError = true;
            if(day<=21) burc = "Oğlak";
            else  burc = "Kova";
        }

        if(month == 12){
            if(!((day>0) && (day<=31))) isError = true;
            if(day<=21) burc = "Oğlak";
            else  burc = "Kova";
        }

        if(isError){
            System.out.println("Hatalı giriş yaptınız,\n Program Sonlandırıldı. ");
        }else{
            System.out.println("Burcunuz :  "+ burc);
        }
    }
}
