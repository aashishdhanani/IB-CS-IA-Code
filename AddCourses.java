import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCourses extends JDialog {
    private JPanel panel1;
    private JTextField tfTest;
    private JPanel Test;
    private JButton btnDone;


    public AddCourses (JFrame parent) {
        setTitle("Add Courses");
        setContentPane(Test);
        setMinimumSize(new Dimension(450, 429));
        setSize(600, 500);
        setVisible(true);
        setAlwaysOnTop(true);

        btnDone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        AddCourses addCourses = new AddCourses(null);
    }


}

