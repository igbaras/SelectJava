import javax.swing.JOptionPane;
class select
{public static void main(String[] args)
{int choice;
String str;
str=JOptionPane.showInputDialog("Main Menu\n"+
"*1+Name\n"+
"*2+School\n"+
"*3+Course\n"+
"*4+Exit");
{choice =Integer.parseInt(str);
if(choice==1)
JOptionPane.showMessageDialog(null,"Christian Igbaras");else
if(choice==2)
JOptionPane.showMessageDialog(null,"DFCAIT");else
if(choice==3)
JOptionPane.showMessageDialog(null,"Programming");else
if(choice==4)
JOptionPane.showMessageDialog(null,"by:TIAN");
}
}
}
