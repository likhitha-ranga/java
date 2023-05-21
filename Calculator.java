import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
class Calculator{
    public static double Arithmetic(String expression)
    {
        char[] tokens = expression.toCharArray();
        Stack<Double> values = new Stack<Double>();
        Stack<Character> ops = new Stack<Character>();
        for (int i = 0; i < tokens.length; i++)
        {
            if (tokens[i] == ' ')
                continue;
            if (tokens[i] >= '0' && tokens[i] <= '9')
            {
                StringBuffer sbuf = new StringBuffer();
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                values.push(Double.parseDouble(sbuf.toString()));
                  i--;
            }
            else if (tokens[i] == '(')
                ops.push(tokens[i]);
            else if (tokens[i] == ')')
            {
                while (ops.peek() != '(')
                  values.push(applyOp(ops.pop(),values.pop(),values.pop()));
                ops.pop();
            }
            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == 'x' || tokens[i] == '/' || tokens[i] == '%' || tokens[i] == '^'  || tokens[i]=='.')
            {
                while (!ops.empty() && hasPrecedence(tokens[i],ops.peek()))
                  values.push(applyOp(ops.pop(),values.pop(), values.pop()));
                ops.push(tokens[i]);
            }
        }
        while (!ops.empty())
            values.push(applyOp(ops.pop(),values.pop(),values.pop()));
        return values.pop();
    }
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == 'x' || op1 == '/' || op1=='%' || op1=='^' || op1=='.') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }
    public static double applyOp(char op, double b, double a)
    {
        switch (op)
        {
        case '+':
            return (double)a + b;
        case '-':
            return a - b;
        case 'x':
            return (double)a * b;
        case '/':
            if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero");
            return (double)a / b;
        case '%':
        return a % b;
        case '^':
        return Math.pow(a,b);
        case '.':
        return (double)(a*10+b)/10;
        }
        return 0;
    }
    public static void main(String[] args){
        Frame f=new Frame();
        f.setSize(450,750);
f.setLayout(null);
f.setVisible(true);
f.setTitle("Calculator");
TextField t=new TextField("");
t.setBounds(30,50,350,70);
f.add(t);
Button b1=new Button("(");
b1.setBounds(30,150,60,60);
f.add(b1);
b1.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"(");
    }
});
Button b2=new Button(")");
b2.setBounds(100,150,60,60);
f.add(b2);
b2.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+")");
    }
});
Button b3=new Button("ans");
b3.setBounds(170,150,60,60);
f.add(b3);
b3.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        double r=Calculator.Arithmetic(a);
        t.setText(r+"");
    }
});
Button b4=new Button("del");
b4.setBounds(240,150,60,60);
f.add(b4);
b4.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a.substring(0,a.length()-1));
    }
});
Button b5=new Button("clear");
b5.setBounds(310,150,60,60);
f.add(b5);
b5.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        t.setText("");
    }
});
Button b6=new Button("7");
b6.setBounds(30,250,60,60);
f.add(b6);
b6.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"7");
    }
});
Button b7=new Button("8");
b7.setBounds(100,250,60,60);
f.add(b7);
b7.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"8");
    }
});
Button b8=new Button("9");
b8.setBounds(170,250,60,60);
f.add(b8);
b8.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"9");
    }
});
Button b9=new Button("%");
b9.setBounds(240,250,60,60);
f.add(b9);
b9.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"%");
    }
});
Button b10=new Button("^");
b10.setBounds(310,250,60,60);
f.add(b10);
b10.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"^");
    }
});
Button b11=new Button("4");
b11.setBounds(30,350,60,60);
f.add(b11);
b11.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"4");
    }
});
Button b12=new Button("5");
b12.setBounds(100,350,60,60);
f.add(b12);
b12.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"5");
    }
});
Button b13=new Button("6");
b13.setBounds(170,350,60,60);
f.add(b13);
b13.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"6");
    }
});
Button b14=new Button("x");
b14.setBounds(240,350,60,60);
f.add(b14);
b14.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"x");
    }
});
Button b15=new Button("/");
b15.setBounds(310,350,60,60);
f.add(b15);
b15.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"/");
    }
});
Button b16=new Button("1");
b16.setBounds(30,450,60,60);
f.add(b16);
b16.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"1");
    }
});
Button b17=new Button("2");
b17.setBounds(100,450,60,60);
f.add(b17);
b17.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"2");
    }
});
Button b18=new Button("3");
b18.setBounds(170,450,60,60);
f.add(b18);
b18.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"3");
    }
});
Button b19=new Button("+");
b19.setBounds(240,450,60,60);
f.add(b19);
b19.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"+");
    }
});
Button b20=new Button("-" );
b20.setBounds(310,450,60,60);
f.add(b20);
b20.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"-");
    }
});
Button b21=new Button(".");
b21.setBounds(30,550,60,60);
f.add(b21);
b21.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+".");
    }
});
Button b22=new Button("0");
b22.setBounds(100,550,60,60);
f.add(b22);
b22.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+"0");
    }
});
Button b23=new Button("+/-");
b23.setBounds(170,550,60,60);
f.add(b23);
b23.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText("-"+a);
    }
});
Button b24=new Button("Enter");
b24.setBounds(240,550,130,60);
f.add(b24);
b24.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String a=t.getText();
        t.setText(a+'\n');
    }
});
f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
		});
    }
}