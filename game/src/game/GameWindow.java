package game;
import javax.swing.*;
//First amendment
import java.awt.*;
import java.awt.event.*;


/**
 * Game Window Classs that do everything for the program
 * @author kamalgiri
 *
 */
public class GameWindow extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	//DIMENSIONS
	private static Dimension d_size = new Dimension(1000,1000); //Dimension for GUI Size
	private static Dimension menu_size = new Dimension(400,100); // Default Menu
	private static Dimension title_size = new Dimension(50,50); // Default Title Size
	private static Dimension button_size = new Dimension(100, 70); //Default Button size within menu
	
	//Colors
	private static String background = "#1199E";
	private static String panels = "#30E3CA";
	private static String elements = "#E4F9F5";
	private static String lines = "#40514E";
	
	//FRAMES
	/**
	 * creating the container that gives us the content pane
	 */
	private Container main = this.getContentPane();
	private static JPanel menu_panel, game_panel;
	private static JPanel LPieces, Board, RPieces;
	
	//BUTTONS
	private static JButton quit, reset, new_game;
	
	
	//Constructor
	/**
	 * Constructor for the GameWindow
	 * @param window_title, name of the winow title for the console
	 */
	public GameWindow(String window_title) {
		super(window_title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		main.setLayout(new GridBagLayout()); //Adding GridBagLayout to the main container
		add_menu_container();
		//Adding buttons
		new_game = add_button("New Game", 0);
		reset = add_button("Reset", 1);
		quit = add_button("Quit", 2);
		quit.addActionListener(this);
	}
	
	//create_main_panel helper function
	/**
	 * Method to create the menu panel in Jpanel
	 * @param border
	 * @return
	 */
	private JPanel create_main_panel(boolean border) {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		panel.setBackground(Color.decode(panels));
		
		//Give the panel a border if requested
		
		if(border) {
			panel.setBorder(BorderFactory.createLineBorder(Color.decode(lines), 3));
		}
		return panel;
	}
	
	//Create the Menu Panel
	/**
	 * method to add the menu container in Jpanel
	 */
	private void add_menu_container() {
		menu_panel = create_main_panel(true);
		menu_panel.setPreferredSize(menu_size);
		menu_panel.setMinimumSize(menu_size);
		GridBagConstraints c  = new GridBagConstraints();
		c.gridy = 0;
		c.insets = new Insets(15,0,0,0);
		c.weighty = 0.1;
		c.anchor = GridBagConstraints.NORTH;
		main.add(menu_panel, c);
		
	}
	
	//Adding buttons to the Menu Panel
	/**
	 * method to add buttons
	 * @param text
	 * @param x
	 * @return
	 */
	
	private JButton add_button(String text, int x) {
		JButton button = new JButton(text);
		button.setPreferredSize(button_size);
		button.setMinimumSize(button_size);
		button.setBackground(Color.decode(elements));
		button.setBorder(BorderFactory.createLineBorder(Color.decode(lines), 2));
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(0,10,0,10);
		c.gridx = x;
		menu_panel.add(button, c);
		return button;
	}
	/**
	 * Method used to make everything visible in board
	 */
	
	public void show_ui() {
		this.setSize(d_size);
		main.setBackground(Color.decode(background));
		this.setVisible(true);
		return;
	}

	@Override
	/**
	 * Is not doing anything right now
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
