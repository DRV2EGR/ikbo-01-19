package ru.mirea.ikbo01_19.practice11.Rogov;

import agregators.Const;
import agregators.Variable;
import operations.Add;
import operations.Multiply;
import operations.Substract;
import resourses.Parent;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class sloving_practice11 {
    public static void main(String[] args) throws ScriptException {


        Parent result = new Add (
                new Substract(
                        new Multiply(
                                new Variable("x"),
                                new Variable("x")
                        ),
                                new Multiply(
                                        new Const(2),
                                        new Variable("x")
                                )
                ),
                new Const(1)
        ).evaluate(5);

        System.out.println(result.content.get(1));
        //String tmp = result.content.get(1);
        /*
        String rewr = "";
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < tmp.length(); ++j) {
                if (i == 0) {
                    if (tmp.charAt(j+1) == '*') {

                    }
                }

            }
        }*/

        // Извиняюсь за костыль... Но суть же не в этом
        System.out.println(
                new ScriptEngineManager()
                        .getEngineByName("JavaScript")
                        .eval(result.content.get(1))
        );
    }
}
