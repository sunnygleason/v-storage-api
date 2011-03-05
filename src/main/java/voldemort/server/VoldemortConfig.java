package voldemort.server;

import java.util.List;
import java.util.Properties;

public class VoldemortConfig {
	public VoldemortConfig(Properties properties) {}
	
	public int getGossipInterval() {
		return 0;
	}

	public void setGossipInterval(int gossipInterval) {
	}

	public int getNodeId() {
		return 0;
	}

	public void setNodeId(int nodeId) {

	}

	public String getVoldemortHome() {
		return null;
	}

	public void setVoldemortHome(String voldemortHome) {
	}

	public String getDataDirectory() {
		return null;
	}

	public void setDataDirectory(String dataDirectory) {
	}

	public String getMetadataDirectory() {
		return null;
	}

	public void setMetadataDirectory(String metadataDirectory) {
	}

	public long getBdbCacheSize() {
		return 0;
	}

	public void setBdbCacheSize(int bdbCacheSize) {
	}

	public boolean isBdbFlushTransactionsEnabled() {
		return false;
	}

	public void setBdbFlushTransactions(boolean bdbSyncTransactions) {
	}

	public String getBdbDataDirectory() {
		return null;
	}

	public void setBdbDataDirectory(String bdbDataDirectory) {
	}

	public long getBdbMaxLogFileSize() {
		return 0;
	}

	public void setBdbMaxLogFileSize(long bdbMaxLogFileSize) {

	}

	public int getBdbCleanerMinFileUtilization() {
		return 0;
	}

	public void setBdbCleanerMinFileUtilization(int minFileUtilization) {
	}

	public int getBdbCleanerMinUtilization() {
		return 0;
	}

	public void setBdbCleanerMinUtilization(int minUtilization) {
	}

	public int getBdbBtreeFanout() {
		return 0;
	}

	public void setBdbBtreeFanout(int bdbBtreeFanout) {
	}

	public boolean getBdbCursorPreload() {
		return false;
	}

	public void setBdbCursorPreload(boolean bdbCursorPreload) {
	}

	public int getCoreThreads() {
		return 0;
	}

	public void setCoreThreads(int coreThreads) {
	}

	public int getMaxThreads() {
		return 0;
	}

	public void setMaxThreads(int maxThreads) {
	}

	public int getAdminCoreThreads() {
		return 0;
	}

	public void setAdminCoreThreads(int coreThreads) {
	}

	public int getAdminMaxThreads() {
		return 0;
	}

	public void setAdminMaxThreads(int maxThreads) {
	}

	public boolean isHttpServerEnabled() {
		return false;
	}

	public void setEnableHttpServer(boolean enableHttpServer) {
	}

	public boolean isSocketServerEnabled() {
		return false;
	}

	public void setAdminServerEnabled(boolean enableSocketServer) {
	}

	public boolean isAdminServerEnabled() {
		return false;
	}

	public long getStreamMaxReadBytesPerSec() {
		return 0;
	}

	public void setStreamMaxReadBytesPerSec(long streamMaxReadBytesPerSec) {
	}

	public long getStreamMaxWriteBytesPerSec() {
		return 0;
	}

	public void setStreamMaxWriteBytesPerSec(long streamMaxWriteBytesPerSec) {
	}

	public long getSlopMaxWriteBytesPerSec() {
		return 0;
	}

	public void setSlopMaxWriteBytesPerSec(long slopMaxWriteBytesPerSec) {
	}

	public long getSlopMaxReadBytesPerSec() {
		return 0;
	}

	public void setSlopMaxReadBytesPerSec(long slopMaxReadBytesPerSec) {
	}

	public void setEnableAdminServer(boolean enableAdminServer) {
	}

	public boolean isJmxEnabled() {
		return false;
	}

	public void setEnableJmx(boolean enableJmx) {
	}

	public boolean isPipelineRoutedStoreEnabled() {
		return false;
	}

	public void setEnablePipelineRoutedStore(boolean enablePipelineRoutedStore) {
	}

	public boolean isGuiEnabled() {
		return false;
	}

	public void setEnableGui(boolean enableGui) {
	}

	public String getMysqlUsername() {
		return null;
	}

	public void setMysqlUsername(String mysqlUsername) {
	}

	public String getMysqlPassword() {
		return null;
	}

	public void setMysqlPassword(String mysqlPassword) {
	}

	public String getMysqlDatabaseName() {
		return null;
	}

	public void setMysqlDatabaseName(String mysqlDatabaseName) {
	}

	public String getMysqlHost() {
		return null;
	}

	public void setMysqlHost(String mysqlHost) {
	}

	public int getMysqlPort() {
		return 0;
	}

	public void setMysqlPort(int mysqlPort) {
	}

	public String getSlopStoreType() {
		return null;
	}

	public void setSlopStoreType(String slopStoreType) {
	}

	public String getPusherType() {
		return null;
	}

	public void setPusherType(String pusherType) {
	}

	public int getSlopZonesDownToTerminate() {
		return 0;
	}

	public void setSlopZonesDownToTerminate(int slopZonesDownToTerminate) {
	}

	public int getSlopBatchSize() {
		return 0;
	}

	public void setSlopBatchSize(int slopBatchSize) {
	}

	public int getSocketTimeoutMs() {
		return 0;
	}

	public long getSlopFrequencyMs() {
		return 0;
	}

	public void setSocketTimeoutMs(int socketTimeoutMs) {
	}

	public int getClientSelectors() {
		return 0;
	}

	public void setClientSelectors(int clientSelectors) {
	}

	public int getClientRoutingTimeoutMs() {
		return 0;
	}

	public void setClientRoutingTimeoutMs(int routingTimeoutMs) {
	}

	public int getClientMaxConnectionsPerNode() {
		return 0;
	}

	public void setClientMaxConnectionsPerNode(int maxConnectionsPerNode) {
	}

	public int getClientConnectionTimeoutMs() {
		return 0;
	}

	public void setClientConnectionTimeoutMs(int connectionTimeoutMs) {
	}

	public int getClientNodeBannageMs() {
		return 0;
	}

	public void setClientNodeBannageMs(int nodeBannageMs) {
	}

	public int getClientMaxThreads() {
		return 0;
	}

	public void setClientMaxThreads(int clientMaxThreads) {
	}

	public int getClientThreadIdleMs() {
		return 0;
	}

	public void setClientThreadIdleMs(int clientThreadIdleMs) {
	}

	public int getClientMaxQueuedRequests() {
		return 0;
	}

	public void setClientMaxQueuedRequests(int clientMaxQueuedRequests) {
	}

	public boolean isSlopEnabled() {
		return false;
	}

	public void setEnableSlop(boolean enableSlop) {
	}

	public boolean isVerboseLoggingEnabled() {
		return false;
	}

	public void setEnableVerboseLogging(boolean enableVerboseLogging) {
	}

	public boolean isStatTrackingEnabled() {
		return false;
	}

	public void setEnableStatTracking(boolean enableStatTracking) {
	}

	public boolean isMetadataCheckingEnabled() {
		return false;
	}

	public void setEnableMetadataChecking(boolean enableMetadataChecking) {
	}

	public boolean isRedirectRoutingEnabled() {
		return false;
	}

	public void setEnableRedirectRouting(boolean enableRedirectRouting) {
	}

	public long getBdbCheckpointBytes() {
		return 0;
	}

	public void setBdbCheckpointBytes(long bdbCheckpointBytes) {
	}

	public long getBdbCheckpointMs() {
		return 0;
	}

	public void setBdbCheckpointMs(long bdbCheckpointMs) {
	}

	public int getSchedulerThreads() {
		return 0;
	}

	public void setSchedulerThreads(int schedulerThreads) {
	}

	public String getReadOnlyDataStorageDirectory() {
		return null;
	}

	public void setReadOnlyDataStorageDirectory(String readOnlyStorageDir) {
	}

	public int getReadOnlyBackups() {
		return 0;
	}

	public void setReadOnlyBackups(int readOnlyBackups) {
	}

	public boolean isBdbWriteTransactionsEnabled() {
		return false;
	}

	public void setBdbWriteTransactions(boolean bdbWriteTransactions) {
	}

	public boolean isBdbSortedDuplicatesEnabled() {
		return false;
	}

	public void setBdbSortedDuplicates(boolean enable) {
	}

	public void setBdbOneEnvPerStore(boolean bdbOneEnvPerStore) {
	}

	public boolean isBdbOneEnvPerStore() {
		return false;
	}

	public int getSocketBufferSize() {
		return 0;
	}

	public void setSocketBufferSize(int socketBufferSize) {
	}

	public boolean getSocketKeepAlive() {
		return false;
	}

	public void setSocketKeepAlive(boolean on) {
	}

	public boolean getUseNioConnector() {
		return false;
	}

	public void setUseNioConnector(boolean useNio) {
	}

	public int getNioConnectorSelectors() {
		return 0;
	}

	public void setNioConnectorSelectors(int nioConnectorSelectors) {
	}

	public int getNioAdminConnectorSelectors() {
		return 0;
	}

	public void setNioAdminConnectorSelectors(int nioAdminConnectorSelectors) {
	}

	public int getAdminSocketBufferSize() {
		return 0;
	}

	public void setAdminSocketBufferSize(int socketBufferSize) {
	}

	public List<String> getStorageConfigurations() {
		return null;
	}

	public void setStorageConfigurations(List<String> storageConfigurations) {
	}

	public boolean isServerRoutingEnabled() {
		return false;
	}

	public void setEnableServerRouting(boolean enableServerRouting) {
	}

	public int getNumCleanupPermits() {
		return 0;
	}

	public void setNumCleanupPermits(int numCleanupPermits) {
	}

	public String getFailureDetectorImplementation() {
		return null;
	}

	public void setFailureDetectorImplementation(
			String failureDetectorImplementation) {
	}

	public long getFailureDetectorBannagePeriod() {
		return 0;
	}

	public void setFailureDetectorBannagePeriod(
			long failureDetectorBannagePeriod) {
	}

	public int getFailureDetectorThreshold() {
		return 0;
	}

	public void setFailureDetectorThreshold(int failureDetectorThreshold) {
	}

	public int getFailureDetectorThresholdCountMinimum() {
		return 0;
	}

	public void setFailureDetectorThresholdCountMinimum(
			int failureDetectorThresholdCountMinimum) {
	}

	public long getFailureDetectorThresholdInterval() {
		return 0;
	}

	public void setFailureDetectorThresholdInterval(
			long failureDetectorThresholdInterval) {
	}

	public long getFailureDetectorAsyncRecoveryInterval() {
		return 0;
	}

	public void setFailureDetectorAsyncRecoveryInterval(
			long failureDetectorAsyncRecoveryInterval) {
	}

	public List<String> getFailureDetectorCatastrophicErrorTypes() {
		return null;
	}

	public void setFailureDetectorCatastrophicErrorTypes(
			List<String> failureDetectorCatastrophicErrorTypes) {
	}

	public long getFailureDetectorRequestLengthThreshold() {
		return 0;
	}

	public void setFailureDetectorRequestLengthThreshold(
			long failureDetectorRequestLengthThreshold) {
	}

	public int getRetentionCleanupFirstStartTimeInHour() {
		return 0;
	}

	public void setRetentionCleanupFirstStartTimeInHour(
			int retentionCleanupFirstStartTimeInHour) {
	}

	public int getRetentionCleanupScheduledPeriodInHour() {
		return 0;
	}

	public void setRetentionCleanupScheduledPeriodInHour(
			int retentionCleanupScheduledPeriodInHour) {
	}

	public int getAdminSocketTimeout() {
		return 0;
	}

	public void setAdminSocketTimeout(int adminSocketTimeout) {
	}

	public int getAdminConnectionTimeout() {
		return 0;
	}

	public void setAdminConnectionTimeout(int adminConnectionTimeout) {
	}

	public void setMaxRebalancingAttempt(int maxRebalancingAttempt) {
	}

	public int getMaxRebalancingAttempt() {
		return 0;
	}

	public int getRebalancingTimeout() {
		return 0;
	}

	public void setRebalancingTimeout(int rebalancingTimeout) {
	}

	public boolean isGossipEnabled() {
		return false;
	}

	public void setEnableGossip(boolean enableGossip) {
	}

	public String getReadOnlySearchStrategy() {
		return null;
	}

	public void setReadOnlySearchStrategy(String readOnlySearchStrategy) {
	}

	public boolean isNetworkClassLoaderEnabled() {
		return false;
	}

	public void setEnableNetworkClassLoader(boolean enableNetworkClassLoader) {
	}

	public int getRebalancingServicePeriod() {
		return 0;
	}

	public void setEnableRebalanceService(boolean enableRebalanceService) {
	}

	public boolean isEnableRebalanceService() {
		return false;
	}

	public int getMaxParallelStoresRebalancing() {
		return 0;
	}

	public void setMaxParallelStoresRebalancing(int maxParallelStoresRebalancing) {
	}
}
