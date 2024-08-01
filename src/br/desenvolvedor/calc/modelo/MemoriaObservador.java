package br.desenvolvedor.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
 
	void valorAlterado(String novoValor); 
		
}
