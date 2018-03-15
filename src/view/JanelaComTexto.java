
package view;

import java.awt.GridLayout;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class JanelaComTexto extends JFrame {
    
    public JanelaComTexto() throws ParseException{
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarComponentes();
        setVisible(true);
    }
    
    public JanelaComTexto(String titulo) throws ParseException{
        this();
        setTitle(titulo);
    }

    private void inicializarComponentes() throws ParseException {
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(8, 1, 5, 5));
        
        JLabel lblTelInter = new JLabel("Telefone Internacional:");
        MaskFormatter mascTelInter = new MaskFormatter("+##(##)####-####");
        mascTelInter.setPlaceholderCharacter('_');
        JFormattedTextField txfTelInter = new JFormattedTextField(mascTelInter);
        
        JLabel lblTelNacio = new JLabel("Telefone Nacional:");
        MaskFormatter mascTelNacio = new MaskFormatter("(##)####-####");
        mascTelInter.setPlaceholderCharacter('_');
        JFormattedTextField txfTelNacio = new JFormattedTextField(mascTelNacio);
        
        JLabel lblCep = new JLabel("CEP:");
        MaskFormatter mascCep = new MaskFormatter("#####-###");
        mascCep.setPlaceholderCharacter('_');
        JFormattedTextField txfCep = new JFormattedTextField(mascCep);
        
        JLabel lblCpf = new JLabel("CPF:");
        MaskFormatter mascCpf = new MaskFormatter("###.###.###-##");
        mascCpf.setPlaceholderCharacter('_');
        JFormattedTextField txfCpf = new JFormattedTextField(mascCpf);
        
        JLabel lblPlacaAuto = new JLabel("Placa de automóveis:");
        MaskFormatter mascPlacaAuto = new MaskFormatter("UUU-####");
        mascPlacaAuto.setPlaceholderCharacter('_');
        JFormattedTextField txfPlacaAuto = new JFormattedTextField(mascPlacaAuto);
        
        JLabel lblCnpj = new JLabel("CNPJ:");
        MaskFormatter mascCnpj = new MaskFormatter("##.###.###/####-##");
        mascCnpj.setPlaceholderCharacter('_');
        JFormattedTextField txfCnpj = new JFormattedTextField(mascCnpj);
        
        JLabel lblTitEle = new JLabel("Título de eleitor:");
        MaskFormatter mascTitEle = new MaskFormatter("#########/##");
        mascTitEle.setPlaceholderCharacter('_');
        JFormattedTextField txfTitEle = new JFormattedTextField(mascTitEle);
        
        JLabel lblDataNasc = new JLabel("Data de nascimento:");
        MaskFormatter mascDataNasc = new MaskFormatter("##/##/####");
        mascDataNasc.setPlaceholderCharacter('_');
        JFormattedTextField txfDataNasc = new JFormattedTextField(mascDataNasc);
        
        
        painel.add(lblTelInter);
        painel.add(txfTelInter);
        
        painel.add(lblTelNacio);
        painel.add(txfTelNacio);
        
        painel.add(lblCep);
        painel.add(txfCep);
        
        painel.add(lblCpf);
        painel.add(txfCpf);
        
        painel.add(lblPlacaAuto);
        painel.add(txfPlacaAuto);
        
        painel.add(lblCnpj);
        painel.add(txfCnpj);
        
        painel.add(lblTitEle);
        painel.add(txfTitEle);
        
        painel.add(lblDataNasc);
        painel.add(txfDataNasc);
        
        getContentPane().add(painel);
    }
        
}
