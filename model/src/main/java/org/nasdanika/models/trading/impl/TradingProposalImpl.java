/**
 */
package org.nasdanika.models.trading.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.trading.ExecutionResult;
import org.nasdanika.models.trading.Order;
import org.nasdanika.models.trading.ProposalStatus;
import org.nasdanika.models.trading.RiskParameters;
import org.nasdanika.models.trading.TradingAccount;
import org.nasdanika.models.trading.TradingPackage;
import org.nasdanika.models.trading.TradingProposal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proposal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getExpiresAt <em>Expires At</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getAgentId <em>Agent Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getStrategyName <em>Strategy Name</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getExpectedReturn <em>Expected Return</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getMaxRisk <em>Max Risk</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getTargetAccount <em>Target Account</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getRiskParameters <em>Risk Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingProposalImpl#getExecutionResults <em>Execution Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TradingProposalImpl extends MinimalEObjectImpl.Container implements TradingProposal {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ProposalStatus STATUS_EDEFAULT = ProposalStatus.DRAFT;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExpiresAt() <em>Expires At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiresAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRES_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAgentId() <em>Agent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentId()
	 * @generated
	 * @ordered
	 */
	protected static final String AGENT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStrategyName() <em>Strategy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategyName()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidence()
	 * @generated
	 * @ordered
	 */
	protected static final double CONFIDENCE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getExpectedReturn() <em>Expected Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedReturn()
	 * @generated
	 * @ordered
	 */
	protected static final double EXPECTED_RETURN_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMaxRisk() <em>Max Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRisk()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_RISK_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TradingProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.TRADING_PROPOSAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(TradingPackage.TRADING_PROPOSAL__ID, TradingPackage.Literals.TRADING_PROPOSAL__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(TradingPackage.TRADING_PROPOSAL__ID, TradingPackage.Literals.TRADING_PROPOSAL__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(TradingPackage.TRADING_PROPOSAL__NAME, TradingPackage.Literals.TRADING_PROPOSAL__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(TradingPackage.TRADING_PROPOSAL__NAME, TradingPackage.Literals.TRADING_PROPOSAL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(TradingPackage.TRADING_PROPOSAL__DESCRIPTION, TradingPackage.Literals.TRADING_PROPOSAL__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(TradingPackage.TRADING_PROPOSAL__DESCRIPTION, TradingPackage.Literals.TRADING_PROPOSAL__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProposalStatus getStatus() {
		return (ProposalStatus)eDynamicGet(TradingPackage.TRADING_PROPOSAL__STATUS, TradingPackage.Literals.TRADING_PROPOSAL__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ProposalStatus newStatus) {
		eDynamicSet(TradingPackage.TRADING_PROPOSAL__STATUS, TradingPackage.Literals.TRADING_PROPOSAL__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return (Date)eDynamicGet(TradingPackage.TRADING_PROPOSAL__CREATED_AT, TradingPackage.Literals.TRADING_PROPOSAL__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(TradingPackage.TRADING_PROPOSAL__CREATED_AT, TradingPackage.Literals.TRADING_PROPOSAL__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpiresAt() {
		return (Date)eDynamicGet(TradingPackage.TRADING_PROPOSAL__EXPIRES_AT, TradingPackage.Literals.TRADING_PROPOSAL__EXPIRES_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpiresAt(Date newExpiresAt) {
		eDynamicSet(TradingPackage.TRADING_PROPOSAL__EXPIRES_AT, TradingPackage.Literals.TRADING_PROPOSAL__EXPIRES_AT, newExpiresAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAgentId() {
		return (String)eDynamicGet(TradingPackage.TRADING_PROPOSAL__AGENT_ID, TradingPackage.Literals.TRADING_PROPOSAL__AGENT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAgentId(String newAgentId) {
		eDynamicSet(TradingPackage.TRADING_PROPOSAL__AGENT_ID, TradingPackage.Literals.TRADING_PROPOSAL__AGENT_ID, newAgentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrategyName() {
		return (String)eDynamicGet(TradingPackage.TRADING_PROPOSAL__STRATEGY_NAME, TradingPackage.Literals.TRADING_PROPOSAL__STRATEGY_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrategyName(String newStrategyName) {
		eDynamicSet(TradingPackage.TRADING_PROPOSAL__STRATEGY_NAME, TradingPackage.Literals.TRADING_PROPOSAL__STRATEGY_NAME, newStrategyName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getConfidence() {
		return (Double)eDynamicGet(TradingPackage.TRADING_PROPOSAL__CONFIDENCE, TradingPackage.Literals.TRADING_PROPOSAL__CONFIDENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidence(double newConfidence) {
		eDynamicSet(TradingPackage.TRADING_PROPOSAL__CONFIDENCE, TradingPackage.Literals.TRADING_PROPOSAL__CONFIDENCE, newConfidence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getExpectedReturn() {
		return (Double)eDynamicGet(TradingPackage.TRADING_PROPOSAL__EXPECTED_RETURN, TradingPackage.Literals.TRADING_PROPOSAL__EXPECTED_RETURN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpectedReturn(double newExpectedReturn) {
		eDynamicSet(TradingPackage.TRADING_PROPOSAL__EXPECTED_RETURN, TradingPackage.Literals.TRADING_PROPOSAL__EXPECTED_RETURN, newExpectedReturn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxRisk() {
		return (Double)eDynamicGet(TradingPackage.TRADING_PROPOSAL__MAX_RISK, TradingPackage.Literals.TRADING_PROPOSAL__MAX_RISK, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxRisk(double newMaxRisk) {
		eDynamicSet(TradingPackage.TRADING_PROPOSAL__MAX_RISK, TradingPackage.Literals.TRADING_PROPOSAL__MAX_RISK, newMaxRisk);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Order> getOrders() {
		return (EList<Order>)eDynamicGet(TradingPackage.TRADING_PROPOSAL__ORDERS, TradingPackage.Literals.TRADING_PROPOSAL__ORDERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TradingAccount getTargetAccount() {
		return (TradingAccount)eDynamicGet(TradingPackage.TRADING_PROPOSAL__TARGET_ACCOUNT, TradingPackage.Literals.TRADING_PROPOSAL__TARGET_ACCOUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TradingAccount basicGetTargetAccount() {
		return (TradingAccount)eDynamicGet(TradingPackage.TRADING_PROPOSAL__TARGET_ACCOUNT, TradingPackage.Literals.TRADING_PROPOSAL__TARGET_ACCOUNT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetAccount(TradingAccount newTargetAccount) {
		eDynamicSet(TradingPackage.TRADING_PROPOSAL__TARGET_ACCOUNT, TradingPackage.Literals.TRADING_PROPOSAL__TARGET_ACCOUNT, newTargetAccount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskParameters getRiskParameters() {
		return (RiskParameters)eDynamicGet(TradingPackage.TRADING_PROPOSAL__RISK_PARAMETERS, TradingPackage.Literals.TRADING_PROPOSAL__RISK_PARAMETERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRiskParameters(RiskParameters newRiskParameters, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRiskParameters, TradingPackage.TRADING_PROPOSAL__RISK_PARAMETERS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRiskParameters(RiskParameters newRiskParameters) {
		eDynamicSet(TradingPackage.TRADING_PROPOSAL__RISK_PARAMETERS, TradingPackage.Literals.TRADING_PROPOSAL__RISK_PARAMETERS, newRiskParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ExecutionResult> getExecutionResults() {
		return (EList<ExecutionResult>)eDynamicGet(TradingPackage.TRADING_PROPOSAL__EXECUTION_RESULTS, TradingPackage.Literals.TRADING_PROPOSAL__EXECUTION_RESULTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TradingPackage.TRADING_PROPOSAL__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
			case TradingPackage.TRADING_PROPOSAL__RISK_PARAMETERS:
				return basicSetRiskParameters(null, msgs);
			case TradingPackage.TRADING_PROPOSAL__EXECUTION_RESULTS:
				return ((InternalEList<?>)getExecutionResults()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.TRADING_PROPOSAL__ID:
				return getId();
			case TradingPackage.TRADING_PROPOSAL__NAME:
				return getName();
			case TradingPackage.TRADING_PROPOSAL__DESCRIPTION:
				return getDescription();
			case TradingPackage.TRADING_PROPOSAL__STATUS:
				return getStatus();
			case TradingPackage.TRADING_PROPOSAL__CREATED_AT:
				return getCreatedAt();
			case TradingPackage.TRADING_PROPOSAL__EXPIRES_AT:
				return getExpiresAt();
			case TradingPackage.TRADING_PROPOSAL__AGENT_ID:
				return getAgentId();
			case TradingPackage.TRADING_PROPOSAL__STRATEGY_NAME:
				return getStrategyName();
			case TradingPackage.TRADING_PROPOSAL__CONFIDENCE:
				return getConfidence();
			case TradingPackage.TRADING_PROPOSAL__EXPECTED_RETURN:
				return getExpectedReturn();
			case TradingPackage.TRADING_PROPOSAL__MAX_RISK:
				return getMaxRisk();
			case TradingPackage.TRADING_PROPOSAL__ORDERS:
				return getOrders();
			case TradingPackage.TRADING_PROPOSAL__TARGET_ACCOUNT:
				if (resolve) return getTargetAccount();
				return basicGetTargetAccount();
			case TradingPackage.TRADING_PROPOSAL__RISK_PARAMETERS:
				return getRiskParameters();
			case TradingPackage.TRADING_PROPOSAL__EXECUTION_RESULTS:
				return getExecutionResults();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TradingPackage.TRADING_PROPOSAL__ID:
				setId((String)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__NAME:
				setName((String)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__STATUS:
				setStatus((ProposalStatus)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__EXPIRES_AT:
				setExpiresAt((Date)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__AGENT_ID:
				setAgentId((String)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__STRATEGY_NAME:
				setStrategyName((String)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__CONFIDENCE:
				setConfidence((Double)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__EXPECTED_RETURN:
				setExpectedReturn((Double)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__MAX_RISK:
				setMaxRisk((Double)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Order>)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__TARGET_ACCOUNT:
				setTargetAccount((TradingAccount)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__RISK_PARAMETERS:
				setRiskParameters((RiskParameters)newValue);
				return;
			case TradingPackage.TRADING_PROPOSAL__EXECUTION_RESULTS:
				getExecutionResults().clear();
				getExecutionResults().addAll((Collection<? extends ExecutionResult>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TradingPackage.TRADING_PROPOSAL__ID:
				setId(ID_EDEFAULT);
				return;
			case TradingPackage.TRADING_PROPOSAL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TradingPackage.TRADING_PROPOSAL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TradingPackage.TRADING_PROPOSAL__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case TradingPackage.TRADING_PROPOSAL__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case TradingPackage.TRADING_PROPOSAL__EXPIRES_AT:
				setExpiresAt(EXPIRES_AT_EDEFAULT);
				return;
			case TradingPackage.TRADING_PROPOSAL__AGENT_ID:
				setAgentId(AGENT_ID_EDEFAULT);
				return;
			case TradingPackage.TRADING_PROPOSAL__STRATEGY_NAME:
				setStrategyName(STRATEGY_NAME_EDEFAULT);
				return;
			case TradingPackage.TRADING_PROPOSAL__CONFIDENCE:
				setConfidence(CONFIDENCE_EDEFAULT);
				return;
			case TradingPackage.TRADING_PROPOSAL__EXPECTED_RETURN:
				setExpectedReturn(EXPECTED_RETURN_EDEFAULT);
				return;
			case TradingPackage.TRADING_PROPOSAL__MAX_RISK:
				setMaxRisk(MAX_RISK_EDEFAULT);
				return;
			case TradingPackage.TRADING_PROPOSAL__ORDERS:
				getOrders().clear();
				return;
			case TradingPackage.TRADING_PROPOSAL__TARGET_ACCOUNT:
				setTargetAccount((TradingAccount)null);
				return;
			case TradingPackage.TRADING_PROPOSAL__RISK_PARAMETERS:
				setRiskParameters((RiskParameters)null);
				return;
			case TradingPackage.TRADING_PROPOSAL__EXECUTION_RESULTS:
				getExecutionResults().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TradingPackage.TRADING_PROPOSAL__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case TradingPackage.TRADING_PROPOSAL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case TradingPackage.TRADING_PROPOSAL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case TradingPackage.TRADING_PROPOSAL__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case TradingPackage.TRADING_PROPOSAL__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case TradingPackage.TRADING_PROPOSAL__EXPIRES_AT:
				return EXPIRES_AT_EDEFAULT == null ? getExpiresAt() != null : !EXPIRES_AT_EDEFAULT.equals(getExpiresAt());
			case TradingPackage.TRADING_PROPOSAL__AGENT_ID:
				return AGENT_ID_EDEFAULT == null ? getAgentId() != null : !AGENT_ID_EDEFAULT.equals(getAgentId());
			case TradingPackage.TRADING_PROPOSAL__STRATEGY_NAME:
				return STRATEGY_NAME_EDEFAULT == null ? getStrategyName() != null : !STRATEGY_NAME_EDEFAULT.equals(getStrategyName());
			case TradingPackage.TRADING_PROPOSAL__CONFIDENCE:
				return getConfidence() != CONFIDENCE_EDEFAULT;
			case TradingPackage.TRADING_PROPOSAL__EXPECTED_RETURN:
				return getExpectedReturn() != EXPECTED_RETURN_EDEFAULT;
			case TradingPackage.TRADING_PROPOSAL__MAX_RISK:
				return getMaxRisk() != MAX_RISK_EDEFAULT;
			case TradingPackage.TRADING_PROPOSAL__ORDERS:
				return !getOrders().isEmpty();
			case TradingPackage.TRADING_PROPOSAL__TARGET_ACCOUNT:
				return basicGetTargetAccount() != null;
			case TradingPackage.TRADING_PROPOSAL__RISK_PARAMETERS:
				return getRiskParameters() != null;
			case TradingPackage.TRADING_PROPOSAL__EXECUTION_RESULTS:
				return !getExecutionResults().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TradingProposalImpl
