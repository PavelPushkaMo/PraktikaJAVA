package ru.mirea.praktika23_2;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size;

    public AbstractQueue() {
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    protected void incrementSize() {
        size++;
    }

    protected void decrementSize() {
        size--;
    }
}