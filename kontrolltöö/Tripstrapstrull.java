import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tripstrapstrull {
	static Scanner in;
	static String[] board;
	static String turn;
	static JPanel mainPanel = new JPanel();

	public static void main(String[] args) {
		JFrame frame= new JFrame(); 
        frame.setTitle("tripstrapstrull");
         
               // Panel to define the layout. We are using GridBagLayout
		
		GridLayout experimentLayout = new GridLayout(3,3);
        mainPanel.setLayout(experimentLayout);
 
        JPanel headingPanel = new JPanel();
        JLabel headingLabel = new JLabel("This is the heading panel for our demo course");
        headingPanel.add(headingLabel);
		 mainPanel.add(new JButton("Button 1"));
		 mainPanel.add(new JButton("Button 1"));
		 mainPanel.add(new JButton("Button 1"));
		 mainPanel.add(new JButton("Button 1"));
		 mainPanel.add(new JButton("Button 1"));
		 mainPanel.add(new JButton("Button 1"));
		 mainPanel.add(new JButton("Button 1"));
		 mainPanel.add(new JButton("Button 1"));
		 mainPanel.add(new JButton("Button 1"));

        // Panel to define the layout. We are using GridBagLayout

		//mainPanel.add(headingPanel);
		//mainPanel.add(panel);
		//mainPanel.add(trips);
 
        // Add panel to frame
        frame.add(mainPanel);
        frame.pack();
                frame.setSize(400, 400);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
		in = new Scanner(System.in);
		board = new String[9];
		turn = "X";
		String winner = null;
		fillBoard();
		Board1();
		System.out.println("X mängib esimesena");
		
		while (winner == null) {
			int numInput;
			try {
				numInput = in.nextInt();
				if (!(numInput > 0 && numInput <= 9)) {
					System.out.println("vale sisestus, pane uus number");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("vale sisestus, pane uus number");
				continue;
			}
			if (board[numInput-1].equals(String.valueOf(numInput))) {
				board[numInput-1] = turn;
				if (turn.equals("X")) {
					turn = "O";
				} else {
					turn = "X";
				}
				Board1();
				winner = Winner1();
			} else {
				System.out.println("see koht on juba võetud, sisesta uus number");
				continue;
			}
		}
		if (winner.equalsIgnoreCase("viik")) {
			System.out.println("see mäng jäi viiki");
		} else {
			System.out.println(winner + " on võitnud mängu");
		}
	}


	static String Winner1() {
		for (int a = 0; a < 8; a++) {
			String line = null;

			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;

			case 1:
				line = board[3] + board[4] + board[5];
				break;

			case 2:
				line = board[6] + board[7] + board[8];
				break;

			case 3:
				line = board[0] + board[3] + board[6];
				break;

			case 4:
				line = board[1] + board[4] + board[7];
				break;

			case 5:
				line = board[2] + board[5] + board[8];
				break;

			case 6:
				line = board[0] + board[4] + board[8];
				break;

			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}

			if (line.equals("XXX")) {
				return "X";
				
			} else if (line.equals("OOO")) {
				return "O";
			}}
		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}
			else if (a == 8) return "viik";
		}
	
		System.out.println(turn + " kord, sisesta koha number");
		return null;
		}


	static void Board1() {
		System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
		System.out.println("---------");
		System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
		System.out.println("---------");
		System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
	}

	static void fillBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
			JButton aa = (JButton)mainPanel.getComponent(a);
			aa.addActionListener(new ActionListener(){  
				public void actionPerformed(ActionEvent e){ 
					e.getSource();
					board[numInput-1] = turn;
					if (turn.equals("X")) {
						turn = "O";
					} else {
						turn = "X";
					} 
						aa.setText("X");  
				}  
				});  
			aa.setText("");
		}
	}
}