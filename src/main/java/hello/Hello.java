package hello;

public class Hello {

   public static void main(String[] args){
        System.out.println("Hello word!");
        String str=null;
        Tool1(str);
    }



    //@override
    private static String Tool1(String str){
        String string="Tool1111!";
        System.out.println("Tool2!");
        return string;
    }
}