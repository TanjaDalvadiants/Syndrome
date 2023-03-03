
package ru.netology.javaqa.javaqamvn.services;
import org.junit.jupiter.api.Test;
//import ru.netology.javaqa.javaqamvn.services.StatisticsService;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
     StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 50};
        long expected = 50;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxInTheMiddle() {
      StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 50, 8, 6, 11, 11, 12};
        long expected = 50;

        long actual = service.findMaxInTheMiddle(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxInTheEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 4, 8, 6, 11, 11, 50};
        long expected = 50;

        long actual = service.findMaxInTheEnd(incomesInBillions);

        assertEquals(expected, actual);
    }

}
