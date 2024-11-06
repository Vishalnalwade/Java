public class SwitchLoop {
    public static void main(String[] args) {
        int i=0;
        do{
            ++i;
            System.out.println(i);
            if(++i <5){
                continue;
            }
            ++i;
            System.out.println(i);
        }while (++i < 10);
        System.out.println(i);
    }
}
