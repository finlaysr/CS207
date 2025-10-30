//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    StackADT<Integer> stack = new StackADT<>(20);
    stack.size();

    stack.push(1);
    stack.push(2);
    stack.push(3);

    stack.size();
    System.out.println(stack.getTop());

    System.out.println(stack.pop());
    System.out.println(stack.getTop());
    stack.size();


    LinkedStackADT<Integer> linkedStack = new LinkedStackADT<>();
    linkedStack.size();
    linkedStack.push(1);
    linkedStack.push(2);
    linkedStack.push(3);
    System.out.println(linkedStack.getTop());
    linkedStack.pop();
    System.out.println(linkedStack.getTop());

    CheckBrackets checkBrackets = new CheckBrackets();
    System.out.println(checkBrackets.check("([{[]}]([]))"));
}
