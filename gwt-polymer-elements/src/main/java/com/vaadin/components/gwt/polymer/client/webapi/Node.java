package com.vaadin.components.gwt.polymer.client.webapi;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface Node extends EventTarget {
    public void appendChild(Object child);
}
