package org.openprovenance.prov.core.xml.serialization.deserial;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.dataformat.xml.deser.FromXmlParser;
import org.openprovenance.prov.core.vanilla.ProvFactory;
import org.openprovenance.prov.core.xml.serialization.ProvDeserialiser;
import org.openprovenance.prov.model.Namespace;
import org.openprovenance.prov.model.QualifiedName;

import java.io.IOException;

import static org.openprovenance.prov.model.NamespacePrefixMapper.PROV_NS;

public class CustomQualifiedNameDeserializerAsXmlAttribute extends JsonDeserializer<QualifiedName> { //StdDeserializer<QualifiedName> {

    private static final ProvFactory pf= ProvDeserialiser.pf;

    static final QualifiedName PROV_TYPE=pf.getName().PROV_TYPE;

    public CustomQualifiedNameDeserializerAsXmlAttribute() {
        super();

    }


    @Override
    public QualifiedName deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        Namespace ns = DeserializerUtil.getNamespace(deserializationContext);

        FromXmlParser xmlParser=(FromXmlParser)jsonParser;

        String ref = DeserializerUtil.getAttributeValue(ns, xmlParser, "ref");
        jsonParser.nextValue();

        jsonParser.readValueAsTree();
        jsonParser.readValueAsTree();

        return ns.stringToQualifiedName(ref, pf, false);

    }



}
