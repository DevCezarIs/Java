public class usuario  {

    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();


        SmartTv.mudarCanalProximo();


        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " +smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
    }
}