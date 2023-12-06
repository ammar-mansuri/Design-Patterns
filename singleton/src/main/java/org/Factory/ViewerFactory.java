package org.Factory;

import org.Factory.Viewer.Viewer;
import org.Factory.enums.ViewerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class ViewerFactory {
    private final Map<ViewerType, Viewer> viewerMap;

    @Autowired
    private ViewerFactory(List<Viewer> viewers) {
        viewerMap =    viewers.stream().collect(Collectors.toUnmodifiableMap(Viewer::getType, Function.identity()));
    }

    public Viewer getViewer(ViewerType viewerType) {
        return   Optional.ofNullable(viewerMap.get(viewerType)).orElseThrow(IllegalArgumentException::new);
    }
}