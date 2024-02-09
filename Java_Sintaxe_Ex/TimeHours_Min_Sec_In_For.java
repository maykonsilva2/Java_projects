package Java_Sintaxe_Ex;
// The import java.util.concurrent.TimeUnit is never used

public class TimeHours_Min_Sec_In_For {
    public static void main(String args[]){
        for(int hours = 0; hours <= 23; hours++) {
            for(int min = 0; min <= 59; min++) {
                for(int sec = 0; sec <= 59; sec++) { 
                    System.out.println(hours + ":" + min + ":" + sec);
                    try{
                        Thread.sleep(10);
                    } catch(InterruptedException err) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

}
