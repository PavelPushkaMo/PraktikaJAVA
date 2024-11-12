package ru.mirea.praktika4_1;

public class Main {
    public static void main(String[] args) {

        Seasons favoriteSeason = Seasons.SUMMER;
        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());


        printSeasonMessage(favoriteSeason);


        for (Seasons season : Seasons.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }


    private static void printSeasonMessage(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму!");
                break;
            case SPRING:
                System.out.println("Я люблю весну!");
                break;
            case SUMMER:
                System.out.println("Я люблю лето!");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень!");
                break;
        }
    }
}