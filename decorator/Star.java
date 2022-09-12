package decorator;

public class Star extends TreeDecorator {
    private Tree tree;

    public Star(Tree tree) {
        super(tree.lines);
    }
    
}
