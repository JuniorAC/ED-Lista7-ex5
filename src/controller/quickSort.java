package controller;

public class quickSort {
	
	public void QuickSort (int vet[], int ini, int fim){
		int divisao;
		if (ini < fim) {
			divisao = particao (vet, ini, fim );
			QuickSort (vet, ini, divisao-1);
			QuickSort (vet, divisao+1, fim);
		}
		
	}

	private static int particao(int[] vet, int ini, int fim) {
		int pivo = vet[ini], i = ini+1, f= fim, aux;
		while (i<=f) {
			while (i <=fim && vet [i] <= pivo) 
				++i;
			while (pivo < vet[f])
				--f;
			if (i <f) {
				aux = vet[i];
				vet[i] = vet[f];
				vet[f] = aux;
				++i;
				--f;
			
			}
		}
		if (ini !=f) {
			vet[ini] = vet[f];
			vet[f] = pivo;
		}
		return f;
	}

}
