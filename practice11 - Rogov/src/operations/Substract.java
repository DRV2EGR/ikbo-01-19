package operations;

import resourses.Parent;

public class Substract extends Parent {
    public Substract(Parent a, Parent b) {
        String a1 = a.content.get(0);
        String a2 = b.content.get(0);

        String tmp = a1 + "-" + a2;
        this.content.add(tmp);
    }
}
