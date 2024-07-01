package TictactoeController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import GUI.UI;
import TictacToeButton.ButtonCellGrid;
import TictacToeButton.tictactoeModel;

public class TictactoeController implements ActionListener{
	private UI view;
	private ArrayList<ButtonCellGrid> cell_list;
	private tictactoeModel modelgame;
	public TictactoeController(UI view,ArrayList<ButtonCellGrid> cell_list,tictactoeModel tictacmodel) {
		this.modelgame = tictacmodel;
		this.cell_list = new ArrayList<ButtonCellGrid>();
		this.view = view;
		this.cell_list = cell_list;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String sc = e.getActionCommand();
		if(sc.equals("NEW GAME")) {
			this.view.GameStart();
			this.modelgame.setClickedButton("");
		}
		else if(sc.equals("EXIT")) {
			int n = JOptionPane.showConfirmDialog(
		            null,
		            "Exit the game",
		            "Notification!",
		            JOptionPane.YES_NO_OPTION);

		        if(true){
		    		try {
		    			 System.exit(0);
		    		} catch (Exception e3) {
		    			// TODO: handle exception
		    			e3.printStackTrace();
		    		}	
		        }
		}
		// get the button
		// button  0
		// void HandleCellValueWhenClicked()	
		else if(e.getSource() == this.cell_list.get(0).getButton()){
			this.view.HandleCellValueWhenClicked(this.cell_list.get(0));
		}
		else if(e.getSource() == this.cell_list.get(1).getButton()){
			this.view.HandleCellValueWhenClicked(this.cell_list.get(1));
		}
		else if(e.getSource() == this.cell_list.get(2).getButton()){
			this.view.HandleCellValueWhenClicked(this.cell_list.get(2));
		}
		else if(e.getSource() == this.cell_list.get(3).getButton()){
			this.view.HandleCellValueWhenClicked(this.cell_list.get(3));
		}
		else if(e.getSource() == this.cell_list.get(4).getButton()){
			this.view.HandleCellValueWhenClicked(this.cell_list.get(4));
		}
		else if(e.getSource() == this.cell_list.get(5).getButton()){
			this.view.HandleCellValueWhenClicked(this.cell_list.get(5));
		}
		else if(e.getSource() == this.cell_list.get(6).getButton()){
			this.view.HandleCellValueWhenClicked(this.cell_list.get(6));
		}
		else if(e.getSource() == this.cell_list.get(7).getButton()){
			this.view.HandleCellValueWhenClicked(this.cell_list.get(7));
		}
		else if(e.getSource() == this.cell_list.get(8).getButton()){
			this.view.HandleCellValueWhenClicked(this.cell_list.get(8));
		}
	}
}
