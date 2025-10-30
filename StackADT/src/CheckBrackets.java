
public class CheckBrackets {
    public static void main() {
    }

    public boolean check(String input){
        StackADT<Character> stack = new StackADT<>(100);

        for (int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']'){
                if (stack.isEmpty()){
                    return false;
                }
                else  {
                    char pop = stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
