package ru.mirea.praktika4_1;

enum Seasons {
    WINTER(-5) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(10) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(15) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    private final int averageTemperature;

    // Конструктор
    Seasons(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года"; // Дефолтное описание
    }
}