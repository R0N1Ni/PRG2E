package OOP;

public class Clock {
    public int hours, minutes, seconds;
    boolean format24;

    public Clock(int hours, int minutes, int seconds, boolean format24) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.format24 = format24;

    }
    int difference (Clock other){
        int difference = 0;
        difference += Math.abs(this.hours - other.hours)*3600;
        difference += Math.abs(this.minutes - other.minutes)*60;
        difference += Math.abs(this.seconds - other.seconds);
        return difference;
    }
    void printTime (){
        System.out.println(hours + " " + minutes + " " + seconds);
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
    }
}
