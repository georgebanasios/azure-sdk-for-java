// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.agents.persistent.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The input definition information for a Microsoft Fabric tool as used to configure an agent.
 */
@Immutable
public final class MicrosoftFabricToolDefinition extends ToolDefinition {

    /*
     * The object type.
     */
    @Generated
    private String type = "fabric_dataagent";

    /*
     * The fabric data agent tool parameters.
     */
    @Generated
    private final FabricDataAgentToolParameters fabricDataagent;

    /**
     * Creates an instance of MicrosoftFabricToolDefinition class.
     *
     * @param fabricDataagent the fabricDataagent value to set.
     */
    @Generated
    public MicrosoftFabricToolDefinition(FabricDataAgentToolParameters fabricDataagent) {
        this.fabricDataagent = fabricDataagent;
    }

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the fabricDataagent property: The fabric data agent tool parameters.
     *
     * @return the fabricDataagent value.
     */
    @Generated
    public FabricDataAgentToolParameters getFabricDataagent() {
        return this.fabricDataagent;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("fabric_dataagent", this.fabricDataagent);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftFabricToolDefinition from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftFabricToolDefinition if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MicrosoftFabricToolDefinition.
     */
    @Generated
    public static MicrosoftFabricToolDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FabricDataAgentToolParameters fabricDataagent = null;
            String type = "fabric_dataagent";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("fabric_dataagent".equals(fieldName)) {
                    fabricDataagent = FabricDataAgentToolParameters.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            MicrosoftFabricToolDefinition deserializedMicrosoftFabricToolDefinition
                = new MicrosoftFabricToolDefinition(fabricDataagent);
            deserializedMicrosoftFabricToolDefinition.type = type;
            return deserializedMicrosoftFabricToolDefinition;
        });
    }
}
