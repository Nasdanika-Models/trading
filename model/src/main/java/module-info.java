import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.trading.util.TradingEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.trading {
	exports org.nasdanika.models.trading;
	exports org.nasdanika.models.trading.impl;
	exports org.nasdanika.models.trading.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires org.nasdanika.capability;
	
	provides CapabilityFactory with TradingEPackageResourceSetCapabilityFactory;
	
}