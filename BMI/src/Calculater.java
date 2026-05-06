import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculater {
    static void main(String[] args) {

        // create frame
        JFrame BMI_Frame = new JFrame("BMI CAlCULATOR");
        BMI_Frame.setSize(800, 600);
        BMI_Frame.setLocationRelativeTo(null);
        BMI_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add layout
        BMI_Frame.setLayout(new BorderLayout());

        //create weight label
        JLabel weight = new JLabel("WEIGHT: ");
        weight.setBounds(30,30,100,25);
        BMI_Frame.add(weight);

        //create height label
        JLabel height = new JLabel("HEIGHT: ");
        height.setBounds(30,70,100,25);
        BMI_Frame.add(height);

        //create weight text
        JTextField weightText = new JTextField(10);
        weightText.setBounds(140,30,150,25);
        BMI_Frame.add(weightText);

        //create height text
        JTextField heightText = new JTextField(10);
        heightText.setBounds(140,70,150,25);
        BMI_Frame.add(heightText);

        //create button
        JButton calBTN = new JButton("CALCULATE");
        calBTN.setBounds(140, 110, 150, 30);

        BMI_Frame.add(calBTN);

        //result label
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(30, 160, 300, 25);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        BMI_Frame.add(resultLabel);

        //event for press button
        calBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double w = Double.parseDouble(weightText.getText());
                    double h = Double.parseDouble(heightText.getText());

                    double h_meter = h/100;

                    double bmi = w/(h_meter*h_meter);

                    String category;

                    if (bmi < 18.5) {
                        category = "Underweight";
                        resultLabel.setText(String.format("BMI: %.2f (%s) ",bmi,category));
                    } else {
                        if (bmi < 25) {
                            category = "Normal";
                        } else if (bmi < 30) {
                            category = "Overweight";
                        } else {
                            category = "Obese";
                        }
                        resultLabel.setText(String.format("BMI: %.2f (%s) ",bmi,category));
                    }

                }catch (Exception ex){
                    resultLabel.setText("Please enter valid numbers!");
                }
            }
        });
            BMI_Frame.setVisible(true);
    }


}
