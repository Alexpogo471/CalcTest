public class Calc {
    public static Number sum(Number arg1, Number arg2) {
        if (arg1 instanceof Integer && arg2 instanceof Integer) {
            return arg1.intValue() + arg2.intValue();
        } else if (arg1 instanceof Double || arg2 instanceof Double) {
            return arg1.doubleValue() + arg2.doubleValue();

        }
        return null;
    }

    public static Number minus(Number arg1, Number arg2) {
        if (arg1 instanceof Integer && arg2 instanceof Integer) {
            return arg1.intValue() - arg2.intValue();
        } else if (arg1 instanceof Double || arg2 instanceof Double) {
            return arg1.doubleValue() - arg2.doubleValue();

        }
        return null;
    }

    public static Number multi(Number arg1, Number arg2) {
        if (arg1 instanceof Integer && arg2 instanceof Integer) {
            return arg1.intValue() * arg2.intValue();
        } else if (arg1 instanceof Double || arg2 instanceof Double) {
            return arg1.doubleValue() * arg2.doubleValue();

        }
        return null;
    }

    public static Number div(Number arg1, Number arg2) {
        if (arg1 instanceof Integer && arg2 instanceof Integer) {
            return arg1.intValue() / arg2.intValue();
        } else if (arg1 instanceof Double || arg2 instanceof Double) {
            return arg1.doubleValue() / arg2.doubleValue();

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(3/2);
    }
}
