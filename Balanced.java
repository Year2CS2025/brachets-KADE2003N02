import java.util.Stack;
public class Balanced{
    public static void main(String[] args) {
        String[] str = {"({[]})","({[})", "((()))", "({)}"};
        for(String s: str)
         System.out.println(isBalanced(s));
        
    }
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else {
                // It's a closing bracket
                if(stack.isEmpty()) return false;
                
                char open = stack.pop();
                if((c == ')' && open != '(') ||
                   (c == '}' && open != '{') ||
                   (c == ']' && open != '[')){
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
}
        
    
}