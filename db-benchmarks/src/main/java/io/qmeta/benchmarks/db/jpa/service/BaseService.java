package io.qmeta.benchmarks.db.jpa.service;

import io.qmeta.benchmarks.db.entity.User;

import java.util.Map;

public interface BaseService<T> {

    public T add(User user);

    public T findById(Integer id);

    public T update(T entity);

    public void customQuery(Map query);
}
