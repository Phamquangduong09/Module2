package Day6_4;

import java.util.Date;

public class StopWatch {
    public static void main(String[] args) {

    }

    Date startTime;
    Date endTime;

    public StopWatch(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public void start() {
        startTime = new Date();
    }
    public void stop() {
        endTime = new Date();
    }
}

