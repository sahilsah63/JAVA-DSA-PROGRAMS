import java.util.Stack;
public class PopPush {
     public static void main(String args[]){
    Stack<String> mystack=new Stack<String>();
    mystack.push("JAVA");
    mystack.push("PYTHON");
    mystack.push("c++");
    System.out.println("Stack Elements="+mystack);
    String Elements=mystack.pop();
    System.out.println("Poped Elements="+Elements);
    System.out.println("Stack elements after poped="+mystack);
   } 
}

