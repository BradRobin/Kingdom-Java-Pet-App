import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PetSelector extends JFrame implements ActionListener {
    private JLabel petLabel;
    private JRadioButton monkeyButton;
    private JRadioButton catButton;
    private JRadioButton birdButton;
    private JRadioButton fishButton;
    private JRadioButton ratButton;

    private ImageIcon monkeyIcon;
    private ImageIcon catIcon;
    private ImageIcon birdIcon;
    private ImageIcon fishIcon;
    private ImageIcon ratIcon;

    public PetSelector() {
        setTitle("Pet Selector");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        petLabel = new JLabel("Select a pet: ", SwingConstants.CENTER);
        petLabel.setHorizontalTextPosition(JLabel.CENTER);
        petLabel.setVerticalTextPosition(JLabel.BOTTOM);
        add(petLabel, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));

        ButtonGroup group = new ButtonGroup();

        monkeyButton = new JRadioButton("Monkey");
        monkeyButton.addActionListener(this);
        group.add(monkeyButton);
        panel.add(monkeyButton);

        catButton = new JRadioButton("Cat");
        catButton.addActionListener(this);
        group.add(catButton);
        panel.add(catButton);

        birdButton = new JRadioButton("Bird");
        birdButton.addActionListener(this);
        group.add(birdButton);
        panel.add(birdButton);

        fishButton = new JRadioButton("Fish");
        fishButton.addActionListener(this);
        group.add(fishButton);
        panel.add(fishButton);

        ratButton = new JRadioButton("Rat");
        ratButton.addActionListener(this);
        group.add(ratButton);
        panel.add(ratButton);

        add(panel, BorderLayout.WEST);

        monkeyIcon = new ImageIcon(
                new ImageIcon("images/monkeyphoto.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        catIcon = new ImageIcon(
                new ImageIcon("images/catphoto.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        birdIcon = new ImageIcon(
                new ImageIcon("images/birdphoto.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        fishIcon = new ImageIcon(
                new ImageIcon("images/fishphoto.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        ratIcon = new ImageIcon(
                new ImageIcon("images/ratphoto.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == monkeyButton) {
            petLabel.setIcon(monkeyIcon);
            petLabel.setText("You selected: Monkey");
        } else if (e.getSource() == catButton) {
            petLabel.setIcon(catIcon);
            petLabel.setText("You selected: Cat");
        } else if (e.getSource() == birdButton) {
            petLabel.setIcon(birdIcon);
            petLabel.setText("You selected: Bird");
        } else if (e.getSource() == fishButton) {
            petLabel.setIcon(fishIcon);
            petLabel.setText("You selected: Fish");
        } else if (e.getSource() == ratButton) {
            petLabel.setIcon(ratIcon);
            petLabel.setText("You selected: Rat");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PetSelector frame = new PetSelector();
            frame.setVisible(true);
        });
    }
}