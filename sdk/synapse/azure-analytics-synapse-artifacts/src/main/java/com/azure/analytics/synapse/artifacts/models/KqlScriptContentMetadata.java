// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The KqlScriptContentMetadata model.
 */
@Fluent
public final class KqlScriptContentMetadata implements JsonSerializable<KqlScriptContentMetadata> {
    /*
     * The language property.
     */
    @Generated
    private String language;

    /**
     * Creates an instance of KqlScriptContentMetadata class.
     */
    @Generated
    public KqlScriptContentMetadata() {
    }

    /**
     * Get the language property: The language property.
     * 
     * @return the language value.
     */
    @Generated
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The language property.
     * 
     * @param language the language value to set.
     * @return the KqlScriptContentMetadata object itself.
     */
    @Generated
    public KqlScriptContentMetadata setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("language", this.language);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KqlScriptContentMetadata from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KqlScriptContentMetadata if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the KqlScriptContentMetadata.
     */
    @Generated
    public static KqlScriptContentMetadata fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KqlScriptContentMetadata deserializedKqlScriptContentMetadata = new KqlScriptContentMetadata();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("language".equals(fieldName)) {
                    deserializedKqlScriptContentMetadata.language = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKqlScriptContentMetadata;
        });
    }
}
