public class prime {
    public static void main(String[] args) {
        for(int i=01;i<=50;i++)
        {
            if(i==1)
                continue;
            int res=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0){
                    res++;
                    break;
                }
            }
            if(res==0)
                System.out.print(i+" ");
        }

      }
}

