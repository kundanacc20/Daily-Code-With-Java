package Java25Code.day05july2026;

public class ObjectProcessor {
//    public String processObject(Object ob){
//        if(ob instanceof String){
//            return new StringHandler().handle((String) ob);
//        } else if(ob instanceof Integer){
//            return new IntegerHandler().handle((Integer) ob);
//        } else if(ob instanceof Double){
//            return new DoubleHandler().handle((Double) ob);
//        } else {
//            return "Unknown type";
//        }
//    }

    //With Java 25 Pattern Matching
    public String processObject(Object obj){
        return switch (obj) {
            case String s -> new StringHandler().handle(s);
            case Integer i -> new IntegerHandler().handle(i);
            case Double d -> new DoubleHandler().handle(d);
            default -> "unknown type";
        };

    }
}
