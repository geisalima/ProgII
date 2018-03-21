package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {

    private final int LARGURA = 220;
    private final int ALTURA = 270;
    
    private JTextField txfVisor;
    JButton b[] = new JButton[16];
    private final String names[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "+", "-", "*", "/", "=", "."};
    JButton bl[] = new JButton[3];
    private final String botoesLimpar[] = {"Backs", "CE", "C"};
    
    String operador;
    String valor1;
    String valor2;
    String operadorIgual;
    String temp = "";
    
    int guarda;
    
    int v1;
    int v2;
   
    public Calculadora() {
        setTitle("Calculadora");
        setSize(LARGURA, ALTURA);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarComponentes();
        setVisible(true);
    }

    private void inicializarComponentes() {
        JPanel painelCentral = new JPanel(new FlowLayout(1, 3, 3));

        painelCentral.add(campoVisor());
        painelCentral.add(criarBotoesLimpar());
        painelCentral.add(criarBotoes());

        getContentPane().add(painelCentral);
    }

    private JPanel campoVisor() {
        JPanel pnlVisor = new JPanel(new FlowLayout(FlowLayout.CENTER, 1, 3));
        txfVisor = new JTextField();
        txfVisor.setHorizontalAlignment(SwingConstants.RIGHT);
        txfVisor.setPreferredSize(new Dimension(200, 30));
        txfVisor.setEditable(false);

        pnlVisor.add(txfVisor);
        return pnlVisor;
    };

    private JPanel criarBotoes() {
        JPanel pnlBotoes = new JPanel(new GridLayout(4, 4, 5, 5));
        pnlBotoes.setPreferredSize(new Dimension(200, 150));
        for (int i = 0; i < 16; i++) {
            b[i] = new JButton(names[i]);
            b[i].addActionListener(this);
            pnlBotoes.add(b[i]);
        }
        return pnlBotoes;
    };
    
    private JPanel criarBotoesLimpar() {
        JPanel pnlBotoes = new JPanel(new GridLayout(1, 1, 2, 2));
        pnlBotoes.setPreferredSize(new Dimension(200, 40));
        for (byte i = 0; i < 3; i++) {
            bl[i] = new JButton(botoesLimpar[i]);
            bl[i].addActionListener(this);
            pnlBotoes.add(bl[i]);
        }
        return pnlBotoes;
    };
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == b[i]) {
                valor1 = txfVisor.getText() + e.getActionCommand();
                txfVisor.setText(valor1);
                
                v1 = Integer.parseInt(valor1);
                System.out.println("valor 1: " + v1);
            }
        }
        
        for (int i = 10; i < 14; i++) {
            if (e.getSource() == b[i]) {
                operador = e.getActionCommand();
                txfVisor.setText(operador);
                System.out.println("operador: " + operador);
            }          
        }
        
        if (e.getSource() == b[14]) {
            txfVisor.setText(Integer.toString((calcular(v1, operador, v1))));
        }
        
        if (e.getSource() == bl[2]) {
           valor1 = "";
           valor2 = "";
           operador = "";
           txfVisor.setText("");
        }
        
    }

    private int calcular(int num1, String op, int num2){
        int res = 0;

        if(op == "+"){
            res = num1 + num2;
        }
        else if(op == "-"){
           res = num1 - num2;
        }
        else if(op == "*"){
           res = num1 * num2;
        }
        else if(op == "/"){
           res = num1 / num2;
        }
        
        return res;
    }
}
