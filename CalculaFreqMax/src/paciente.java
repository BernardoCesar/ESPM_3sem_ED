public class paciente {
    String nome;
    int idade;

    static int freqMax(int idade){
        int freq = 220 - idade;
        return freq;
    }
}
