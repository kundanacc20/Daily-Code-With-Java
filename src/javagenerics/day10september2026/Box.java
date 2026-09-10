package javagenerics.day10september2026;

public class Box<T> {
    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

//    @Override
//    public String toString(){
//        return value.toString();
//    }
}
