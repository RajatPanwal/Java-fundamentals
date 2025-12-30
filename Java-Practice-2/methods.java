
class Computer {

    public void playMusic(){
        System.out.println("Music Playing");
    }

    public String getMeAPen(int cost){
        return "Pen";
    }

}

public class methods {
    
    public static void main(String[] arg){

        Computer comp = new Computer();

        comp.playMusic();

        String pen = comp.getMeAPen(10);
        System.out.println(pen);

    }

}