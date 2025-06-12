package TESTES_TDD_IRPF.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import app.IRPF;

public class CadastroDependentesTest {
    
    private IRPF irpf;

    @Before
    public void setup() {
        irpf = new IRPF();
    }

    @Test
    public void testCadastrarUmDependente() {
        irpf.cadastrarDependente("João");
        assertEquals(189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarDoisDependente() {
        irpf.cadastrarDependente("João");
        irpf.cadastrarDependente("Maria");
        assertEquals(2 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarTresDependente() {
        irpf.cadastrarDependente("João");
        irpf.cadastrarDependente("Maria");
        irpf.cadastrarDependente("Pedro");
        assertEquals(3 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }

    @Test
    public void testCadastrarCincoDependente() {
        irpf.cadastrarDependente("João");
        irpf.cadastrarDependente("Maria");
        irpf.cadastrarDependente("Pedro");
        irpf.cadastrarDependente("Maria Jose");
        irpf.cadastrarDependente("Jose  Maria");
        assertEquals(5 * 189.59f, irpf.getDeducaoDependentes(), 0);
    }
}
