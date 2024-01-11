package com.surcov.revisit.java.designPatterns.interpretor;

import java.util.List;

public interface Expression {
    List<String> interpret(Context ctx);
}