package ua.opnu;

public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes >= 60) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = hours;
            this.minutes = minutes;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void add(int h, int m) {
        if (h < 0 || m < 0 || m >= 60) return;
        minutes += m;
        hours += h + minutes / 60;
        minutes %= 60;
    }

    public void addTimeSpan(TimeSpan other) {
        add(other.hours, other.minutes);
    }

    public double getTotalHours() {
        return hours + minutes / 60.0;
    }

    public int getTotalMinutes() {
        return hours * 60 + minutes;
    }

    public void subtract(TimeSpan other) {
        int total = getTotalMinutes() - other.getTotalMinutes();
        if (total < 0) return;
        hours = total / 60;
        minutes = total % 60;
    }

    public void scale(int factor) {
        if (factor <= 0) return;
        int total = getTotalMinutes() * factor;
        hours = total / 60;
        minutes = total % 60;
    }
}
