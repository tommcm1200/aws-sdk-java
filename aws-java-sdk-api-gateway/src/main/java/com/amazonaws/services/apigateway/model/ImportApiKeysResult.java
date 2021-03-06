/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * The identifier of an <a>ApiKey</a> used in a <a>UsagePlan</a>.
 * </p>
 */
public class ImportApiKeysResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of all the <a>ApiKey</a> identifiers.
     * </p>
     */
    private java.util.List<String> ids;
    /**
     * <p>
     * A list of warning messages.
     * </p>
     */
    private java.util.List<String> warnings;

    /**
     * <p>
     * A list of all the <a>ApiKey</a> identifiers.
     * </p>
     * 
     * @return A list of all the <a>ApiKey</a> identifiers.
     */

    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * A list of all the <a>ApiKey</a> identifiers.
     * </p>
     * 
     * @param ids
     *        A list of all the <a>ApiKey</a> identifiers.
     */

    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * A list of all the <a>ApiKey</a> identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        A list of all the <a>ApiKey</a> identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportApiKeysResult withIds(String... ids) {
        if (this.ids == null) {
            setIds(new java.util.ArrayList<String>(ids.length));
        }
        for (String ele : ids) {
            this.ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all the <a>ApiKey</a> identifiers.
     * </p>
     * 
     * @param ids
     *        A list of all the <a>ApiKey</a> identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportApiKeysResult withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * A list of warning messages.
     * </p>
     * 
     * @return A list of warning messages.
     */

    public java.util.List<String> getWarnings() {
        return warnings;
    }

    /**
     * <p>
     * A list of warning messages.
     * </p>
     * 
     * @param warnings
     *        A list of warning messages.
     */

    public void setWarnings(java.util.Collection<String> warnings) {
        if (warnings == null) {
            this.warnings = null;
            return;
        }

        this.warnings = new java.util.ArrayList<String>(warnings);
    }

    /**
     * <p>
     * A list of warning messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWarnings(java.util.Collection)} or {@link #withWarnings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param warnings
     *        A list of warning messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportApiKeysResult withWarnings(String... warnings) {
        if (this.warnings == null) {
            setWarnings(new java.util.ArrayList<String>(warnings.length));
        }
        for (String ele : warnings) {
            this.warnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of warning messages.
     * </p>
     * 
     * @param warnings
     *        A list of warning messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportApiKeysResult withWarnings(java.util.Collection<String> warnings) {
        setWarnings(warnings);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIds() != null)
            sb.append("Ids: ").append(getIds()).append(",");
        if (getWarnings() != null)
            sb.append("Warnings: ").append(getWarnings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportApiKeysResult == false)
            return false;
        ImportApiKeysResult other = (ImportApiKeysResult) obj;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        if (other.getWarnings() == null ^ this.getWarnings() == null)
            return false;
        if (other.getWarnings() != null && other.getWarnings().equals(this.getWarnings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        hashCode = prime * hashCode + ((getWarnings() == null) ? 0 : getWarnings().hashCode());
        return hashCode;
    }

    @Override
    public ImportApiKeysResult clone() {
        try {
            return (ImportApiKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
