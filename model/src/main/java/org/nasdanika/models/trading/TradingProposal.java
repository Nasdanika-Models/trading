/**
 */
package org.nasdanika.models.trading;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A trading proposal created by a trader agent.
 * Contains one or more orders to be reviewed and potentially executed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getExpiresAt <em>Expires At</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getAgentId <em>Agent Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getStrategyName <em>Strategy Name</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getExpectedReturn <em>Expected Return</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getMaxRisk <em>Max Risk</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getOrders <em>Orders</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getTargetAccount <em>Target Account</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getRiskParameters <em>Risk Parameters</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingProposal#getExecutionResults <em>Execution Results</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal()
 * @model
 * @generated
 */
public interface TradingProposal extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for this proposal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingProposal#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable name for the proposal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingProposal#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detailed description of the trading rationale
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingProposal#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"DRAFT"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.trading.ProposalStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current status of the proposal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.trading.ProposalStatus
	 * @see #setStatus(ProposalStatus)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_Status()
	 * @model default="DRAFT"
	 * @generated
	 */
	ProposalStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingProposal#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.trading.ProposalStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ProposalStatus value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timestamp when proposal was created
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingProposal#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Expires At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timestamp when proposal expires if not executed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expires At</em>' attribute.
	 * @see #setExpiresAt(Date)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_ExpiresAt()
	 * @model
	 * @generated
	 */
	Date getExpiresAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingProposal#getExpiresAt <em>Expires At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires At</em>' attribute.
	 * @see #getExpiresAt()
	 * @generated
	 */
	void setExpiresAt(Date value);

	/**
	 * Returns the value of the '<em><b>Agent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of the trader agent that created this proposal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Agent Id</em>' attribute.
	 * @see #setAgentId(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_AgentId()
	 * @model
	 * @generated
	 */
	String getAgentId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingProposal#getAgentId <em>Agent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Id</em>' attribute.
	 * @see #getAgentId()
	 * @generated
	 */
	void setAgentId(String value);

	/**
	 * Returns the value of the '<em><b>Strategy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the trading strategy that generated this proposal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Name</em>' attribute.
	 * @see #setStrategyName(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_StrategyName()
	 * @model
	 * @generated
	 */
	String getStrategyName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingProposal#getStrategyName <em>Strategy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Name</em>' attribute.
	 * @see #getStrategyName()
	 * @generated
	 */
	void setStrategyName(String value);

	/**
	 * Returns the value of the '<em><b>Confidence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Agent's confidence level in this proposal (0.0-1.0)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidence</em>' attribute.
	 * @see #setConfidence(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_Confidence()
	 * @model
	 * @generated
	 */
	double getConfidence();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingProposal#getConfidence <em>Confidence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidence</em>' attribute.
	 * @see #getConfidence()
	 * @generated
	 */
	void setConfidence(double value);

	/**
	 * Returns the value of the '<em><b>Expected Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expected return as a percentage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Return</em>' attribute.
	 * @see #setExpectedReturn(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_ExpectedReturn()
	 * @model
	 * @generated
	 */
	double getExpectedReturn();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingProposal#getExpectedReturn <em>Expected Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Return</em>' attribute.
	 * @see #getExpectedReturn()
	 * @generated
	 */
	void setExpectedReturn(double value);

	/**
	 * Returns the value of the '<em><b>Max Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum risk/drawdown as a percentage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Risk</em>' attribute.
	 * @see #setMaxRisk(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_MaxRisk()
	 * @model
	 * @generated
	 */
	double getMaxRisk();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingProposal#getMaxRisk <em>Max Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Risk</em>' attribute.
	 * @see #getMaxRisk()
	 * @generated
	 */
	void setMaxRisk(double value);

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.trading.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Orders included in this proposal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_Orders()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Order> getOrders();

	/**
	 * Returns the value of the '<em><b>Target Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target account for execution
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Account</em>' reference.
	 * @see #setTargetAccount(TradingAccount)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_TargetAccount()
	 * @model
	 * @generated
	 */
	TradingAccount getTargetAccount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingProposal#getTargetAccount <em>Target Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Account</em>' reference.
	 * @see #getTargetAccount()
	 * @generated
	 */
	void setTargetAccount(TradingAccount value);

	/**
	 * Returns the value of the '<em><b>Risk Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risk management parameters for this proposal
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Parameters</em>' containment reference.
	 * @see #setRiskParameters(RiskParameters)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_RiskParameters()
	 * @model containment="true"
	 * @generated
	 */
	RiskParameters getRiskParameters();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingProposal#getRiskParameters <em>Risk Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Parameters</em>' containment reference.
	 * @see #getRiskParameters()
	 * @generated
	 */
	void setRiskParameters(RiskParameters value);

	/**
	 * Returns the value of the '<em><b>Execution Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.trading.ExecutionResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Execution results after orders are placed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Results</em>' containment reference list.
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingProposal_ExecutionResults()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutionResult> getExecutionResults();

} // TradingProposal
