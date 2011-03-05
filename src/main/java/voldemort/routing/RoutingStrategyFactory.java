package voldemort.routing;

import voldemort.cluster.Cluster;
import voldemort.store.StoreDefinition;

/**
 * A factory that gets the appropriate {@link RoutingStrategy} for a given
 * {@link RoutingStrategyType}.
 * 
 * 
 */
public class RoutingStrategyFactory {

    public RoutingStrategyFactory() {}

    public RoutingStrategy updateRoutingStrategy(StoreDefinition storeDef, Cluster cluster) {
    	return null;
    }
}
