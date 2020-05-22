package compiler;

public enum VariableType {
    INTEGER("int"),
    FLOAT("float"),
    VOID("void");

    private String type;

    VariableType(String type) {
        this.type = type;
    }

    public static VariableType getTypeByString(String type){
        switch (type) {
            case "INTEGER":
                return INTEGER;
            case "FLOAT":
                return FLOAT;
            default:
                return VOID;
        }
    }

    @Override
    public String toString() {
        return type;
    }
}