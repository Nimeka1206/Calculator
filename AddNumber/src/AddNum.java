import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddNum {
    static void main(String[] args) {

        //create frame
        JFrame frame = new JFrame("Add Two Numbers");
        frame.setSize(800,400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create label for num_1
        JLabel num1_label = new JLabel("Number 1:");
        num1_label.setBounds(50,50,100,25);
        frame.add(num1_label);

        //create label for num_2
        JLabel num2_label = new JLabel("Number 2:");
        num2_label.setBounds(50,100,100,25);
        frame.add(num2_label);

        //create text field for num1
        JTextField num1_text = new JTextField(10);
        num1_text.setBounds(150,50,100,25);
        frame.add(num1_text);

        //create text field for num2
        JTextField num2_text = new JTextField(10);
        num2_text.setBounds(150,100,100,25);
        frame.add(num2_text);

        //create button
        JButton btn = new JButton("Divide");
        btn.setBounds(50,150,100,25);
        frame.add(btn);

        //result label
        JLabel result = new JLabel("Result");
        result.setHorizontalTextPosition(SwingConstants.RIGHT);
        result.setBounds(400,50,100,50);
        frame.add(result);

        //get result value
        JLabel resultValue = new JLabel("");
        resultValue.setBounds(400,75,100,50);
        frame.add(resultValue);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double n1 = Double.parseDouble(num1_text.getText());
                    double n2 = Double.parseDouble(num2_text.getText());

                    if(n2 == 0){
                        JOptionPane.showMessageDialog(frame,"You can't enter 0 for second number");
                    } else {
                        double r = n1/n2;
                        resultValue.setText(String.valueOf(r));
                    }
                }catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(frame,"Please enter valid numbers");
                }
            }
        });
        frame.setVisible(true);
    }
}
