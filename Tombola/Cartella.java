import java.util.Arrays;

public class Cartella {
	private int[] numeri; // numeri contenuti in questa cartella
	final private boolean[] segnati; // true se il numero corrispondente è segnato


	public Cartella() {
		segnati = new boolean[15]; //default tutti false
		creaCartella();
	}
	
	// Posiziona i numeri nella cartella
	private void creaCartella() {
		numeri = new int[15]; 
		// Riempio il vettore con 15 numeri casuali che rispettino le regole:
		// 1. no numeri ripetuti
		// 2. max 2 numeri con la stessa decina
		final int[] decine = new int[10]; //indica quanti numeri per ogni decina
		for (int i=0; i<15; i++) {
			// Genero un numero casuale tra 1 e 90
			int n = generaCasuale(1, 90);
			// Decina attuale
			final int d = n==90? 8 : n/10; //il 90 va nella colonna degli 80

			// Se il numero casuale generato è già presente oppure se ci sono già due
			// numeri con la stessa decina, ripeto il calcolo dell'elemento i-esimo
			if (decine[d] >= 2 || indexOf(n, numeri, i) >= 0) {
				i--;
				continue;
			} else {
				numeri[i] = n;
				decine[d]++;
			}
		}

		// Ordina il vettore finale
		Arrays.sort(numeri);

		// Permuta per ottenere le righe finali (un elemento ogni tre nel vettore ordinato)
		int tmp = numeri[1];
		numeri[1] = numeri[3];
		numeri[3] = numeri[9];
		numeri[9] = numeri[13];
		numeri[13] = numeri[11];
		numeri[11] = numeri[5];
		numeri[5] = numeri[2];
		numeri[2] = numeri[6];
		numeri[6] = numeri[4];
		numeri[4] = numeri[12];
		numeri[12] = numeri[8];
		numeri[8] = numeri[10];
		numeri[10] = numeri[5];
		numeri[5] = tmp;
		
		// Scambia (in verticale) i numeri della stessa colonna se non sono in ordine tra loro
		for (int i=0; i<15; i++) {
			final int n = numeri[i];
			final int d = n/10;
			for (int j=i; j<15; j++) {
				final int n2 = numeri[j];
				final int d2 = n2/10;
				
				if (d == d2 && n>n2) { // d==d2: stessa colonna, n>n2 ordine invertito
					final int temp = numeri[i];
					numeri[i] = numeri[j];
					numeri[j] = temp;
				}
			}
		}
	}
	
	// Rappresentazione testuale
	public void stampa() {
		String spacer = "   ";
		for (int r=0; r<3; r++) {
			String output = "";
			int d = 0;
			for (int c=0; c<5; c++) {
				int index = r*5+c;
				int num = numeri[index];

				// spazi per i numeri mancanti (per incolonnare i numeri nella giusta decina)
				int _d = (int)((double)num/10.0);
				if (num == 90) // il 90 va nella colonna degli 80
					_d = 8;
				for (int i=1; i<_d-d+(c==0?1:0); i++)
					output += spacer+"   ";
				d = _d;

				// stampa numero
				output += String.format(spacer, num, (segnati[index]?'#':' '));
			}

			info(output);
		}
	}
	
	public static int generaCasuale(final int min, final int max) {
		return min + (int)(Math.random() * (max-min));
	}

	// Controlla se un numero è presente in un array e ne restituisce l'indice, o -1 se non presente
	public static int indexOf(int numero, int[] array, int size) {
		for (int i = 0; i < size; i++) {
			if (numero == array[i])
				return i;
		}
		return -1;
	}

	// Stampa informazioni a schermo
	public static void info(final String s) {
		if (true) {
			String[] lines = s.split("\n\r");
			for (String l: lines)
				System.out.println(""+l);
		}
	}

	// Variante senza argomenti, stampa solo una riga vuota
	public static void info() {
		if (true)
			System.out.println();
	}
}

