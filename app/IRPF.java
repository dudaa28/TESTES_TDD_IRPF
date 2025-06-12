package TESTES_TDD_IRPF.app;

public class IRPF {

    private float salario;
    private float contribuicaoPrevidenciaria;
    private String[] dependentes;

    public IRPF() {
        dependentes = new String[0];
    }

    public void cadastrarSalario(float salario) {
        this.salario += salario;
    }

    public float getTotalSalario() {
        return this.salario;
    }

    public void cadastrarPrevidenciaOficial(float contribuicaoPrevidenciaria) {
        this.contribuicaoPrevidenciaria += contribuicaoPrevidenciaria;
    }

    public float getPrevidenciariaOficial() {
        return this.contribuicaoPrevidenciaria;
    }

    public void cadastrarDependente(String nome) {
        
        String[] tempo = new String[dependentes.length + 1];
        for (int i = 0; i < dependentes.length; i++) {
            tempo[i] = dependentes[i];
        }
        tempo[dependentes.length] = nome;
        this.dependentes = tempo;
    }

    public float getDeducaoDependentes() {

        return dependentes.length * 189.59f;
        /*if (dependentes.length == 1) 
            return 189.59f;
        else if (dependentes.length > 1)
            return 379.18f;
        else
            return 0;
            */
    }
}
