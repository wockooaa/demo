public class Example{
    String str=new String("tarena");
    char[]ch={'a','b','c'};
    public static void main(String args[]){
        Example ex=new Example();
        ex.change(ex.ch);
        System.out.print(ex.str+" and ");
        System.out.print(ex.ch);

        int i = 5;
        int j = 10;
        System.out.println(i + ~~j);
    }
    public void change(char[] ch){
        //引用类型变量，传递的是地址，属于引用传递。
        String str = "test ok";
        ch[0]='g';
    }
}

class a extends Thread {

}