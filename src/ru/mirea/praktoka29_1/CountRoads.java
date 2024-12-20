package ru.mirea.praktoka29_1;

import java.util.Scanner;

public class CountRoads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем количество городов
        int N = scanner.nextInt();

        // Если городов нет, количество дорог равно 0
        if (N == 0) {
            System.out.println(0);
            return;
        }

        int[][] adjacencyMatrix = new int[N][N];
        int roadCount = 0;

        // Считываем матрицу смежности
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                adjacencyMatrix[i][j] = scanner.nextInt();
                // Считаем количество соединений (дорог)
                if (adjacencyMatrix[i][j] == 1) {
                    roadCount++;
                }
            }
        }

        // Поскольку дороги считаются дважды (i, j) и (j, i), делим на 2
        roadCount /= 2;

        // Выводим количество дорог
        System.out.println(roadCount);

        scanner.close();
    }
}
// ввод 4
//0 1 1 0
//1 0 0 1
//1 0 0 1
//0 1 1 0
// вывод 4