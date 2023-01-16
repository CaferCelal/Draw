import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        String Alper= "C:\\Users\\Cafer Celal Evrenüz\\IdeaProjects\\cekilis\\src\\Alper.txt";
        String Cafer= "C:\\Users\\Cafer Celal Evrenüz\\IdeaProjects\\cekilis\\src\\Cafer.txt";
        String Emre= "C:\\Users\\Cafer Celal Evrenüz\\IdeaProjects\\cekilis\\src\\Emre.txt";
        String Mustafa= "C:\\Users\\Cafer Celal Evrenüz\\IdeaProjects\\cekilis\\src\\Mustafa.txt";
        LinkedList<String> origin = new LinkedList();
        LinkedList<String> mixed = new LinkedList<>();
        Functions fnc = new Functions();
        origin.add("Alper");
        origin.add("Cafer");
        origin.add("Emre");
        origin.add("Mustafa");
        mixed.addAll(origin);
        int i=0;
            while (true){
                if(origin.get(i)==mixed.get(i)) {
                    fnc.shaker(origin, mixed,i);
                    continue;
                }
                i++;
                    if(i==origin.size())
                        break;
            }
        fnc.writeFile(mixed.get(0),Alper);
        fnc.writeFile(mixed.get(1),Cafer);
        fnc.writeFile(mixed.get(2),Emre);
        fnc.writeFile(mixed.get(3),Mustafa);
    }

}





