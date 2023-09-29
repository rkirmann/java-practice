package seatplanner;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private boolean hasVisionImpairment;
    private List<String> preferredNeighbors;

}

