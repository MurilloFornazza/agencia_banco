package paineis;

import classes.Conta;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PainelDepositar extends JPanel {

    private JMenuBar jmbMenubar;
    private JMenuItem jmiSacar, jmiDepositar, jmiTranferir, jmiSair;
    private JLabel jlNumeroConta, jlNomeCliente, jlSaldo, jlLimite;
    private JTextField jtfNumeroConta, jtfNomeCliente, jtfSaldo, jtfLimite;

    private JButton jbBotaoCadastrar;

    List<Conta> contas = new ArrayList<>();




    private void iniciarCompontentes() {
    }

    private void criarEventos() {
    }

}
