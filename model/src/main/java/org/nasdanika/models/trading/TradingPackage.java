/**
 */
package org.nasdanika.models.trading;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Interactive Brokers (IBKR) Trading Model for automated trader agents.
 * This model captures the core concepts from IBKR's TWS API and Web API
 * for creating trading proposals that can be executed on real or paper accounts.
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.trading.TradingFactory
 * @model kind="package"
 * @generated
 */
public interface TradingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trading";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/trading";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.trading";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TradingPackage eINSTANCE = org.nasdanika.models.trading.impl.TradingPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.impl.ContractImpl
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 0;

	/**
	 * The feature id for the '<em><b>Con Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CON_ID = 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>Sec Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__SEC_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__EXCHANGE = 3;

	/**
	 * The feature id for the '<em><b>Primary Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PRIMARY_EXCHANGE = 4;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CURRENCY = 5;

	/**
	 * The feature id for the '<em><b>Local Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__LOCAL_SYMBOL = 6;

	/**
	 * The feature id for the '<em><b>Trading Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__TRADING_CLASS = 7;

	/**
	 * The feature id for the '<em><b>Last Trade Date Or Contract Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__LAST_TRADE_DATE_OR_CONTRACT_MONTH = 8;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__STRIKE = 9;

	/**
	 * The feature id for the '<em><b>Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__RIGHT = 10;

	/**
	 * The feature id for the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__MULTIPLIER = 11;

	/**
	 * The feature id for the '<em><b>Include Expired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__INCLUDE_EXPIRED = 12;

	/**
	 * The feature id for the '<em><b>Combo Legs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__COMBO_LEGS = 13;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.impl.ComboLegImpl <em>Combo Leg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.impl.ComboLegImpl
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getComboLeg()
	 * @generated
	 */
	int COMBO_LEG = 1;

	/**
	 * The feature id for the '<em><b>Con Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_LEG__CON_ID = 0;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_LEG__RATIO = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_LEG__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_LEG__EXCHANGE = 3;

	/**
	 * The number of structural features of the '<em>Combo Leg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_LEG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Combo Leg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMBO_LEG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.impl.OrderImpl
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 2;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_ID = 0;

	/**
	 * The feature id for the '<em><b>Client Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__CLIENT_ORDER_ID = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Total Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TOTAL_QUANTITY = 3;

	/**
	 * The feature id for the '<em><b>Order Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Lmt Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__LMT_PRICE = 5;

	/**
	 * The feature id for the '<em><b>Aux Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__AUX_PRICE = 6;

	/**
	 * The feature id for the '<em><b>Tif</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TIF = 7;

	/**
	 * The feature id for the '<em><b>Good Till Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__GOOD_TILL_DATE = 8;

	/**
	 * The feature id for the '<em><b>Outside Rth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__OUTSIDE_RTH = 9;

	/**
	 * The feature id for the '<em><b>All Or None</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ALL_OR_NONE = 10;

	/**
	 * The feature id for the '<em><b>Transmit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TRANSMIT = 11;

	/**
	 * The feature id for the '<em><b>Trigger Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TRIGGER_METHOD = 12;

	/**
	 * The feature id for the '<em><b>Trailing Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TRAILING_PERCENT = 13;

	/**
	 * The feature id for the '<em><b>Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__DISPLAY_SIZE = 14;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PARENT_ID = 15;

	/**
	 * The feature id for the '<em><b>Oca Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__OCA_GROUP = 16;

	/**
	 * The feature id for the '<em><b>Order Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_REF = 17;

	/**
	 * The feature id for the '<em><b>Use Adaptive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__USE_ADAPTIVE = 18;

	/**
	 * The feature id for the '<em><b>Cash Qty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__CASH_QTY = 19;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__CONTRACT = 20;

	/**
	 * The feature id for the '<em><b>Algo Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ALGO_PARAMS = 21;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.impl.AlgoParamsImpl <em>Algo Params</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.impl.AlgoParamsImpl
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getAlgoParams()
	 * @generated
	 */
	int ALGO_PARAMS = 3;

	/**
	 * The feature id for the '<em><b>Algo Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_PARAMS__ALGO_STRATEGY = 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_PARAMS__START_TIME = 1;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_PARAMS__END_TIME = 2;

	/**
	 * The feature id for the '<em><b>Allow Past End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_PARAMS__ALLOW_PAST_END_TIME = 3;

	/**
	 * The feature id for the '<em><b>Max Pct Vol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_PARAMS__MAX_PCT_VOL = 4;

	/**
	 * The feature id for the '<em><b>No Take Liq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_PARAMS__NO_TAKE_LIQ = 5;

	/**
	 * The feature id for the '<em><b>Adaptive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_PARAMS__ADAPTIVE_PRIORITY = 6;

	/**
	 * The number of structural features of the '<em>Algo Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_PARAMS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Algo Params</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGO_PARAMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.impl.TradingProposalImpl <em>Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.impl.TradingProposalImpl
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getTradingProposal()
	 * @generated
	 */
	int TRADING_PROPOSAL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__CREATED_AT = 4;

	/**
	 * The feature id for the '<em><b>Expires At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__EXPIRES_AT = 5;

	/**
	 * The feature id for the '<em><b>Agent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__AGENT_ID = 6;

	/**
	 * The feature id for the '<em><b>Strategy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__STRATEGY_NAME = 7;

	/**
	 * The feature id for the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__CONFIDENCE = 8;

	/**
	 * The feature id for the '<em><b>Expected Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__EXPECTED_RETURN = 9;

	/**
	 * The feature id for the '<em><b>Max Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__MAX_RISK = 10;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__ORDERS = 11;

	/**
	 * The feature id for the '<em><b>Target Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__TARGET_ACCOUNT = 12;

	/**
	 * The feature id for the '<em><b>Risk Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__RISK_PARAMETERS = 13;

	/**
	 * The feature id for the '<em><b>Execution Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL__EXECUTION_RESULTS = 14;

	/**
	 * The number of structural features of the '<em>Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_PROPOSAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.impl.TradingAccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.impl.TradingAccountImpl
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getTradingAccount()
	 * @generated
	 */
	int TRADING_ACCOUNT = 5;

	/**
	 * The feature id for the '<em><b>Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ACCOUNT__ACCOUNT_ID = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ACCOUNT__ALIAS = 1;

	/**
	 * The feature id for the '<em><b>Account Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ACCOUNT__ACCOUNT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Currency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ACCOUNT__CURRENCY = 3;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ACCOUNT__IS_ACTIVE = 4;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ACCOUNT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADING_ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.impl.RiskParametersImpl <em>Risk Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.impl.RiskParametersImpl
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getRiskParameters()
	 * @generated
	 */
	int RISK_PARAMETERS = 6;

	/**
	 * The feature id for the '<em><b>Max Position Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETERS__MAX_POSITION_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Stop Loss Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETERS__STOP_LOSS_PERCENT = 1;

	/**
	 * The feature id for the '<em><b>Take Profit Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETERS__TAKE_PROFIT_PERCENT = 2;

	/**
	 * The feature id for the '<em><b>Max Drawdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETERS__MAX_DRAWDOWN = 3;

	/**
	 * The feature id for the '<em><b>Trailing Stop Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETERS__TRAILING_STOP_PERCENT = 4;

	/**
	 * The number of structural features of the '<em>Risk Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETERS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Risk Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.impl.ExecutionResultImpl <em>Execution Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.impl.ExecutionResultImpl
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getExecutionResult()
	 * @generated
	 */
	int EXECUTION_RESULT = 7;

	/**
	 * The feature id for the '<em><b>Execution Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT__EXECUTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT__ORDER_ID = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT__STATUS = 2;

	/**
	 * The feature id for the '<em><b>Filled Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT__FILLED_QUANTITY = 3;

	/**
	 * The feature id for the '<em><b>Remaining Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT__REMAINING_QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Avg Fill Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT__AVG_FILL_PRICE = 5;

	/**
	 * The feature id for the '<em><b>Last Fill Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT__LAST_FILL_PRICE = 6;

	/**
	 * The feature id for the '<em><b>Commission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT__COMMISSION = 7;

	/**
	 * The feature id for the '<em><b>Realized Pn L</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT__REALIZED_PN_L = 8;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT__EXECUTION_TIME = 9;

	/**
	 * The feature id for the '<em><b>Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT__EXCHANGE = 10;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT__ERROR_MESSAGE = 11;

	/**
	 * The number of structural features of the '<em>Execution Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Execution Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.impl.BracketOrderImpl <em>Bracket Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.impl.BracketOrderImpl
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getBracketOrder()
	 * @generated
	 */
	int BRACKET_ORDER = 8;

	/**
	 * The feature id for the '<em><b>Entry Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET_ORDER__ENTRY_ORDER = 0;

	/**
	 * The feature id for the '<em><b>Profit Taker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET_ORDER__PROFIT_TAKER = 1;

	/**
	 * The feature id for the '<em><b>Stop Loss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET_ORDER__STOP_LOSS = 2;

	/**
	 * The number of structural features of the '<em>Bracket Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET_ORDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bracket Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRACKET_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.impl.PositionImpl
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 9;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__CONTRACT = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Avg Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__AVG_COST = 2;

	/**
	 * The feature id for the '<em><b>Market Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__MARKET_PRICE = 3;

	/**
	 * The feature id for the '<em><b>Market Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__MARKET_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Unrealized Pn L</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__UNREALIZED_PN_L = 5;

	/**
	 * The feature id for the '<em><b>Realized Pn L</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__REALIZED_PN_L = 6;

	/**
	 * The feature id for the '<em><b>Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__ACCOUNT_ID = 7;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl <em>Market Data Snapshot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.impl.MarketDataSnapshotImpl
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getMarketDataSnapshot()
	 * @generated
	 */
	int MARKET_DATA_SNAPSHOT = 10;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__CONTRACT = 0;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__TIMESTAMP = 1;

	/**
	 * The feature id for the '<em><b>Bid Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__BID_PRICE = 2;

	/**
	 * The feature id for the '<em><b>Bid Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__BID_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Ask Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__ASK_PRICE = 4;

	/**
	 * The feature id for the '<em><b>Ask Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__ASK_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Last Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__LAST_PRICE = 6;

	/**
	 * The feature id for the '<em><b>Last Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__LAST_SIZE = 7;

	/**
	 * The feature id for the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__HIGH = 8;

	/**
	 * The feature id for the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__LOW = 9;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__OPEN = 10;

	/**
	 * The feature id for the '<em><b>Close</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__CLOSE = 11;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__VOLUME = 12;

	/**
	 * The feature id for the '<em><b>Halted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT__HALTED = 13;

	/**
	 * The number of structural features of the '<em>Market Data Snapshot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Market Data Snapshot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKET_DATA_SNAPSHOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.SecurityType <em>Security Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.SecurityType
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getSecurityType()
	 * @generated
	 */
	int SECURITY_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.OrderType <em>Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.OrderType
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getOrderType()
	 * @generated
	 */
	int ORDER_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.OrderAction <em>Order Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.OrderAction
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getOrderAction()
	 * @generated
	 */
	int ORDER_ACTION = 13;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.TimeInForce <em>Time In Force</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.TimeInForce
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getTimeInForce()
	 * @generated
	 */
	int TIME_IN_FORCE = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.OptionRight <em>Option Right</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.OptionRight
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getOptionRight()
	 * @generated
	 */
	int OPTION_RIGHT = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.OrderStatus <em>Order Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.OrderStatus
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getOrderStatus()
	 * @generated
	 */
	int ORDER_STATUS = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.ProposalStatus <em>Proposal Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.ProposalStatus
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getProposalStatus()
	 * @generated
	 */
	int PROPOSAL_STATUS = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.AccountType <em>Account Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.AccountType
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getAccountType()
	 * @generated
	 */
	int ACCOUNT_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.trading.TriggerMethod <em>Trigger Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.trading.TriggerMethod
	 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getTriggerMethod()
	 * @generated
	 */
	int TRIGGER_METHOD = 19;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.trading.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see org.nasdanika.models.trading.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Contract#getConId <em>Con Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Con Id</em>'.
	 * @see org.nasdanika.models.trading.Contract#getConId()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_ConId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Contract#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.nasdanika.models.trading.Contract#getSymbol()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Contract#getSecType <em>Sec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sec Type</em>'.
	 * @see org.nasdanika.models.trading.Contract#getSecType()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_SecType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Contract#getExchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange</em>'.
	 * @see org.nasdanika.models.trading.Contract#getExchange()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Exchange();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Contract#getPrimaryExchange <em>Primary Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary Exchange</em>'.
	 * @see org.nasdanika.models.trading.Contract#getPrimaryExchange()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_PrimaryExchange();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Contract#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.nasdanika.models.trading.Contract#getCurrency()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Currency();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Contract#getLocalSymbol <em>Local Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Symbol</em>'.
	 * @see org.nasdanika.models.trading.Contract#getLocalSymbol()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_LocalSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Contract#getTradingClass <em>Trading Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trading Class</em>'.
	 * @see org.nasdanika.models.trading.Contract#getTradingClass()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_TradingClass();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Contract#getLastTradeDateOrContractMonth <em>Last Trade Date Or Contract Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Trade Date Or Contract Month</em>'.
	 * @see org.nasdanika.models.trading.Contract#getLastTradeDateOrContractMonth()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_LastTradeDateOrContractMonth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Contract#getStrike <em>Strike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strike</em>'.
	 * @see org.nasdanika.models.trading.Contract#getStrike()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Strike();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Contract#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right</em>'.
	 * @see org.nasdanika.models.trading.Contract#getRight()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Right();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Contract#getMultiplier <em>Multiplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplier</em>'.
	 * @see org.nasdanika.models.trading.Contract#getMultiplier()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_Multiplier();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Contract#isIncludeExpired <em>Include Expired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Expired</em>'.
	 * @see org.nasdanika.models.trading.Contract#isIncludeExpired()
	 * @see #getContract()
	 * @generated
	 */
	EAttribute getContract_IncludeExpired();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.trading.Contract#getComboLegs <em>Combo Legs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Combo Legs</em>'.
	 * @see org.nasdanika.models.trading.Contract#getComboLegs()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_ComboLegs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.trading.ComboLeg <em>Combo Leg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Combo Leg</em>'.
	 * @see org.nasdanika.models.trading.ComboLeg
	 * @generated
	 */
	EClass getComboLeg();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ComboLeg#getConId <em>Con Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Con Id</em>'.
	 * @see org.nasdanika.models.trading.ComboLeg#getConId()
	 * @see #getComboLeg()
	 * @generated
	 */
	EAttribute getComboLeg_ConId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ComboLeg#getRatio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratio</em>'.
	 * @see org.nasdanika.models.trading.ComboLeg#getRatio()
	 * @see #getComboLeg()
	 * @generated
	 */
	EAttribute getComboLeg_Ratio();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ComboLeg#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.nasdanika.models.trading.ComboLeg#getAction()
	 * @see #getComboLeg()
	 * @generated
	 */
	EAttribute getComboLeg_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ComboLeg#getExchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange</em>'.
	 * @see org.nasdanika.models.trading.ComboLeg#getExchange()
	 * @see #getComboLeg()
	 * @generated
	 */
	EAttribute getComboLeg_Exchange();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.trading.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see org.nasdanika.models.trading.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see org.nasdanika.models.trading.Order#getOrderId()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getClientOrderId <em>Client Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Client Order Id</em>'.
	 * @see org.nasdanika.models.trading.Order#getClientOrderId()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_ClientOrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.nasdanika.models.trading.Order#getAction()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getTotalQuantity <em>Total Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Quantity</em>'.
	 * @see org.nasdanika.models.trading.Order#getTotalQuantity()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_TotalQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getOrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Type</em>'.
	 * @see org.nasdanika.models.trading.Order#getOrderType()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getLmtPrice <em>Lmt Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lmt Price</em>'.
	 * @see org.nasdanika.models.trading.Order#getLmtPrice()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_LmtPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getAuxPrice <em>Aux Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aux Price</em>'.
	 * @see org.nasdanika.models.trading.Order#getAuxPrice()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_AuxPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getTif <em>Tif</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tif</em>'.
	 * @see org.nasdanika.models.trading.Order#getTif()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Tif();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getGoodTillDate <em>Good Till Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Good Till Date</em>'.
	 * @see org.nasdanika.models.trading.Order#getGoodTillDate()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_GoodTillDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#isOutsideRth <em>Outside Rth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outside Rth</em>'.
	 * @see org.nasdanika.models.trading.Order#isOutsideRth()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OutsideRth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#isAllOrNone <em>All Or None</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Or None</em>'.
	 * @see org.nasdanika.models.trading.Order#isAllOrNone()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_AllOrNone();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#isTransmit <em>Transmit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transmit</em>'.
	 * @see org.nasdanika.models.trading.Order#isTransmit()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Transmit();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getTriggerMethod <em>Trigger Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger Method</em>'.
	 * @see org.nasdanika.models.trading.Order#getTriggerMethod()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_TriggerMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getTrailingPercent <em>Trailing Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trailing Percent</em>'.
	 * @see org.nasdanika.models.trading.Order#getTrailingPercent()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_TrailingPercent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getDisplaySize <em>Display Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Size</em>'.
	 * @see org.nasdanika.models.trading.Order#getDisplaySize()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_DisplaySize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getParentId <em>Parent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Id</em>'.
	 * @see org.nasdanika.models.trading.Order#getParentId()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_ParentId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getOcaGroup <em>Oca Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oca Group</em>'.
	 * @see org.nasdanika.models.trading.Order#getOcaGroup()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OcaGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getOrderRef <em>Order Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Ref</em>'.
	 * @see org.nasdanika.models.trading.Order#getOrderRef()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderRef();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#isUseAdaptive <em>Use Adaptive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Adaptive</em>'.
	 * @see org.nasdanika.models.trading.Order#isUseAdaptive()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_UseAdaptive();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Order#getCashQty <em>Cash Qty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cash Qty</em>'.
	 * @see org.nasdanika.models.trading.Order#getCashQty()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_CashQty();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.trading.Order#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contract</em>'.
	 * @see org.nasdanika.models.trading.Order#getContract()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Contract();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.trading.Order#getAlgoParams <em>Algo Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algo Params</em>'.
	 * @see org.nasdanika.models.trading.Order#getAlgoParams()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_AlgoParams();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.trading.AlgoParams <em>Algo Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algo Params</em>'.
	 * @see org.nasdanika.models.trading.AlgoParams
	 * @generated
	 */
	EClass getAlgoParams();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.AlgoParams#getAlgoStrategy <em>Algo Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Algo Strategy</em>'.
	 * @see org.nasdanika.models.trading.AlgoParams#getAlgoStrategy()
	 * @see #getAlgoParams()
	 * @generated
	 */
	EAttribute getAlgoParams_AlgoStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.AlgoParams#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see org.nasdanika.models.trading.AlgoParams#getStartTime()
	 * @see #getAlgoParams()
	 * @generated
	 */
	EAttribute getAlgoParams_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.AlgoParams#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see org.nasdanika.models.trading.AlgoParams#getEndTime()
	 * @see #getAlgoParams()
	 * @generated
	 */
	EAttribute getAlgoParams_EndTime();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.AlgoParams#isAllowPastEndTime <em>Allow Past End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Past End Time</em>'.
	 * @see org.nasdanika.models.trading.AlgoParams#isAllowPastEndTime()
	 * @see #getAlgoParams()
	 * @generated
	 */
	EAttribute getAlgoParams_AllowPastEndTime();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.AlgoParams#getMaxPctVol <em>Max Pct Vol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Pct Vol</em>'.
	 * @see org.nasdanika.models.trading.AlgoParams#getMaxPctVol()
	 * @see #getAlgoParams()
	 * @generated
	 */
	EAttribute getAlgoParams_MaxPctVol();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.AlgoParams#isNoTakeLiq <em>No Take Liq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Take Liq</em>'.
	 * @see org.nasdanika.models.trading.AlgoParams#isNoTakeLiq()
	 * @see #getAlgoParams()
	 * @generated
	 */
	EAttribute getAlgoParams_NoTakeLiq();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.AlgoParams#getAdaptivePriority <em>Adaptive Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adaptive Priority</em>'.
	 * @see org.nasdanika.models.trading.AlgoParams#getAdaptivePriority()
	 * @see #getAlgoParams()
	 * @generated
	 */
	EAttribute getAlgoParams_AdaptivePriority();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.trading.TradingProposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposal</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal
	 * @generated
	 */
	EClass getTradingProposal();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingProposal#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getId()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EAttribute getTradingProposal_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingProposal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getName()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EAttribute getTradingProposal_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingProposal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getDescription()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EAttribute getTradingProposal_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingProposal#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getStatus()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EAttribute getTradingProposal_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingProposal#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getCreatedAt()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EAttribute getTradingProposal_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingProposal#getExpiresAt <em>Expires At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expires At</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getExpiresAt()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EAttribute getTradingProposal_ExpiresAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingProposal#getAgentId <em>Agent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent Id</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getAgentId()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EAttribute getTradingProposal_AgentId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingProposal#getStrategyName <em>Strategy Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strategy Name</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getStrategyName()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EAttribute getTradingProposal_StrategyName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingProposal#getConfidence <em>Confidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidence</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getConfidence()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EAttribute getTradingProposal_Confidence();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingProposal#getExpectedReturn <em>Expected Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expected Return</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getExpectedReturn()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EAttribute getTradingProposal_ExpectedReturn();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingProposal#getMaxRisk <em>Max Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Risk</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getMaxRisk()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EAttribute getTradingProposal_MaxRisk();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.trading.TradingProposal#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getOrders()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EReference getTradingProposal_Orders();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.trading.TradingProposal#getTargetAccount <em>Target Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Account</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getTargetAccount()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EReference getTradingProposal_TargetAccount();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.trading.TradingProposal#getRiskParameters <em>Risk Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Risk Parameters</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getRiskParameters()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EReference getTradingProposal_RiskParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.trading.TradingProposal#getExecutionResults <em>Execution Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Execution Results</em>'.
	 * @see org.nasdanika.models.trading.TradingProposal#getExecutionResults()
	 * @see #getTradingProposal()
	 * @generated
	 */
	EReference getTradingProposal_ExecutionResults();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.trading.TradingAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see org.nasdanika.models.trading.TradingAccount
	 * @generated
	 */
	EClass getTradingAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingAccount#getAccountId <em>Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Id</em>'.
	 * @see org.nasdanika.models.trading.TradingAccount#getAccountId()
	 * @see #getTradingAccount()
	 * @generated
	 */
	EAttribute getTradingAccount_AccountId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingAccount#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.nasdanika.models.trading.TradingAccount#getAlias()
	 * @see #getTradingAccount()
	 * @generated
	 */
	EAttribute getTradingAccount_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingAccount#getAccountType <em>Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Type</em>'.
	 * @see org.nasdanika.models.trading.TradingAccount#getAccountType()
	 * @see #getTradingAccount()
	 * @generated
	 */
	EAttribute getTradingAccount_AccountType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingAccount#getCurrency <em>Currency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Currency</em>'.
	 * @see org.nasdanika.models.trading.TradingAccount#getCurrency()
	 * @see #getTradingAccount()
	 * @generated
	 */
	EAttribute getTradingAccount_Currency();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.TradingAccount#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see org.nasdanika.models.trading.TradingAccount#isIsActive()
	 * @see #getTradingAccount()
	 * @generated
	 */
	EAttribute getTradingAccount_IsActive();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.trading.RiskParameters <em>Risk Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Parameters</em>'.
	 * @see org.nasdanika.models.trading.RiskParameters
	 * @generated
	 */
	EClass getRiskParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.RiskParameters#getMaxPositionSize <em>Max Position Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Position Size</em>'.
	 * @see org.nasdanika.models.trading.RiskParameters#getMaxPositionSize()
	 * @see #getRiskParameters()
	 * @generated
	 */
	EAttribute getRiskParameters_MaxPositionSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.RiskParameters#getStopLossPercent <em>Stop Loss Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Loss Percent</em>'.
	 * @see org.nasdanika.models.trading.RiskParameters#getStopLossPercent()
	 * @see #getRiskParameters()
	 * @generated
	 */
	EAttribute getRiskParameters_StopLossPercent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.RiskParameters#getTakeProfitPercent <em>Take Profit Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Take Profit Percent</em>'.
	 * @see org.nasdanika.models.trading.RiskParameters#getTakeProfitPercent()
	 * @see #getRiskParameters()
	 * @generated
	 */
	EAttribute getRiskParameters_TakeProfitPercent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.RiskParameters#getMaxDrawdown <em>Max Drawdown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Drawdown</em>'.
	 * @see org.nasdanika.models.trading.RiskParameters#getMaxDrawdown()
	 * @see #getRiskParameters()
	 * @generated
	 */
	EAttribute getRiskParameters_MaxDrawdown();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.RiskParameters#getTrailingStopPercent <em>Trailing Stop Percent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trailing Stop Percent</em>'.
	 * @see org.nasdanika.models.trading.RiskParameters#getTrailingStopPercent()
	 * @see #getRiskParameters()
	 * @generated
	 */
	EAttribute getRiskParameters_TrailingStopPercent();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.trading.ExecutionResult <em>Execution Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Result</em>'.
	 * @see org.nasdanika.models.trading.ExecutionResult
	 * @generated
	 */
	EClass getExecutionResult();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ExecutionResult#getExecutionId <em>Execution Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Id</em>'.
	 * @see org.nasdanika.models.trading.ExecutionResult#getExecutionId()
	 * @see #getExecutionResult()
	 * @generated
	 */
	EAttribute getExecutionResult_ExecutionId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ExecutionResult#getOrderId <em>Order Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order Id</em>'.
	 * @see org.nasdanika.models.trading.ExecutionResult#getOrderId()
	 * @see #getExecutionResult()
	 * @generated
	 */
	EAttribute getExecutionResult_OrderId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ExecutionResult#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.trading.ExecutionResult#getStatus()
	 * @see #getExecutionResult()
	 * @generated
	 */
	EAttribute getExecutionResult_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ExecutionResult#getFilledQuantity <em>Filled Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filled Quantity</em>'.
	 * @see org.nasdanika.models.trading.ExecutionResult#getFilledQuantity()
	 * @see #getExecutionResult()
	 * @generated
	 */
	EAttribute getExecutionResult_FilledQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ExecutionResult#getRemainingQuantity <em>Remaining Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remaining Quantity</em>'.
	 * @see org.nasdanika.models.trading.ExecutionResult#getRemainingQuantity()
	 * @see #getExecutionResult()
	 * @generated
	 */
	EAttribute getExecutionResult_RemainingQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ExecutionResult#getAvgFillPrice <em>Avg Fill Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Fill Price</em>'.
	 * @see org.nasdanika.models.trading.ExecutionResult#getAvgFillPrice()
	 * @see #getExecutionResult()
	 * @generated
	 */
	EAttribute getExecutionResult_AvgFillPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ExecutionResult#getLastFillPrice <em>Last Fill Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Fill Price</em>'.
	 * @see org.nasdanika.models.trading.ExecutionResult#getLastFillPrice()
	 * @see #getExecutionResult()
	 * @generated
	 */
	EAttribute getExecutionResult_LastFillPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ExecutionResult#getCommission <em>Commission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commission</em>'.
	 * @see org.nasdanika.models.trading.ExecutionResult#getCommission()
	 * @see #getExecutionResult()
	 * @generated
	 */
	EAttribute getExecutionResult_Commission();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ExecutionResult#getRealizedPnL <em>Realized Pn L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized Pn L</em>'.
	 * @see org.nasdanika.models.trading.ExecutionResult#getRealizedPnL()
	 * @see #getExecutionResult()
	 * @generated
	 */
	EAttribute getExecutionResult_RealizedPnL();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ExecutionResult#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Time</em>'.
	 * @see org.nasdanika.models.trading.ExecutionResult#getExecutionTime()
	 * @see #getExecutionResult()
	 * @generated
	 */
	EAttribute getExecutionResult_ExecutionTime();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ExecutionResult#getExchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exchange</em>'.
	 * @see org.nasdanika.models.trading.ExecutionResult#getExchange()
	 * @see #getExecutionResult()
	 * @generated
	 */
	EAttribute getExecutionResult_Exchange();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.ExecutionResult#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see org.nasdanika.models.trading.ExecutionResult#getErrorMessage()
	 * @see #getExecutionResult()
	 * @generated
	 */
	EAttribute getExecutionResult_ErrorMessage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.trading.BracketOrder <em>Bracket Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bracket Order</em>'.
	 * @see org.nasdanika.models.trading.BracketOrder
	 * @generated
	 */
	EClass getBracketOrder();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.trading.BracketOrder#getEntryOrder <em>Entry Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Order</em>'.
	 * @see org.nasdanika.models.trading.BracketOrder#getEntryOrder()
	 * @see #getBracketOrder()
	 * @generated
	 */
	EReference getBracketOrder_EntryOrder();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.trading.BracketOrder#getProfitTaker <em>Profit Taker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Profit Taker</em>'.
	 * @see org.nasdanika.models.trading.BracketOrder#getProfitTaker()
	 * @see #getBracketOrder()
	 * @generated
	 */
	EReference getBracketOrder_ProfitTaker();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.trading.BracketOrder#getStopLoss <em>Stop Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop Loss</em>'.
	 * @see org.nasdanika.models.trading.BracketOrder#getStopLoss()
	 * @see #getBracketOrder()
	 * @generated
	 */
	EReference getBracketOrder_StopLoss();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.trading.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see org.nasdanika.models.trading.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.trading.Position#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contract</em>'.
	 * @see org.nasdanika.models.trading.Position#getContract()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Contract();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Position#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see org.nasdanika.models.trading.Position#getQuantity()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Position#getAvgCost <em>Avg Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avg Cost</em>'.
	 * @see org.nasdanika.models.trading.Position#getAvgCost()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_AvgCost();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Position#getMarketPrice <em>Market Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Market Price</em>'.
	 * @see org.nasdanika.models.trading.Position#getMarketPrice()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_MarketPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Position#getMarketValue <em>Market Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Market Value</em>'.
	 * @see org.nasdanika.models.trading.Position#getMarketValue()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_MarketValue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Position#getUnrealizedPnL <em>Unrealized Pn L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unrealized Pn L</em>'.
	 * @see org.nasdanika.models.trading.Position#getUnrealizedPnL()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_UnrealizedPnL();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Position#getRealizedPnL <em>Realized Pn L</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realized Pn L</em>'.
	 * @see org.nasdanika.models.trading.Position#getRealizedPnL()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_RealizedPnL();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.Position#getAccountId <em>Account Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Id</em>'.
	 * @see org.nasdanika.models.trading.Position#getAccountId()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_AccountId();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.trading.MarketDataSnapshot <em>Market Data Snapshot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Market Data Snapshot</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot
	 * @generated
	 */
	EClass getMarketDataSnapshot();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.trading.MarketDataSnapshot#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contract</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#getContract()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EReference getMarketDataSnapshot_Contract();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.MarketDataSnapshot#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#getTimestamp()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EAttribute getMarketDataSnapshot_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.MarketDataSnapshot#getBidPrice <em>Bid Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bid Price</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#getBidPrice()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EAttribute getMarketDataSnapshot_BidPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.MarketDataSnapshot#getBidSize <em>Bid Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bid Size</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#getBidSize()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EAttribute getMarketDataSnapshot_BidSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.MarketDataSnapshot#getAskPrice <em>Ask Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ask Price</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#getAskPrice()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EAttribute getMarketDataSnapshot_AskPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.MarketDataSnapshot#getAskSize <em>Ask Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ask Size</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#getAskSize()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EAttribute getMarketDataSnapshot_AskSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.MarketDataSnapshot#getLastPrice <em>Last Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Price</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#getLastPrice()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EAttribute getMarketDataSnapshot_LastPrice();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.MarketDataSnapshot#getLastSize <em>Last Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Size</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#getLastSize()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EAttribute getMarketDataSnapshot_LastSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.MarketDataSnapshot#getHigh <em>High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>High</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#getHigh()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EAttribute getMarketDataSnapshot_High();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.MarketDataSnapshot#getLow <em>Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Low</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#getLow()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EAttribute getMarketDataSnapshot_Low();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.MarketDataSnapshot#getOpen <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#getOpen()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EAttribute getMarketDataSnapshot_Open();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.MarketDataSnapshot#getClose <em>Close</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Close</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#getClose()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EAttribute getMarketDataSnapshot_Close();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.MarketDataSnapshot#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#getVolume()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EAttribute getMarketDataSnapshot_Volume();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.trading.MarketDataSnapshot#isHalted <em>Halted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Halted</em>'.
	 * @see org.nasdanika.models.trading.MarketDataSnapshot#isHalted()
	 * @see #getMarketDataSnapshot()
	 * @generated
	 */
	EAttribute getMarketDataSnapshot_Halted();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.trading.SecurityType <em>Security Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Type</em>'.
	 * @see org.nasdanika.models.trading.SecurityType
	 * @generated
	 */
	EEnum getSecurityType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.trading.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Type</em>'.
	 * @see org.nasdanika.models.trading.OrderType
	 * @generated
	 */
	EEnum getOrderType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.trading.OrderAction <em>Order Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Action</em>'.
	 * @see org.nasdanika.models.trading.OrderAction
	 * @generated
	 */
	EEnum getOrderAction();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.trading.TimeInForce <em>Time In Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time In Force</em>'.
	 * @see org.nasdanika.models.trading.TimeInForce
	 * @generated
	 */
	EEnum getTimeInForce();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.trading.OptionRight <em>Option Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Option Right</em>'.
	 * @see org.nasdanika.models.trading.OptionRight
	 * @generated
	 */
	EEnum getOptionRight();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.trading.OrderStatus <em>Order Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Status</em>'.
	 * @see org.nasdanika.models.trading.OrderStatus
	 * @generated
	 */
	EEnum getOrderStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.trading.ProposalStatus <em>Proposal Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Proposal Status</em>'.
	 * @see org.nasdanika.models.trading.ProposalStatus
	 * @generated
	 */
	EEnum getProposalStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.trading.AccountType <em>Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Account Type</em>'.
	 * @see org.nasdanika.models.trading.AccountType
	 * @generated
	 */
	EEnum getAccountType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.trading.TriggerMethod <em>Trigger Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Method</em>'.
	 * @see org.nasdanika.models.trading.TriggerMethod
	 * @generated
	 */
	EEnum getTriggerMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TradingFactory getTradingFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.impl.ContractImpl
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Con Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__CON_ID = eINSTANCE.getContract_ConId();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__SYMBOL = eINSTANCE.getContract_Symbol();

		/**
		 * The meta object literal for the '<em><b>Sec Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__SEC_TYPE = eINSTANCE.getContract_SecType();

		/**
		 * The meta object literal for the '<em><b>Exchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__EXCHANGE = eINSTANCE.getContract_Exchange();

		/**
		 * The meta object literal for the '<em><b>Primary Exchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__PRIMARY_EXCHANGE = eINSTANCE.getContract_PrimaryExchange();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__CURRENCY = eINSTANCE.getContract_Currency();

		/**
		 * The meta object literal for the '<em><b>Local Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__LOCAL_SYMBOL = eINSTANCE.getContract_LocalSymbol();

		/**
		 * The meta object literal for the '<em><b>Trading Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__TRADING_CLASS = eINSTANCE.getContract_TradingClass();

		/**
		 * The meta object literal for the '<em><b>Last Trade Date Or Contract Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__LAST_TRADE_DATE_OR_CONTRACT_MONTH = eINSTANCE.getContract_LastTradeDateOrContractMonth();

		/**
		 * The meta object literal for the '<em><b>Strike</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__STRIKE = eINSTANCE.getContract_Strike();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__RIGHT = eINSTANCE.getContract_Right();

		/**
		 * The meta object literal for the '<em><b>Multiplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__MULTIPLIER = eINSTANCE.getContract_Multiplier();

		/**
		 * The meta object literal for the '<em><b>Include Expired</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRACT__INCLUDE_EXPIRED = eINSTANCE.getContract_IncludeExpired();

		/**
		 * The meta object literal for the '<em><b>Combo Legs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__COMBO_LEGS = eINSTANCE.getContract_ComboLegs();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.impl.ComboLegImpl <em>Combo Leg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.impl.ComboLegImpl
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getComboLeg()
		 * @generated
		 */
		EClass COMBO_LEG = eINSTANCE.getComboLeg();

		/**
		 * The meta object literal for the '<em><b>Con Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_LEG__CON_ID = eINSTANCE.getComboLeg_ConId();

		/**
		 * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_LEG__RATIO = eINSTANCE.getComboLeg_Ratio();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_LEG__ACTION = eINSTANCE.getComboLeg_Action();

		/**
		 * The meta object literal for the '<em><b>Exchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMBO_LEG__EXCHANGE = eINSTANCE.getComboLeg_Exchange();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.impl.OrderImpl
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_ID = eINSTANCE.getOrder_OrderId();

		/**
		 * The meta object literal for the '<em><b>Client Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__CLIENT_ORDER_ID = eINSTANCE.getOrder_ClientOrderId();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ACTION = eINSTANCE.getOrder_Action();

		/**
		 * The meta object literal for the '<em><b>Total Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TOTAL_QUANTITY = eINSTANCE.getOrder_TotalQuantity();

		/**
		 * The meta object literal for the '<em><b>Order Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_TYPE = eINSTANCE.getOrder_OrderType();

		/**
		 * The meta object literal for the '<em><b>Lmt Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__LMT_PRICE = eINSTANCE.getOrder_LmtPrice();

		/**
		 * The meta object literal for the '<em><b>Aux Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__AUX_PRICE = eINSTANCE.getOrder_AuxPrice();

		/**
		 * The meta object literal for the '<em><b>Tif</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TIF = eINSTANCE.getOrder_Tif();

		/**
		 * The meta object literal for the '<em><b>Good Till Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__GOOD_TILL_DATE = eINSTANCE.getOrder_GoodTillDate();

		/**
		 * The meta object literal for the '<em><b>Outside Rth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__OUTSIDE_RTH = eINSTANCE.getOrder_OutsideRth();

		/**
		 * The meta object literal for the '<em><b>All Or None</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ALL_OR_NONE = eINSTANCE.getOrder_AllOrNone();

		/**
		 * The meta object literal for the '<em><b>Transmit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TRANSMIT = eINSTANCE.getOrder_Transmit();

		/**
		 * The meta object literal for the '<em><b>Trigger Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TRIGGER_METHOD = eINSTANCE.getOrder_TriggerMethod();

		/**
		 * The meta object literal for the '<em><b>Trailing Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TRAILING_PERCENT = eINSTANCE.getOrder_TrailingPercent();

		/**
		 * The meta object literal for the '<em><b>Display Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__DISPLAY_SIZE = eINSTANCE.getOrder_DisplaySize();

		/**
		 * The meta object literal for the '<em><b>Parent Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PARENT_ID = eINSTANCE.getOrder_ParentId();

		/**
		 * The meta object literal for the '<em><b>Oca Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__OCA_GROUP = eINSTANCE.getOrder_OcaGroup();

		/**
		 * The meta object literal for the '<em><b>Order Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_REF = eINSTANCE.getOrder_OrderRef();

		/**
		 * The meta object literal for the '<em><b>Use Adaptive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__USE_ADAPTIVE = eINSTANCE.getOrder_UseAdaptive();

		/**
		 * The meta object literal for the '<em><b>Cash Qty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__CASH_QTY = eINSTANCE.getOrder_CashQty();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__CONTRACT = eINSTANCE.getOrder_Contract();

		/**
		 * The meta object literal for the '<em><b>Algo Params</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__ALGO_PARAMS = eINSTANCE.getOrder_AlgoParams();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.impl.AlgoParamsImpl <em>Algo Params</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.impl.AlgoParamsImpl
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getAlgoParams()
		 * @generated
		 */
		EClass ALGO_PARAMS = eINSTANCE.getAlgoParams();

		/**
		 * The meta object literal for the '<em><b>Algo Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO_PARAMS__ALGO_STRATEGY = eINSTANCE.getAlgoParams_AlgoStrategy();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO_PARAMS__START_TIME = eINSTANCE.getAlgoParams_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO_PARAMS__END_TIME = eINSTANCE.getAlgoParams_EndTime();

		/**
		 * The meta object literal for the '<em><b>Allow Past End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO_PARAMS__ALLOW_PAST_END_TIME = eINSTANCE.getAlgoParams_AllowPastEndTime();

		/**
		 * The meta object literal for the '<em><b>Max Pct Vol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO_PARAMS__MAX_PCT_VOL = eINSTANCE.getAlgoParams_MaxPctVol();

		/**
		 * The meta object literal for the '<em><b>No Take Liq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO_PARAMS__NO_TAKE_LIQ = eINSTANCE.getAlgoParams_NoTakeLiq();

		/**
		 * The meta object literal for the '<em><b>Adaptive Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGO_PARAMS__ADAPTIVE_PRIORITY = eINSTANCE.getAlgoParams_AdaptivePriority();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.impl.TradingProposalImpl <em>Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.impl.TradingProposalImpl
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getTradingProposal()
		 * @generated
		 */
		EClass TRADING_PROPOSAL = eINSTANCE.getTradingProposal();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_PROPOSAL__ID = eINSTANCE.getTradingProposal_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_PROPOSAL__NAME = eINSTANCE.getTradingProposal_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_PROPOSAL__DESCRIPTION = eINSTANCE.getTradingProposal_Description();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_PROPOSAL__STATUS = eINSTANCE.getTradingProposal_Status();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_PROPOSAL__CREATED_AT = eINSTANCE.getTradingProposal_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Expires At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_PROPOSAL__EXPIRES_AT = eINSTANCE.getTradingProposal_ExpiresAt();

		/**
		 * The meta object literal for the '<em><b>Agent Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_PROPOSAL__AGENT_ID = eINSTANCE.getTradingProposal_AgentId();

		/**
		 * The meta object literal for the '<em><b>Strategy Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_PROPOSAL__STRATEGY_NAME = eINSTANCE.getTradingProposal_StrategyName();

		/**
		 * The meta object literal for the '<em><b>Confidence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_PROPOSAL__CONFIDENCE = eINSTANCE.getTradingProposal_Confidence();

		/**
		 * The meta object literal for the '<em><b>Expected Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_PROPOSAL__EXPECTED_RETURN = eINSTANCE.getTradingProposal_ExpectedReturn();

		/**
		 * The meta object literal for the '<em><b>Max Risk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_PROPOSAL__MAX_RISK = eINSTANCE.getTradingProposal_MaxRisk();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADING_PROPOSAL__ORDERS = eINSTANCE.getTradingProposal_Orders();

		/**
		 * The meta object literal for the '<em><b>Target Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADING_PROPOSAL__TARGET_ACCOUNT = eINSTANCE.getTradingProposal_TargetAccount();

		/**
		 * The meta object literal for the '<em><b>Risk Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADING_PROPOSAL__RISK_PARAMETERS = eINSTANCE.getTradingProposal_RiskParameters();

		/**
		 * The meta object literal for the '<em><b>Execution Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRADING_PROPOSAL__EXECUTION_RESULTS = eINSTANCE.getTradingProposal_ExecutionResults();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.impl.TradingAccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.impl.TradingAccountImpl
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getTradingAccount()
		 * @generated
		 */
		EClass TRADING_ACCOUNT = eINSTANCE.getTradingAccount();

		/**
		 * The meta object literal for the '<em><b>Account Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_ACCOUNT__ACCOUNT_ID = eINSTANCE.getTradingAccount_AccountId();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_ACCOUNT__ALIAS = eINSTANCE.getTradingAccount_Alias();

		/**
		 * The meta object literal for the '<em><b>Account Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_ACCOUNT__ACCOUNT_TYPE = eINSTANCE.getTradingAccount_AccountType();

		/**
		 * The meta object literal for the '<em><b>Currency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_ACCOUNT__CURRENCY = eINSTANCE.getTradingAccount_Currency();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRADING_ACCOUNT__IS_ACTIVE = eINSTANCE.getTradingAccount_IsActive();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.impl.RiskParametersImpl <em>Risk Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.impl.RiskParametersImpl
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getRiskParameters()
		 * @generated
		 */
		EClass RISK_PARAMETERS = eINSTANCE.getRiskParameters();

		/**
		 * The meta object literal for the '<em><b>Max Position Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_PARAMETERS__MAX_POSITION_SIZE = eINSTANCE.getRiskParameters_MaxPositionSize();

		/**
		 * The meta object literal for the '<em><b>Stop Loss Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_PARAMETERS__STOP_LOSS_PERCENT = eINSTANCE.getRiskParameters_StopLossPercent();

		/**
		 * The meta object literal for the '<em><b>Take Profit Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_PARAMETERS__TAKE_PROFIT_PERCENT = eINSTANCE.getRiskParameters_TakeProfitPercent();

		/**
		 * The meta object literal for the '<em><b>Max Drawdown</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_PARAMETERS__MAX_DRAWDOWN = eINSTANCE.getRiskParameters_MaxDrawdown();

		/**
		 * The meta object literal for the '<em><b>Trailing Stop Percent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_PARAMETERS__TRAILING_STOP_PERCENT = eINSTANCE.getRiskParameters_TrailingStopPercent();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.impl.ExecutionResultImpl <em>Execution Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.impl.ExecutionResultImpl
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getExecutionResult()
		 * @generated
		 */
		EClass EXECUTION_RESULT = eINSTANCE.getExecutionResult();

		/**
		 * The meta object literal for the '<em><b>Execution Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_RESULT__EXECUTION_ID = eINSTANCE.getExecutionResult_ExecutionId();

		/**
		 * The meta object literal for the '<em><b>Order Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_RESULT__ORDER_ID = eINSTANCE.getExecutionResult_OrderId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_RESULT__STATUS = eINSTANCE.getExecutionResult_Status();

		/**
		 * The meta object literal for the '<em><b>Filled Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_RESULT__FILLED_QUANTITY = eINSTANCE.getExecutionResult_FilledQuantity();

		/**
		 * The meta object literal for the '<em><b>Remaining Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_RESULT__REMAINING_QUANTITY = eINSTANCE.getExecutionResult_RemainingQuantity();

		/**
		 * The meta object literal for the '<em><b>Avg Fill Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_RESULT__AVG_FILL_PRICE = eINSTANCE.getExecutionResult_AvgFillPrice();

		/**
		 * The meta object literal for the '<em><b>Last Fill Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_RESULT__LAST_FILL_PRICE = eINSTANCE.getExecutionResult_LastFillPrice();

		/**
		 * The meta object literal for the '<em><b>Commission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_RESULT__COMMISSION = eINSTANCE.getExecutionResult_Commission();

		/**
		 * The meta object literal for the '<em><b>Realized Pn L</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_RESULT__REALIZED_PN_L = eINSTANCE.getExecutionResult_RealizedPnL();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_RESULT__EXECUTION_TIME = eINSTANCE.getExecutionResult_ExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Exchange</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_RESULT__EXCHANGE = eINSTANCE.getExecutionResult_Exchange();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTION_RESULT__ERROR_MESSAGE = eINSTANCE.getExecutionResult_ErrorMessage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.impl.BracketOrderImpl <em>Bracket Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.impl.BracketOrderImpl
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getBracketOrder()
		 * @generated
		 */
		EClass BRACKET_ORDER = eINSTANCE.getBracketOrder();

		/**
		 * The meta object literal for the '<em><b>Entry Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRACKET_ORDER__ENTRY_ORDER = eINSTANCE.getBracketOrder_EntryOrder();

		/**
		 * The meta object literal for the '<em><b>Profit Taker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRACKET_ORDER__PROFIT_TAKER = eINSTANCE.getBracketOrder_ProfitTaker();

		/**
		 * The meta object literal for the '<em><b>Stop Loss</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRACKET_ORDER__STOP_LOSS = eINSTANCE.getBracketOrder_StopLoss();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.impl.PositionImpl
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__CONTRACT = eINSTANCE.getPosition_Contract();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__QUANTITY = eINSTANCE.getPosition_Quantity();

		/**
		 * The meta object literal for the '<em><b>Avg Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__AVG_COST = eINSTANCE.getPosition_AvgCost();

		/**
		 * The meta object literal for the '<em><b>Market Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__MARKET_PRICE = eINSTANCE.getPosition_MarketPrice();

		/**
		 * The meta object literal for the '<em><b>Market Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__MARKET_VALUE = eINSTANCE.getPosition_MarketValue();

		/**
		 * The meta object literal for the '<em><b>Unrealized Pn L</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__UNREALIZED_PN_L = eINSTANCE.getPosition_UnrealizedPnL();

		/**
		 * The meta object literal for the '<em><b>Realized Pn L</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__REALIZED_PN_L = eINSTANCE.getPosition_RealizedPnL();

		/**
		 * The meta object literal for the '<em><b>Account Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__ACCOUNT_ID = eINSTANCE.getPosition_AccountId();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl <em>Market Data Snapshot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.impl.MarketDataSnapshotImpl
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getMarketDataSnapshot()
		 * @generated
		 */
		EClass MARKET_DATA_SNAPSHOT = eINSTANCE.getMarketDataSnapshot();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MARKET_DATA_SNAPSHOT__CONTRACT = eINSTANCE.getMarketDataSnapshot_Contract();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_DATA_SNAPSHOT__TIMESTAMP = eINSTANCE.getMarketDataSnapshot_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Bid Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_DATA_SNAPSHOT__BID_PRICE = eINSTANCE.getMarketDataSnapshot_BidPrice();

		/**
		 * The meta object literal for the '<em><b>Bid Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_DATA_SNAPSHOT__BID_SIZE = eINSTANCE.getMarketDataSnapshot_BidSize();

		/**
		 * The meta object literal for the '<em><b>Ask Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_DATA_SNAPSHOT__ASK_PRICE = eINSTANCE.getMarketDataSnapshot_AskPrice();

		/**
		 * The meta object literal for the '<em><b>Ask Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_DATA_SNAPSHOT__ASK_SIZE = eINSTANCE.getMarketDataSnapshot_AskSize();

		/**
		 * The meta object literal for the '<em><b>Last Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_DATA_SNAPSHOT__LAST_PRICE = eINSTANCE.getMarketDataSnapshot_LastPrice();

		/**
		 * The meta object literal for the '<em><b>Last Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_DATA_SNAPSHOT__LAST_SIZE = eINSTANCE.getMarketDataSnapshot_LastSize();

		/**
		 * The meta object literal for the '<em><b>High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_DATA_SNAPSHOT__HIGH = eINSTANCE.getMarketDataSnapshot_High();

		/**
		 * The meta object literal for the '<em><b>Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_DATA_SNAPSHOT__LOW = eINSTANCE.getMarketDataSnapshot_Low();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_DATA_SNAPSHOT__OPEN = eINSTANCE.getMarketDataSnapshot_Open();

		/**
		 * The meta object literal for the '<em><b>Close</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_DATA_SNAPSHOT__CLOSE = eINSTANCE.getMarketDataSnapshot_Close();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_DATA_SNAPSHOT__VOLUME = eINSTANCE.getMarketDataSnapshot_Volume();

		/**
		 * The meta object literal for the '<em><b>Halted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKET_DATA_SNAPSHOT__HALTED = eINSTANCE.getMarketDataSnapshot_Halted();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.SecurityType <em>Security Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.SecurityType
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getSecurityType()
		 * @generated
		 */
		EEnum SECURITY_TYPE = eINSTANCE.getSecurityType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.OrderType <em>Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.OrderType
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getOrderType()
		 * @generated
		 */
		EEnum ORDER_TYPE = eINSTANCE.getOrderType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.OrderAction <em>Order Action</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.OrderAction
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getOrderAction()
		 * @generated
		 */
		EEnum ORDER_ACTION = eINSTANCE.getOrderAction();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.TimeInForce <em>Time In Force</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.TimeInForce
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getTimeInForce()
		 * @generated
		 */
		EEnum TIME_IN_FORCE = eINSTANCE.getTimeInForce();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.OptionRight <em>Option Right</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.OptionRight
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getOptionRight()
		 * @generated
		 */
		EEnum OPTION_RIGHT = eINSTANCE.getOptionRight();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.OrderStatus <em>Order Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.OrderStatus
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getOrderStatus()
		 * @generated
		 */
		EEnum ORDER_STATUS = eINSTANCE.getOrderStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.ProposalStatus <em>Proposal Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.ProposalStatus
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getProposalStatus()
		 * @generated
		 */
		EEnum PROPOSAL_STATUS = eINSTANCE.getProposalStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.AccountType <em>Account Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.AccountType
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getAccountType()
		 * @generated
		 */
		EEnum ACCOUNT_TYPE = eINSTANCE.getAccountType();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.trading.TriggerMethod <em>Trigger Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.trading.TriggerMethod
		 * @see org.nasdanika.models.trading.impl.TradingPackageImpl#getTriggerMethod()
		 * @generated
		 */
		EEnum TRIGGER_METHOD = eINSTANCE.getTriggerMethod();

	}

} //TradingPackage
