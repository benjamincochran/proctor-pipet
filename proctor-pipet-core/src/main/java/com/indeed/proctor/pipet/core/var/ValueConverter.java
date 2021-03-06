package com.indeed.proctor.pipet.core.var;

import javax.annotation.Nonnull;

public interface ValueConverter<T> {
    public T convert(@Nonnull String rawValue) throws ValueConversionException;

    public Class<T> getType();
}
