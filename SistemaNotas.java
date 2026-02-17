import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SistemaNotas extends JFrame {
    private ArrayList<Aluno> lista;
    private JLabel lblNome, lblNota1, lblNota2;
    private JTextField txtNome, txtNota1, txtNota2;
    private JButton btnCadastrar, btnLimpar, btnSair;
    private JTextArea txtHistorico;

    public SistemaNotas() {
        lista = new ArrayList<>();

        setTitle("Sistema de Notas");
        setSize(350, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        lblNome = new JLabel("Nome: ");
        lblNota1 = new JLabel("Nota 1: ");
        lblNota2 = new JLabel("Nota 2: ");

        txtNome = new JTextField(25);
        txtNota1 = new JTextField(25);
        txtNota2 = new JTextField(25);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(e -> {
            try {
                String nome = txtNome.getText();
                if (nome.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Digite o nome do aluno.");
                    return;
                }

                double nota1 = Double.parseDouble(txtNota1.getText());
                double nota2 = Double.parseDouble(txtNota2.getText());

                if(nota1 < 0 || nota1 > 10) {
                    throw new NotaInvalidaException("Nota 1 deve estar entre 0 e 10.");
                }

                if(nota2 < 0 || nota2 > 10) {
                    throw new NotaInvalidaException("Nota 2 deve estar entre 0 e 10.");
                }

                Aluno aluno = new Aluno(nome, nota1, nota2);
                lista.add(aluno);

                atualizarHistorico();

                txtNome.setText("");
                txtNota1.setText("");
                txtNota2.setText("");
                txtNome.requestFocus();
            } catch(NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Erro: Notas devem ser numeros validos.");
            } catch(NotaInvalidaException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(e -> {
            txtNome.setText("");
            txtNota1.setText("");
            txtNota2.setText("");
            txtNome.requestFocus();
        });

        btnSair = new JButton("Sair");
        btnSair.addActionListener(e -> {
            System.exit(0);
        });

        txtHistorico = new JTextArea(15, 30);
        txtHistorico.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtHistorico);

        add(lblNome);
        add(txtNome);
        add(lblNota1);
        add(txtNota1);
        add(lblNota2);
        add(txtNota2);
        add(btnCadastrar);
        add(btnLimpar);
        add(btnSair);
        add(scroll);

        setVisible(true);
    }

    public void atualizarHistorico() {
        txtHistorico.setText("");

        for(Aluno aluno : lista) {
            txtHistorico.append(aluno.toString());
        }
    }

    public static void main(String[] args) {
        new SistemaNotas();
    }
}