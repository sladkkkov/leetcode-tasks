package ru.sladkkov.leetcodetasks;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.sladkkov.leetcodetasks.task.DailyTemperature739;

@SpringBootApplication
public class LeetCodeTasksApplication {

    public static void main(String[] args) {
        var temperature = DailyTemperature739.temperatureSecondSolution(new int[]{73, 74, 75, 71, 69, 72, 76, 73});

        for (int i : temperature) {
            System.out.println(i);
        }
    }

}
