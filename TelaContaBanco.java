package Telas;


import classes.Conta;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TelaContaBanco extends JFrame {

    private JMenuBar jmbMenubar;
    private JMenuItem jmiSacar, jmiDepositar, jmiTranferir, jmiSair;
    private JLabel jlNumeroConta, jlNomeCliente, jlSaldo, jlLimite;
    private JTextField jtfNumeroConta, jtfNomeCliente, jtfSaldo, jtfLimite;

    private JButton jbBotaoCadastrar;

    List<Conta> contas = new ArrayList<>();

    public TelaContaBanco(String title) throws HeadlessException {
        super(title);
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Color color = new Color(75, 121, 117);
        getContentPane().setBackground(color);
        setLocationRelativeTo(getContentPane());
        iniciarCompontentes();
        criarEventos();
        setTitle("Banco ItaCÚ");

    }

    private void iniciarCompontentes() {
        jmbMenubar = new JMenuBar();
        add(jmbMenubar);
        setJMenuBar(jmbMenubar);

        jmiDepositar = new JMenuItem("Depositar");
        jmbMenubar.add(jmiDepositar);

        jmiSacar = new JMenuItem("Sacar");
        jmbMenubar.add(jmiSacar);

        jmiTranferir = new JMenuItem("Transferir");
        jmbMenubar.add(jmiTranferir);

        jmiSair = new JMenuItem("Sair");
        jmbMenubar.add(jmiSair);

        jlNomeCliente = new JLabel("Nome do cliente");
        add(jlNomeCliente);
        jtfNomeCliente = new JTextField();
        add(jtfNomeCliente);

        jlNumeroConta = new JLabel("Número da conta");
        add(jlNumeroConta);
        jtfNumeroConta = new JTextField();
        add(jtfNumeroConta);

        jlSaldo = new JLabel("Saldo");
        add(jlSaldo);
        jtfSaldo = new JTextField();
        add(jtfSaldo);

        jlLimite = new JLabel("Limite da conta");
        add(jlLimite);
        jtfLimite = new JTextField();
        add(jtfLimite);

        jbBotaoCadastrar = new JButton("Cadastrar");
        add(jbBotaoCadastrar);


        jlNomeCliente.setBounds(60, 30, 100, 20);
        jtfNomeCliente.setBounds(60, 60, 150, 20 );

        jlNumeroConta.setBounds(60, 90, 100, 20);
        jtfNumeroConta.setBounds(60, 120, 150, 20);

        jlLimite.setBounds(280, 30, 100, 20);
        jtfLimite.setBounds(280, 60, 150, 20);

        jlSaldo.setBounds(280, 90, 100 ,20);
        jtfSaldo.setBounds(280, 120, 150, 20);

        jbBotaoCadastrar.setBounds(200, 300, 100, 20);

    }

    private void criarEventos() {

        jbBotaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome;
                int numeroConta;
                double saldo, limite;

                nome = jlNomeCliente.getText();
                numeroConta = Integer.parseInt(jlNumeroConta.getText());
                saldo = Double.parseDouble(jlSaldo.getText());
                limite = Double.parseDouble(jlLimite.getText());

                Conta conta = new Conta(numeroConta, nome, saldo, limite);
                contas.add(conta);

                jlLimite.setText("");
                jlNumeroConta.setText("");
                


            }
        });

        jmiDepositar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jmiSacar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jmiTranferir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jmiSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });



    }

    public static void main(String[] args) {
        TelaContaBanco tela = new TelaContaBanco("Bando itaCÚ");
        tela.setVisible(true);
    }

}


