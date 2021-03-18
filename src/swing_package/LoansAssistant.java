package swing_package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class LoansAssistant extends javax.swing.JFrame {

    public boolean validateDecimalNumber(JTextField tf) {
// checks to see if text field contains
// valid decimal number with onl digits and a single decimal point
        String s = tf.getText().trim();
        boolean hasDecimal = false;
        boolean valid = true;
        if (s.length() == 0) {
            valid = false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= '0' && c <= '9') {
                    continue;
                } else if (c == '.' && !hasDecimal) {
                    hasDecimal = true;
                } else {
// invalid character found
                    valid = false;
                }
            }
        }
        tf.setText(s);
        if (!valid) {
            tf.requestFocus();
        }
        return (valid);
    }

    public LoansAssistant() {

        initComponents();

        balanceTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                balanceTextFieldActionPerformed(e);
            }
        });

        interestTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                interestTextFieldActionPerformed(e);
            }

            private void interestTextFieldActionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        monthsTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                monthsTextFieldActionPerformed(e);
            }
        });
        paymentTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                paymentTextFieldActionPerformed(e);
            }

            private void paymentTextFieldActionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

    }
    
    
   

    private void exitForm(WindowEvent evt) {
        System.exit(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        loanBalanceLabel = new javax.swing.JLabel();
        balanceTextField = new javax.swing.JTextField();
        interestRateLabel = new javax.swing.JLabel();
        interestTextField = new javax.swing.JTextField();
        paymentLabel = new javax.swing.JLabel();
        paymentTextField = new javax.swing.JTextField();
        monthsLabel = new javax.swing.JLabel();
        monthsTextField = new javax.swing.JTextField();
        paymentButton = new javax.swing.JButton();
        computeButton = new javax.swing.JButton();
        analysisLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        analysisTextArea = new javax.swing.JTextArea();
        exitButton = new javax.swing.JButton();
        newLoanButton = new javax.swing.JButton();
        monthsButton = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan Assistant");

        loanBalanceLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        loanBalanceLabel.setText("Loan Balance");

        balanceTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        balanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceTextFieldActionPerformed(evt);
            }
        });

        interestRateLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        interestRateLabel.setText("Interest Rate");

        interestTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interestTextFieldActionPerformed(evt);
            }
        });

        paymentLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        paymentLabel.setText("Number of Payments");

        paymentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentTextFieldActionPerformed(evt);
            }
        });

        monthsLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        monthsLabel.setText("Monthly Payment");

        monthsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthsTextFieldActionPerformed(evt);
            }
        });

        paymentButton.setText("X");
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });

        computeButton.setText("Computer Monthly Payment");
        computeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeButtonActionPerformed(evt);
            }
        });

        analysisLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        analysisLabel.setText("Loan Analysis:");

        analysisTextArea.setColumns(20);
        analysisTextArea.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        analysisTextArea.setRows(5);
        jScrollPane1.setViewportView(analysisTextArea);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        newLoanButton.setText("Next Loan Analysis");
        newLoanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLoanButtonActionPerformed(evt);
            }
        });

        monthsButton.setText("X");
        monthsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(paymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(monthsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addGap(28, 28, 28))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(loanBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(interestRateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(interestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paymentButton)
                            .addComponent(monthsButton))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(newLoanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(analysisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(computeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loanBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(interestRateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(interestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthsButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monthsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(paymentButton)))
                        .addGap(28, 28, 28)
                        .addComponent(computeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(newLoanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(analysisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Color lightYellow = new Color(255, 255, 128);
    boolean computePayment;

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed


// will compute payment
        computePayment = true;
        paymentButton.setVisible(false);
        monthsButton.setVisible(true);
        monthsTextField.setEditable(true);
        monthsTextField.setBackground(Color.WHITE);
        monthsTextField.setFocusable(true);
        paymentTextField.setText("");
        paymentTextField.setEditable(false);
        paymentTextField.setBackground(lightYellow);
        paymentTextField.setFocusable(false);
        computeButton.setText("Compute Monthly of Payment");
        balanceTextField.requestFocus();
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void computeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeButtonActionPerformed

        double balance, interest, payment;
        int months;
        double monthlInterest, multiplier;
        double loanBalance, finalPayment;

        if (validateDecimalNumber(balanceTextField)) {
            balance
                    = Double.valueOf(balanceTextField.getText()).doubleValue();
        } else {

            JOptionPane.showConfirmDialog(null, "Invalid or empty Loan Balance entry.\nPlease correct.", "Balance Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

            return;
        }
        if (validateDecimalNumber(interestTextField)) {
            interest
                    = Double.valueOf(interestTextField.getText()).doubleValue();
        } else {
            JOptionPane.showConfirmDialog(null, "Invalid or empty Interest Rate entry.\nPlease correct.", "Interest Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

            return;
        }
        monthlInterest = interest / 1200;
        if (computePayment) {
            //Compute loan payment

            if (validateDecimalNumber(monthsTextField)) {
                months = Integer.valueOf(monthsTextField.getText()).intValue();
            } else {
                JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Payments entry.\nPlease correct.", "Number of Payments Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

                return;
            }
            if (interest == 0) {
                payment = balance / months;
            } else {
                multiplier = Math.pow(1 + monthlInterest, months);
                payment = balance * monthlInterest * multiplier / (multiplier - 1);
            }
            paymentTextField.setText(new DecimalFormat("0.00").format(payment));


        } else {
// Compute number of payments
            if (validateDecimalNumber(paymentTextField)) {
                payment = Double.valueOf(paymentTextField.getText()).doubleValue();
                if (payment <= (balance * monthlInterest + 1.0)) {
                    if (JOptionPane.showConfirmDialog(null, "Minimum payment must be $" + new DecimalFormat("0.00").format((int) (balance * monthlInterest + 1.0)) + "\n" + "Do you want to use the minimum payment?", "Input Error", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                        paymentTextField.setText(new DecimalFormat("0.00").format((int) (balance * monthlInterest + 1.0)));
                        payment
                                = Double.valueOf(paymentTextField.getText()).doubleValue();
                    } else {
                        paymentTextField.requestFocus();
                        return;
                    }
                }

            } else {
                JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Payment entry.\nPlease correct.", "Payment Input Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

                return;
            }
            if (interest == 0) {
                months = (int) (balance / payment);
            } else {
                months = (int) ((Math.log(payment) - Math.log(payment - balance * monthlInterest))
                        / Math.log(1 + monthlInterest));
            }
            monthsTextField.setText(String.valueOf(months));

        }
// reset payment prior to analysis to fix at two decimals
        payment
                = Double.valueOf(paymentTextField.getText()).doubleValue();
// show analysis
        analysisTextArea.setText("Loan Balance: $" + new DecimalFormat("0.00").format(balance));
        analysisTextArea.append("\n" + "Interest Rate: " + new DecimalFormat("0.00").format(interest) + "%");
// process all but last payment
        loanBalance = balance;
        for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++) {
            loanBalance += loanBalance * monthlInterest - payment;
        }
// find final payment
        finalPayment = loanBalance;
        if (finalPayment > payment) {
// appl one more payment
            loanBalance += loanBalance * monthlInterest - payment;
            finalPayment = loanBalance;
            months++;
            monthsTextField.setText(String.valueOf(months));
        }
        analysisTextArea.append("\n\n" + String.valueOf(months - 1) + " Payments of $" + new DecimalFormat("0.00").format(payment));
        analysisTextArea.append("\n" + "Final Payment of: $" + new DecimalFormat("0.00").format(finalPayment));
        analysisTextArea.append("\n" + "Total Payments: $" + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment));
        analysisTextArea.append("\n" + "Interest Paid $" + new DecimalFormat("0.00").format((months - 1) * payment + finalPayment - balance));
        computeButton.setEnabled(false);
        newLoanButton.setEnabled(true);
        newLoanButton.requestFocus();

        int response;
        response = JOptionPane.showConfirmDialog(null, "This is an example of an confirm dialog box", "Example", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
// Pressed Yes
            JOptionPane.showConfirmDialog(null, "Quick message for you.", "Hey you!!",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
        } else if (response == JOptionPane.NO_OPTION) {

        } else {

        }

    }//GEN-LAST:event_computeButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void monthsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsTextFieldActionPerformed
        monthsTextField.transferFocus();
    }//GEN-LAST:event_monthsTextFieldActionPerformed

    private void balanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceTextFieldActionPerformed
        balanceTextField.transferFocus();
    }//GEN-LAST:event_balanceTextFieldActionPerformed

    private void monthsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsButtonActionPerformed
        // will compute months

//computePayment = false;
//paymentButton.setVisible(true);
//monthsButton.setVisible(false);
//monthsTextField.setText("");
//monthsTextField.setEditable(false);
//monthsTextField.setBackground(lightYellow);
//paymentTextField.setEditable(true);
//paymentTextField.setBackground(Color.WHITE);
//computeButton.setText("Compute Number of Payments");
// will compute months
        computePayment = false;
        paymentButton.setVisible(true);
        monthsButton.setVisible(false);
        monthsTextField.setText("");
        monthsTextField.setEditable(false);
        monthsTextField.setBackground(lightYellow);
        monthsTextField.setFocusable(false);
        paymentTextField.setEditable(true);
        paymentTextField.setBackground(Color.WHITE);
        paymentTextField.setFocusable(true);
        computeButton.setText("Compute Number of Payments");
        balanceTextField.requestFocus();


    }//GEN-LAST:event_monthsButtonActionPerformed

    private void newLoanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLoanButtonActionPerformed
        //clear computed value and analysis
        if (computePayment) {
            paymentTextField.setText("");
        } else {
            monthsTextField.setText("");
        }
        analysisTextArea.setText("");
        computeButton.setEnabled(true);
        newLoanButton.setEnabled(false);
        balanceTextField.requestFocus();
    }//GEN-LAST:event_newLoanButtonActionPerformed

    private void interestTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interestTextFieldActionPerformed
        interestTextField.transferFocus();
    }//GEN-LAST:event_interestTextFieldActionPerformed

    private void paymentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentTextFieldActionPerformed
        paymentTextField.transferFocus();
    }//GEN-LAST:event_paymentTextFieldActionPerformed

    public static void main(String args[]) {
        //creste frame
//        new LoansAssistant().show();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoansAssistant().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel analysisLabel;
    private javax.swing.JTextArea analysisTextArea;
    private javax.swing.JTextField balanceTextField;
    private javax.swing.JButton computeButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel interestRateLabel;
    private javax.swing.JTextField interestTextField;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loanBalanceLabel;
    private javax.swing.JButton monthsButton;
    private javax.swing.JLabel monthsLabel;
    private javax.swing.JTextField monthsTextField;
    private javax.swing.JButton newLoanButton;
    private javax.swing.JButton paymentButton;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JTextField paymentTextField;
    // End of variables declaration//GEN-END:variables
}
