package resourses;

import java.util.ArrayList;

public abstract class Parent {
    public ArrayList<String> content = new ArrayList<>();

    public Parent evaluate(int n) {
        String tm = this.content.get(0);
        String rs = "";

        for (int i = 0; i < tm.length(); ++i) {
            if (tm.charAt(i) == 'x') {
                rs += String.valueOf(n);
            } else {
                rs += tm.charAt(i);
            }
        }

        content.add(rs);

        return this;
    }
}
