package TictacToeButton;

public class tictactoeModel {

	private String clickedButton;
	private String cell_Value;
	private int X_value,O_value,Draw_value;
	private boolean game_end;
	public tictactoeModel() {
		X_value = 0;
		O_value  = 0;
		Draw_value = 0;
		this.clickedButton = "";
		this.cell_Value = "";
		this.game_end = false;
	}
	public void setGame_end(boolean game_end) {
		this.game_end = game_end;
	}
	public String getClickedButton() {
		return clickedButton;
	}
	public int getX_value() {
		return X_value;
	}

	public void setX_value(int x_value) {
		X_value = x_value;
	}

	public int getO_value() {
		return O_value;
	}

	public void setO_value(int o_value) {
		O_value = o_value;
	}

	public int getDraw_value() {
		return Draw_value;
	}

	public void setDraw_value(int draw_value) {
		Draw_value = draw_value;
	}

	public void setClickedButton(String clickedButton) {
		this.clickedButton = clickedButton;
	}

	public String getCell_Value() {
		return cell_Value;
	}

	public void setCell_Value(String cell_Value) {
		this.cell_Value = cell_Value;
	}
	public void X_incresement() {
		this.X_value++;
	}
	public void O_incresement() {
		this.O_value++;
	}
	public void Draw_incresement() {
		this.Draw_value++;
	}
	public boolean isGame_end() {
		return this.game_end;
	}
	
}
