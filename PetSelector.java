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

        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(70, 130, 180));
        JLabel headerLabel = new JLabel("Select Your Favorite Pet");
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(headerLabel);
        add(headerPanel, BorderLayout.NORTH);

        // Button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1, 10, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        ButtonGroup group = new ButtonGroup();

        monkeyButton = new JRadioButton("Monkey");
        styleButton(monkeyButton);
        monkeyButton.addActionListener(this);
        group.add(monkeyButton);
        buttonPanel.add(monkeyButton);

        catButton = new JRadioButton("Cat");
        styleButton(catButton);
        catButton.addActionListener(this);
        group.add(catButton);
        buttonPanel.add(catButton);

        birdButton = new JRadioButton("Bird");
        styleButton(birdButton);
        birdButton.addActionListener(this);
        group.add(birdButton);
        buttonPanel.add(birdButton);

        fishButton = new JRadioButton("Fish");
        styleButton(fishButton);
        fishButton.addActionListener(this);
        group.add(fishButton);
        buttonPanel.add(fishButton);

        ratButton = new JRadioButton("Rat");
        styleButton(ratButton);
        ratButton.addActionListener(this);
        group.add(ratButton);
        buttonPanel.add(ratButton);

        add(buttonPanel, BorderLayout.WEST);

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

    private void styleButton(JRadioButton button) {
        button.setFont(new Font("Arial", Font.PLAIN, 18));
        button.setFocusPainted(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == monkeyButton) {
            showMessage("Monkey", monkeyIcon);
        } else if (e.getSource() == catButton) {
            showMessage("Cat", catIcon);
        } else if (e.getSource() == birdButton) {
            showMessage("Bird", birdIcon);
        } else if (e.getSource() == fishButton) {
            showMessage("Fish", fishIcon);
        } else if (e.getSource() == ratButton) {
            showMessage("Rat", ratIcon);
        }
    }

    private void showMessage(String petName, ImageIcon petIcon) {
        JOptionPane.showMessageDialog(this, "You selected: " + petName, "Pet Selected", JOptionPane.INFORMATION_MESSAGE,
                petIcon);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PetSelector frame = new PetSelector();
            frame.setVisible(true);
        });
    }
}