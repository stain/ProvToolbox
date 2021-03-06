package org.openprovenance.prov.core.jsonld11.serialization.deserial.attic;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.openprovenance.prov.model.StatementOrBundle;

import java.io.IOException;


public class CustomKindDeserializer extends StdDeserializer<StatementOrBundle.Kind> {

    public CustomKindDeserializer() {
        super(StatementOrBundle.Kind.class);
    }

    @Override
    public StatementOrBundle.Kind deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return StatementOrBundle.Kind.PROV_ACTIVITY;
    }

    protected CustomKindDeserializer(Class<StatementOrBundle.Kind> t) {
        super(t);
    }

}