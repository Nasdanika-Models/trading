/**
 */
package org.nasdanika.models.trading.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.trading.AccountType;
import org.nasdanika.models.trading.AlgoParams;
import org.nasdanika.models.trading.BracketOrder;
import org.nasdanika.models.trading.ComboLeg;
import org.nasdanika.models.trading.Contract;
import org.nasdanika.models.trading.ExecutionResult;
import org.nasdanika.models.trading.MarketDataSnapshot;
import org.nasdanika.models.trading.OptionRight;
import org.nasdanika.models.trading.Order;
import org.nasdanika.models.trading.OrderAction;
import org.nasdanika.models.trading.OrderStatus;
import org.nasdanika.models.trading.OrderType;
import org.nasdanika.models.trading.Position;
import org.nasdanika.models.trading.ProposalStatus;
import org.nasdanika.models.trading.RiskParameters;
import org.nasdanika.models.trading.SecurityType;
import org.nasdanika.models.trading.TimeInForce;
import org.nasdanika.models.trading.TradingAccount;
import org.nasdanika.models.trading.TradingFactory;
import org.nasdanika.models.trading.TradingPackage;
import org.nasdanika.models.trading.TradingProposal;
import org.nasdanika.models.trading.TriggerMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TradingPackageImpl extends EPackageImpl implements TradingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comboLegEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algoParamsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tradingProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tradingAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskParametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bracketOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marketDataSnapshotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeInForceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum optionRightEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum proposalStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accountTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerMethodEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.trading.TradingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TradingPackageImpl() {
		super(eNS_URI, TradingFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TradingPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TradingPackage init() {
		if (isInited) return (TradingPackage)EPackage.Registry.INSTANCE.getEPackage(TradingPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTradingPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TradingPackageImpl theTradingPackage = registeredTradingPackage instanceof TradingPackageImpl ? (TradingPackageImpl)registeredTradingPackage : new TradingPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTradingPackage.createPackageContents();

		// Initialize created meta-data
		theTradingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTradingPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TradingPackage.eNS_URI, theTradingPackage);
		return theTradingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContract() {
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContract_ConId() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContract_Symbol() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContract_SecType() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContract_Exchange() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContract_PrimaryExchange() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContract_Currency() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContract_LocalSymbol() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContract_TradingClass() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContract_LastTradeDateOrContractMonth() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContract_Strike() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContract_Right() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContract_Multiplier() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContract_IncludeExpired() {
		return (EAttribute)contractEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContract_ComboLegs() {
		return (EReference)contractEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComboLeg() {
		return comboLegEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComboLeg_ConId() {
		return (EAttribute)comboLegEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComboLeg_Ratio() {
		return (EAttribute)comboLegEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComboLeg_Action() {
		return (EAttribute)comboLegEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComboLeg_Exchange() {
		return (EAttribute)comboLegEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_OrderId() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_ClientOrderId() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_Action() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_TotalQuantity() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_OrderType() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_LmtPrice() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_AuxPrice() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_Tif() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_GoodTillDate() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_OutsideRth() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_AllOrNone() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_Transmit() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_TriggerMethod() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_TrailingPercent() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_DisplaySize() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_ParentId() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_OcaGroup() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_OrderRef() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_UseAdaptive() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrder_CashQty() {
		return (EAttribute)orderEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrder_Contract() {
		return (EReference)orderEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrder_AlgoParams() {
		return (EReference)orderEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlgoParams() {
		return algoParamsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgoParams_AlgoStrategy() {
		return (EAttribute)algoParamsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgoParams_StartTime() {
		return (EAttribute)algoParamsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgoParams_EndTime() {
		return (EAttribute)algoParamsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgoParams_AllowPastEndTime() {
		return (EAttribute)algoParamsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgoParams_MaxPctVol() {
		return (EAttribute)algoParamsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgoParams_NoTakeLiq() {
		return (EAttribute)algoParamsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgoParams_AdaptivePriority() {
		return (EAttribute)algoParamsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTradingProposal() {
		return tradingProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingProposal_Id() {
		return (EAttribute)tradingProposalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingProposal_Name() {
		return (EAttribute)tradingProposalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingProposal_Description() {
		return (EAttribute)tradingProposalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingProposal_Status() {
		return (EAttribute)tradingProposalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingProposal_CreatedAt() {
		return (EAttribute)tradingProposalEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingProposal_ExpiresAt() {
		return (EAttribute)tradingProposalEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingProposal_AgentId() {
		return (EAttribute)tradingProposalEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingProposal_StrategyName() {
		return (EAttribute)tradingProposalEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingProposal_Confidence() {
		return (EAttribute)tradingProposalEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingProposal_ExpectedReturn() {
		return (EAttribute)tradingProposalEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingProposal_MaxRisk() {
		return (EAttribute)tradingProposalEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTradingProposal_Orders() {
		return (EReference)tradingProposalEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTradingProposal_TargetAccount() {
		return (EReference)tradingProposalEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTradingProposal_RiskParameters() {
		return (EReference)tradingProposalEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTradingProposal_ExecutionResults() {
		return (EReference)tradingProposalEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTradingAccount() {
		return tradingAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingAccount_AccountId() {
		return (EAttribute)tradingAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingAccount_Alias() {
		return (EAttribute)tradingAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingAccount_AccountType() {
		return (EAttribute)tradingAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingAccount_Currency() {
		return (EAttribute)tradingAccountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTradingAccount_IsActive() {
		return (EAttribute)tradingAccountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskParameters() {
		return riskParametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskParameters_MaxPositionSize() {
		return (EAttribute)riskParametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskParameters_StopLossPercent() {
		return (EAttribute)riskParametersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskParameters_TakeProfitPercent() {
		return (EAttribute)riskParametersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskParameters_MaxDrawdown() {
		return (EAttribute)riskParametersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskParameters_TrailingStopPercent() {
		return (EAttribute)riskParametersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionResult() {
		return executionResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionResult_ExecutionId() {
		return (EAttribute)executionResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionResult_OrderId() {
		return (EAttribute)executionResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionResult_Status() {
		return (EAttribute)executionResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionResult_FilledQuantity() {
		return (EAttribute)executionResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionResult_RemainingQuantity() {
		return (EAttribute)executionResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionResult_AvgFillPrice() {
		return (EAttribute)executionResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionResult_LastFillPrice() {
		return (EAttribute)executionResultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionResult_Commission() {
		return (EAttribute)executionResultEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionResult_RealizedPnL() {
		return (EAttribute)executionResultEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionResult_ExecutionTime() {
		return (EAttribute)executionResultEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionResult_Exchange() {
		return (EAttribute)executionResultEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExecutionResult_ErrorMessage() {
		return (EAttribute)executionResultEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBracketOrder() {
		return bracketOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBracketOrder_EntryOrder() {
		return (EReference)bracketOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBracketOrder_ProfitTaker() {
		return (EReference)bracketOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBracketOrder_StopLoss() {
		return (EReference)bracketOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPosition_Contract() {
		return (EReference)positionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_Quantity() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_AvgCost() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_MarketPrice() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_MarketValue() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_UnrealizedPnL() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_RealizedPnL() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPosition_AccountId() {
		return (EAttribute)positionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarketDataSnapshot() {
		return marketDataSnapshotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketDataSnapshot_Contract() {
		return (EReference)marketDataSnapshotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketDataSnapshot_Timestamp() {
		return (EAttribute)marketDataSnapshotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketDataSnapshot_BidPrice() {
		return (EAttribute)marketDataSnapshotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketDataSnapshot_BidSize() {
		return (EAttribute)marketDataSnapshotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketDataSnapshot_AskPrice() {
		return (EAttribute)marketDataSnapshotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketDataSnapshot_AskSize() {
		return (EAttribute)marketDataSnapshotEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketDataSnapshot_LastPrice() {
		return (EAttribute)marketDataSnapshotEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketDataSnapshot_LastSize() {
		return (EAttribute)marketDataSnapshotEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketDataSnapshot_High() {
		return (EAttribute)marketDataSnapshotEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketDataSnapshot_Low() {
		return (EAttribute)marketDataSnapshotEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketDataSnapshot_Open() {
		return (EAttribute)marketDataSnapshotEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketDataSnapshot_Close() {
		return (EAttribute)marketDataSnapshotEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketDataSnapshot_Volume() {
		return (EAttribute)marketDataSnapshotEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarketDataSnapshot_Halted() {
		return (EAttribute)marketDataSnapshotEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSecurityType() {
		return securityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrderType() {
		return orderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrderAction() {
		return orderActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTimeInForce() {
		return timeInForceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOptionRight() {
		return optionRightEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrderStatus() {
		return orderStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProposalStatus() {
		return proposalStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccountType() {
		return accountTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTriggerMethod() {
		return triggerMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TradingFactory getTradingFactory() {
		return (TradingFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		contractEClass = createEClass(CONTRACT);
		createEAttribute(contractEClass, CONTRACT__CON_ID);
		createEAttribute(contractEClass, CONTRACT__SYMBOL);
		createEAttribute(contractEClass, CONTRACT__SEC_TYPE);
		createEAttribute(contractEClass, CONTRACT__EXCHANGE);
		createEAttribute(contractEClass, CONTRACT__PRIMARY_EXCHANGE);
		createEAttribute(contractEClass, CONTRACT__CURRENCY);
		createEAttribute(contractEClass, CONTRACT__LOCAL_SYMBOL);
		createEAttribute(contractEClass, CONTRACT__TRADING_CLASS);
		createEAttribute(contractEClass, CONTRACT__LAST_TRADE_DATE_OR_CONTRACT_MONTH);
		createEAttribute(contractEClass, CONTRACT__STRIKE);
		createEAttribute(contractEClass, CONTRACT__RIGHT);
		createEAttribute(contractEClass, CONTRACT__MULTIPLIER);
		createEAttribute(contractEClass, CONTRACT__INCLUDE_EXPIRED);
		createEReference(contractEClass, CONTRACT__COMBO_LEGS);

		comboLegEClass = createEClass(COMBO_LEG);
		createEAttribute(comboLegEClass, COMBO_LEG__CON_ID);
		createEAttribute(comboLegEClass, COMBO_LEG__RATIO);
		createEAttribute(comboLegEClass, COMBO_LEG__ACTION);
		createEAttribute(comboLegEClass, COMBO_LEG__EXCHANGE);

		orderEClass = createEClass(ORDER);
		createEAttribute(orderEClass, ORDER__ORDER_ID);
		createEAttribute(orderEClass, ORDER__CLIENT_ORDER_ID);
		createEAttribute(orderEClass, ORDER__ACTION);
		createEAttribute(orderEClass, ORDER__TOTAL_QUANTITY);
		createEAttribute(orderEClass, ORDER__ORDER_TYPE);
		createEAttribute(orderEClass, ORDER__LMT_PRICE);
		createEAttribute(orderEClass, ORDER__AUX_PRICE);
		createEAttribute(orderEClass, ORDER__TIF);
		createEAttribute(orderEClass, ORDER__GOOD_TILL_DATE);
		createEAttribute(orderEClass, ORDER__OUTSIDE_RTH);
		createEAttribute(orderEClass, ORDER__ALL_OR_NONE);
		createEAttribute(orderEClass, ORDER__TRANSMIT);
		createEAttribute(orderEClass, ORDER__TRIGGER_METHOD);
		createEAttribute(orderEClass, ORDER__TRAILING_PERCENT);
		createEAttribute(orderEClass, ORDER__DISPLAY_SIZE);
		createEAttribute(orderEClass, ORDER__PARENT_ID);
		createEAttribute(orderEClass, ORDER__OCA_GROUP);
		createEAttribute(orderEClass, ORDER__ORDER_REF);
		createEAttribute(orderEClass, ORDER__USE_ADAPTIVE);
		createEAttribute(orderEClass, ORDER__CASH_QTY);
		createEReference(orderEClass, ORDER__CONTRACT);
		createEReference(orderEClass, ORDER__ALGO_PARAMS);

		algoParamsEClass = createEClass(ALGO_PARAMS);
		createEAttribute(algoParamsEClass, ALGO_PARAMS__ALGO_STRATEGY);
		createEAttribute(algoParamsEClass, ALGO_PARAMS__START_TIME);
		createEAttribute(algoParamsEClass, ALGO_PARAMS__END_TIME);
		createEAttribute(algoParamsEClass, ALGO_PARAMS__ALLOW_PAST_END_TIME);
		createEAttribute(algoParamsEClass, ALGO_PARAMS__MAX_PCT_VOL);
		createEAttribute(algoParamsEClass, ALGO_PARAMS__NO_TAKE_LIQ);
		createEAttribute(algoParamsEClass, ALGO_PARAMS__ADAPTIVE_PRIORITY);

		tradingProposalEClass = createEClass(TRADING_PROPOSAL);
		createEAttribute(tradingProposalEClass, TRADING_PROPOSAL__ID);
		createEAttribute(tradingProposalEClass, TRADING_PROPOSAL__NAME);
		createEAttribute(tradingProposalEClass, TRADING_PROPOSAL__DESCRIPTION);
		createEAttribute(tradingProposalEClass, TRADING_PROPOSAL__STATUS);
		createEAttribute(tradingProposalEClass, TRADING_PROPOSAL__CREATED_AT);
		createEAttribute(tradingProposalEClass, TRADING_PROPOSAL__EXPIRES_AT);
		createEAttribute(tradingProposalEClass, TRADING_PROPOSAL__AGENT_ID);
		createEAttribute(tradingProposalEClass, TRADING_PROPOSAL__STRATEGY_NAME);
		createEAttribute(tradingProposalEClass, TRADING_PROPOSAL__CONFIDENCE);
		createEAttribute(tradingProposalEClass, TRADING_PROPOSAL__EXPECTED_RETURN);
		createEAttribute(tradingProposalEClass, TRADING_PROPOSAL__MAX_RISK);
		createEReference(tradingProposalEClass, TRADING_PROPOSAL__ORDERS);
		createEReference(tradingProposalEClass, TRADING_PROPOSAL__TARGET_ACCOUNT);
		createEReference(tradingProposalEClass, TRADING_PROPOSAL__RISK_PARAMETERS);
		createEReference(tradingProposalEClass, TRADING_PROPOSAL__EXECUTION_RESULTS);

		tradingAccountEClass = createEClass(TRADING_ACCOUNT);
		createEAttribute(tradingAccountEClass, TRADING_ACCOUNT__ACCOUNT_ID);
		createEAttribute(tradingAccountEClass, TRADING_ACCOUNT__ALIAS);
		createEAttribute(tradingAccountEClass, TRADING_ACCOUNT__ACCOUNT_TYPE);
		createEAttribute(tradingAccountEClass, TRADING_ACCOUNT__CURRENCY);
		createEAttribute(tradingAccountEClass, TRADING_ACCOUNT__IS_ACTIVE);

		riskParametersEClass = createEClass(RISK_PARAMETERS);
		createEAttribute(riskParametersEClass, RISK_PARAMETERS__MAX_POSITION_SIZE);
		createEAttribute(riskParametersEClass, RISK_PARAMETERS__STOP_LOSS_PERCENT);
		createEAttribute(riskParametersEClass, RISK_PARAMETERS__TAKE_PROFIT_PERCENT);
		createEAttribute(riskParametersEClass, RISK_PARAMETERS__MAX_DRAWDOWN);
		createEAttribute(riskParametersEClass, RISK_PARAMETERS__TRAILING_STOP_PERCENT);

		executionResultEClass = createEClass(EXECUTION_RESULT);
		createEAttribute(executionResultEClass, EXECUTION_RESULT__EXECUTION_ID);
		createEAttribute(executionResultEClass, EXECUTION_RESULT__ORDER_ID);
		createEAttribute(executionResultEClass, EXECUTION_RESULT__STATUS);
		createEAttribute(executionResultEClass, EXECUTION_RESULT__FILLED_QUANTITY);
		createEAttribute(executionResultEClass, EXECUTION_RESULT__REMAINING_QUANTITY);
		createEAttribute(executionResultEClass, EXECUTION_RESULT__AVG_FILL_PRICE);
		createEAttribute(executionResultEClass, EXECUTION_RESULT__LAST_FILL_PRICE);
		createEAttribute(executionResultEClass, EXECUTION_RESULT__COMMISSION);
		createEAttribute(executionResultEClass, EXECUTION_RESULT__REALIZED_PN_L);
		createEAttribute(executionResultEClass, EXECUTION_RESULT__EXECUTION_TIME);
		createEAttribute(executionResultEClass, EXECUTION_RESULT__EXCHANGE);
		createEAttribute(executionResultEClass, EXECUTION_RESULT__ERROR_MESSAGE);

		bracketOrderEClass = createEClass(BRACKET_ORDER);
		createEReference(bracketOrderEClass, BRACKET_ORDER__ENTRY_ORDER);
		createEReference(bracketOrderEClass, BRACKET_ORDER__PROFIT_TAKER);
		createEReference(bracketOrderEClass, BRACKET_ORDER__STOP_LOSS);

		positionEClass = createEClass(POSITION);
		createEReference(positionEClass, POSITION__CONTRACT);
		createEAttribute(positionEClass, POSITION__QUANTITY);
		createEAttribute(positionEClass, POSITION__AVG_COST);
		createEAttribute(positionEClass, POSITION__MARKET_PRICE);
		createEAttribute(positionEClass, POSITION__MARKET_VALUE);
		createEAttribute(positionEClass, POSITION__UNREALIZED_PN_L);
		createEAttribute(positionEClass, POSITION__REALIZED_PN_L);
		createEAttribute(positionEClass, POSITION__ACCOUNT_ID);

		marketDataSnapshotEClass = createEClass(MARKET_DATA_SNAPSHOT);
		createEReference(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__CONTRACT);
		createEAttribute(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__TIMESTAMP);
		createEAttribute(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__BID_PRICE);
		createEAttribute(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__BID_SIZE);
		createEAttribute(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__ASK_PRICE);
		createEAttribute(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__ASK_SIZE);
		createEAttribute(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__LAST_PRICE);
		createEAttribute(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__LAST_SIZE);
		createEAttribute(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__HIGH);
		createEAttribute(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__LOW);
		createEAttribute(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__OPEN);
		createEAttribute(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__CLOSE);
		createEAttribute(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__VOLUME);
		createEAttribute(marketDataSnapshotEClass, MARKET_DATA_SNAPSHOT__HALTED);

		// Create enums
		securityTypeEEnum = createEEnum(SECURITY_TYPE);
		orderTypeEEnum = createEEnum(ORDER_TYPE);
		orderActionEEnum = createEEnum(ORDER_ACTION);
		timeInForceEEnum = createEEnum(TIME_IN_FORCE);
		optionRightEEnum = createEEnum(OPTION_RIGHT);
		orderStatusEEnum = createEEnum(ORDER_STATUS);
		proposalStatusEEnum = createEEnum(PROPOSAL_STATUS);
		accountTypeEEnum = createEEnum(ACCOUNT_TYPE);
		triggerMethodEEnum = createEEnum(TRIGGER_METHOD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(contractEClass, Contract.class, "Contract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContract_ConId(), ecorePackage.getEInt(), "conId", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_SecType(), this.getSecurityType(), "secType", "STK", 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_Exchange(), ecorePackage.getEString(), "exchange", "SMART", 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_PrimaryExchange(), ecorePackage.getEString(), "primaryExchange", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_Currency(), ecorePackage.getEString(), "currency", "USD", 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_LocalSymbol(), ecorePackage.getEString(), "localSymbol", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_TradingClass(), ecorePackage.getEString(), "tradingClass", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_LastTradeDateOrContractMonth(), ecorePackage.getEString(), "lastTradeDateOrContractMonth", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_Strike(), ecorePackage.getEDouble(), "strike", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_Right(), this.getOptionRight(), "right", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_Multiplier(), ecorePackage.getEString(), "multiplier", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContract_IncludeExpired(), ecorePackage.getEBoolean(), "includeExpired", "false", 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_ComboLegs(), this.getComboLeg(), null, "comboLegs", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comboLegEClass, ComboLeg.class, "ComboLeg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComboLeg_ConId(), ecorePackage.getEInt(), "conId", null, 1, 1, ComboLeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComboLeg_Ratio(), ecorePackage.getEInt(), "ratio", "1", 1, 1, ComboLeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComboLeg_Action(), this.getOrderAction(), "action", null, 1, 1, ComboLeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComboLeg_Exchange(), ecorePackage.getEString(), "exchange", null, 1, 1, ComboLeg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrder_OrderId(), ecorePackage.getEInt(), "orderId", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_ClientOrderId(), ecorePackage.getEString(), "clientOrderId", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Action(), this.getOrderAction(), "action", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_TotalQuantity(), ecorePackage.getEBigDecimal(), "totalQuantity", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_OrderType(), this.getOrderType(), "orderType", "LMT", 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_LmtPrice(), ecorePackage.getEDouble(), "lmtPrice", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_AuxPrice(), ecorePackage.getEDouble(), "auxPrice", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Tif(), this.getTimeInForce(), "tif", "DAY", 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_GoodTillDate(), ecorePackage.getEString(), "goodTillDate", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_OutsideRth(), ecorePackage.getEBoolean(), "outsideRth", "false", 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_AllOrNone(), ecorePackage.getEBoolean(), "allOrNone", "false", 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_Transmit(), ecorePackage.getEBoolean(), "transmit", "true", 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_TriggerMethod(), this.getTriggerMethod(), "triggerMethod", "DEFAULT", 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_TrailingPercent(), ecorePackage.getEDouble(), "trailingPercent", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_DisplaySize(), ecorePackage.getEInt(), "displaySize", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_ParentId(), ecorePackage.getEInt(), "parentId", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_OcaGroup(), ecorePackage.getEString(), "ocaGroup", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_OrderRef(), ecorePackage.getEString(), "orderRef", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_UseAdaptive(), ecorePackage.getEBoolean(), "useAdaptive", "false", 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrder_CashQty(), ecorePackage.getEDouble(), "cashQty", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_Contract(), this.getContract(), null, "contract", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrder_AlgoParams(), this.getAlgoParams(), null, "algoParams", null, 0, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(algoParamsEClass, AlgoParams.class, "AlgoParams", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlgoParams_AlgoStrategy(), ecorePackage.getEString(), "algoStrategy", null, 0, 1, AlgoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgoParams_StartTime(), ecorePackage.getEString(), "startTime", null, 0, 1, AlgoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgoParams_EndTime(), ecorePackage.getEString(), "endTime", null, 0, 1, AlgoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgoParams_AllowPastEndTime(), ecorePackage.getEBoolean(), "allowPastEndTime", "false", 0, 1, AlgoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgoParams_MaxPctVol(), ecorePackage.getEDouble(), "maxPctVol", null, 0, 1, AlgoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgoParams_NoTakeLiq(), ecorePackage.getEBoolean(), "noTakeLiq", "false", 0, 1, AlgoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgoParams_AdaptivePriority(), ecorePackage.getEString(), "adaptivePriority", null, 0, 1, AlgoParams.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tradingProposalEClass, TradingProposal.class, "TradingProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTradingProposal_Id(), ecorePackage.getEString(), "id", null, 1, 1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingProposal_Name(), ecorePackage.getEString(), "name", null, 0, 1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingProposal_Description(), ecorePackage.getEString(), "description", null, 0, 1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingProposal_Status(), this.getProposalStatus(), "status", "DRAFT", 0, 1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingProposal_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingProposal_ExpiresAt(), ecorePackage.getEDate(), "expiresAt", null, 0, 1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingProposal_AgentId(), ecorePackage.getEString(), "agentId", null, 0, 1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingProposal_StrategyName(), ecorePackage.getEString(), "strategyName", null, 0, 1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingProposal_Confidence(), ecorePackage.getEDouble(), "confidence", null, 0, 1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingProposal_ExpectedReturn(), ecorePackage.getEDouble(), "expectedReturn", null, 0, 1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingProposal_MaxRisk(), ecorePackage.getEDouble(), "maxRisk", null, 0, 1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTradingProposal_Orders(), this.getOrder(), null, "orders", null, 1, -1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTradingProposal_TargetAccount(), this.getTradingAccount(), null, "targetAccount", null, 0, 1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTradingProposal_RiskParameters(), this.getRiskParameters(), null, "riskParameters", null, 0, 1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTradingProposal_ExecutionResults(), this.getExecutionResult(), null, "executionResults", null, 0, -1, TradingProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tradingAccountEClass, TradingAccount.class, "TradingAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTradingAccount_AccountId(), ecorePackage.getEString(), "accountId", null, 1, 1, TradingAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingAccount_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, TradingAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingAccount_AccountType(), this.getAccountType(), "accountType", "PAPER", 0, 1, TradingAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingAccount_Currency(), ecorePackage.getEString(), "currency", "USD", 0, 1, TradingAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTradingAccount_IsActive(), ecorePackage.getEBoolean(), "isActive", "true", 0, 1, TradingAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskParametersEClass, RiskParameters.class, "RiskParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskParameters_MaxPositionSize(), ecorePackage.getEDouble(), "maxPositionSize", null, 0, 1, RiskParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskParameters_StopLossPercent(), ecorePackage.getEDouble(), "stopLossPercent", null, 0, 1, RiskParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskParameters_TakeProfitPercent(), ecorePackage.getEDouble(), "takeProfitPercent", null, 0, 1, RiskParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskParameters_MaxDrawdown(), ecorePackage.getEDouble(), "maxDrawdown", null, 0, 1, RiskParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskParameters_TrailingStopPercent(), ecorePackage.getEDouble(), "trailingStopPercent", null, 0, 1, RiskParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionResultEClass, ExecutionResult.class, "ExecutionResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExecutionResult_ExecutionId(), ecorePackage.getEString(), "executionId", null, 1, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionResult_OrderId(), ecorePackage.getEInt(), "orderId", null, 1, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionResult_Status(), this.getOrderStatus(), "status", null, 0, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionResult_FilledQuantity(), ecorePackage.getEBigDecimal(), "filledQuantity", null, 0, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionResult_RemainingQuantity(), ecorePackage.getEBigDecimal(), "remainingQuantity", null, 0, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionResult_AvgFillPrice(), ecorePackage.getEDouble(), "avgFillPrice", null, 0, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionResult_LastFillPrice(), ecorePackage.getEDouble(), "lastFillPrice", null, 0, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionResult_Commission(), ecorePackage.getEDouble(), "commission", null, 0, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionResult_RealizedPnL(), ecorePackage.getEDouble(), "realizedPnL", null, 0, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionResult_ExecutionTime(), ecorePackage.getEDate(), "executionTime", null, 0, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionResult_Exchange(), ecorePackage.getEString(), "exchange", null, 0, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExecutionResult_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 0, 1, ExecutionResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bracketOrderEClass, BracketOrder.class, "BracketOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBracketOrder_EntryOrder(), this.getOrder(), null, "entryOrder", null, 1, 1, BracketOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBracketOrder_ProfitTaker(), this.getOrder(), null, "profitTaker", null, 0, 1, BracketOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBracketOrder_StopLoss(), this.getOrder(), null, "stopLoss", null, 0, 1, BracketOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPosition_Contract(), this.getContract(), null, "contract", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_Quantity(), ecorePackage.getEBigDecimal(), "quantity", null, 1, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_AvgCost(), ecorePackage.getEDouble(), "avgCost", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_MarketPrice(), ecorePackage.getEDouble(), "marketPrice", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_MarketValue(), ecorePackage.getEDouble(), "marketValue", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_UnrealizedPnL(), ecorePackage.getEDouble(), "unrealizedPnL", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_RealizedPnL(), ecorePackage.getEDouble(), "realizedPnL", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPosition_AccountId(), ecorePackage.getEString(), "accountId", null, 0, 1, Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(marketDataSnapshotEClass, MarketDataSnapshot.class, "MarketDataSnapshot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarketDataSnapshot_Contract(), this.getContract(), null, "contract", null, 1, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketDataSnapshot_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 0, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketDataSnapshot_BidPrice(), ecorePackage.getEDouble(), "bidPrice", null, 0, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketDataSnapshot_BidSize(), ecorePackage.getEInt(), "bidSize", null, 0, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketDataSnapshot_AskPrice(), ecorePackage.getEDouble(), "askPrice", null, 0, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketDataSnapshot_AskSize(), ecorePackage.getEInt(), "askSize", null, 0, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketDataSnapshot_LastPrice(), ecorePackage.getEDouble(), "lastPrice", null, 0, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketDataSnapshot_LastSize(), ecorePackage.getEInt(), "lastSize", null, 0, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketDataSnapshot_High(), ecorePackage.getEDouble(), "high", null, 0, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketDataSnapshot_Low(), ecorePackage.getEDouble(), "low", null, 0, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketDataSnapshot_Open(), ecorePackage.getEDouble(), "open", null, 0, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketDataSnapshot_Close(), ecorePackage.getEDouble(), "close", null, 0, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketDataSnapshot_Volume(), ecorePackage.getELong(), "volume", null, 0, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMarketDataSnapshot_Halted(), ecorePackage.getEBoolean(), "halted", "false", 0, 1, MarketDataSnapshot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(securityTypeEEnum, SecurityType.class, "SecurityType");
		addEEnumLiteral(securityTypeEEnum, SecurityType.STK);
		addEEnumLiteral(securityTypeEEnum, SecurityType.OPT);
		addEEnumLiteral(securityTypeEEnum, SecurityType.FUT);
		addEEnumLiteral(securityTypeEEnum, SecurityType.FOP);
		addEEnumLiteral(securityTypeEEnum, SecurityType.CFD);
		addEEnumLiteral(securityTypeEEnum, SecurityType.CASH);
		addEEnumLiteral(securityTypeEEnum, SecurityType.BOND);
		addEEnumLiteral(securityTypeEEnum, SecurityType.WAR);
		addEEnumLiteral(securityTypeEEnum, SecurityType.FUND);
		addEEnumLiteral(securityTypeEEnum, SecurityType.CRYPTO);
		addEEnumLiteral(securityTypeEEnum, SecurityType.IND);
		addEEnumLiteral(securityTypeEEnum, SecurityType.CMDTY);
		addEEnumLiteral(securityTypeEEnum, SecurityType.BAG);
		addEEnumLiteral(securityTypeEEnum, SecurityType.IOPT);

		initEEnum(orderTypeEEnum, OrderType.class, "OrderType");
		addEEnumLiteral(orderTypeEEnum, OrderType.MKT);
		addEEnumLiteral(orderTypeEEnum, OrderType.LMT);
		addEEnumLiteral(orderTypeEEnum, OrderType.STP);
		addEEnumLiteral(orderTypeEEnum, OrderType.STP_LMT);
		addEEnumLiteral(orderTypeEEnum, OrderType.MIT);
		addEEnumLiteral(orderTypeEEnum, OrderType.LIT);
		addEEnumLiteral(orderTypeEEnum, OrderType.TRAIL);
		addEEnumLiteral(orderTypeEEnum, OrderType.TRAIL_LIMIT);
		addEEnumLiteral(orderTypeEEnum, OrderType.REL);
		addEEnumLiteral(orderTypeEEnum, OrderType.MOC);
		addEEnumLiteral(orderTypeEEnum, OrderType.LOC);
		addEEnumLiteral(orderTypeEEnum, OrderType.MIDPRICE);
		addEEnumLiteral(orderTypeEEnum, OrderType.ADAPTIVE);
		addEEnumLiteral(orderTypeEEnum, OrderType.VWAP);
		addEEnumLiteral(orderTypeEEnum, OrderType.TWAP);

		initEEnum(orderActionEEnum, OrderAction.class, "OrderAction");
		addEEnumLiteral(orderActionEEnum, OrderAction.BUY);
		addEEnumLiteral(orderActionEEnum, OrderAction.SELL);

		initEEnum(timeInForceEEnum, TimeInForce.class, "TimeInForce");
		addEEnumLiteral(timeInForceEEnum, TimeInForce.DAY);
		addEEnumLiteral(timeInForceEEnum, TimeInForce.GTC);
		addEEnumLiteral(timeInForceEEnum, TimeInForce.IOC);
		addEEnumLiteral(timeInForceEEnum, TimeInForce.GTD);
		addEEnumLiteral(timeInForceEEnum, TimeInForce.OPG);
		addEEnumLiteral(timeInForceEEnum, TimeInForce.FOK);
		addEEnumLiteral(timeInForceEEnum, TimeInForce.DTC);

		initEEnum(optionRightEEnum, OptionRight.class, "OptionRight");
		addEEnumLiteral(optionRightEEnum, OptionRight.CALL);
		addEEnumLiteral(optionRightEEnum, OptionRight.PUT);

		initEEnum(orderStatusEEnum, OrderStatus.class, "OrderStatus");
		addEEnumLiteral(orderStatusEEnum, OrderStatus.PENDING_SUBMIT);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.PENDING_CANCEL);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.PRE_SUBMITTED);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.SUBMITTED);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.API_CANCELLED);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.CANCELLED);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.FILLED);
		addEEnumLiteral(orderStatusEEnum, OrderStatus.INACTIVE);

		initEEnum(proposalStatusEEnum, ProposalStatus.class, "ProposalStatus");
		addEEnumLiteral(proposalStatusEEnum, ProposalStatus.DRAFT);
		addEEnumLiteral(proposalStatusEEnum, ProposalStatus.PENDING_REVIEW);
		addEEnumLiteral(proposalStatusEEnum, ProposalStatus.APPROVED);
		addEEnumLiteral(proposalStatusEEnum, ProposalStatus.REJECTED);
		addEEnumLiteral(proposalStatusEEnum, ProposalStatus.EXECUTING);
		addEEnumLiteral(proposalStatusEEnum, ProposalStatus.EXECUTED);
		addEEnumLiteral(proposalStatusEEnum, ProposalStatus.PARTIALLY_EXECUTED);
		addEEnumLiteral(proposalStatusEEnum, ProposalStatus.FAILED);
		addEEnumLiteral(proposalStatusEEnum, ProposalStatus.EXPIRED);

		initEEnum(accountTypeEEnum, AccountType.class, "AccountType");
		addEEnumLiteral(accountTypeEEnum, AccountType.LIVE);
		addEEnumLiteral(accountTypeEEnum, AccountType.PAPER);

		initEEnum(triggerMethodEEnum, TriggerMethod.class, "TriggerMethod");
		addEEnumLiteral(triggerMethodEEnum, TriggerMethod.DEFAULT);
		addEEnumLiteral(triggerMethodEEnum, TriggerMethod.DOUBLE_BID_ASK);
		addEEnumLiteral(triggerMethodEEnum, TriggerMethod.LAST);
		addEEnumLiteral(triggerMethodEEnum, TriggerMethod.DOUBLE_LAST);
		addEEnumLiteral(triggerMethodEEnum, TriggerMethod.BID_ASK);
		addEEnumLiteral(triggerMethodEEnum, TriggerMethod.LAST_OR_BID_ASK);
		addEEnumLiteral(triggerMethodEEnum, TriggerMethod.MIDPOINT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Interactive Brokers (IBKR) Trading Model for automated trader agents.\nThis model captures the core concepts from IBKR\'s TWS API and Web API\nfor creating trading proposals that can be executed on real or paper accounts."
		   });
		addAnnotation
		  (securityTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Available security types for trading instruments"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Stock or ETF"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Option"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Future"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Futures Option"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Contract for Difference"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Forex pair"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Bond"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "Warrant"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "documentation", "Mutual Fund"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "documentation", "Cryptocurrency"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "documentation", "Index"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(11),
		   source,
		   new String[] {
			   "documentation", "Commodity"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(12),
		   source,
		   new String[] {
			   "documentation", "Combo/Spread"
		   });
		addAnnotation
		  (securityTypeEEnum.getELiterals().get(13),
		   source,
		   new String[] {
			   "documentation", "Issuer Option"
		   });
		addAnnotation
		  (orderTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Order types supported by IBKR. See https://www.interactivebrokers.com/campus/ibkr-api-page/order-types/"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Market order - executes immediately at best available price"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Limit order - executes at specified price or better"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Stop order - becomes market order when stop price is reached"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Stop limit order - becomes limit order when stop price is reached"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Market-if-Touched - becomes market order when trigger price is reached"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Limit-if-Touched - becomes limit order when trigger price is reached"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Trailing stop order"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "Trailing stop limit order"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "documentation", "Relative/Pegged-to-Primary order"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(9),
		   source,
		   new String[] {
			   "documentation", "Market-on-Close order"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(10),
		   source,
		   new String[] {
			   "documentation", "Limit-on-Close order"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(11),
		   source,
		   new String[] {
			   "documentation", "Midprice order - pegged to midpoint"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(12),
		   source,
		   new String[] {
			   "documentation", "IB Adaptive algo order"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(13),
		   source,
		   new String[] {
			   "documentation", "Volume Weighted Average Price algo"
		   });
		addAnnotation
		  (orderTypeEEnum.getELiterals().get(14),
		   source,
		   new String[] {
			   "documentation", "Time Weighted Average Price algo"
		   });
		addAnnotation
		  (orderActionEEnum,
		   source,
		   new String[] {
			   "documentation", "Side of the order - buy or sell"
		   });
		addAnnotation
		  (timeInForceEEnum,
		   source,
		   new String[] {
			   "documentation", "Time in Force - how long the order remains active"
		   });
		addAnnotation
		  (timeInForceEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Valid for the trading day only"
		   });
		addAnnotation
		  (timeInForceEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Good-Til-Cancelled - remains active until filled or cancelled"
		   });
		addAnnotation
		  (timeInForceEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Immediate-or-Cancel - fills immediately or cancels unfilled portion"
		   });
		addAnnotation
		  (timeInForceEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Good-Til-Date - remains active until specified date"
		   });
		addAnnotation
		  (timeInForceEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "At-the-Opening - executes at market open"
		   });
		addAnnotation
		  (timeInForceEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Fill-or-Kill - must be filled entirely immediately or cancelled"
		   });
		addAnnotation
		  (timeInForceEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Day-Til-Cancelled"
		   });
		addAnnotation
		  (optionRightEEnum,
		   source,
		   new String[] {
			   "documentation", "Option right - Call or Put"
		   });
		addAnnotation
		  (orderStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Status of an order in the IBKR system"
		   });
		addAnnotation
		  (orderStatusEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Order transmitted but not yet confirmed by destination"
		   });
		addAnnotation
		  (orderStatusEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Cancel request sent but not yet confirmed"
		   });
		addAnnotation
		  (orderStatusEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Simulated order accepted, waiting for trigger"
		   });
		addAnnotation
		  (orderStatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Order accepted by the system"
		   });
		addAnnotation
		  (orderStatusEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Cancelled by API client before acknowledgement"
		   });
		addAnnotation
		  (orderStatusEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Order cancelled by IB system"
		   });
		addAnnotation
		  (orderStatusEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Order completely filled"
		   });
		addAnnotation
		  (orderStatusEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "Order received but no longer active (rejected or cancelled)"
		   });
		addAnnotation
		  (proposalStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Status of a trading proposal from an agent"
		   });
		addAnnotation
		  (proposalStatusEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Proposal being created, not ready for review"
		   });
		addAnnotation
		  (proposalStatusEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Proposal submitted for human review"
		   });
		addAnnotation
		  (proposalStatusEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Proposal approved for execution"
		   });
		addAnnotation
		  (proposalStatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Proposal rejected, will not be executed"
		   });
		addAnnotation
		  (proposalStatusEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Proposal is being executed"
		   });
		addAnnotation
		  (proposalStatusEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "All orders in proposal have been executed"
		   });
		addAnnotation
		  (proposalStatusEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Some orders executed, others pending or failed"
		   });
		addAnnotation
		  (proposalStatusEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "Execution failed"
		   });
		addAnnotation
		  (proposalStatusEEnum.getELiterals().get(8),
		   source,
		   new String[] {
			   "documentation", "Proposal expired without being executed"
		   });
		addAnnotation
		  (accountTypeEEnum,
		   source,
		   new String[] {
			   "documentation", "Type of trading account"
		   });
		addAnnotation
		  (accountTypeEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Real money account"
		   });
		addAnnotation
		  (accountTypeEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Paper trading account for practice"
		   });
		addAnnotation
		  (triggerMethodEEnum,
		   source,
		   new String[] {
			   "documentation", "How simulated stop orders are triggered"
		   });
		addAnnotation
		  (triggerMethodEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Default method for instrument"
		   });
		addAnnotation
		  (triggerMethodEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Triggered on two consecutive bid/ask prices"
		   });
		addAnnotation
		  (triggerMethodEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Triggered on last traded price"
		   });
		addAnnotation
		  (triggerMethodEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Triggered on two consecutive last prices"
		   });
		addAnnotation
		  (triggerMethodEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Triggered on bid/ask price"
		   });
		addAnnotation
		  (triggerMethodEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "Triggered on last or bid/ask"
		   });
		addAnnotation
		  (triggerMethodEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "Triggered on midpoint"
		   });
		addAnnotation
		  (contractEClass,
		   source,
		   new String[] {
			   "documentation", "Represents a tradeable financial instrument in IBKR.\nA Contract uniquely identifies a security for trading, market data, and portfolio queries.\nAt minimum, requires either conId+exchange OR symbol+secType+exchange+currency."
		   });
		addAnnotation
		  (getContract_ConId(),
		   source,
		   new String[] {
			   "documentation", "IBKR\'s unique contract identifier. Use this to specify an exact contract."
		   });
		addAnnotation
		  (getContract_Symbol(),
		   source,
		   new String[] {
			   "documentation", "The ticker symbol of the underlying instrument (e.g., AAPL, IBM, EUR)"
		   });
		addAnnotation
		  (getContract_SecType(),
		   source,
		   new String[] {
			   "documentation", "The security type of the instrument"
		   });
		addAnnotation
		  (getContract_Exchange(),
		   source,
		   new String[] {
			   "documentation", "Exchange for routing. SMART enables IB SmartRouting for best execution."
		   });
		addAnnotation
		  (getContract_PrimaryExchange(),
		   source,
		   new String[] {
			   "documentation", "Primary listing exchange (e.g., NASDAQ, NYSE). Helps disambiguate contracts."
		   });
		addAnnotation
		  (getContract_Currency(),
		   source,
		   new String[] {
			   "documentation", "Currency the contract is traded in (e.g., USD, EUR, GBP)"
		   });
		addAnnotation
		  (getContract_LocalSymbol(),
		   source,
		   new String[] {
			   "documentation", "The local trading symbol on the exchange"
		   });
		addAnnotation
		  (getContract_TradingClass(),
		   source,
		   new String[] {
			   "documentation", "Trading class of the instrument (important for options)"
		   });
		addAnnotation
		  (getContract_LastTradeDateOrContractMonth(),
		   source,
		   new String[] {
			   "documentation", "For derivatives: expiration date (YYYYMMDD) or contract month (YYYYMM)"
		   });
		addAnnotation
		  (getContract_Strike(),
		   source,
		   new String[] {
			   "documentation", "For options: the strike price"
		   });
		addAnnotation
		  (getContract_Right(),
		   source,
		   new String[] {
			   "documentation", "For options: Call (C) or Put (P)"
		   });
		addAnnotation
		  (getContract_Multiplier(),
		   source,
		   new String[] {
			   "documentation", "For derivatives: contract multiplier (e.g., 100 for US equity options)"
		   });
		addAnnotation
		  (getContract_IncludeExpired(),
		   source,
		   new String[] {
			   "documentation", "Set to true to obtain historical data for expired contracts"
		   });
		addAnnotation
		  (getContract_ComboLegs(),
		   source,
		   new String[] {
			   "documentation", "Combo/Spread legs for BAG security type"
		   });
		addAnnotation
		  (comboLegEClass,
		   source,
		   new String[] {
			   "documentation", "Represents a leg in a combo/spread order"
		   });
		addAnnotation
		  (getComboLeg_ConId(),
		   source,
		   new String[] {
			   "documentation", "Contract ID of this leg"
		   });
		addAnnotation
		  (getComboLeg_Ratio(),
		   source,
		   new String[] {
			   "documentation", "Ratio of this leg relative to combo"
		   });
		addAnnotation
		  (getComboLeg_Action(),
		   source,
		   new String[] {
			   "documentation", "BUY or SELL for this leg"
		   });
		addAnnotation
		  (getComboLeg_Exchange(),
		   source,
		   new String[] {
			   "documentation", "Exchange for this leg"
		   });
		addAnnotation
		  (orderEClass,
		   source,
		   new String[] {
			   "documentation", "Represents an order to be placed with IBKR.\nOrders define the action (buy/sell), quantity, type, and execution parameters."
		   });
		addAnnotation
		  (getOrder_OrderId(),
		   source,
		   new String[] {
			   "documentation", "Unique order ID within the API client session. Assigned upon execution."
		   });
		addAnnotation
		  (getOrder_ClientOrderId(),
		   source,
		   new String[] {
			   "documentation", "Client-configurable order identifier for tracking"
		   });
		addAnnotation
		  (getOrder_Action(),
		   source,
		   new String[] {
			   "documentation", "BUY or SELL"
		   });
		addAnnotation
		  (getOrder_TotalQuantity(),
		   source,
		   new String[] {
			   "documentation", "Total number of shares/contracts to trade. Supports fractional for eligible instruments."
		   });
		addAnnotation
		  (getOrder_OrderType(),
		   source,
		   new String[] {
			   "documentation", "Type of order (MKT, LMT, STP, etc.)"
		   });
		addAnnotation
		  (getOrder_LmtPrice(),
		   source,
		   new String[] {
			   "documentation", "Limit price for LMT, STP_LMT, and TRAIL orders"
		   });
		addAnnotation
		  (getOrder_AuxPrice(),
		   source,
		   new String[] {
			   "documentation", "Stop price for STP orders, or trailing amount for TRAIL orders"
		   });
		addAnnotation
		  (getOrder_Tif(),
		   source,
		   new String[] {
			   "documentation", "Time in Force - how long the order remains active"
		   });
		addAnnotation
		  (getOrder_GoodTillDate(),
		   source,
		   new String[] {
			   "documentation", "Expiration date/time for GTD orders. Format: YYYYMMDD HH:MM:SS TMZ"
		   });
		addAnnotation
		  (getOrder_OutsideRth(),
		   source,
		   new String[] {
			   "documentation", "Allow execution outside regular trading hours"
		   });
		addAnnotation
		  (getOrder_AllOrNone(),
		   source,
		   new String[] {
			   "documentation", "Fill entire order or none of it"
		   });
		addAnnotation
		  (getOrder_Transmit(),
		   source,
		   new String[] {
			   "documentation", "If false, order is created but not transmitted to exchange"
		   });
		addAnnotation
		  (getOrder_TriggerMethod(),
		   source,
		   new String[] {
			   "documentation", "Trigger method for simulated stop orders"
		   });
		addAnnotation
		  (getOrder_TrailingPercent(),
		   source,
		   new String[] {
			   "documentation", "Trailing percentage for trailing stop orders (0-100)"
		   });
		addAnnotation
		  (getOrder_DisplaySize(),
		   source,
		   new String[] {
			   "documentation", "Visible quantity for iceberg orders"
		   });
		addAnnotation
		  (getOrder_ParentId(),
		   source,
		   new String[] {
			   "documentation", "Parent order ID for bracket orders"
		   });
		addAnnotation
		  (getOrder_OcaGroup(),
		   source,
		   new String[] {
			   "documentation", "One-Cancels-All group name"
		   });
		addAnnotation
		  (getOrder_OrderRef(),
		   source,
		   new String[] {
			   "documentation", "User-defined reference string for the order"
		   });
		addAnnotation
		  (getOrder_UseAdaptive(),
		   source,
		   new String[] {
			   "documentation", "Use IB\'s Adaptive algo for price improvement"
		   });
		addAnnotation
		  (getOrder_CashQty(),
		   source,
		   new String[] {
			   "documentation", "Cash quantity for cash-based orders instead of share quantity"
		   });
		addAnnotation
		  (getOrder_Contract(),
		   source,
		   new String[] {
			   "documentation", "The contract/instrument to trade"
		   });
		addAnnotation
		  (getOrder_AlgoParams(),
		   source,
		   new String[] {
			   "documentation", "Algorithm parameters for algo orders"
		   });
		addAnnotation
		  (algoParamsEClass,
		   source,
		   new String[] {
			   "documentation", "Parameters for algorithmic orders (VWAP, TWAP, Adaptive, etc.)"
		   });
		addAnnotation
		  (getAlgoParams_AlgoStrategy(),
		   source,
		   new String[] {
			   "documentation", "Algo strategy name (e.g., Adaptive, Vwap, Twap)"
		   });
		addAnnotation
		  (getAlgoParams_StartTime(),
		   source,
		   new String[] {
			   "documentation", "Start time for VWAP/TWAP orders"
		   });
		addAnnotation
		  (getAlgoParams_EndTime(),
		   source,
		   new String[] {
			   "documentation", "End time for VWAP/TWAP orders"
		   });
		addAnnotation
		  (getAlgoParams_AllowPastEndTime(),
		   source,
		   new String[] {
			   "documentation", "Allow algo to continue past end time"
		   });
		addAnnotation
		  (getAlgoParams_MaxPctVol(),
		   source,
		   new String[] {
			   "documentation", "Maximum percentage of average daily volume"
		   });
		addAnnotation
		  (getAlgoParams_NoTakeLiq(),
		   source,
		   new String[] {
			   "documentation", "Do not remove liquidity"
		   });
		addAnnotation
		  (getAlgoParams_AdaptivePriority(),
		   source,
		   new String[] {
			   "documentation", "Priority for Adaptive algo: Urgent, Normal, Patient"
		   });
		addAnnotation
		  (tradingProposalEClass,
		   source,
		   new String[] {
			   "documentation", "A trading proposal created by a trader agent.\nContains one or more orders to be reviewed and potentially executed."
		   });
		addAnnotation
		  (getTradingProposal_Id(),
		   source,
		   new String[] {
			   "documentation", "Unique identifier for this proposal"
		   });
		addAnnotation
		  (getTradingProposal_Name(),
		   source,
		   new String[] {
			   "documentation", "Human-readable name for the proposal"
		   });
		addAnnotation
		  (getTradingProposal_Description(),
		   source,
		   new String[] {
			   "documentation", "Detailed description of the trading rationale"
		   });
		addAnnotation
		  (getTradingProposal_Status(),
		   source,
		   new String[] {
			   "documentation", "Current status of the proposal"
		   });
		addAnnotation
		  (getTradingProposal_CreatedAt(),
		   source,
		   new String[] {
			   "documentation", "Timestamp when proposal was created"
		   });
		addAnnotation
		  (getTradingProposal_ExpiresAt(),
		   source,
		   new String[] {
			   "documentation", "Timestamp when proposal expires if not executed"
		   });
		addAnnotation
		  (getTradingProposal_AgentId(),
		   source,
		   new String[] {
			   "documentation", "Identifier of the trader agent that created this proposal"
		   });
		addAnnotation
		  (getTradingProposal_StrategyName(),
		   source,
		   new String[] {
			   "documentation", "Name of the trading strategy that generated this proposal"
		   });
		addAnnotation
		  (getTradingProposal_Confidence(),
		   source,
		   new String[] {
			   "documentation", "Agent\'s confidence level in this proposal (0.0-1.0)"
		   });
		addAnnotation
		  (getTradingProposal_ExpectedReturn(),
		   source,
		   new String[] {
			   "documentation", "Expected return as a percentage"
		   });
		addAnnotation
		  (getTradingProposal_MaxRisk(),
		   source,
		   new String[] {
			   "documentation", "Maximum risk/drawdown as a percentage"
		   });
		addAnnotation
		  (getTradingProposal_Orders(),
		   source,
		   new String[] {
			   "documentation", "Orders included in this proposal"
		   });
		addAnnotation
		  (getTradingProposal_TargetAccount(),
		   source,
		   new String[] {
			   "documentation", "Target account for execution"
		   });
		addAnnotation
		  (getTradingProposal_RiskParameters(),
		   source,
		   new String[] {
			   "documentation", "Risk management parameters for this proposal"
		   });
		addAnnotation
		  (getTradingProposal_ExecutionResults(),
		   source,
		   new String[] {
			   "documentation", "Execution results after orders are placed"
		   });
		addAnnotation
		  (tradingAccountEClass,
		   source,
		   new String[] {
			   "documentation", "Represents an IBKR trading account"
		   });
		addAnnotation
		  (getTradingAccount_AccountId(),
		   source,
		   new String[] {
			   "documentation", "IBKR account identifier (e.g., U1234567, DU123456 for paper)"
		   });
		addAnnotation
		  (getTradingAccount_Alias(),
		   source,
		   new String[] {
			   "documentation", "User-friendly name for the account"
		   });
		addAnnotation
		  (getTradingAccount_AccountType(),
		   source,
		   new String[] {
			   "documentation", "Type of account (LIVE or PAPER)"
		   });
		addAnnotation
		  (getTradingAccount_Currency(),
		   source,
		   new String[] {
			   "documentation", "Base currency of the account"
		   });
		addAnnotation
		  (getTradingAccount_IsActive(),
		   source,
		   new String[] {
			   "documentation", "Whether the account is currently active for trading"
		   });
		addAnnotation
		  (riskParametersEClass,
		   source,
		   new String[] {
			   "documentation", "Risk management parameters for a trading proposal"
		   });
		addAnnotation
		  (getRiskParameters_MaxPositionSize(),
		   source,
		   new String[] {
			   "documentation", "Maximum position size as percentage of portfolio"
		   });
		addAnnotation
		  (getRiskParameters_StopLossPercent(),
		   source,
		   new String[] {
			   "documentation", "Stop loss level as percentage from entry"
		   });
		addAnnotation
		  (getRiskParameters_TakeProfitPercent(),
		   source,
		   new String[] {
			   "documentation", "Take profit level as percentage from entry"
		   });
		addAnnotation
		  (getRiskParameters_MaxDrawdown(),
		   source,
		   new String[] {
			   "documentation", "Maximum acceptable drawdown percentage"
		   });
		addAnnotation
		  (getRiskParameters_TrailingStopPercent(),
		   source,
		   new String[] {
			   "documentation", "Trailing stop percentage if applicable"
		   });
		addAnnotation
		  (executionResultEClass,
		   source,
		   new String[] {
			   "documentation", "Result of executing an order"
		   });
		addAnnotation
		  (getExecutionResult_ExecutionId(),
		   source,
		   new String[] {
			   "documentation", "IBKR execution ID"
		   });
		addAnnotation
		  (getExecutionResult_OrderId(),
		   source,
		   new String[] {
			   "documentation", "Order ID that was executed"
		   });
		addAnnotation
		  (getExecutionResult_Status(),
		   source,
		   new String[] {
			   "documentation", "Status of the order"
		   });
		addAnnotation
		  (getExecutionResult_FilledQuantity(),
		   source,
		   new String[] {
			   "documentation", "Quantity that was filled"
		   });
		addAnnotation
		  (getExecutionResult_RemainingQuantity(),
		   source,
		   new String[] {
			   "documentation", "Quantity remaining to be filled"
		   });
		addAnnotation
		  (getExecutionResult_AvgFillPrice(),
		   source,
		   new String[] {
			   "documentation", "Average fill price across executions"
		   });
		addAnnotation
		  (getExecutionResult_LastFillPrice(),
		   source,
		   new String[] {
			   "documentation", "Price of the last fill"
		   });
		addAnnotation
		  (getExecutionResult_Commission(),
		   source,
		   new String[] {
			   "documentation", "Commission charged for this execution"
		   });
		addAnnotation
		  (getExecutionResult_RealizedPnL(),
		   source,
		   new String[] {
			   "documentation", "Realized profit/loss from this execution"
		   });
		addAnnotation
		  (getExecutionResult_ExecutionTime(),
		   source,
		   new String[] {
			   "documentation", "Time of execution"
		   });
		addAnnotation
		  (getExecutionResult_Exchange(),
		   source,
		   new String[] {
			   "documentation", "Exchange where execution occurred"
		   });
		addAnnotation
		  (getExecutionResult_ErrorMessage(),
		   source,
		   new String[] {
			   "documentation", "Error message if execution failed"
		   });
		addAnnotation
		  (bracketOrderEClass,
		   source,
		   new String[] {
			   "documentation", "A bracket order consisting of an entry order with attached profit taker and stop loss.\nWhen the entry order fills, the profit taker and stop loss become active as OCA group."
		   });
		addAnnotation
		  (getBracketOrder_EntryOrder(),
		   source,
		   new String[] {
			   "documentation", "The parent/entry order"
		   });
		addAnnotation
		  (getBracketOrder_ProfitTaker(),
		   source,
		   new String[] {
			   "documentation", "Profit taking order (limit order on opposite side)"
		   });
		addAnnotation
		  (getBracketOrder_StopLoss(),
		   source,
		   new String[] {
			   "documentation", "Stop loss order"
		   });
		addAnnotation
		  (positionEClass,
		   source,
		   new String[] {
			   "documentation", "Represents a position held in an account"
		   });
		addAnnotation
		  (getPosition_Contract(),
		   source,
		   new String[] {
			   "documentation", "The contract for this position"
		   });
		addAnnotation
		  (getPosition_Quantity(),
		   source,
		   new String[] {
			   "documentation", "Number of shares/contracts held. Negative for short positions."
		   });
		addAnnotation
		  (getPosition_AvgCost(),
		   source,
		   new String[] {
			   "documentation", "Average cost per share/contract"
		   });
		addAnnotation
		  (getPosition_MarketPrice(),
		   source,
		   new String[] {
			   "documentation", "Current market price"
		   });
		addAnnotation
		  (getPosition_MarketValue(),
		   source,
		   new String[] {
			   "documentation", "Current market value of the position"
		   });
		addAnnotation
		  (getPosition_UnrealizedPnL(),
		   source,
		   new String[] {
			   "documentation", "Unrealized profit/loss"
		   });
		addAnnotation
		  (getPosition_RealizedPnL(),
		   source,
		   new String[] {
			   "documentation", "Realized profit/loss from closed portions"
		   });
		addAnnotation
		  (getPosition_AccountId(),
		   source,
		   new String[] {
			   "documentation", "Account holding this position"
		   });
		addAnnotation
		  (marketDataSnapshotEClass,
		   source,
		   new String[] {
			   "documentation", "Snapshot of market data for a contract"
		   });
		addAnnotation
		  (getMarketDataSnapshot_Contract(),
		   source,
		   new String[] {
			   "documentation", "The contract this data is for"
		   });
		addAnnotation
		  (getMarketDataSnapshot_Timestamp(),
		   source,
		   new String[] {
			   "documentation", "Time of the snapshot"
		   });
		addAnnotation
		  (getMarketDataSnapshot_BidPrice(),
		   source,
		   new String[] {
			   "documentation", "Current bid price"
		   });
		addAnnotation
		  (getMarketDataSnapshot_BidSize(),
		   source,
		   new String[] {
			   "documentation", "Size at bid"
		   });
		addAnnotation
		  (getMarketDataSnapshot_AskPrice(),
		   source,
		   new String[] {
			   "documentation", "Current ask price"
		   });
		addAnnotation
		  (getMarketDataSnapshot_AskSize(),
		   source,
		   new String[] {
			   "documentation", "Size at ask"
		   });
		addAnnotation
		  (getMarketDataSnapshot_LastPrice(),
		   source,
		   new String[] {
			   "documentation", "Last traded price"
		   });
		addAnnotation
		  (getMarketDataSnapshot_LastSize(),
		   source,
		   new String[] {
			   "documentation", "Size of last trade"
		   });
		addAnnotation
		  (getMarketDataSnapshot_High(),
		   source,
		   new String[] {
			   "documentation", "High price for the day"
		   });
		addAnnotation
		  (getMarketDataSnapshot_Low(),
		   source,
		   new String[] {
			   "documentation", "Low price for the day"
		   });
		addAnnotation
		  (getMarketDataSnapshot_Open(),
		   source,
		   new String[] {
			   "documentation", "Opening price"
		   });
		addAnnotation
		  (getMarketDataSnapshot_Close(),
		   source,
		   new String[] {
			   "documentation", "Previous close price"
		   });
		addAnnotation
		  (getMarketDataSnapshot_Volume(),
		   source,
		   new String[] {
			   "documentation", "Trading volume for the day"
		   });
		addAnnotation
		  (getMarketDataSnapshot_Halted(),
		   source,
		   new String[] {
			   "documentation", "Whether trading is halted"
		   });
	}

} //TradingPackageImpl
