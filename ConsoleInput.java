import java.io.*;

public class ConsoleInput{
    public static String readLine(){
        StringBuilder response=new StringBuilder();
        try{
            BufferedInputStream buff=new BufferedInputStream(System.in);
            int in;
            char inChar;
            do{
                in=buff.read();
                inChar=(char)in;
                if((in!=-1)&(in!='\n')&(in!='\r')){
                    response.append(inChar);
                }
            }while((in!=-1)&(in!='\n')&(in!='\r'));
            return response.toString();
        }catch(IOException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void main(String[] args){
        System.out.print("\nWhat is your name?");
        String input=ConsoleInput.readLine();
        System.out.print("\nHello,"+input);
    }
}