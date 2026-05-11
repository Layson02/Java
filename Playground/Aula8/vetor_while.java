public class vetor_while {
    public static void main(String[] args) {
        int[] vetor = new int[]{10, 20, 30, 40, 50};
        
        int i = 0;
        while (i < vetor.length) {
            System.out.println("vetor[" + i + "] = " + vetor[i]);
            i++;
        }
    }
}
