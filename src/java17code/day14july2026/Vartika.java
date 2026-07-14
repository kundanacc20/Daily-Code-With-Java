package java17code.day14july2026;

sealed public class Vartika extends Human permits VartikaChild{
    public void printName(){
        System.out.println("Vartika Dadheech");
    }
}
