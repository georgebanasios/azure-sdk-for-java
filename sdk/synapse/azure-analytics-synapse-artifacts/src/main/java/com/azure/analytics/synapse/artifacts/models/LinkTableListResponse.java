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
import java.util.List;

/**
 * The LinkTableListResponse model.
 */
@Fluent
public final class LinkTableListResponse implements JsonSerializable<LinkTableListResponse> {
    /*
     * List link table value
     */
    @Generated
    private List<LinkTableResource> value;

    /**
     * Creates an instance of LinkTableListResponse class.
     */
    @Generated
    public LinkTableListResponse() {
    }

    /**
     * Get the value property: List link table value.
     * 
     * @return the value value.
     */
    @Generated
    public List<LinkTableResource> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List link table value.
     * 
     * @param value the value value to set.
     * @return the LinkTableListResponse object itself.
     */
    @Generated
    public LinkTableListResponse setValue(List<LinkTableResource> value) {
        this.value = value;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LinkTableListResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LinkTableListResponse if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the LinkTableListResponse.
     */
    @Generated
    public static LinkTableListResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LinkTableListResponse deserializedLinkTableListResponse = new LinkTableListResponse();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<LinkTableResource> value = reader.readArray(reader1 -> LinkTableResource.fromJson(reader1));
                    deserializedLinkTableListResponse.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLinkTableListResponse;
        });
    }
}
