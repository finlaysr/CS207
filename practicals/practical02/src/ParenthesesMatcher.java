import java.util.HashMap;

public class ParenthesesMatcher {
  public static void main() {
  }

  public boolean check(String input) {
    StackADT<Character> stack = new LinkedStack<>();
    HashMap<Character, Character> map = new HashMap<>();
    map.put('(', ')');
    map.put('[', ']');
    map.put('{', '}');
    map.put('<', '>');

    for (char ch : input.toCharArray()) {
      if (map.containsKey(ch)) {
        stack.push(ch);
      } else if (map.containsValue(ch)) {
        if (stack.isEmpty()) {
          return false;
        } else if (map.get(stack.getTop()).equals(ch)) {
          stack.pop();
        }
      }
    }
    return stack.isEmpty();
  }
}
