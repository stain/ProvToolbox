package org.openprovenance.prov.service.core;

public interface ResourceIndex {
    DocumentResource get(String key);
    void put(String key, DocumentResource dr);
    void remove(String key);
}