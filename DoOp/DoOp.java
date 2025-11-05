
public class DoOp {

    public static String operate(String[] args) {
        if (args.length != 3) {
            return "it depend on the input.";
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);

        return switch (args[1]) {
            case "+" ->
                Integer.toString(a + b);
            case "-" ->
                Integer.toString(a - b);
            case "*" ->
                Integer.toString(a * b);
            case "/" ->
                b != 0 ? Integer.toString(a / b) : "Error";
            case "%" ->
                b != 0 ? Integer.toString(a % b) : "Error";
            default ->
                "Error";
        };
    }
}
