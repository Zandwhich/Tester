import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * Class to do tests with JTables to figure out how to use them
 */
public class JTableTest {

    public static void main() {

        JFrame.setDefaultLookAndFeelDecorated(true);

        Vector<String> columnNames = new Vector<>();
        columnNames.add("Column 1");
        columnNames.add("Column 2");
        columnNames.add("Column 3");
        columnNames.add("Column 4");
        columnNames.add("Column 5");

        Vector<Vector<String>> data = new Vector<>();
        Vector<String> temp = new Vector<>();
        temp.add("Column 1 Row 1");
        temp.add("Column 2 Row 1");
        temp.add("Column 3 Row 1");
        temp.add("Column 4 Row 1");
        temp.add("Column 5 Row 1");
        data.add(temp);
        Vector<String> temp2 = new Vector<>();
        temp2.add("Column 1 Row 2");
        temp2.add("Column 2 Row 2");
        temp2.add("Column 3 Row 2");
        temp2.add("Column 4 Row 2");
        temp2.add("Column 5 Row 2");
        data.add(temp2);
        Vector<String> temp3 = new Vector<>();
        temp3.add("Column 1 Row 3");
        temp3.add("Column 2 Row 3");
        temp3.add("Column 3 Row 3");
        temp3.add("Column 4 Row 3");
        temp3.add("Column 5 Row 3");
        data.add(temp3);
        Vector<String> temp4 = new Vector<>();
        temp4.add("Column 1 Row 4");
        temp4.add("Column 2 Row 4");
        temp4.add("Column 3 Row 4");
        temp4.add("Column 4 Row 4");
        temp4.add("Column 5 Row 4");
        data.add(temp4);
        Vector<String> temp5 = new Vector<>();
        temp5.add("Column 1 Row 5");
        temp5.add("Column 2 Row 5");
        temp5.add("Column 3 Row 5");
        temp5.add("Column 4 Row 5");
        temp5.add("Column 5 Row 5");
        data.add(temp5);

        JTable table = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        JButton button = new JButton();
        button.setText("Set random num to random cell");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(button);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setTitle("Testing Window");
        frame.add(panel);
        frame.setSize(600, 151);
        frame.setVisible(true);

        // Keep reading:
        // https://docs.oracle.com/javase/tutorial/uiswing/layout/using.html
        // http://www.java2s.com/Tutorial/Java/0240__Swing/CreatingaJTable.htm
        // http://www.java2s.com/Tutorial/Java/0240__Swing/ResizingandpositioningaJFrame.html

    }//end main()

}//end JTableTest
