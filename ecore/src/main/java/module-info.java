import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.trading.ecore.ECoreGenTradingProcessorsCapabilityFactory;

module org.nasdanika.models.trading.ecore {
		
	requires transitive org.nasdanika.models.trading;
	requires transitive org.nasdanika.models.ecore.graph;
	requires org.eclipse.emf.common;
	
	exports org.nasdanika.models.trading.ecore;
	opens org.nasdanika.models.trading.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenTradingProcessorsCapabilityFactory; 		
	
}
