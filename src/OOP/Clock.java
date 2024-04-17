package OOP;

public class Clock {
    public int hours, minutes, seconds;
    boolean format24;
    int alarmHour, alarmMin, alarmSec;


    public Clock(int hours, int minutes, int seconds, boolean format24, int alarmHour, int alarmMin, int alarmSec) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.format24 = format24;
        this.alarmHour = alarmHour;
        this.alarmMin = alarmMin;
        this.alarmSec = alarmSec;

    }
    int difference (Clock other){
        int difference = 0;
        difference += Math.abs(this.hours - other.hours)*3600;
        difference += Math.abs(this.minutes - other.minutes)*60;
        difference += Math.abs(this.seconds - other.seconds);
        return difference;
    }
    void printTime (){
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
    void tick (){
        seconds++;
        if (seconds == 60){
            seconds = 0;
            minutes++;

        }
        if (minutes == 60){
            minutes = 0;
            hours++;

        }
        if ((format24 && hours == 24) || (!format24 && hours == 12)){
            if(format24){
                hours = 0;

            }else {
                hours = 1;

            }
        }

       if (isAlarm()){
           System.out.println("Budicek zmrde");
           printTime();
           System.out.println("Budicek zmrde");
       }


//        if (specialTimes()){
//            printTime();
//        }

        boolean isSpecial = specialTimes();
        if (isSpecial ){
            printTime();
        }
    }
    boolean specialTimes(){
        boolean sameDigit = hours == minutes && hours == seconds;
        boolean specialMinutes = minutes == 15 || minutes == 30 || minutes == 45;
        boolean zeroSeconds = seconds == 0;
        if (sameDigit || (specialMinutes && zeroSeconds)) {
            return true;
        } else {
            return false;
        }
    }

    boolean isAlarm(){
        boolean sameHour = hours == alarmHour;
        boolean sameMin = minutes == alarmMin;
        boolean sameSec = seconds == alarmSec;
        if (sameHour && sameSec && sameMin){
            return true;
        } else {
            return false;
        }
    }
}
