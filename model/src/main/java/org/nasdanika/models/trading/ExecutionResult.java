/**
 */
package org.nasdanika.models.trading;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Result of executing an order
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.ExecutionResult#getExecutionId <em>Execution Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ExecutionResult#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ExecutionResult#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ExecutionResult#getFilledQuantity <em>Filled Quantity</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ExecutionResult#getRemainingQuantity <em>Remaining Quantity</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ExecutionResult#getAvgFillPrice <em>Avg Fill Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ExecutionResult#getLastFillPrice <em>Last Fill Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ExecutionResult#getCommission <em>Commission</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ExecutionResult#getRealizedPnL <em>Realized Pn L</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ExecutionResult#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ExecutionResult#getExchange <em>Exchange</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ExecutionResult#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.trading.TradingPackage#getExecutionResult()
 * @model
 * @generated
 */
public interface ExecutionResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Execution Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IBKR execution ID
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Id</em>' attribute.
	 * @see #setExecutionId(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getExecutionResult_ExecutionId()
	 * @model required="true"
	 * @generated
	 */
	String getExecutionId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ExecutionResult#getExecutionId <em>Execution Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Id</em>' attribute.
	 * @see #getExecutionId()
	 * @generated
	 */
	void setExecutionId(String value);

	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order ID that was executed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(int)
	 * @see org.nasdanika.models.trading.TradingPackage#getExecutionResult_OrderId()
	 * @model required="true"
	 * @generated
	 */
	int getOrderId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ExecutionResult#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.trading.OrderStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the order
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.trading.OrderStatus
	 * @see #setStatus(OrderStatus)
	 * @see org.nasdanika.models.trading.TradingPackage#getExecutionResult_Status()
	 * @model
	 * @generated
	 */
	OrderStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ExecutionResult#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.trading.OrderStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(OrderStatus value);

	/**
	 * Returns the value of the '<em><b>Filled Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantity that was filled
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Filled Quantity</em>' attribute.
	 * @see #setFilledQuantity(BigDecimal)
	 * @see org.nasdanika.models.trading.TradingPackage#getExecutionResult_FilledQuantity()
	 * @model
	 * @generated
	 */
	BigDecimal getFilledQuantity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ExecutionResult#getFilledQuantity <em>Filled Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filled Quantity</em>' attribute.
	 * @see #getFilledQuantity()
	 * @generated
	 */
	void setFilledQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Remaining Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantity remaining to be filled
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remaining Quantity</em>' attribute.
	 * @see #setRemainingQuantity(BigDecimal)
	 * @see org.nasdanika.models.trading.TradingPackage#getExecutionResult_RemainingQuantity()
	 * @model
	 * @generated
	 */
	BigDecimal getRemainingQuantity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ExecutionResult#getRemainingQuantity <em>Remaining Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remaining Quantity</em>' attribute.
	 * @see #getRemainingQuantity()
	 * @generated
	 */
	void setRemainingQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Avg Fill Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Average fill price across executions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Avg Fill Price</em>' attribute.
	 * @see #setAvgFillPrice(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getExecutionResult_AvgFillPrice()
	 * @model
	 * @generated
	 */
	double getAvgFillPrice();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ExecutionResult#getAvgFillPrice <em>Avg Fill Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Fill Price</em>' attribute.
	 * @see #getAvgFillPrice()
	 * @generated
	 */
	void setAvgFillPrice(double value);

	/**
	 * Returns the value of the '<em><b>Last Fill Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Price of the last fill
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Fill Price</em>' attribute.
	 * @see #setLastFillPrice(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getExecutionResult_LastFillPrice()
	 * @model
	 * @generated
	 */
	double getLastFillPrice();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ExecutionResult#getLastFillPrice <em>Last Fill Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Fill Price</em>' attribute.
	 * @see #getLastFillPrice()
	 * @generated
	 */
	void setLastFillPrice(double value);

	/**
	 * Returns the value of the '<em><b>Commission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commission charged for this execution
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commission</em>' attribute.
	 * @see #setCommission(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getExecutionResult_Commission()
	 * @model
	 * @generated
	 */
	double getCommission();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ExecutionResult#getCommission <em>Commission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commission</em>' attribute.
	 * @see #getCommission()
	 * @generated
	 */
	void setCommission(double value);

	/**
	 * Returns the value of the '<em><b>Realized Pn L</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Realized profit/loss from this execution
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realized Pn L</em>' attribute.
	 * @see #setRealizedPnL(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getExecutionResult_RealizedPnL()
	 * @model
	 * @generated
	 */
	double getRealizedPnL();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ExecutionResult#getRealizedPnL <em>Realized Pn L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realized Pn L</em>' attribute.
	 * @see #getRealizedPnL()
	 * @generated
	 */
	void setRealizedPnL(double value);

	/**
	 * Returns the value of the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time of execution
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Time</em>' attribute.
	 * @see #setExecutionTime(Date)
	 * @see org.nasdanika.models.trading.TradingPackage#getExecutionResult_ExecutionTime()
	 * @model
	 * @generated
	 */
	Date getExecutionTime();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ExecutionResult#getExecutionTime <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time</em>' attribute.
	 * @see #getExecutionTime()
	 * @generated
	 */
	void setExecutionTime(Date value);

	/**
	 * Returns the value of the '<em><b>Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exchange where execution occurred
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange</em>' attribute.
	 * @see #setExchange(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getExecutionResult_Exchange()
	 * @model
	 * @generated
	 */
	String getExchange();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ExecutionResult#getExchange <em>Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange</em>' attribute.
	 * @see #getExchange()
	 * @generated
	 */
	void setExchange(String value);

	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error message if execution failed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error Message</em>' attribute.
	 * @see #setErrorMessage(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getExecutionResult_ErrorMessage()
	 * @model
	 * @generated
	 */
	String getErrorMessage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ExecutionResult#getErrorMessage <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' attribute.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(String value);

} // ExecutionResult
