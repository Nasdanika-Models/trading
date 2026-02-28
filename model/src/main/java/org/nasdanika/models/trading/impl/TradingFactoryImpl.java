/**
 */
package org.nasdanika.models.trading.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.trading.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TradingFactoryImpl extends EFactoryImpl implements TradingFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TradingFactory init() {
		try {
			TradingFactory theTradingFactory = (TradingFactory)EPackage.Registry.INSTANCE.getEFactory(TradingPackage.eNS_URI);
			if (theTradingFactory != null) {
				return theTradingFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TradingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradingFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TradingPackage.CONTRACT: return createContract();
			case TradingPackage.COMBO_LEG: return createComboLeg();
			case TradingPackage.ORDER: return createOrder();
			case TradingPackage.ALGO_PARAMS: return createAlgoParams();
			case TradingPackage.TRADING_PROPOSAL: return createTradingProposal();
			case TradingPackage.TRADING_ACCOUNT: return createTradingAccount();
			case TradingPackage.RISK_PARAMETERS: return createRiskParameters();
			case TradingPackage.EXECUTION_RESULT: return createExecutionResult();
			case TradingPackage.BRACKET_ORDER: return createBracketOrder();
			case TradingPackage.POSITION: return createPosition();
			case TradingPackage.MARKET_DATA_SNAPSHOT: return createMarketDataSnapshot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TradingPackage.SECURITY_TYPE:
				return createSecurityTypeFromString(eDataType, initialValue);
			case TradingPackage.ORDER_TYPE:
				return createOrderTypeFromString(eDataType, initialValue);
			case TradingPackage.ORDER_ACTION:
				return createOrderActionFromString(eDataType, initialValue);
			case TradingPackage.TIME_IN_FORCE:
				return createTimeInForceFromString(eDataType, initialValue);
			case TradingPackage.OPTION_RIGHT:
				return createOptionRightFromString(eDataType, initialValue);
			case TradingPackage.ORDER_STATUS:
				return createOrderStatusFromString(eDataType, initialValue);
			case TradingPackage.PROPOSAL_STATUS:
				return createProposalStatusFromString(eDataType, initialValue);
			case TradingPackage.ACCOUNT_TYPE:
				return createAccountTypeFromString(eDataType, initialValue);
			case TradingPackage.TRIGGER_METHOD:
				return createTriggerMethodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TradingPackage.SECURITY_TYPE:
				return convertSecurityTypeToString(eDataType, instanceValue);
			case TradingPackage.ORDER_TYPE:
				return convertOrderTypeToString(eDataType, instanceValue);
			case TradingPackage.ORDER_ACTION:
				return convertOrderActionToString(eDataType, instanceValue);
			case TradingPackage.TIME_IN_FORCE:
				return convertTimeInForceToString(eDataType, instanceValue);
			case TradingPackage.OPTION_RIGHT:
				return convertOptionRightToString(eDataType, instanceValue);
			case TradingPackage.ORDER_STATUS:
				return convertOrderStatusToString(eDataType, instanceValue);
			case TradingPackage.PROPOSAL_STATUS:
				return convertProposalStatusToString(eDataType, instanceValue);
			case TradingPackage.ACCOUNT_TYPE:
				return convertAccountTypeToString(eDataType, instanceValue);
			case TradingPackage.TRIGGER_METHOD:
				return convertTriggerMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComboLeg createComboLeg() {
		ComboLegImpl comboLeg = new ComboLegImpl();
		return comboLeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlgoParams createAlgoParams() {
		AlgoParamsImpl algoParams = new AlgoParamsImpl();
		return algoParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TradingProposal createTradingProposal() {
		TradingProposalImpl tradingProposal = new TradingProposalImpl();
		return tradingProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TradingAccount createTradingAccount() {
		TradingAccountImpl tradingAccount = new TradingAccountImpl();
		return tradingAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskParameters createRiskParameters() {
		RiskParametersImpl riskParameters = new RiskParametersImpl();
		return riskParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExecutionResult createExecutionResult() {
		ExecutionResultImpl executionResult = new ExecutionResultImpl();
		return executionResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BracketOrder createBracketOrder() {
		BracketOrderImpl bracketOrder = new BracketOrderImpl();
		return bracketOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarketDataSnapshot createMarketDataSnapshot() {
		MarketDataSnapshotImpl marketDataSnapshot = new MarketDataSnapshotImpl();
		return marketDataSnapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityType createSecurityTypeFromString(EDataType eDataType, String initialValue) {
		SecurityType result = SecurityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderTypeFromString(EDataType eDataType, String initialValue) {
		OrderType result = OrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderAction createOrderActionFromString(EDataType eDataType, String initialValue) {
		OrderAction result = OrderAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeInForce createTimeInForceFromString(EDataType eDataType, String initialValue) {
		TimeInForce result = TimeInForce.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeInForceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionRight createOptionRightFromString(EDataType eDataType, String initialValue) {
		OptionRight result = OptionRight.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptionRightToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderStatus createOrderStatusFromString(EDataType eDataType, String initialValue) {
		OrderStatus result = OrderStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProposalStatus createProposalStatusFromString(EDataType eDataType, String initialValue) {
		ProposalStatus result = ProposalStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProposalStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountType createAccountTypeFromString(EDataType eDataType, String initialValue) {
		AccountType result = AccountType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccountTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerMethod createTriggerMethodFromString(EDataType eDataType, String initialValue) {
		TriggerMethod result = TriggerMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TradingPackage getTradingPackage() {
		return (TradingPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TradingPackage getPackage() {
		return TradingPackage.eINSTANCE;
	}

} //TradingFactoryImpl
