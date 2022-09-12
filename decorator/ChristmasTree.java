package decorator;

public class ChristmasTree extends Tree {
    
    public ChristmasTree() {
        super(FileReader.getLines("txt/tree.txt"));
    }
}
/*
 * takes the methods from Tree and combines them with the file reader to shaow a display
 */
