package model;

public class BinNo<T extends Comparable<T>>  {

    private T conteudo;
    private BinNo noEsq;
    private BinNo noDir;

    public BinNo(){

    }
    public BinNo(T conteudo){
        this.conteudo = conteudo;
        this.noEsq = this.noDir = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "model.BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }
    
}
