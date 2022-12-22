package calculoimc;

import javax.swing.JOptionPane;


public class Principal {

    public static void main(String[] args) {

        Pessoa usuario = new Pessoa ();

        String peso;
        String altura;

        usuario.nome = JOptionPane.showInputDialog("Informe o seu nome:");
        peso = JOptionPane.showInputDialog("Informe o seu peso em Kg:");
        altura = JOptionPane.showInputDialog("Informe o sua altura em cm:");

        Double peso2 = Double.parseDouble(peso);
        Double altura2 = Double.parseDouble(altura);


        Double altura3 = altura2*altura2;
        Double peso3 = (peso2*10000);


        Double IMC = peso3/altura3;


        if (IMC <= 19){
            JOptionPane.showMessageDialog(null, usuario.nome + " está abaixo do Peso!, seu imc é: " + IMC);
        }

        else if (IMC >= 20 && IMC <= 25){
            JOptionPane.showMessageDialog(null, usuario.nome + " está dentro do Peso ideal!, seu imc é: " + IMC);
        }

        else if (IMC >= 26 && IMC <= 30){
            JOptionPane.showMessageDialog(null, usuario.nome + " está acima do Peso!, seu imc é: " + IMC);
        }

        else if (IMC >= 31 && IMC < 40){
            JOptionPane.showMessageDialog(null, usuario.nome + " está com OBESIDADE!, seu imc é: " + IMC);
        }
 
    }
    
}

