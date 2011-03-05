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

package voldemort.store.bdb;

import voldemort.annotations.jmx.JmxOperation;
import voldemort.server.VoldemortConfig;
import voldemort.store.StorageConfiguration;
import voldemort.store.StorageEngine;
import voldemort.utils.ByteArray;

/**
 * The configuration that is shared between berkeley db instances. This includes
 * the db environment and the configuration
 */
public class BdbStorageConfiguration implements StorageConfiguration {

    public BdbStorageConfiguration(VoldemortConfig config) {
    }

    public StorageEngine<ByteArray, byte[], byte[]> getStore(String storeName) {
    	return null;
    }

    public String getType() {
        return null;
    }

    @JmxOperation(description = "A variety of stats about one BDB environment.")
    public String getEnvStatsAsString(String storeName) throws Exception {
    	return null;
    }

    public void close() {
    }
}
