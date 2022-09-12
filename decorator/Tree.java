package decorator;

import java.util.ArrayList;

public class Tree {
    protected ArrayList<String> lines;

    public Tree(ArrayList<String> lines){
        this.lines = lines;
    }
/*
 * Uses an array to display the lines in a text file
 */
    public String toString(ArrayList<String> lines){
        String show = "";
        for (int i=0;i<lines.size();i++) {
            show += lines.get(i);
            show += "\n";
        }
        return show;
    }
    
}
