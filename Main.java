
// import java.awt.FlowLayout;
// import javax.swing.JButton;
// import javax.swing.JFrame;

// // public class Main extends JFrame {
// //     public static void main(String[] args) {
// //         JFrame frame = new JFrame("Exemplo de interface gráfica");
// //         JButton button = new JButton("Clique aqui");
// //         frame.setLayout(new FlowLayout());
// //         frame.add(button);
// //         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// //         frame.setSize(300, 200);
// //         frame.setVisible(true);
// //     }
// // }


import java.util.ArrayList;
import java.time.LocalDateTime;


// public class Main {
//     private static long codigochave = 1;
//     private static long codigopessoa = 1;
//     private static long codigoemprestimo = 1;

//     ArrayList<Chave> chaves = new ArrayList<Chave>();
//     ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
//     ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

//     public static void main(String[] args) throws Exception {    
//         Pessoa pessoa = new Pessoa(codigopessoa++, "João");
//         Chave chave = new Chave(codigochave++, "Sala 1", true);
//         Emprestimo emprestimo;
//         pessoa.addContato(new Contato(1, TipoContato.EMAIL,"fulano@gmail.com"));
//         pessoa.addContato(new Contato(2, TipoContato.CELULAR,"34992056754"));
//         emprestimo = new Emprestimo(codigoemprestimo++,pessoa,chave);
//         emprestimo.setRetirada(LocalDateTime.now());
//         Pessoa pessoa2 = new Pessoa(codigopessoa++, "Maria");
//         pessoa2.addContato(new Contato(1, TipoContato.EMAIL,"Maria@yahoo.com"));
//         pessoa2.addContato(new Contato(2, TipoContato.CELULAR,"34992056754"));
//         emprestimo.finalizarEmprestimo(pessoa2);
//         System.out.println(emprestimo);
//     }
// }

public class Main {
    private static long codigochave = 1;
    private static long codigopessoa = 1;
    private static long codigoemprestimo = 1;

    ArrayList<Chave> chaves = new ArrayList<Chave>();
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
    public static void main(String[] args) throws Exception {
        // Instanciar a classe MainFrame
        MainFrame mainFrame = new MainFrame();

        // Executar o programa
        Pessoa pessoa = new Pessoa(codigopessoa++, "João");
        Chave chave = new Chave(codigochave++, "Sala 1", true);
        Emprestimo emprestimo;
        pessoa.addContato(new Contato(1, TipoContato.EMAIL,"fulano@gmail.com"));
        pessoa.addContato(new Contato(2, TipoContato.CELULAR,"34992056754"));
        emprestimo = new Emprestimo(codigoemprestimo++,pessoa,chave);
        emprestimo.setRetirada(LocalDateTime.now());
        Pessoa pessoa2 = new Pessoa(codigopessoa++, "Maria");    
        pessoa2.addContato(new Contato(1, TipoContato.EMAIL,"maria@yahoo.com"));
        mainFrame.outputTextArea.append(emprestimo.toString());
    }
}