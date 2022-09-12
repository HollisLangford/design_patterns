package decorator;

import java.util.ArrayList;

public class TreeDecorator extends Tree {

    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
    }
    protected void integrateDecor(ArrayList<String> decor){
        for (int i=0;i<decor.size();i++) {
            for (int j=0;j<decor.get(i).length();j++) {
                if(lines.get(i).substring(j, j+1).equals(" ") &&
                !(decor.get(i).substring(j, j+1).equals(" "))) {
                    lines.set(i, lines.get(i).substring(0,j) + decor.get(i).substring(j,j+1) +
                    lines.get(i).substring(j+1,lines.get(i).length()));
                }
            }
        }
    }
    
}
