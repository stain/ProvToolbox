package org.openprovenance.prov.core.json.serialization;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.openprovenance.prov.model.QualifiedName;

import java.io.IOException;

abstract public class CustomMapSerializer extends JsonSerializer<QualifiedName> {
    @Override
    public void serialize(QualifiedName q, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String s=q.getPrefix() + ":" + q.getLocalPart();
        if (s.equals("prov:type")) {
            s=Constants.PROPERTY_AT_TYPE;
        }
        //deserializationContext.getAttribute(CustomNamespaceDeserializer.CONTEXT_KEY_NAMESPACE);

        jsonGenerator.writeFieldName(s);
    }
}
