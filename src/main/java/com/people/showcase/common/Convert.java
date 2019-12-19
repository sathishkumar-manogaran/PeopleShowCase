package com.people.showcase.common;


public interface Convert<E, B> {

    /**
     * Generic method to map entity to bean.
     */
    B mapToBean(E e, Class<B> b);

    /**
     * Generic method to map bean to entity.
     *
     * @param b (Bean class object)
     * @param e (Entity class)
     * @return
     */
    E mapToEntity(B b, Class<E> e);
}
