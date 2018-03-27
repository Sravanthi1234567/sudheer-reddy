import java.applet.*;
import java.awt.*;
public class  Apps extends Applet
{
String s,s1,s2;
public void init()
{

setBackground(Color.white);
s="this is of red color";
s1="this is of blue color";
s2="this is of pink color";
}
public void paint(Graphics g)
{
g.setColor(Color.red);
g.drawString(s,10,10);
g.setColor(Color.blue);
g.drawString(s1,30,30);
g.setColor(Color.pink);
g.drawString(s2,50,50);
}
} 
/*<Applet code="Apps" width=300 height=200>
</applet>
*/