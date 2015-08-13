package com.starsea.im.aggregation.transfor;

import com.google.common.base.Function;

/**
 * Created by beigua on 2015/8/12.
 * 在输入null值时直接返回null的Function
 */
public abstract class SafeFunction<F, O> implements Function<F, O> {

    @Override
    public final O apply(F input) {
        return input != null ? safeApply(input) : null;
    }

    /**
     * @param input 不会为null
     * @return
     */
    protected abstract O safeApply(F input);
}
