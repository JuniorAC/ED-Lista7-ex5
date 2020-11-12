package view;

import controller.quickSort;

public class menu {

	public static void main(String[] args) {
		int vet1[] = { 149, 192, 47, 152, 159, 195, 61, 66, 17, 167, 118, 64, 27, 80, 30, 105 };
		String mostra = "";
		System.out.println("vetor desorganizado antes do Merge Sort");
		for (int i = 0; i < 11; i++) {
			mostra = mostra + vet1[i] + " ";
		}
		System.out.println(mostra);
		mostra = "";

		quickSort Q = new quickSort();

		Q.QuickSort(vet1, 0, 11);
		System.out.println("vetor organizado após o Merge Sort");
		for (int i = 0; i < 11; i++) {
			mostra = mostra + vet1[i] + " ";
		}
		System.out.println(mostra);
	}
}
