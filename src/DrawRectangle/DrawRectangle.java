package DrawRectangle;

/**
 * Написать программу, которая будет рисовать на консоли
 прямоугольник с заданными длинами сторон.
 */
public class DrawRectangle {
    private int a;
    private int b;

    public DrawRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    // рисование прямоугольника
    public void drawParts() {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1) {
                    System.out.print("-");
                } else if (j == 0 || j == b - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // рисование прямоугольника с помощью двумерного массива
     public void drawMassive() {
     char[][] rec = new char[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == a - 1) {
                    rec[i][j] = '-';
                } else if (j == 0 || j == b - 1) {
                    rec[i][j] = '|';
                } else {
                    rec[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < rec.length; i++) {
            for (int j = 0; j < rec[i].length; j++) {
                System.out.print(rec[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DrawRectangle rec = new DrawRectangle(6, 12);
        rec.drawParts();
        rec.drawMassive();
    }
}
