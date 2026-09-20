package java17code.day14july2026;

sealed public class Human permits Manish, Vartika, Anjali {
    public void printName(){
        System.out.println("Default Human");
    }
}
