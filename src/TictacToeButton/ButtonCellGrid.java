package TictacToeButton;

import java.awt.Color;

import javax.swing.JButton;

public class ButtonCellGrid {
	private JButton button;
	private String Button_text;
	
	public ButtonCellGrid(JButton buttoncell){
		this.button = buttoncell;
		this.Button_text = buttoncell.getText();
	}
	public JButton getButton() {
		return button;
	}
	public void setButton(JButton button) {
		this.button = button;
	}
	public String getButton_text() {
		return Button_text;
	}
	public void setButton_text(String button_text) {
		Button_text = button_text;
	}
	public void resetcellValue(){
		this.button.setText("");
	}
	
	public void setValueForcell(String value){
		this.button.setText(value);
		if(value.equals("X")) {
			this.button.setForeground(new Color(72, 210, 254));
		}
		else {
			this.button.setForeground(new Color(226, 190, 0));
		}
	}
}
