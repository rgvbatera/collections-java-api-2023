package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = contatoSet;
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c: contatoSet) {
            if (c.getNome().startsWith(nome)) {
               contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                    break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();
        //agendaContatos.adicionarContato("camila", 123456);
        //agendaContatos.adicionarContato("camila", 555554);
        //agendaContatos.adicionarContato("camila cavalcante", 111111);
        //agendaContatos.adicionarContato("camila DIO", 454987);
        //agendaContatos.adicionarContato("maria silva", 111111);

        //agendaContatos.exibirContato();

        //System.out.println(agendaContatos.pesquisarPorNome("camila"));

        //System.out.println("contato atualizado: " + agendaContatos.atualizarNumeroContato("maia silva", 555555));

    }

}
