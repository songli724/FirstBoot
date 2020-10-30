package com.sl.product.common.dozer.generator;

import org.apache.commons.lang3.StringUtils;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author ：sl
 * @description：
 * @date ： 2020/10/29 10:26
 */
@Component
@Lazy
public class GeneratorImpl implements IGenerator {
    private static final Logger log = LoggerFactory.getLogger(GeneratorImpl.class);
    protected Mapper mapper = new DozerBeanMapper();

    public GeneratorImpl() {
    }

    @Override
    public <T, S> T convert(S s, Class<T> clz) {
        return s == null ? null : this.mapper.map(s, clz);
    }

    @Override
    public <T, S> List<T> convert(List<S> s, Class<T> clz) {
        if (s == null) {
            return null;
        } else {
            List<T> list = new ArrayList();
            Iterator var4 = s.iterator();

            while (var4.hasNext()) {
                S vs = (S) var4.next();
                list.add(this.mapper.map(vs, clz));
            }

            return list;
        }
    }

    @Override
    public <T, S> Set<T> convert(Set<S> s, Class<T> clz) {
        if (s == null) {
            return null;
        } else {
            Set<T> set = new HashSet();
            Iterator var4 = s.iterator();

            while (var4.hasNext()) {
                S vs = (S) var4.next();
                set.add(this.mapper.map(vs, clz));
            }

            return set;
        }
    }

    @Override
    public <T, S> T[] convert(S[] s, Class<T> clz) {
        if (s == null) {
            return null;
        } else {
            T[] arr = (T[]) ((Object[]) Array.newInstance(clz, s.length));

            for (int i = 0; i < s.length; ++i) {
                arr[i] = this.mapper.map(s[i], clz);
            }

            return arr;
        }
    }

    @Override
    public long convert(String str) {
        try {
            return StringUtils.isNotBlank(str) ? Long.parseLong(str) : -1L;
        } catch (NumberFormatException var3) {
            log.info("字符串[]转换为long类型失败，参数必须为数字格式", str);
            throw var3;
        }
    }

    @Override
    public long[] convert(String[] strings) {
        try {
            return Arrays.stream(strings).mapToLong((s) -> {
                return Long.valueOf(s);
            }).toArray();
        } catch (Exception var3) {
            log.info("字符串数组[]转换为long数组失败，参数必须为数字格式", strings);
            throw var3;
        }
    }
}
