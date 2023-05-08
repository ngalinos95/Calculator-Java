package calculator;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Calculator extends JFrame {


    public Calculator() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 700);
        setLayout(null);
        JLabel EquationLabel=new JLabel();
        EquationLabel.setName("EquationLabel");
        EquationLabel.setBounds(25,70,450,40);
        EquationLabel.setForeground(Color.GREEN);
        add(EquationLabel);

        JLabel ResultLabel=new JLabel();
        ResultLabel.setName("ResultLabel");
        ResultLabel.setBounds(400,20,100,70);
        add(ResultLabel);
//Add  buttons zero row
        JButton  clear=new JButton("C");
        clear.setName("Clear");
        clear.setBounds(270,95,75,30);
        add(clear);
        clear.addActionListener(e -> {
            EquationLabel.setForeground(Color.GREEN);
            EquationLabel.setText("");
            ResultLabel.setText("");
        });


        JButton  delete=new JButton("Del");
        delete.setName("Delete");
        delete.setBounds(385,95,75,30);
        add(delete);
        delete.addActionListener(e -> {
            if(EquationLabel.getText().contains("=")){
                EquationLabel.setText("");
            }
            EquationLabel.setText(EquationLabel.getText().substring(0,EquationLabel.getText().length()-1));
        });



//Add  buttons first row
        JButton  seven=new JButton("7");
        seven.setName("Seven");
        seven.setBounds(40,140,75,75);
        add(seven);
        seven.addActionListener(e -> {
            if(EquationLabel.getText().contains("=")){
                EquationLabel.setText("");
            }
            EquationLabel.setText(EquationLabel.getText()+"7");

        });


        JButton  eight=new JButton("8");
        eight.setName("Eight");
        eight.setBounds(155,140,75,75);
        add(eight);
        eight.addActionListener(e -> {
            if(EquationLabel.getText().contains("=")){
                EquationLabel.setText("");
            }
            EquationLabel.setText(EquationLabel.getText()+"8");
        });


        JButton  nine=new JButton("9");
        nine.setName("Nine");
        nine.setBounds(270,140,75,75);
        add(nine);
        nine.addActionListener(e -> {
            if(EquationLabel.getText().contains("=")){
                EquationLabel.setText("");
            }
            EquationLabel.setText(EquationLabel.getText()+"9");
        });


        JButton  divide=new JButton("÷");
        divide.setName("Divide");
        divide.setBounds(385,140,75,75);
        add(divide);
        divide.addActionListener(e -> {
            int len = EquationLabel.getText().length();
            if (EquationLabel.getText().isEmpty()) {
                EquationLabel.setText("");
            } else {
                if (EquationLabel.getText().substring(len - 1).matches("[+×÷-]")) {
                    EquationLabel.setText(EquationLabel.getText().substring(0, len - 1) + "÷");
                } else {
                    EquationLabel.setText(EquationLabel.getText() + "÷");
                }
            }

        });
//Add  buttons second row
        JButton  four=new JButton("4");
        four.setName("Four");
        four.setBounds(40,290,75,75);
        add(four);
        four.addActionListener(e -> {
            if(EquationLabel.getText().contains("=")){
                EquationLabel.setText("");
            }
            EquationLabel.setText(EquationLabel.getText()+"4");
        });


        JButton  five=new JButton("5");
        five.setName("Five");
        five.setBounds(155,290,75,75);
        add(five);
        five.addActionListener(e -> {
            if(EquationLabel.getText().contains("=")){
                EquationLabel.setText("");
            }
            EquationLabel.setText(EquationLabel.getText()+"5");
        });


        JButton  six=new JButton("6");
        six.setName("Six");
        six.setBounds(270,290,75,75);
        add(six);
        six.addActionListener(e -> {
            if(EquationLabel.getText().contains("=")){
                EquationLabel.setText("");
            }
            EquationLabel.setText(EquationLabel.getText()+"6");
        });

        JButton  multiply=new JButton("×");
        multiply.setName("Multiply");
        multiply.setBounds(385,290,75,75);
        add(multiply);
        multiply.addActionListener(e -> {
            int len = EquationLabel.getText().length();
            if (EquationLabel.getText().isEmpty()) {
                EquationLabel.setText("");
            } else {
                if (EquationLabel.getText().substring(len - 1).matches("[+×÷-]")) {
                    EquationLabel.setText(EquationLabel.getText().substring(0, len - 1) + "×");
                } else {
                    EquationLabel.setText(EquationLabel.getText() + "×");
                }
            }

        });
//Add  buttons third row
        JButton  one=new JButton("1");
        one.setName("One");
        one.setBounds(40,440,75,75);
        add(one);
        one.addActionListener(e -> {
            if(EquationLabel.getText().contains("=")){
                EquationLabel.setText("");
            }
            EquationLabel.setText(EquationLabel.getText()+"1");

        });


        JButton  two=new JButton("2");
        two.setName("Two");
        two.setBounds(155,440,75,75);
        add(two);
        two.addActionListener(e -> {
            if(EquationLabel.getText().contains("=")){
                EquationLabel.setText("");
            }
            EquationLabel.setText(EquationLabel.getText()+"2");
        });


        JButton  three=new JButton("3");
        three.setName("Three");
        three.setBounds(270,440,75,75);
        add(three);
        three.addActionListener(e -> {
            if(EquationLabel.getText().contains("=")){
                EquationLabel.setText("");
            }
            EquationLabel.setText(EquationLabel.getText()+"3");
        });

        JButton  add=new JButton("+");
        add.setName("Add");
        add.setBounds(385,440,75,75);
        add(add);
        add.addActionListener(e -> {
            int len = EquationLabel.getText().length();
            if (EquationLabel.getText().isEmpty()) {
                EquationLabel.setText("");
            } else {
                if (EquationLabel.getText().substring(len - 1).matches("[+×÷-]")) {
                    EquationLabel.setText(EquationLabel.getText().substring(0, len - 1) + "+");
                } else {
                    EquationLabel.setText(EquationLabel.getText() + "+");
                }
            }
        });
//Add  buttons forth row
        JButton  dot=new JButton(".");
        dot.setName("Dot");
        dot.setBounds(40,590,75,75);
        add(dot);
        dot.addActionListener(e -> {

            if(EquationLabel.getText().isEmpty()){
                EquationLabel.setText(String.valueOf(0)+".");
            }else{
            EquationLabel.setText(EquationLabel.getText()+".");}

        });





        JButton  zero=new JButton("0");
        zero.setName("Zero");
        zero.setBounds(155,590,75,75);
        add(zero);
        zero.addActionListener(e -> {
            if(EquationLabel.getText().contains("=")){
                EquationLabel.setText("");
            }
            EquationLabel.setText(EquationLabel.getText()+"0");

        });


        JButton  equals=new JButton("=");
        equals.setName("Equals");
        equals.setBounds(270,590,75,75);
        add(equals);

        /*Create an empty stack for operators.
        -Create an empty string for the output (postfix notation).
        -Split the infix expression into tokens (numbers and operators) and iterate through them.
        -If the token is a number, append it to the output string followed by a space.
        -If the token is an operator (+, -, x, or /), do the following:
        -While there is an operator on top of the stack , it has greater precedence or has equal precedence and is left-associative than the current operator, pop the operator from the stack and append it to the output string, followed by a space.
        -Push the current operator onto the stack.
        -After processing all tokens, pop any remaining operators from the stack and append them to the output string, followed by a space
        -Remove the last space from the output string and return it as the postfix notation.
*/

        equals.addActionListener(e -> {
            Map<String, Integer> precedence = new HashMap<>();
            precedence.put("+", 2);
            precedence.put("-", 2);
            precedence.put("×", 3);
            precedence.put("÷", 3);

            Stack<String> operatorStack = new Stack<>();
            String[] tokens = EquationLabel.getText().split("(?<=[+×÷-])|(?=[+×÷-])");
            if(tokens[tokens.length-1].matches(("[+×÷-]"))){
                EquationLabel.setForeground(Color.RED);
            }else{EquationLabel.setForeground(Color.GREEN);}

            StringBuilder postfix = new StringBuilder();

            for (String token : tokens) {
                System.out.println(token);
                if (token.matches("-?\\d+(\\.\\d+)?")) { // check if token is a number
                    postfix.append(token).append(" ");
                } else if (token.matches("[+×÷-]")) { // check if token is an operator
                    while (!operatorStack.isEmpty() &&
                            precedence.get(operatorStack.peek()) >= precedence.get(token)) {
                        postfix.append(operatorStack.pop()).append(" ");
                    }
                    operatorStack.push(token);
                } else {
                    throw new IllegalArgumentException("Invalid token: " + token);
                }
            }

            while (!operatorStack.isEmpty()) {
                postfix.append(operatorStack.pop()).append(" ");
            }

            String expression=postfix.toString().trim();
            System.out.println(expression);

            //Calculate the result of the postfix

            Stack<Double> stack = new Stack<>();

            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);

                if (Character.isDigit(c) || c == '.') {
                    // If the character is a digit or a decimal point, parse it as a double and push it onto the stack
                    int startIndex = i;
                    while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                        i++;
                    }
                    double num = Double.parseDouble(expression.substring(startIndex, i));
                    stack.push(num);
                    i--;
                } else if (c == '+' || c == '-' || c == '×' || c == '÷') {
                    // If the character is an operator, pop two operands from the stack and perform the operation
                    double operand2 = stack.pop();
                    double operand1 = stack.pop();

                    switch (c) {
                        case '+':
                            stack.push(operand1 + operand2);
                            break;
                        case '-':
                            stack.push(operand1-operand2);
                            break;
                        case '×':
                            stack.push(operand1 * operand2);
                            break;
                        case '÷':
                            stack.push(operand1 / operand2);
                            break;
                    }
                }
            }
            // The result of the expression is the top element on the stack
            double resultFinal=stack.pop();
            if(Double.isInfinite(resultFinal)){
                EquationLabel.setForeground(Color.RED);
                ResultLabel.setText(String.valueOf(0));

            }else {
                if (resultFinal % 1 == 0) {
                    int y = (int) resultFinal;
                    ResultLabel.setText(String.valueOf(y));
                } else {
                    ResultLabel.setText(Double.toString(resultFinal));
                }


            }
        });

        JButton  subtract=new JButton("-");
        subtract.setName("Subtract");
        subtract.setBounds(385,590,75,75);
        add(subtract);
        subtract.addActionListener(e -> {
            int len = EquationLabel.getText().length();
            if (EquationLabel.getText().isEmpty()) {
                EquationLabel.setText("");
            } else {
                if (EquationLabel.getText().substring(len - 1).matches("[+×÷-]")) {
                    EquationLabel.setText(EquationLabel.getText().substring(0, len - 1) + "-");
                } else {
                    EquationLabel.setText(EquationLabel.getText() + "-");
                }
            }
        });









        setVisible(true);
    }
}
