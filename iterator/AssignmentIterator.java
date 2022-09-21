package iterator;

import java.util.Iterator;

public class AssignmentIterator {
    private Assignment[] assignments;
    private int positions = 0;

    public AssignmentIterator(Assignment[] assignments) {
        this.assignments = assignments;
    }

    public boolean hasNext() {
        return assignments.length > positions && assignments[positions] != null;
    }

    public Assignment next() {
        if(hasNext()) {
            return assignments[positions++];
        }
        return null;
    }
    
}
