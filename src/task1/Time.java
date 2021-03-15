package task1;

public class Time {

    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.setHours(hours);
        this.setMinutes(minutes);
    }


    public Time(int minutes){

        this.setMinutes(minutes);

    }



    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {

        if (minutes>0&& minutes<60){

        this.minutes = minutes;}else {
            this.minutes=-1;
        }

    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}
