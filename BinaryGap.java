public class BinaryGap {
	public static int solution(int N) {
		int tamanho = 0; 
		int oneQuantity= 0;
		int zeroQuantity=0; 
		
		String numero = new String(Integer.toBinaryString(N));
		
		for(int i =0 ; i < numero.length() ; i++) {
			if(numero.charAt(i) == '1'){
				oneQuantity++;
				if(oneQuantity == 2) {
					oneQuantity --;
					if(zeroQuantity > tamanho){
						tamanho = zeroQuantity;
					}
					zeroQuantity = 0;
				}
			}
			else{
				zeroQuantity++;
			}
		}
		
		return tamanho; 
	}
	
	
	public static void main(String[] args) {
		int res = solution(6291457);
		
		System.out.println(res);

	}
}
