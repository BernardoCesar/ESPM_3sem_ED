import javax.swing.JOptionPane;

public class processo {
    static paciente[] paciente = new paciente[3];
    static int posicao = 0;

    public static void criarPaciente(){
        String nome;
        int idade;

        if(posicao < paciente.length){
            nome = JOptionPane.showInputDialog("Nome: ");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
            
            paciente[posicao] = new paciente();
            paciente[posicao].nome = nome;
            paciente[posicao].idade = idade;
            posicao++;

        } else{
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o paciente!");
        }
    }

    public static int pesquisar() {
        int aux = -1; // -1 indica que o cpf nao foi encontrado
        String nome = JOptionPane.showInputDialog("Informe o nome do paciente");
        for(int i=0; i<posicao; i++){
            if(paciente[i].nome.equals(nome)){
                aux = i;
                break;
            }
        }
        return aux;
    }

    public static void consultarPaciente(){
        double saldo;
        int p = pesquisar();
        if(p==-1){
            JOptionPane.showMessageDialog(null,"Paciente não encontrado");
        }else{
            int freq = 220 - paciente[p].idade;
            JOptionPane.showMessageDialog(null, "Nome -> " + paciente[p].nome + " | Frequencia maxima -> " + freq);
        }
    }
}
