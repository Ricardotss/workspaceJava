
public class Teste {
	
        lista.sort(new Comparator<Conta>() { //classe anonima

        @Override
        public int compare(Conta c1, Conta c2) {

            return Integer.compare(c1.getNumero(), c2.getNumero());
                    }
                }
                );

                Comparator<Conta> comp = new Comparator<Conta>() {

                        @Override
                        public int compare(Conta c1, Conta c2) {
                            String nomeC1 = c1.getTitular().getNome();
                            String nomeC2 = c2.getTitular().getNome();
                            return nomeC1.compareTo(nomeC2);
                        }
                };

        for (Conta conta : lista) {
                System.out.println(conta + ", " + conta.getTitular().getNome());
        }
}