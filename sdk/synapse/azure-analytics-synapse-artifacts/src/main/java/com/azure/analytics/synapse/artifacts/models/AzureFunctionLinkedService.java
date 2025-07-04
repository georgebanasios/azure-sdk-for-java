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
import java.util.List;
import java.util.Map;

/**
 * Azure Function linked service.
 */
@Fluent
public class AzureFunctionLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    @Generated
    private String type = "AzureFunction";

    /*
     * The endpoint of the Azure Function App. URL will be in the format https://<accountName>.azurewebsites.net.
     */
    @Generated
    private Object functionAppUrl;

    /*
     * Function or Host key for Azure Function App.
     */
    @Generated
    private SecretBase functionKey;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @Generated
    private Object encryptedCredential;

    /*
     * The credential reference containing authentication information.
     */
    @Generated
    private CredentialReference credential;

    /*
     * Allowed token audiences for azure function.
     */
    @Generated
    private Object resourceId;

    /*
     * Type of authentication (Required to specify MSI) used to connect to AzureFunction. Type: string (or Expression
     * with resultType string).
     */
    @Generated
    private Object authentication;

    /**
     * Creates an instance of AzureFunctionLinkedService class.
     */
    @Generated
    public AzureFunctionLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Generated
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the functionAppUrl property: The endpoint of the Azure Function App. URL will be in the format
     * https://&lt;accountName&gt;.azurewebsites.net.
     * 
     * @return the functionAppUrl value.
     */
    @Generated
    public Object getFunctionAppUrl() {
        return this.functionAppUrl;
    }

    /**
     * Set the functionAppUrl property: The endpoint of the Azure Function App. URL will be in the format
     * https://&lt;accountName&gt;.azurewebsites.net.
     * 
     * @param functionAppUrl the functionAppUrl value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    @Generated
    public AzureFunctionLinkedService setFunctionAppUrl(Object functionAppUrl) {
        this.functionAppUrl = functionAppUrl;
        return this;
    }

    /**
     * Get the functionKey property: Function or Host key for Azure Function App.
     * 
     * @return the functionKey value.
     */
    @Generated
    public SecretBase getFunctionKey() {
        return this.functionKey;
    }

    /**
     * Set the functionKey property: Function or Host key for Azure Function App.
     * 
     * @param functionKey the functionKey value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    @Generated
    public AzureFunctionLinkedService setFunctionKey(SecretBase functionKey) {
        this.functionKey = functionKey;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    @Generated
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    @Generated
    public AzureFunctionLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     * 
     * @return the credential value.
     */
    @Generated
    public CredentialReference getCredential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     * 
     * @param credential the credential value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    @Generated
    public AzureFunctionLinkedService setCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Get the resourceId property: Allowed token audiences for azure function.
     * 
     * @return the resourceId value.
     */
    @Generated
    public Object getResourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Allowed token audiences for azure function.
     * 
     * @param resourceId the resourceId value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    @Generated
    public AzureFunctionLinkedService setResourceId(Object resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the authentication property: Type of authentication (Required to specify MSI) used to connect to
     * AzureFunction. Type: string (or Expression with resultType string).
     * 
     * @return the authentication value.
     */
    @Generated
    public Object getAuthentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: Type of authentication (Required to specify MSI) used to connect to
     * AzureFunction. Type: string (or Expression with resultType string).
     * 
     * @param authentication the authentication value to set.
     * @return the AzureFunctionLinkedService object itself.
     */
    @Generated
    public AzureFunctionLinkedService setAuthentication(Object authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureFunctionLinkedService setVersion(String version) {
        super.setVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureFunctionLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureFunctionLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureFunctionLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public AzureFunctionLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("version", getVersion());
        jsonWriter.writeJsonField("connectVia", getConnectVia());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeMapField("parameters", getParameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", getAnnotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeStringField("type", this.type);
        if (functionAppUrl != null
            || functionKey != null
            || encryptedCredential != null
            || credential != null
            || resourceId != null
            || authentication != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("functionAppUrl", this.functionAppUrl);
            jsonWriter.writeJsonField("functionKey", this.functionKey);
            if (this.encryptedCredential != null) {
                jsonWriter.writeUntypedField("encryptedCredential", this.encryptedCredential);
            }
            jsonWriter.writeJsonField("credential", this.credential);
            if (this.resourceId != null) {
                jsonWriter.writeUntypedField("resourceId", this.resourceId);
            }
            if (this.authentication != null) {
                jsonWriter.writeUntypedField("authentication", this.authentication);
            }
            jsonWriter.writeEndObject();
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFunctionLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFunctionLinkedService if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureFunctionLinkedService.
     */
    @Generated
    public static AzureFunctionLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFunctionLinkedService deserializedAzureFunctionLinkedService = new AzureFunctionLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedAzureFunctionLinkedService.setVersion(reader.getString());
                } else if ("connectVia".equals(fieldName)) {
                    deserializedAzureFunctionLinkedService.setConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedAzureFunctionLinkedService.setDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedAzureFunctionLinkedService.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedAzureFunctionLinkedService.setAnnotations(annotations);
                } else if ("type".equals(fieldName)) {
                    deserializedAzureFunctionLinkedService.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("functionAppUrl".equals(fieldName)) {
                            deserializedAzureFunctionLinkedService.functionAppUrl = reader.readUntyped();
                        } else if ("functionKey".equals(fieldName)) {
                            deserializedAzureFunctionLinkedService.functionKey = SecretBase.fromJson(reader);
                        } else if ("encryptedCredential".equals(fieldName)) {
                            deserializedAzureFunctionLinkedService.encryptedCredential = reader.readUntyped();
                        } else if ("credential".equals(fieldName)) {
                            deserializedAzureFunctionLinkedService.credential = CredentialReference.fromJson(reader);
                        } else if ("resourceId".equals(fieldName)) {
                            deserializedAzureFunctionLinkedService.resourceId = reader.readUntyped();
                        } else if ("authentication".equals(fieldName)) {
                            deserializedAzureFunctionLinkedService.authentication = reader.readUntyped();
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzureFunctionLinkedService.setAdditionalProperties(additionalProperties);

            return deserializedAzureFunctionLinkedService;
        });
    }
}
