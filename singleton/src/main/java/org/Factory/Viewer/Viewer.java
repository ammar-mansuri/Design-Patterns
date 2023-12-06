package org.Factory.Viewer;

import org.Factory.enums.ViewerType;

public interface Viewer<T> {
    ViewerType getType();
    void view(T object);
}