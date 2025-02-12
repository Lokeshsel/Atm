import javax.swing.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


 class bank extends JFrame  implements ActionListener {
    int amount = 0;
    JButton Balance,withdrawal,deposit,cancel;
    Scanner depositInput,withdrawalInput;



    bank() {


        Balance = new JButton("Balance");
        Balance.setBounds(40, 50, 100, 40);
        Balance.addActionListener(new ActionListener() {
            @Override
            public synchronized void actionPerformed(ActionEvent e) {
                System.out.println("current Balance" + amount);


            }
        });


        deposit = new JButton("Deposit");
        deposit.setBounds(170, 50, 100, 40);
        deposit.addActionListener(new ActionListener() {
            @Override
            public synchronized void actionPerformed(ActionEvent e) {
                depositInput = new Scanner(System.in);
                int depositAmount = depositInput.nextInt();
                amount+=depositAmount;
                System.out.println("Deposited amount:"+amount);



            }

        });

        withdrawal = new JButton("Withdrawal");
        withdrawal.setBounds(290, 50, 100, 40);
        withdrawal.addActionListener(new ActionListener() {
            @Override
            public synchronized void actionPerformed(ActionEvent e) {
                withdrawalInput = new Scanner(System.in);
                int withdrawalAmount = withdrawalInput.nextInt();
                if (withdrawalAmount <= amount) {
                    amount -= withdrawalAmount;
                    System.out.println("Withdrawn: " + withdrawalAmount);
                } else {
                    System.out.println("Insufficient balance.");
                }
            }


        });
        add(Balance);
        add(deposit);
        add(withdrawal);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new bank();
    }


     @Override
     public void actionPerformed(ActionEvent e) {

     }
 }
