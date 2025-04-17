import java.util.Stack;
public class infixtopostfix
 {
       public static String convert(String infix)
       {
              Stack<character>stack=new stack<>();
              String Builderpostfix =new StringBuilder();
              for(char ch: infix. tocharArray())
       {
       if(character.isLetterorDigit (ch))
       {
       postfix.append(ch);
//Add operand to result
       } 
       else if (ch=')')
       {
       while(Stack.peek()!='(')
       {
       postfix.append(Stack.pop());
       }
       stack.pop();
       }else{
       while(!stack.isEmpty()&precedence(Stack.peek()>=precedence(ch)))
       postfix.append(Stack.pop());
       }
       stack.push(ch);
       }
       }
       while(!stack.isEmpty())
       {
       postfix.append(stack.pop());
       }
       return postfix.to string();
       }
       private static int precedence (char on)
       {
       return(op==" +" //")?op=="-")?:(op=="+"//on=="/")?2:0;
       }
       public static void main(String[] args)
       {
       String infix="a-b*d/e(b+c)";
       System.out.println("postfix:"+ convert(infix));
       }
}
