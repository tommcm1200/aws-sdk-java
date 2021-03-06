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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Defines a patch filter.
 * </p>
 */
public class PatchFilter implements Serializable, Cloneable {

    /**
     * <p>
     * The key for the filter (PRODUCT, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID)
     * </p>
     */
    private String key;
    /**
     * <p>
     * The value for the filter key.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The key for the filter (PRODUCT, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID)
     * </p>
     * 
     * @param key
     *        The key for the filter (PRODUCT, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID)
     * @see PatchFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The key for the filter (PRODUCT, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID)
     * </p>
     * 
     * @return The key for the filter (PRODUCT, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID)
     * @see PatchFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The key for the filter (PRODUCT, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID)
     * </p>
     * 
     * @param key
     *        The key for the filter (PRODUCT, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchFilterKey
     */

    public PatchFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The key for the filter (PRODUCT, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID)
     * </p>
     * 
     * @param key
     *        The key for the filter (PRODUCT, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID)
     * @see PatchFilterKey
     */

    public void setKey(PatchFilterKey key) {
        this.key = key.toString();
    }

    /**
     * <p>
     * The key for the filter (PRODUCT, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID)
     * </p>
     * 
     * @param key
     *        The key for the filter (PRODUCT, CLASSIFICATION, MSRC_SEVERITY, PATCH_ID)
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PatchFilterKey
     */

    public PatchFilter withKey(PatchFilterKey key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * 
     * @return The value for the filter key.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * 
     * @param values
     *        The value for the filter key.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value for the filter key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value for the filter key.
     * </p>
     * 
     * @param values
     *        The value for the filter key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PatchFilter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchFilter == false)
            return false;
        PatchFilter other = (PatchFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public PatchFilter clone() {
        try {
            return (PatchFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
