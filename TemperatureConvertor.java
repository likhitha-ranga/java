import java.awt.*;
import java.awt.event.*;
class TemperatureConvertor{
   static int val1,val2;
public static void main(String[] args){
Frame f=new Frame();
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
f.setTitle("Temperature Convertor");
int a=255,b= 182, c=193;
Label l1=new Label("Temperature Convertor");
l1.setBounds(130,30,150,30);
f.add(l1);
l1.setBackground(new Color(a,b,c));
Label l2=new Label("Degrees");
l2.setBounds(30,70,70,40);
f.add(l2);
l2.setBackground(new Color(a,b,c));
Label l3=new Label("Type");
f.add(l3);
l3.setBounds(250,70,70,40);
l3.setBackground(new Color(a,b,c));
Label l4=new Label("Convert to type");
f.add(l4);
l4.setBounds(400,70,150,40);
l4.setBackground(new Color(a,b,c));
TextField t1=new TextField("");
t1.setBounds(30,150,100,20);
f.add(t1);
Button b1=new Button("Celsius");
b1.setBounds(250,150,75,20);
f.add(b1);
Button b2=new Button("Farenheit");
b2.setBounds(250,175,75,20);
f.add(b2);
Button b3=new Button("Kelvin");
b3.setBounds(250,200,75,20);
f.add(b3);
Button b4=new Button("convert");
b4.setBounds(175,250,50,30);
f.add(b4);
Button b5=new Button("Celsius");
b5.setBounds(400,150,75,20);
f.add(b5);
Button b6=new Button("Farenheit");
b6.setBounds(400,175,75,20);
f.add(b6);
Button b7=new Button("Kelvin");
b7.setBounds(400,200,75,20);
f.add(b7);
TextField t2=new TextField("Result");
t2.setBounds(30,200,200,20);
f.add(t2);
b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
		t2.setText("Celsius scale....");
			val1=0;
			}
		});
b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
		t2.setText("Farenheit scale....");
			val1=1;
			}
		});
b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
		t2.setText("Kelvin scale....");
			val1=2;
			}
		});
b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
		t2.setText("converting into Celsius scale....");
			val2=0;
			}
		});
b6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
		t2.setText("converting into farenheit scale....");
			val2=1;
			}
		});
b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
		t2.setText("converting into kelvin scale....");
			val2=2;
			}
		});
b4.addActionListener(new ActionListener()
		{
            float res;
			public void actionPerformed(ActionEvent ae)
			{
                float value=Float.parseFloat(t1.getText());
                if(val1==0 && val2==0)
                res=value;
                else if(val1==0 && val2==1)
                res=value*(1.8f)+32;
                else if(val1==0 && val2==2)
                res=value+(273.15f);
                else if(val1==1 && val2==0)
                res=(value-32)*(10.0f/18);
                else if(val1==1 && val2==1)
                res=value;
                else if(val1==1 && val2==2)
                res=((value-32)*(10.0f/18.0f))+273.15f;
                else if(val1==2 && val2==0)
                res=value-273.15f;
                else if(val1==2 && val2==1)
                res=((value-273.15f)*(1.8f))+32;
                else if(val1==2 && val2==2)
                res=value;
		t2.setText(""+res);
			}
		});
        f.setBackground(new Color(a,b,c));
f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we)
		{
			System.exit(0);
		}
		});
}
}