package models;

public class Personagem {
    private String nome;
    private int velocidade;
    private int armas;
    private int combos;

    public Personagem(String nome, int velocidade, int armas, int combos) {
        this.nome = nome;

        if (velocidade > 0) {
            this.velocidade = velocidade;
        } else {
            System.out.println("velocidade invalida");
        }

        if (armas > 0) {
            this.armas = armas;
        } else {
            System.out.println("quantidade de armas invalidas");
        }

        if (combos > 0) {
            this.combos = combos;
        } else {
            System.out.println("quantidade de combos possiveis invalida");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public int getQuantidadeDeArmas() {
        return this.armas;
    }

    public int getCombosPossiveis() {
        return this.combos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setQuantidadeDeArmas(int quantidadeDeArmas) {
        this.armas = quantidadeDeArmas;
    }

    public void setQuantidadeDeCombos(int combosPossiveis) {
        this.combos = combosPossiveis;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | Velocidade: %d | Armas: %d | Combos: %d", nome, velocidade, armas, combos);
    }
}