package operations;

import agregators.Const;
import agregators.Variable;
import resourses.Parent;

import java.util.ArrayList;

public class Multiply extends Parent {

    public Multiply(Parent a, Parent b) {
        String a1 = a.content.get(0);
        String a2 = b.content.get(0);

        String tmp = a1 + "*" + a2;
        this.content.add(tmp);
    }
}