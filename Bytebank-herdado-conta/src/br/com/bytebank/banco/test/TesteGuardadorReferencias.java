package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta2;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {

        public static void main(String[] args) {

            GuardadorDeReferencias guardador = new GuardadorDeReferencias();

            Conta2 cc = new ContaCorrente(22, 11);
            guardador.adiciona(cc);

            Conta2 cc2 = new ContaCorrente(22, 22);
            guardador.adiciona(cc2);

            int tamanho = guardador.getQuantidadeDeElementos();
            System.out.println(tamanho);

            Conta2 ref = (Conta2) guardador.getReferencia(1);
            System.out.println(ref.getNumero());

}
}