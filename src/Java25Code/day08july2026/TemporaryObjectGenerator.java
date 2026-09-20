package Java25Code.day08july2026;

public class TemporaryObjectGenerator {

    public void generateTemporaryObjects(int count){
        for(int i =0; i< count; i++){
            String temp = "Employee-"+i;
            byte[] data = new byte[1024];

            if(i % 200000 == 0){
                System.out.println("Generated temporary objects: "+i);
            }
        }
    }
}
