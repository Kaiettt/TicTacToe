package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import TictacToeButton.ButtonCellGrid;
import TictacToeButton.TicTacToe;
import TictacToeButton.tictactoeModel;
import TictactoeController.TictactoeController;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class UI extends JFrame {

	private JPanel contentPane;
	private JLabel Draw_Value;
	private JLabel PlayerOInfo;
	private JButton ExitgameButton;
	private JButton strartgameButton;
	private JButton Cell_Value_1;
	private JButton Cell_Value_2;
	private JButton Cell_Value_3;
	private JButton Cell_Value_5;
	private JButton Cell_Value_4;
	private JButton Cell_Value_6;
	private JButton Cell_Value_8;
	private JButton Cell_Value_7;
	private JButton Cell_Value_9;
	private ArrayList<ButtonCellGrid> cell_list;
	private Color customColor;
	private tictactoeModel tictactoeModel;
	private JLabel PlayerXInfo;
	private JLabel gameResult;
	private tictactoeModel tictac_model;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		this.tictac_model = new tictactoeModel();
		this.cell_list  = new ArrayList<ButtonCellGrid>();
		this.tictactoeModel = new tictactoeModel();
		this.tictactoeModel.setX_value(0);
		this.tictactoeModel.setO_value(0);
		this.tictactoeModel.setDraw_value(0);
		ActionListener ac = new TictactoeController(this,this.cell_list,this.tictac_model);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel GamePlayPannel = new JPanel();
		GamePlayPannel.setBackground(Color.decode("#2b0040"));
		GamePlayPannel.setBounds(0, 0, 436, 459);
		contentPane.add(GamePlayPannel);
		GamePlayPannel.setLayout(null);
		 

		customColor = new Color(61, 21, 88);
		Font font = new Font("Arial", Font.BOLD,65);
		
	     Color game_notification_pane_color = new Color(81, 25, 175);
		 
		 
		 Cell_Value_1 = new JButton("");
		 Cell_Value_1.addActionListener(ac);
		 cell_list.add(new ButtonCellGrid(Cell_Value_1));
		 setColorBackandText(customColor,Cell_Value_1,font);
		Cell_Value_1.setBounds(40, 67, 97, 95);
		
		GamePlayPannel.add(Cell_Value_1);
		
		 Cell_Value_2 = new JButton("");
		 Cell_Value_2.addActionListener(ac);
		 cell_list.add(new ButtonCellGrid(Cell_Value_2));
		 setColorBackandText(customColor,Cell_Value_2,font);
		Cell_Value_2.setBounds(170, 67, 97, 95);
		GamePlayPannel.add(Cell_Value_2);
		
		 Cell_Value_3 = new JButton("");
		 Cell_Value_3.addActionListener(ac);
		 cell_list.add(new ButtonCellGrid(Cell_Value_3));
		 setColorBackandText(customColor,Cell_Value_3,font);
		Cell_Value_3.setBounds(294, 67, 97, 95);
		GamePlayPannel.add(Cell_Value_3);
		
		 Cell_Value_4 = new JButton("");
		 Cell_Value_4.addActionListener(ac);
		 cell_list.add(new ButtonCellGrid(Cell_Value_4));
		 setColorBackandText(customColor,Cell_Value_4,font);
		Cell_Value_4.setBounds(40, 190, 97, 95);
		GamePlayPannel.add(Cell_Value_4);
		
		 Cell_Value_5 = new JButton("");
		 Cell_Value_5.addActionListener(ac);
		 cell_list.add(new ButtonCellGrid(Cell_Value_5));
		 setColorBackandText(customColor,Cell_Value_5,font);
		Cell_Value_5.setBounds(170, 190, 97, 95);
		GamePlayPannel.add(Cell_Value_5);
		
		
		 Cell_Value_6 = new JButton("");
		 Cell_Value_6.addActionListener(ac);
		 cell_list.add(new ButtonCellGrid(Cell_Value_6));
		 setColorBackandText(customColor,Cell_Value_6,font);
		Cell_Value_6.setBounds(294, 190, 97, 95);
		GamePlayPannel.add(Cell_Value_6);
		
		
		
		
		 Cell_Value_7 = new JButton("");
		 Cell_Value_7.addActionListener(ac);
		 cell_list.add(new ButtonCellGrid(Cell_Value_7));;
		 setColorBackandText(customColor,Cell_Value_7,font);
		Cell_Value_7.setBounds(40, 312, 97, 95);
		GamePlayPannel.add(Cell_Value_7);
		
		
		 Cell_Value_8 = new JButton("");
		 Cell_Value_8.addActionListener(ac);
		 cell_list.add(new ButtonCellGrid(Cell_Value_8));
		 setColorBackandText(customColor,Cell_Value_8,font);
		Cell_Value_8.setBounds(170, 312, 97, 95);
		GamePlayPannel.add(Cell_Value_8);
	
		
		 Cell_Value_9 = new JButton("");
		 Cell_Value_9.addActionListener(ac);
		 cell_list.add(new ButtonCellGrid(Cell_Value_9));
		 setColorBackandText(customColor,Cell_Value_9,font);
		Cell_Value_9.setBounds(294, 312, 97, 95);
		GamePlayPannel.add(Cell_Value_9);
		
		
		Font font_gameResult = new Font("Arial", Font.BOLD,17);
		gameResult = new JLabel();
		gameResult.setFont(font_gameResult);
		gameResult.setForeground(Color.white);
		gameResult.setBounds(40, 11, 203, 34);
		GamePlayPannel.add(gameResult);
		
		JPanel InfoGame = new JPanel();
		InfoGame.setBackground(Color.decode("#2b0040"));
		InfoGame.setBounds(436, 0, 280, 459);
		contentPane.add(InfoGame);
		InfoGame.setLayout(null);
		
		strartgameButton = new JButton("NEW GAME");
		strartgameButton.addActionListener(ac);
		Font font_button = new Font("Arial", Font.BOLD,17);
		strartgameButton.setBorder(new RoundedBorder(32));
		strartgameButton.setFont(font_button);
		strartgameButton.setBackground(Color.decode("#3d1558"));
		strartgameButton.setForeground(Color.white);
		strartgameButton.setBounds(45, 301, 171, 49);
		InfoGame.add(strartgameButton);
		
		ExitgameButton = new JButton("EXIT");
		ExitgameButton.addActionListener(ac);
		ExitgameButton.setBorder(new RoundedBorder(32));
		ExitgameButton.setFont(font_button);
		ExitgameButton.setForeground(Color.white);
		ExitgameButton.setBackground(Color.decode("#3d1558"));
		ExitgameButton.setBounds(45, 367, 171, 49);
		InfoGame.add(ExitgameButton);
		
		PlayerXInfo = new JLabel("X : " + this.tictactoeModel.getX_value());
		Color customColor2 = new Color(114, 207, 249);
		Font font_2 = new Font("Arial", Font.BOLD,20); // Arial, bold, size 16
		setColorBackandTextLabel(customColor2,PlayerXInfo,font_2);
		PlayerXInfo.setBounds(60, 36, 130, 57);
		InfoGame.add(PlayerXInfo);
		
		Draw_Value = new JLabel("DRAW :" + this.tictactoeModel.getDraw_value());
		Color customColor3 = new Color(194, 218, 246);
		setColorBackandTextLabel(customColor3,Draw_Value,font_2);
		Draw_Value.setBounds(60, 119, 130, 57);
		InfoGame.add(Draw_Value);
		
		PlayerOInfo = new JLabel("O: " + this.tictactoeModel.getO_value());
		//220, 191, 63
		Color customColor4 = new Color(220, 191, 63);
		setColorBackandTextLabel(customColor4,PlayerOInfo,font_2);
		PlayerOInfo.setBounds(60, 197, 130, 57);
		InfoGame.add(PlayerOInfo);
		
		this.setVisible(true);
	}
	
	// 72cff9
	// dcbf3f		
	void setColorBackandText(Color customColor,JButton but,Font font){
		 but.setBackground(customColor);
	        // Ensure the label paints the background
		 but.setOpaque(true);
		 but.setHorizontalAlignment(SwingConstants.CENTER);
		 but.setFont(font);
		 but.setForeground(customColor);
	}
	void setColorBackandTextLabel(Color customColor_1,JLabel label,Font font){
		 label.setBackground(customColor_1);
	        label.setOpaque(true);
	        label.setHorizontalAlignment(SwingConstants.CENTER);
	        label.setFont(font);
	        label.setForeground(Color.white);
	}
	public void GameStart() {
		this.tictac_model.setGame_end(false);
		this.gameResult.setText("");
		for (ButtonCellGrid buttonCellGrid : this.cell_list) {
			buttonCellGrid.resetcellValue();
//			buttonCellGrid.getButton().setVisible(false);
		}
	}
	static boolean isGameOver(char[][] board) {
        // Check rows and columns for a win
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true; // Row i is filled with the same player
            }
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return true; // Column i is filled with the same player
            }
        }

        // Check diagonals
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true; // Top-left to bottom-right diagonal is filled with the same player
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true; // Top-right to bottom-left diagonal is filled with the same player
        }

        // Check if the board is completely filled (draw condition)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // There is still an empty cell, game is not over
                }
            }
        }

        return true; // All cells are filled, game is a draw
    }

    // Function to determine the winner
    static char determineWinner(char[][] board) {
        // Check rows and columns for a win
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return board[i][0]; // Row i is filled with the same player
            }
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return board[0][i]; // Column i is filled with the same player
            }
        }

        // Check diagonals
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return board[0][0]; // Top-left to bottom-right diagonal is filled with the same player
        }
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return board[0][2]; // Top-right to bottom-left diagonal is filled with the same player
        }

        return ' '; // No winner found
    }

	public String checkBoardGame() {
		char[][] board = new char[3][3];
		int row = 0,col = 0;
		for (ButtonCellGrid buttonCellGrid : this.cell_list) {
			char value;
			if(buttonCellGrid.getButton().getText().isEmpty()) {
				value = ' ';
			}
			else value = buttonCellGrid.getButton().getText().charAt(0);
			board[row][col] = value;
			col++;
			if(col>=3) {
				row++;
				col = 0;
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(board[i][j]);
			}
			System.out.println(" ");
		}
//        int x = 0, o = 0, x3 = 0, o3 = 0;
//        // Reading the board
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (board[i][j] == 'X') x++;
//                else if (board[i][j] == 'O') o++;
//            }
//        }
//        // Checking rows and columns for winning lines
//        for (int i = 0; i < 3; i++) {
//            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
//                if (board[i][0] == 'X') x3++;
//                if (board[i][0] == 'O') o3++;
//            }
//            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
//                if (board[0][i] == 'X') x3++;
//                if (board[0][i] == 'O') o3++;
//            }
//        }
//
//        // Checking diagonals for winning lines
//        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
//            if (board[1][1] == 'X') x3++;
//            if (board[1][1] == 'O') o3++;
//        }
//        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
//            if (board[1][1] == 'X') x3++;
//            if (board[1][1] == 'O') o3++;
//        }
//        String game_check ="";
//        // Determining the game state
//        if ((x - o < 0 || x - o > 1) || (x3 > 0 && o3 > 0) || (x3 > 0 && x - o != 1) || (o3 > 0 && x - o != 0)) {
//        	game_check = "draw";
//        	this.tictac_model.setGame_end(true);
//        } else if (x3 > 0) {
//        	game_check = "X";
//        	this.tictac_model.setGame_end(true);
//        } else if (o3 > 0) {
//        	game_check = "O";
//        	this.tictac_model.setGame_end(true);
//        } else if (x - o == 0) {
//        	game_check = "Still";
//        } else if ((x + o < 9) && (x - o == 1)) {
//        	game_check = "Still";
//        } else {
//        	game_check = "draw";
//        }
//        return game_check;
		
		 if (isGameOver(board)) {
	            char winner = determineWinner(board);
	            if (winner != ' ') {
	            	this.tictac_model.setGame_end(true);
	            	return winner+"";
	            } else {
	            	this.tictac_model.setGame_end(true);
	            	return "draw";
	            }
	        } else {
	            return "still";
	        }
	}

	public void GameResult(String result){
		if(result.equals("X")) {
			
			this.tictactoeModel.X_incresement();
			this.gameResult.setText("The Winner is X");
			this.PlayerXInfo.setText("X : " + this.tictactoeModel.getX_value());
		}
		else if(result.equals("O")) {
			
			this.tictactoeModel.O_incresement();
			this.gameResult.setText("The Winner is O");
			this.PlayerOInfo.setText("O : " + this.tictactoeModel.getO_value());
		}
		else if(result.equals("draw")) {
			this.tictactoeModel.Draw_incresement();
			this.gameResult.setText("The game is Draw");
			this.Draw_Value.setText("DRAW :" + this.tictactoeModel.getDraw_value());
		}
		else this.gameResult.setText("");
	}
	
	
	public void AI_Play() {
//		while(true) {
//			Random random = new Random();
//	        int indx = random.nextInt(9);
//	        if(this.cell_list.get(indx).getButton().getText().isEmpty() || this.cell_list.get(indx).getButton().getText().equals("")) {
//	        	this.cell_list.get(indx).setValueForcell("O");
//	        	break;
//	        }
//		}
		char[][] board = new char[3][3];
		int row = 0,col = 0;
		for (ButtonCellGrid buttonCellGrid : this.cell_list) {
			char value;
			if(buttonCellGrid.getButton().getText().isEmpty()) {
				value = ' ';
			}
			else value = buttonCellGrid.getButton().getText().charAt(0);
			board[row][col] = value;
			col++;
			if(col>=3) {
				row++;
				col = 0;
			}
		}
		TicTacToe AI_Opponent = new TicTacToe(board);
		AI_Opponent.findBestMove();
		int r = AI_Opponent.getRow();
		int c = AI_Opponent.getCol();
		int cnt = 0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(r==i && c == j) {
		        	this.cell_list.get(cnt).setValueForcell("O");
				}
				cnt++;
			}
		}
		String gameplay = this.checkBoardGame();
		this.GameResult(gameplay);
	}
	
	public void HandleCellValueWhenClicked(ButtonCellGrid buttonCellGrid) {
		buttonCellGrid.setValueForcell("X");
		String gameplay  = this.checkBoardGame(); // still
		this.GameResult(gameplay);
		if(!this.tictac_model.isGame_end()) {
			this.AI_Play();
		}
}
	
}
