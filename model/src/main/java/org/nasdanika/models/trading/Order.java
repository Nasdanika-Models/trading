/**
 */
package org.nasdanika.models.trading;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an order to be placed with IBKR.
 * Orders define the action (buy/sell), quantity, type, and execution parameters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.Order#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getClientOrderId <em>Client Order Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getAction <em>Action</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getTotalQuantity <em>Total Quantity</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getOrderType <em>Order Type</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getLmtPrice <em>Lmt Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getAuxPrice <em>Aux Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getTif <em>Tif</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getGoodTillDate <em>Good Till Date</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#isOutsideRth <em>Outside Rth</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#isAllOrNone <em>All Or None</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#isTransmit <em>Transmit</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getTriggerMethod <em>Trigger Method</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getTrailingPercent <em>Trailing Percent</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getDisplaySize <em>Display Size</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getOcaGroup <em>Oca Group</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getOrderRef <em>Order Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#isUseAdaptive <em>Use Adaptive</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getCashQty <em>Cash Qty</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getContract <em>Contract</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Order#getAlgoParams <em>Algo Params</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.trading.TradingPackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique order ID within the API client session. Assigned upon execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Id</em>' attribute.
	 * @see #setOrderId(int)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_OrderId()
	 * @model
	 * @generated
	 */
	int getOrderId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getOrderId <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Id</em>' attribute.
	 * @see #getOrderId()
	 * @generated
	 */
	void setOrderId(int value);

	/**
	 * Returns the value of the '<em><b>Client Order Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Client-configurable order identifier for tracking
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Order Id</em>' attribute.
	 * @see #setClientOrderId(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_ClientOrderId()
	 * @model
	 * @generated
	 */
	String getClientOrderId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getClientOrderId <em>Client Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Order Id</em>' attribute.
	 * @see #getClientOrderId()
	 * @generated
	 */
	void setClientOrderId(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.trading.OrderAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BUY or SELL
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see org.nasdanika.models.trading.OrderAction
	 * @see #setAction(OrderAction)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_Action()
	 * @model required="true"
	 * @generated
	 */
	OrderAction getAction();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see org.nasdanika.models.trading.OrderAction
	 * @see #getAction()
	 * @generated
	 */
	void setAction(OrderAction value);

	/**
	 * Returns the value of the '<em><b>Total Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Total number of shares/contracts to trade. Supports fractional for eligible instruments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Total Quantity</em>' attribute.
	 * @see #setTotalQuantity(BigDecimal)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_TotalQuantity()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getTotalQuantity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getTotalQuantity <em>Total Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Quantity</em>' attribute.
	 * @see #getTotalQuantity()
	 * @generated
	 */
	void setTotalQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Order Type</b></em>' attribute.
	 * The default value is <code>"LMT"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.trading.OrderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of order (MKT, LMT, STP, etc.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Type</em>' attribute.
	 * @see org.nasdanika.models.trading.OrderType
	 * @see #setOrderType(OrderType)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_OrderType()
	 * @model default="LMT" required="true"
	 * @generated
	 */
	OrderType getOrderType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getOrderType <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Type</em>' attribute.
	 * @see org.nasdanika.models.trading.OrderType
	 * @see #getOrderType()
	 * @generated
	 */
	void setOrderType(OrderType value);

	/**
	 * Returns the value of the '<em><b>Lmt Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Limit price for LMT, STP_LMT, and TRAIL orders
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lmt Price</em>' attribute.
	 * @see #setLmtPrice(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_LmtPrice()
	 * @model
	 * @generated
	 */
	double getLmtPrice();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getLmtPrice <em>Lmt Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lmt Price</em>' attribute.
	 * @see #getLmtPrice()
	 * @generated
	 */
	void setLmtPrice(double value);

	/**
	 * Returns the value of the '<em><b>Aux Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop price for STP orders, or trailing amount for TRAIL orders
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aux Price</em>' attribute.
	 * @see #setAuxPrice(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_AuxPrice()
	 * @model
	 * @generated
	 */
	double getAuxPrice();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getAuxPrice <em>Aux Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aux Price</em>' attribute.
	 * @see #getAuxPrice()
	 * @generated
	 */
	void setAuxPrice(double value);

	/**
	 * Returns the value of the '<em><b>Tif</b></em>' attribute.
	 * The default value is <code>"DAY"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.trading.TimeInForce}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time in Force - how long the order remains active
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tif</em>' attribute.
	 * @see org.nasdanika.models.trading.TimeInForce
	 * @see #setTif(TimeInForce)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_Tif()
	 * @model default="DAY"
	 * @generated
	 */
	TimeInForce getTif();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getTif <em>Tif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tif</em>' attribute.
	 * @see org.nasdanika.models.trading.TimeInForce
	 * @see #getTif()
	 * @generated
	 */
	void setTif(TimeInForce value);

	/**
	 * Returns the value of the '<em><b>Good Till Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expiration date/time for GTD orders. Format: YYYYMMDD HH:MM:SS TMZ
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Good Till Date</em>' attribute.
	 * @see #setGoodTillDate(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_GoodTillDate()
	 * @model
	 * @generated
	 */
	String getGoodTillDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getGoodTillDate <em>Good Till Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Good Till Date</em>' attribute.
	 * @see #getGoodTillDate()
	 * @generated
	 */
	void setGoodTillDate(String value);

	/**
	 * Returns the value of the '<em><b>Outside Rth</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allow execution outside regular trading hours
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outside Rth</em>' attribute.
	 * @see #setOutsideRth(boolean)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_OutsideRth()
	 * @model default="false"
	 * @generated
	 */
	boolean isOutsideRth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#isOutsideRth <em>Outside Rth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outside Rth</em>' attribute.
	 * @see #isOutsideRth()
	 * @generated
	 */
	void setOutsideRth(boolean value);

	/**
	 * Returns the value of the '<em><b>All Or None</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fill entire order or none of it
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>All Or None</em>' attribute.
	 * @see #setAllOrNone(boolean)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_AllOrNone()
	 * @model default="false"
	 * @generated
	 */
	boolean isAllOrNone();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#isAllOrNone <em>All Or None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Or None</em>' attribute.
	 * @see #isAllOrNone()
	 * @generated
	 */
	void setAllOrNone(boolean value);

	/**
	 * Returns the value of the '<em><b>Transmit</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If false, order is created but not transmitted to exchange
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmit</em>' attribute.
	 * @see #setTransmit(boolean)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_Transmit()
	 * @model default="true"
	 * @generated
	 */
	boolean isTransmit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#isTransmit <em>Transmit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmit</em>' attribute.
	 * @see #isTransmit()
	 * @generated
	 */
	void setTransmit(boolean value);

	/**
	 * Returns the value of the '<em><b>Trigger Method</b></em>' attribute.
	 * The default value is <code>"DEFAULT"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.trading.TriggerMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trigger method for simulated stop orders
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Method</em>' attribute.
	 * @see org.nasdanika.models.trading.TriggerMethod
	 * @see #setTriggerMethod(TriggerMethod)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_TriggerMethod()
	 * @model default="DEFAULT"
	 * @generated
	 */
	TriggerMethod getTriggerMethod();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getTriggerMethod <em>Trigger Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Method</em>' attribute.
	 * @see org.nasdanika.models.trading.TriggerMethod
	 * @see #getTriggerMethod()
	 * @generated
	 */
	void setTriggerMethod(TriggerMethod value);

	/**
	 * Returns the value of the '<em><b>Trailing Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trailing percentage for trailing stop orders (0-100)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trailing Percent</em>' attribute.
	 * @see #setTrailingPercent(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_TrailingPercent()
	 * @model
	 * @generated
	 */
	double getTrailingPercent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getTrailingPercent <em>Trailing Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trailing Percent</em>' attribute.
	 * @see #getTrailingPercent()
	 * @generated
	 */
	void setTrailingPercent(double value);

	/**
	 * Returns the value of the '<em><b>Display Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Visible quantity for iceberg orders
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Size</em>' attribute.
	 * @see #setDisplaySize(int)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_DisplaySize()
	 * @model
	 * @generated
	 */
	int getDisplaySize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getDisplaySize <em>Display Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Size</em>' attribute.
	 * @see #getDisplaySize()
	 * @generated
	 */
	void setDisplaySize(int value);

	/**
	 * Returns the value of the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parent order ID for bracket orders
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Id</em>' attribute.
	 * @see #setParentId(int)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_ParentId()
	 * @model
	 * @generated
	 */
	int getParentId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getParentId <em>Parent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Id</em>' attribute.
	 * @see #getParentId()
	 * @generated
	 */
	void setParentId(int value);

	/**
	 * Returns the value of the '<em><b>Oca Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One-Cancels-All group name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oca Group</em>' attribute.
	 * @see #setOcaGroup(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_OcaGroup()
	 * @model
	 * @generated
	 */
	String getOcaGroup();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getOcaGroup <em>Oca Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oca Group</em>' attribute.
	 * @see #getOcaGroup()
	 * @generated
	 */
	void setOcaGroup(String value);

	/**
	 * Returns the value of the '<em><b>Order Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-defined reference string for the order
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Ref</em>' attribute.
	 * @see #setOrderRef(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_OrderRef()
	 * @model
	 * @generated
	 */
	String getOrderRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getOrderRef <em>Order Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Ref</em>' attribute.
	 * @see #getOrderRef()
	 * @generated
	 */
	void setOrderRef(String value);

	/**
	 * Returns the value of the '<em><b>Use Adaptive</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use IB's Adaptive algo for price improvement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Adaptive</em>' attribute.
	 * @see #setUseAdaptive(boolean)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_UseAdaptive()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseAdaptive();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#isUseAdaptive <em>Use Adaptive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Adaptive</em>' attribute.
	 * @see #isUseAdaptive()
	 * @generated
	 */
	void setUseAdaptive(boolean value);

	/**
	 * Returns the value of the '<em><b>Cash Qty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cash quantity for cash-based orders instead of share quantity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cash Qty</em>' attribute.
	 * @see #setCashQty(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_CashQty()
	 * @model
	 * @generated
	 */
	double getCashQty();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getCashQty <em>Cash Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cash Qty</em>' attribute.
	 * @see #getCashQty()
	 * @generated
	 */
	void setCashQty(double value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contract/instrument to trade
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference.
	 * @see #setContract(Contract)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_Contract()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getContract <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' containment reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Contract value);

	/**
	 * Returns the value of the '<em><b>Algo Params</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Algorithm parameters for algo orders
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algo Params</em>' containment reference.
	 * @see #setAlgoParams(AlgoParams)
	 * @see org.nasdanika.models.trading.TradingPackage#getOrder_AlgoParams()
	 * @model containment="true"
	 * @generated
	 */
	AlgoParams getAlgoParams();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Order#getAlgoParams <em>Algo Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algo Params</em>' containment reference.
	 * @see #getAlgoParams()
	 * @generated
	 */
	void setAlgoParams(AlgoParams value);

} // Order
