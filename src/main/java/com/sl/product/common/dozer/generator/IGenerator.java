package com.sl.product.common.dozer.generator;

import java.util.List;
import java.util.Set;

/**
 * @author ：sl
 * @description：
 * @date ： 2020/10/29 10:25
 */
public interface IGenerator {
    <T, S> T convert(S s, Class<T> clz);

    <T, S> List<T> convert(List<S> s, Class<T> clz);

    <T, S> Set<T> convert(Set<S> s, Class<T> clz);

    <T, S> T[] convert(S[] s, Class<T> clz);

    long convert(String str);

    long[] convert(String[] strings);
}
