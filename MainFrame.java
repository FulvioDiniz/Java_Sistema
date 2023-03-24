import javax.swing.*;
import java.awt.*;


    public class MainFrame extends JFrame {
        private JPanel mainPanel;
        private JLabel titleLabel;
        public JTextArea outputTextArea;
    
        public MainFrame() {
            // Configurar a janela principal
            setTitle("Sistema de Empréstimo de Chaves");
            setSize(500, 500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            // Criar o painel principal
            mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());
    
            // Criar o rótulo do título
            titleLabel = new JLabel("Histórico de Empréstimos");
            mainPanel.add(titleLabel, BorderLayout.NORTH);
    
            // Criar a área de texto para exibir o resultado
            outputTextArea = new JTextArea();
            mainPanel.add(new JScrollPane(outputTextArea), BorderLayout.CENTER);
    
            // Adicionar o painel principal à janela principal
            add(mainPanel);
    
            // Exibir a janela principal
            setVisible(true);
        }
    }
    

