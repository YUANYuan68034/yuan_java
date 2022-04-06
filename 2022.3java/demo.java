public class demo {
    public static void main(String[] args) {
        int data[] = {1, 2, 4, 545, 11, -32, -13131, 4444};
        int contens = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == 0) {
                System.out.println("0");
                break;
            }else if (data[i] < 0){
                contens++;
                if (contens % 2 == 0){
                    System.out.println("1");
                    break;
                }else{
                    System.out.println("-1");
                    break;
            }
            }
        }

    }
}
