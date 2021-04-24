public class cuentaDig {
    public int re;
    public void cuenta_dig(int n)
    { re=0;
        int c=0;
        while(n>0)
        {
            n=n/10;
            c=c+1;
        }
        re= c;
    }
    public void nro_divisible(int n)
    { re=0;
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        re= c;
    }


}

