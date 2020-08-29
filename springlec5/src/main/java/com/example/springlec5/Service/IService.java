package com.example.springlec5.Service;

public interface IService<T> {
    public void create(T object);

    public T get(long id);

    void update(T object);
}