package operations;

import resourses.Parent;

public class Add extends Parent {
    public Add(Parent a, Parent b) {
        String a1 = a.content.get(0);
        String a2 = b.content.get(0);

        String tmp = a1 + "+" + a2;
        this.content.add(tmp);
    }
}
