package com.people.showcase.common;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Implementation class for Convert.class.
 *
 * @param <E>
 * @param <B>
 */
@Component
public class Mapper<E, B> implements Convert<E, B> {

    @Autowired
    ModelMapper modelMapper;

    public Mapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public B mapToBean(E e, Class<B> b) {
        return modelMapper.map(e, b);
    }

    @Override
    public E mapToEntity(B b, Class<E> e) {
        return modelMapper.map(b, e);
    }
}
