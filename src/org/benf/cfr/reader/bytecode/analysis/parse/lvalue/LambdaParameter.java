package org.benf.cfr.reader.bytecode.analysis.parse.lvalue;

import org.benf.cfr.reader.bytecode.analysis.types.MethodPrototype;
import org.benf.cfr.reader.bytecode.analysis.types.discovery.InferredJavaType;
import org.benf.cfr.reader.util.output.Dumper;

public class LambdaParameter extends LocalVariable {
    public final MethodPrototype originalMethod;
    public final LocalVariable originalArg;

    public LambdaParameter(String name, InferredJavaType inferredJavaType, MethodPrototype originalMethod, LocalVariable originalArg) {
        super(name, inferredJavaType);
        this.originalArg = originalArg;
        this.originalMethod = originalMethod;
    }

    @Override
    public Dumper dump(Dumper d, boolean defines) {
        getName().dumpParameter(d, originalMethod, originalArg.getIdx(), defines);
        return d;
    }
}
