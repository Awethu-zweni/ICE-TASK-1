//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int[][] totalSales = {{100, 150, 70}, {88, 92, 103}, {75, 45, 90}, {65, 95, 175}};
    String[] quarter = {"Q1", "Q2", "Q3", "Q4"};
    String[] brandShoes = {"NIKE", "ADIDAS", "REEBOK"};

    int[] brandTotal = new int[brandShoes.length];
    int[] brandMax = new int[brandShoes.length];
    int[] brandMin = new int[brandShoes.length];

    for (int b = 0; b < brandShoes.length; b++) {
        brandMax[b] = totalSales[0][b];
        brandMin[b] = totalSales[0][b];
    }

    System.out.println("-------------------------------------------------------------------------------------");
    System.out.println("ULTIMATE SHOE SALES");
    System.out.println("-------------------------------------------------------------------------------------");

    System.out.printf("%-18s", "QUARTER");
    for (int brandShoe = 0; brandShoe < brandShoes.length; brandShoe++) {
        System.out.printf("%-8s", brandShoes[brandShoe]);
    }
    System.out.println();
    System.out.println("-------------------------------------------------------------------------------------");

    System.out.println();
    for (int quarterYear = 0; quarterYear < totalSales.length; quarterYear++) {
        System.out.printf("%-18s", quarter[quarterYear]);

        for (int brandShoe = 0; brandShoe < totalSales[quarterYear].length; brandShoe++) {
            int sales = totalSales[quarterYear][brandShoe];
            System.out.printf("%-8d", sales);

            brandTotal[brandShoe] += sales;

            if (sales > brandMax[brandShoe]) {
                brandMax[brandShoe] = sales;
            }
            if (sales < brandMin[brandShoe]) {
                brandMin[brandShoe] = sales;
            }
        }
        System.out.println();
    }

    System.out.println("-------------------------------------------------------------------------------------");

    System.out.printf("%-18s", "Toltal:");
    for (int b = 0; b < brandShoes.length; b++) {
        System.out.printf("%-8d", brandTotal[b]);
    }
    System.out.println();

    System.out.printf("%-18s", "AVERAGE:");
    for (int b = 0; b < brandShoes.length; b++) {
        double average = (double) brandTotal[b] / totalSales.length;
        System.out.printf("%-8.1f", average);
    }
    System.out.println();

    System.out.printf("%-18s", "MIN:");
    for (int b = 0; b < brandShoes.length; b++) {
        System.out.printf("%-8d", brandMin[b]);
    }
    System.out.println();

    System.out.printf("%-18s", "MAX:");
    for (int b = 0; b < brandShoes.length; b++) {
        System.out.printf("%-8d", brandMax[b]);
    }
    System.out.println();

    System.out.println("-------------------------------------------------------------------------------------");

}

