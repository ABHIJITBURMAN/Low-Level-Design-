package ChainofResponsibilityDesignPattern;

public class InfoLogProcessor extends LogProcessor {

    public InfoLogProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == INFO){
            System.out.println("Info: "+ message);
        }
        else{
            super.log(logLevel,message);
        }
    }


}
