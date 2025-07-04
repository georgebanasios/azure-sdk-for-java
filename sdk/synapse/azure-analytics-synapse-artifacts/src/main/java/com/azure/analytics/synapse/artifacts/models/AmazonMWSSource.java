// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A copy activity Amazon Marketplace Web Service source.
 */
@Fluent
public final class AmazonMWSSource extends TabularSource {
    /*
     * Copy source type.
     */
    @Generated
    private String type = "AmazonMWSSource";

    /*
     * A query to retrieve data from source. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object query;

    /**
     * Creates an instance of AmazonMWSSource class.
     */
    @Generated
    public AmazonMWSSource() {
    }

    /**
     * Get the type property: Copy source type.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     * 
     * @return the query value.
     */
    @Generated
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: A query to retrieve data from source. Type: string (or Expression with resultType
     * string).
     * 
     * @param query the query value to set.
     * @return the AmazonMWSSource object itself.
     */
    @Generated
    public AmazonMWSSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AmazonMWSSource setQueryTimeout(Object queryTimeout) {
        super.setQueryTimeout(queryTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AmazonMWSSource setAdditionalColumns(Object additionalColumns) {
        super.setAdditionalColumns(additionalColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AmazonMWSSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AmazonMWSSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AmazonMWSSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (getSourceRetryCount() != null) {
            jsonWriter.writeUntypedField("sourceRetryCount", getSourceRetryCount());
        }
        if (getSourceRetryWait() != null) {
            jsonWriter.writeUntypedField("sourceRetryWait", getSourceRetryWait());
        }
        if (getMaxConcurrentConnections() != null) {
            jsonWriter.writeUntypedField("maxConcurrentConnections", getMaxConcurrentConnections());
        }
        if (getQueryTimeout() != null) {
            jsonWriter.writeUntypedField("queryTimeout", getQueryTimeout());
        }
        if (getAdditionalColumns() != null) {
            jsonWriter.writeUntypedField("additionalColumns", getAdditionalColumns());
        }
        jsonWriter.writeStringField("type", this.type);
        if (this.query != null) {
            jsonWriter.writeUntypedField("query", this.query);
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AmazonMWSSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AmazonMWSSource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AmazonMWSSource.
     */
    @Generated
    public static AmazonMWSSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AmazonMWSSource deserializedAmazonMWSSource = new AmazonMWSSource();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceRetryCount".equals(fieldName)) {
                    deserializedAmazonMWSSource.setSourceRetryCount(reader.readUntyped());
                } else if ("sourceRetryWait".equals(fieldName)) {
                    deserializedAmazonMWSSource.setSourceRetryWait(reader.readUntyped());
                } else if ("maxConcurrentConnections".equals(fieldName)) {
                    deserializedAmazonMWSSource.setMaxConcurrentConnections(reader.readUntyped());
                } else if ("queryTimeout".equals(fieldName)) {
                    deserializedAmazonMWSSource.setQueryTimeout(reader.readUntyped());
                } else if ("additionalColumns".equals(fieldName)) {
                    deserializedAmazonMWSSource.setAdditionalColumns(reader.readUntyped());
                } else if ("type".equals(fieldName)) {
                    deserializedAmazonMWSSource.type = reader.getString();
                } else if ("query".equals(fieldName)) {
                    deserializedAmazonMWSSource.query = reader.readUntyped();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAmazonMWSSource.setAdditionalProperties(additionalProperties);

            return deserializedAmazonMWSSource;
        });
    }
}
