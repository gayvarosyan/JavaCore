package Homeworks.braceChecker;

public class BraceChecker {

    private final String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            else if (c == ')' || c == '}' || c == ']') {
                char last = stack.pop();

                if (last == '\0') {
                    System.out.println("Error: closed " + c + " at " + i + " but nothing to close!");
                    continue;
                }

                if (!matches(last, c)) {
                    System.out.println("Error: opened " + last + " but closed " + c + " at " + i);
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Error: some braces were not closed!");
        } else {
            System.out.println("All braces are correctly balanced");
        }
    }

    private boolean matches(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }
}
