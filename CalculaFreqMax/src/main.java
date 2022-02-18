import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int opcao;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu()));
            if(opcao < 1 || opcao > 3){
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            } else{
                switch(opcao){
                    case 1:
                        processo.criarPaciente();
                        break;
                    case 2:
                        processo.consultarPaciente();
                        break;
                }
            }
        } while(opcao != 3);

    }

    public static String menu(){
        String aux = "Escolha uma opção: \n";
        aux += "1. Cadastrar um paciente\n";
        aux += "2. Consultar um paciente\n";
        aux += "3. Finalizar";

        return aux;
    }
    
}
