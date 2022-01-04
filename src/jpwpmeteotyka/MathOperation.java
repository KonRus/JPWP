package jpwpmeteotyka;


public class MathOperation {
        int mina;
        int maxa;
        int minb;
        int maxb;
        int a;
        int b;
        int result;
        String operation;
        boolean isSet;
        MathOperation(int mina, int maxa, int minb, int maxb){
            this.mina = mina;
            this.maxa = maxa;
            this.minb = minb;
            this.maxb = maxb;
            this.a = (int)Math.floor(Math.random()*(maxa-mina+1)+mina);
            this.b = (int)Math.floor(Math.random()*(maxb-minb+1)+minb);
           
        };
        
}
