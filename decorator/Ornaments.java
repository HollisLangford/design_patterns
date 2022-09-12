package decorator;

public class Ornaments extends TreeDecorator {
    private Tree tree;

    public Ornaments(Tree tree) {
        super(tree.lines);
    }
    
}
