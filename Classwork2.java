public class Classwork2 {
    public static void main(String[] args){
        Seasons current = Seasons.AUTUUMN;
        if(current== Seasons.WINTER){
            System.out.println("На улице холодно");
        } else if (current == Seasons.SUMMER) {
            System.out.println("На улице жарко");
        } else if (current == Seasons.AUTUUMN) {
            System.out.println("На улице холодает");
        }else if (current == Seasons.SPRING){
            System.out.println("На улице теплеет");
        }
        switch (current){
            case WINTER:
                System.out.println("На улице холодно");
                break;
            case SPRING:
                System.out.println("На улице теплеет");
                break;
            case SUMMER:
                System.out.println("На улице жарко");
                break;
            case AUTUUMN:
                System.out.println("На улице холодает");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    enum Seasons{
        WINTER,
        SPRING,
        SUMMER,
        AUTUUMN;

    }
}
