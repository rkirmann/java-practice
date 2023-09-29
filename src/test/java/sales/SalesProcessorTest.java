package sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesProcessorTest {

    @Test
    void testGenerateReport() {
        List<Sale> sales = Arrays.asList(
                new Sale("Widget", 5, 10.00),
                new Sale("Gadget", 3, 15.00),
                new Sale("Widget", 2, 10.00)
        );

        String expected = "Total Sales: $100.00\nBest-Selling Item: Widget (7 sold)";
        assertEquals(expected, SalesProcessor.generateReport(sales));
    }

    @Test
    void testEmptySalesList() {
        List<Sale> sales = Collections.emptyList();
        String expected = "Total Sales: $0.00\nBest-Selling Item: None (0 sold)";
        assertEquals(expected, SalesProcessor.generateReport(sales));
    }

    @Test
    void testSingleSale() {
        List<Sale> sales = Collections.singletonList(new Sale("Widget", 5, 10.00));
        String expected = "Total Sales: $50.00\nBest-Selling Item: Widget (5 sold)";
        assertEquals(expected, SalesProcessor.generateReport(sales));
    }

    @Test
    void testMultipleItemsSameQuantity() {
        List<Sale> sales = Arrays.asList(
                new Sale("Widget", 5, 10.00),
                new Sale("Gadget", 5, 15.00)
        );

        String expected = "Total Sales: $125.00\nBest-Selling Item: Widget (5 sold)";
        assertEquals(expected, SalesProcessor.generateReport(sales));
    }

    @Test
    void testMultipleSalesSameItem() {
        List<Sale> sales = Arrays.asList(
                new Sale("Widget", 3, 10.00),
                new Sale("Widget", 4, 10.00)
        );

        String expected = "Total Sales: $70.00\nBest-Selling Item: Widget (7 sold)";
        assertEquals(expected, SalesProcessor.generateReport(sales));
    }

}
