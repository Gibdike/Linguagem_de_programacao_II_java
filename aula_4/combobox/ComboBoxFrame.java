import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame {

    private JComboBox imagesJComboBox;
    private JLabel label;
    private static final long serialVersionUID = 1L;

    private static final String[] names = {"bug1.gif", "gif2.gif", "travelbug.gif", "baymax.gif"};
    private Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3]))
    };

    public ComboBoxFrame(){
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        imagesJComboBox = new JComboBox(names);
        imagesJComboBox.setMaximumRowCount(3);

        imagesJComboBox.addItemListener((ItemEvent event) -> {
            if(event.getStateChange() == ItemEvent.SELECTED )
                label.setIcon(icons[
                        imagesJComboBox.getSelectedIndex()
                        ]);
        });
        add(imagesJComboBox);
        label = new JLabel(icons[0]);
        add(label);
    };
}