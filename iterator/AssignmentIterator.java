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
    /*
     * returns the number of assignments while it is larger the the postions number and if it does not equal null
     */

    public Assignment next() {
        if(hasNext()) {
            return assignments[positions++];
        }
        return null;
    }
    
}
