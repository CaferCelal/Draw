import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Functions {
    public static int getRandomValue(int Min, int Max)
    {

        // Get and return the random integer
        // within Min and Max
        return ThreadLocalRandom
                .current()
                .nextInt(Min, Max );
    }
    public static void shaker(LinkedList<String> origin, LinkedList<String> mixed,int min){
        mixed.clear();
        LinkedList<String> temp = new LinkedList<>();
        temp.addAll(origin);
        for (int i = 0; true; i++) {
            int X = getRandomValue(min,origin.size());
            mixed.add(origin.get(X));
            origin.remove(X);
            if (origin.size() == min)
                break;
        }
        origin.addAll(temp);
    }
    public static void writeFile(String name,String file_address){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file_address,true));
            writer.write(name);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
