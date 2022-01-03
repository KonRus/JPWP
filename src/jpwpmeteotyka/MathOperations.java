package jpwpmeteotyka;


public class MathOperations {
    
    public class Addition{
        int min = 0;
        int max = 100;
        int a = (int)Math.floor(Math.random()*(max-min+1)+min);
        int b = (int)Math.floor(Math.random()*(max-min+1)+min);
        int result = a+b;
        String operation = a+" + "+b;
        boolean isSet = true;
        
    }
    public class Subtraction{
        int mina = 50;
        int maxa = 100;
        int minb = 1;
        int maxb = 49;
        int a = (int)Math.floor(Math.random()*(maxa-mina+1)+mina);
        int b = (int)Math.floor(Math.random()*(maxb-minb+1)+minb);
        int result = a - b;
        String operation = a+" - "+b;
        boolean isSet = true;
        
    }
    public class Multiplication{
        int min = 0;
        int max = 10;
        int a = (int)Math.floor(Math.random()*(max-min+1)+min);
        int b = (int)Math.floor(Math.random()*(max-min+1)+min);
        int result = a*b;
        String operation = a+" * "+b;
        boolean isSet = true;
    }
    public class Division{
        int min = 1;
        int max = 10;
        int a = (int)Math.floor(Math.random()*(max-min+1)+min);
        int b = (int)Math.floor(Math.random()*(max-min+1)+min);
        int c = a*b;
        int result = a;
        String operation = c+" : "+b;
        boolean isSet = true;
    }
}
