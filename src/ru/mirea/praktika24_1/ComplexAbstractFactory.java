package ru.mirea.praktika24_1;

interface ComplexAbstractFactory {
    Complex createComplex();
    Complex createComplex(int real, int image);
}