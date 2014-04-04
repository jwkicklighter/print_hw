class Main {

    public static void main(String[] args) {

        String threeString = "Hello ";
        String fiveString = "World";

        for (int i=1; i<=100; i++) {
            if (i%3!=0 && i%5!=0) {
                print(i);
            }
            else {
                if (i%3==0) {
                    print(threeString);
                }
                if (i%5==0) {
                    print(fiveString);
                }
            }
            newLine();
        }
    }

    private static void print(String string) {
        System.out.printf("%s", string);
    }

    private static void print(int number) {
        System.out.printf("%d", number);
    }

    private static void newLine() {
        System.out.println();
    }
}