import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class calculator implements ActionListener{

    JFrame frame;
    TextField tx;
    JButton nbutton[]=new JButton[10];
    JButton fbutton[]=new JButton[8];
    JButton addbutton,subbutton,mulbutton,divbutton;
    JButton decbutton,equbutton,clrbutton,delbutton;

    JPanel p;
    Font myfont=new Font("Ink Free",Font.BOLD,30);

    double num1=0,num2=0,result=0;
    char operator;

    calculator()
    {
        frame=new JFrame("CALCULATOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);


        tx=new TextField();
        tx.setBackground(Color.lightGray);
        tx.setBounds(50,25,300,50);
        tx.setFont(myfont);
        tx.setForeground(Color.blue);


        addbutton=new JButton("+");
        subbutton=new JButton("-");
        divbutton=new JButton("/");
        mulbutton=new JButton("*");
        decbutton=new JButton(".");
        equbutton=new JButton("=");
        clrbutton=new JButton("CLEAR");
        delbutton=new JButton("DEL");

        fbutton[0]=addbutton;
        fbutton[1]=subbutton;
        fbutton[2]=mulbutton;
        fbutton[3]=divbutton;
        fbutton[4]=decbutton;
        fbutton[5]=equbutton;
        fbutton[6]=clrbutton;
        fbutton[7]=delbutton;

        for(int i=0;i<8;i++)
        {
            fbutton[i].addActionListener(this);
            fbutton[i].setFont(myfont);
            fbutton[i].setFocusable(false);
        }

        for(int i=0;i<10;i++)
        {
            nbutton[i]=new JButton(String.valueOf(i));
            nbutton[i].addActionListener(this);
            nbutton[i].setFont(myfont);
            nbutton[i].setFocusable(false);
        }
        p=new JPanel();
        p.setBounds(50,100,300,300);
        p.setBackground(Color.GRAY);
        p.setLayout(new GridLayout(4,4,10,10));



        clrbutton.setBounds(50,430,145,50);
        delbutton.setBounds(205,430,145,50);

        p.add(nbutton[1]);
        p.add(nbutton[2]);
        p.add(nbutton[3]);
        p.add(addbutton);
        p.add(nbutton[4]);
        p.add(nbutton[5]);
        p.add(nbutton[6]);
        p.add(subbutton);
        p.add(nbutton[7]);
        p.add(nbutton[8]);
        p.add(nbutton[9]);
        p.add(mulbutton);
        p.add(decbutton);
        p.add(nbutton[0]);
        p.add(divbutton);
        p.add(equbutton);


        frame.add(tx);
        frame.add(clrbutton);
        frame.add(delbutton);
        frame.add(p);
        frame.setVisible(true);
    }
    public static void main(String args[])
    {
        calculator obj=new calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        for(int i=0;i<10;i++)
        {
            if(e.getSource()==nbutton[i])
            {
                tx.setText(tx.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource()==decbutton)
        {
            tx.setText(tx.getText().concat(String.valueOf(".")));
        }
        if(e.getSource()==addbutton)
        {
            num1=Double.parseDouble(tx.getText());
            operator='+';
            tx.setText("");
        }
        if(e.getSource()==subbutton)
        {
            num1=Double.parseDouble(tx.getText());
            operator='-';
            tx.setText("");
        }
        if(e.getSource()==mulbutton)
        {
            num1=Double.parseDouble(tx.getText());
            operator='*';
            tx.setText("");
        }
        if(e.getSource()==divbutton)
        {
            num1=Double.parseDouble(tx.getText());
            operator='/';
            tx.setText("");
        }
        if(e.getSource()==equbutton)
        {
            num2=Double.parseDouble(tx.getText());
            switch(operator)
            {
                case '+':
                    result=num1+num2;
                    break;
                case '-':
                    result=num1-num2;
                    break;
                case '*':
                    result=num1*num2;
                    break;
                case '/':
                    result=num1/num2;
                    break;
            }
            tx.setText(String.valueOf(result));
            num1=result;
        }
        if(e.getSource()==clrbutton)
        {
            tx.setText("");
        }
        if(e.getSource()==delbutton)
        {
            String str=tx.getText();
            tx.setText("");
            for(int i=0;i<str.length()-1;i++)
            {
                tx.setText(tx.getText()+str.charAt(i));
            }
        }

    }
}