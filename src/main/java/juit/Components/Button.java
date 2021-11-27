package juit.Components;
import javax.swing.JButton;
@SuppressWarnings("ALL")
public class Button {
    JButton jButton = new JButton();
    String Text;
    private int y = 50, x = 100, SizeX = 100,SizeY = 50;
    public Button(String Text, int x, int y) {
        jButton.setText(Text);
        jButton.setSize(x,y);
        jButton.setVisible(true);
        this.Text = Text;
        this.x = x;
        this.y = y;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }

    public void createButton(String Text,int x, int y,int SizeX, int SizeY)
    {
        jButton = new JButton(Text);
        jButton.setBounds(x,y,SizeX,SizeY);
        jButton.setVisible(true);
        this.Text = Text;
        this.x = x;
        this.y = y;
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public String getText()
    {return Text;}
    public int GetX()
    {return x;}
    public int GetY()
    {return y;}
    public int GetSizeX()
    {return SizeX;}
    public int GetSizeY()
    {return SizeY;}

    public JButton getButton() {
        return jButton;
    }

    public void setText(String text) {jButton.setText(text);}
    public void setButtonSize(int SizeX,int SizeY)
    {
        jButton.setSize(x,y);
    }
}
