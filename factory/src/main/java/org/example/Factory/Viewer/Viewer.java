package org.example.Factory.Viewer;

import org.example.Factory.enums.ViewerType;

public interface Viewer<T> {
    ViewerType getType();
    void view(T object);
}