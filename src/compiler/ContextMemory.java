package compiler;

import compiler.grammar.*;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Map;

public class ContextMemory {
    public Map<String, VariableType> globals = new HashMap<>();
    public Map<String, VariableType> locals = new HashMap<>();
    public Map<String, VariableType> functionNames = new HashMap<>();

    public void addVariable(ParserRuleContext ctx, String name, VariableType type) {
        if (isGlobal(ctx)) {
            globals.put(name, type);
        } else {
            locals.put(name, type);
        }
    }

    public boolean isGlobal(ParserRuleContext ctx) {
        return ctx.getParent().getParent() instanceof mathlangParser.MathContext;
    }

    public void addLocal(String name, VariableType type) {
        locals.put(name, type);
    }

    public void clearLocals() {
        locals.clear();
    }

    public void addFunction(String name, VariableType type) {
        functionNames.put(name, type);
    }

    public void isVariableExists(String variableName) throws UndefinedEntityException {
        if (!(globals.containsKey(variableName) || locals.containsKey(variableName))) {
            throw new UndefinedEntityException("Variable " + variableName + " is not defined");
        }
    }
    public boolean isNotLocal(String variableName) {
        return !locals.containsKey(variableName);
    }

    public void isFunctionExists(String functionName) throws UndefinedEntityException {
        if (!(functionNames.containsKey(functionName))) {
            throw new UndefinedEntityException("Function " + functionName + " is not defined");
        }
    }

    public void isCastValid(String name, VariableType needType) throws InvalidTypeCastException {
        if (locals.containsKey(name)) {
            var isnotLocal = isNotLocal(name);
            var isnotGlobal = !(globals.get(name) == null || globals.get(name).equals(needType));
            if (isnotLocal || isnotGlobal) {
                throw new InvalidTypeCastException("Variable " + name + " need have type " + needType);
            }
        }
    }
}
