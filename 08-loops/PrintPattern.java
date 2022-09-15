public class PrintPattern {
    public static void main(String[] args) {
        // squarePattern();
        // uniformSquarePattern();
        // boxPattern();
        // seriesBoxPattern();

        // lowerTriangularPattern();
        // lowerTriangularPatternB();
        // lowerTriangularPatternC();
        // upperTriangularPattern();
        // upperTriangularPatternB();
        // upperTriangularPatternC();

        // upperRightTriangularPattern();
        // lowerRightTriangularPattern();
        equilateralTriangularPattern();
    }

    public static void squarePattern() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void uniformSquarePattern() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void boxPattern() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print((i+j)+" ");
            }
            System.out.println();
        }
    }

    public static void seriesBoxPattern() {
        int k = 1;
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.format("%02d ", k);
                k++;
            }
            System.out.println();
        }
    }

    public static void lowerTriangularPattern() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(i >= j)
                    System.out.format("%2d ", j);
            }
            System.out.println();
        }
    }

    public static void lowerTriangularPatternB() {
        int k = 1;
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(i >= j)
                    System.out.format("%02d ", k++);
            }
            System.out.println();
        }
    }

    public static void lowerTriangularPatternC() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(i >= j)
                    System.out.format("%2c ", '*');
            }
            System.out.println();
        }
    }

    public static void upperTriangularPattern() {
        int k=1;
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(i <= j)
                    System.out.format("%2d", k++);
            }
            k = 1;
            System.out.println();
        }
    }

    public static void upperTriangularPatternB() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(i <= j)
                    System.out.format("%2c", '*');
            }
            System.out.println();
        }
    }

    public static void upperTriangularPatternC() {
        int k = 1;
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(i <= j)
                    System.out.format("%02d ", k++);
            }
            System.out.println();
        }
    }

    public static void upperRightTriangularPattern() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(j>=i)
                    System.out.format("%2c ", '*');
                else
                    System.out.format("%2c ", ' ');
            }
            System.out.println();
        }
    }

    public static void lowerRightTriangularPattern() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(i+j > 5)
                    System.out.format("%2c ", '*');
                else
                    System.out.format("%2c ", ' ');
            }
            System.out.println();
        }
    }

    public static void equilateralTriangularPattern() {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if(i+j>5)
                    System.out.format("%2c ", '*');
                else
                    System.out.format("%2c ", ' ');
            }
            for(int j=6; j<=9; j++) {
                if(i+5>j)
                    System.out.format("%2c ", '*');
                else
                    System.out.format("%2c ", ' ');
            }
            System.out.println();
        }
    }

}
