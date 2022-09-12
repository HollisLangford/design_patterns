package decorator;

public class Lights extends TreeDecorator {
    private Tree tree;

    public Lights(Tree tree) {
        super(tree.lines);
    }
    
}
