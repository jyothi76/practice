import javax.sound.midi.Soundbank;

public class loops {
    public static void main(String[] args) {
        int n=10;
        switch(n)
        {
            case 1:
                System.out.println("number 1");
                break;
            case 2:
                System.out.println("number 2");
            case 5:
                System.out.println("number 5");
                break;
            default:
                System.out.println("no number given");
        }
        while(n>0)
        {
            System.out.print(n+" ");
            n--;
        }
        System.out.println();
        for(int i=0;i<=10;i++)
        {
            if(i==5){
                continue;}
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<=10;i++)
        {
            if(i==5){
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        int i=0;
        do{
            System.out.print(i+" " );
            i++;
            }while(i<=9);
        System.out.println();
        int [] arr={3,5,33,6,8,9,10};
        for(int j :arr)
            System.out.print(j+" ");


    }
}
