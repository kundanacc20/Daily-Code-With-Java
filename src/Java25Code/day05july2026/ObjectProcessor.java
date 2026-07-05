package Java25Code.day05july2026;

public class ObjectProcessor {
    public String processObject(Object ob){
        if(ob instanceof String){
            return new StringHandler().handle((String) ob);
        } else if(ob instanceof Integer){
            return new IntegerHandler().handle((Integer) ob);
        } else if(ob instanceof Double){
            return new DoubleHandler().handle((Double) ob);
        } else {
            return "Unknown type";
        }
    }
}
