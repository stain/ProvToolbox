package org.openprovenance.prov.json;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import org.openprovenance.prov.model.Document;
import org.openprovenance.prov.xml.UncheckedTestException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Round trip testing JavaBean -> PROV-JSON -> JavaBean
 */
public class RoundTripFromJavaTest extends org.openprovenance.prov.xml.RoundTripFromJavaTest
{

    
	private Gson gson = new GsonBuilder()
							.registerTypeAdapter(org.openprovenance.prov.xml.Document.class, new ProvDocumentDeserializer())
							.registerTypeAdapter(org.openprovenance.prov.xml.Document.class, new ProvDocumentSerializer())
							.setPrettyPrinting()
							.create();
	
	
	public RoundTripFromJavaTest(String testName) {
		super(testName);
	}

	@Override
	public String extension() {
		return ".json";
	}
	
	@Override
	public Document readDocument(String file) {
		try {
			Document doc = gson.fromJson(new BufferedReader(new FileReader(file)), org.openprovenance.prov.xml.Document.class);
			return doc;
		} catch (Exception e) {
			throw new UncheckedTestException(e);
		}
	}

	@Override
	public void writeDocument(Document doc, String file) {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			gson.toJson(doc, writer);
			writer.close();
		} catch (Exception e) {
			throw new UncheckedTestException(e);
		}
	}
	
}