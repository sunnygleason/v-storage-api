package voldemort.store.krati;

import voldemort.server.VoldemortConfig;
import voldemort.store.StorageConfiguration;
import voldemort.store.StorageEngine;
import voldemort.utils.ByteArray;

public class KratiStorageConfiguration implements StorageConfiguration {
    public KratiStorageConfiguration(VoldemortConfig config) {
    }

    public void close() {}

    public StorageEngine<ByteArray, byte[], byte[]> getStore(String storeName) {
    	return null;
    }

    public String getType() {
        return null;
    }
}
