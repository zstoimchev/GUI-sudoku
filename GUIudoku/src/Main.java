import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Sudoku");
        frame.setBounds(150, 50, 600, 600);

        JPanel grid = new JPanel(new GridLayout(9, 9));

        JButton[][] b = new JButton[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                b[i][j] = new JButton();
                b[i][j].setText("" + i + "" + j);
                grid.add(b[i][j]);
            }
        }
        frame.add(grid, BorderLayout.CENTER);

        JButton[] bu = new JButton[9];
        JPanel numbers = new JPanel(new GridLayout(1, 9));
        frame.add(numbers, BorderLayout.SOUTH);
        for (int i = 0; i < 9; i++) {
            bu[i] = new JButton();
            bu[i].setText("" + (i + 1));
            numbers.add(bu[i]);
        }


        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
}
