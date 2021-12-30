package juit.Components;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CheckBox {
    JCheckBox jCheckBox = new JCheckBox();
    boolean isSelected = false;
    String Text ="";
    public void addActionListener(ActionListener actionListener)
    {
        jCheckBox.addActionListener(actionListener);
    }
    public void setSelected(boolean isSelected)
    {
        jCheckBox.setSelected(isSelected);
        this.isSelected = isSelected;
    }
    public boolean isSelected()
    {
        return isSelected;
    }
    public String toString(){
        String temp = "";
        if(isSelected == true) temp = "true";
        if(isSelected == false) temp = "false";
        return temp;
    }
    public void setText(String Text){
        jCheckBox.setText(Text);
        this.Text = Text;
    }
    public String getTextLocally()
    {
        return this.Text;
    }
    public String getText(){
        return jCheckBox.getText();
    }

}
