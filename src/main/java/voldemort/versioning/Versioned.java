/*
 * Copyright 2008-2009 LinkedIn, Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package voldemort.versioning;

import java.io.Serializable;
import java.util.Comparator;

import voldemort.utils.Utils;

/**
 * A wrapper for an object that adds a Version.
 * 
 * 
 */
public final class Versioned<T> implements Serializable {
    private static final long serialVersionUID = 1;

    private final VectorClock version;
    private volatile T object;

    public Versioned(T object) {
        this(object, new VectorClock());
    }

    public Versioned(T object, Version version) {
        this.version = version == null ? new VectorClock() : (VectorClock) version;
        this.object = object;
    }

    public Version getVersion() {
        return version;
    }

    public T getValue() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    /**
     * Create a clone of this Versioned object such that the object pointed to
     * is the same, but the VectorClock and Versioned wrapper is a shallow copy.
     */
    public Versioned<T> cloneVersioned() {
        return new Versioned<T>(this.getValue(), this.version.clone());
    }

    public static <S> Versioned<S> value(S s) {
        return new Versioned<S>(s, new VectorClock());
    }

    public static <S> Versioned<S> value(S s, Version v) {
        return new Versioned<S>(s, v);
    }

    public static final class HappenedBeforeComparator<S> implements Comparator<Versioned<S>> {

        public int compare(Versioned<S> v1, Versioned<S> v2) {
            Occured occured = v1.getVersion().compare(v2.getVersion());
            if(occured == Occured.BEFORE)
                return -1;
            else if(occured == Occured.AFTER)
                return 1;
            else
                return 0;
        }
    }

}
