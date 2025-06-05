public class performance {

        public static void main(String[] args) {
            long start = System.currentTimeMillis();
            concatString(30_000);
            long end = System.currentTimeMillis();
            System.out.println("Tempo gasto para String:  " + (end - start) + "ms");
            start = System.currentTimeMillis();
            concatStringBuilder(1000_000);
            end = System.currentTimeMillis();
            System.out.println("Tempo gasto para StringBuilder: " + (end - start) + "ms");

            start = System.currentTimeMillis();
            concatStringBuffer(1000_000);
            end = System.currentTimeMillis();
            System.out.println("Tempo gasto para StringBuffer " + (end - start) + "ms");
        }


        private static void concatString(int tamanho) {
            String frase = " ";
            for (int i = 0; i < tamanho; i++) {
                frase += i;
            }

        }
        private static void concatStringBuilder(int tamanho) {
            StringBuilder sb = new StringBuilder(tamanho);
            for (int i = 0; i < tamanho; i++) {
                sb.append(i);
            }
        }
        private static void concatStringBuffer(int tamanho) {
            StringBuffer sb = new StringBuffer(tamanho);
            for (int i = 0; i < tamanho; i++) {
                sb.append(i);
            }
        }}

