
public class Control {

	private int[][] A;
	private int[] B;
	public String calcularRecargo(String ingresoDia) {

		int dia = 0;
		try {
			dia = Integer.parseInt(ingresoDia);
		} catch (Exception e) {
			dia = 0;
		}

		if (dia > 0 && dia <= 10)
			return 0 + "%";
		if (dia > 10 && dia < 21)
			return 2 + "%";
		if (dia > 20 && dia <= 31)
			return 4 + "%";

		return "error";

	}
	public int calcularPromedio(int N ,int M ,int P) {
	
		 if ( (N<1) || (M<1) || (P<1) ) {
			 return 0;	}
				A = new int[N] [M];
				B= new int[P];
				int prom=0;
		 int res = prom = 0;
		 for (int i = 0; i < N; i++) {
		 for (int j = 0; j < M; j++) {
			 A [i] [j]=i;
			 prom += A [i] [j];
		 
		 }}
		 prom = prom / ( N * M );
		// System.out.println("promedio"+prom);
		 for (int k = 0; k < P; k++) {
		 B[k]=k-5;
			 if ( B [k] > prom ) res += B [k];
		 }
		// System.out.println(res);
		 return res;

		 
		
		

		
		
		
		
		
		
	}


}
