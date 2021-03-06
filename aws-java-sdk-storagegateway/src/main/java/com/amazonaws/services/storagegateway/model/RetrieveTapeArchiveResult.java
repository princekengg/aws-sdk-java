/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * RetrieveTapeArchiveOutput
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/RetrieveTapeArchive" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrieveTapeArchiveResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the retrieved virtual tape.
     * </p>
     */
    private String tapeARN;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the retrieved virtual tape.
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of the retrieved virtual tape.
     */

    public void setTapeARN(String tapeARN) {
        this.tapeARN = tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the retrieved virtual tape.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the retrieved virtual tape.
     */

    public String getTapeARN() {
        return this.tapeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the retrieved virtual tape.
     * </p>
     * 
     * @param tapeARN
     *        The Amazon Resource Name (ARN) of the retrieved virtual tape.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrieveTapeArchiveResult withTapeARN(String tapeARN) {
        setTapeARN(tapeARN);
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
        if (getTapeARN() != null)
            sb.append("TapeARN: ").append(getTapeARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieveTapeArchiveResult == false)
            return false;
        RetrieveTapeArchiveResult other = (RetrieveTapeArchiveResult) obj;
        if (other.getTapeARN() == null ^ this.getTapeARN() == null)
            return false;
        if (other.getTapeARN() != null && other.getTapeARN().equals(this.getTapeARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTapeARN() == null) ? 0 : getTapeARN().hashCode());
        return hashCode;
    }

    @Override
    public RetrieveTapeArchiveResult clone() {
        try {
            return (RetrieveTapeArchiveResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
