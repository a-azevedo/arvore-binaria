package model;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    public void inserir(T conteudo){
        BinNo novoNo = new BinNo<>(conteudo);
        this.raiz = inserir(raiz, novoNo);
    }

    private BinNo<T> inserir(BinNo<T> noAtual, BinNo<T> novoNo) {
        if(noAtual == null){
            return novoNo;
        }else if(novoNo.getConteudo().compareTo(noAtual.getConteudo()) < 0){
            noAtual.setNoEsq(inserir(noAtual.getNoEsq(),novoNo));
        }else{
            noAtual.setNoEsq(inserir(noAtual.getNoEsq(),novoNo));
        }
        return novoNo;
    }

    public ArvoreBinaria(){
        this.raiz = null;
    }



}
