package com.surcov.revisit.java.designPatterns.interpretor;

import java.util.List;
import java.util.function.Predicate;

/**
 * The Where expression is again modifying the context by setting the necessary filter and terminates the interpretation with search call:
 */
public class Where implements Expression {

    private Predicate<String> filter;

    Where(Predicate<String> filter) {
        this.filter = filter;
    }

    @Override
    public List<String> interpret(Context ctx) {
        ctx.setFilter(filter);
        return ctx.search();
    }
}