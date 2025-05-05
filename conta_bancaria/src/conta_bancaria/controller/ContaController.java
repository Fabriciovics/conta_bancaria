package conta_bancaria.controller;

import conta_bancaria.model.Conta;
import conta_bancaria.repository.ContaRepository;

import java.util.ArrayList;
import java.util.Optional;

public class ContaController implements ContaRepository {


    //Criar collection array list
    private ArrayList<Conta> listaContas = new ArrayList<Conta>();

    int numero = 0;

    @Override
    public void procurarPorNumero(int numero) {
        Optional<Conta> conta = buscarNaCollection(numero);
        if(conta.isPresent()) {
            conta.get().visualizar();

        }else {
            System.out.printf("Conta numero %d nao foi encontrada", numero);
        }
    }

    @Override
    public void listarTodas() {
        for(var conta : listaContas){
            conta.visualizar();
        }
    }

    @Override
    public void cadastrar(Conta conta) {
        listaContas.add(conta);
        System.out.println("Conta foi criada com sucesso!");
    }

    @Override
    public void atualizar(Conta conta) {
        Optional<Conta> buscaConta = buscarNaCollection(conta.getNumero());
        if(buscaConta.isPresent()) {
            listaContas.set(listaContas.indexOf(buscaConta.get()), conta);
            System.out.printf("Conta numero %d atualizada com sucesso", conta.getNumero());
        } else {
            System.out.printf("Conta numero %d nao foi encontrada", conta.getNumero());
        }
    }


    @Override
    public void deletar(int numero) {
        Optional<Conta> conta = buscarNaCollection(numero);
        if (conta.isPresent()) {
            if (listaContas.remove(conta.get())) {
                System.out.printf("A conta numero %d foi excluida com sucesso!", numero);
            } else {
                System.out.printf("Conta numero %d nao foi encontrada", numero);
            }
        }
    }

    @Override
    public void sacar(int numero, float valor) {

    }

    @Override
    public void depositar() {

    }

    @Override
    public void transferir(int numeroOrigem, int numeroDestino, float valor) {

    }

    //Metodos auxiliares
    public int gerarNumero(){
        return ++ numero;
    }

    public Optional<Conta> buscarNaCollection(int numero){
        for(var  conta : listaContas) {
            if (conta.getNumero() == numero)
                return Optional.of(conta);
        }
        return Optional.empty();
    }
}

