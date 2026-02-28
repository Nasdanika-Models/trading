/**
 */
package org.nasdanika.models.trading.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.trading.AlgoParams;
import org.nasdanika.models.trading.Contract;
import org.nasdanika.models.trading.Order;
import org.nasdanika.models.trading.OrderAction;
import org.nasdanika.models.trading.OrderType;
import org.nasdanika.models.trading.TimeInForce;
import org.nasdanika.models.trading.TradingPackage;
import org.nasdanika.models.trading.TriggerMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getClientOrderId <em>Client Order Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getTotalQuantity <em>Total Quantity</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getOrderType <em>Order Type</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getLmtPrice <em>Lmt Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getAuxPrice <em>Aux Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getTif <em>Tif</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getGoodTillDate <em>Good Till Date</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#isOutsideRth <em>Outside Rth</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#isAllOrNone <em>All Or None</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#isTransmit <em>Transmit</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getTriggerMethod <em>Trigger Method</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getTrailingPercent <em>Trailing Percent</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getDisplaySize <em>Display Size</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getOcaGroup <em>Oca Group</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getOrderRef <em>Order Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#isUseAdaptive <em>Use Adaptive</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getCashQty <em>Cash Qty</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.OrderImpl#getAlgoParams <em>Algo Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The default value of the '{@link #getOrderId() <em>Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final int ORDER_ID_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getClientOrderId() <em>Client Order Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientOrderId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_ORDER_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final OrderAction ACTION_EDEFAULT = OrderAction.BUY;

	/**
	 * The default value of the '{@link #getTotalQuantity() <em>Total Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TOTAL_QUANTITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrderType() <em>Order Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderType()
	 * @generated
	 * @ordered
	 */
	protected static final OrderType ORDER_TYPE_EDEFAULT = OrderType.LMT;

	/**
	 * The default value of the '{@link #getLmtPrice() <em>Lmt Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLmtPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double LMT_PRICE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getAuxPrice() <em>Aux Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuxPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double AUX_PRICE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getTif() <em>Tif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTif()
	 * @generated
	 * @ordered
	 */
	protected static final TimeInForce TIF_EDEFAULT = TimeInForce.DAY;

	/**
	 * The default value of the '{@link #getGoodTillDate() <em>Good Till Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoodTillDate()
	 * @generated
	 * @ordered
	 */
	protected static final String GOOD_TILL_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isOutsideRth() <em>Outside Rth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutsideRth()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTSIDE_RTH_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAllOrNone() <em>All Or None</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllOrNone()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_OR_NONE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isTransmit() <em>Transmit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransmit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSMIT_EDEFAULT = true;

	/**
	 * The default value of the '{@link #getTriggerMethod() <em>Trigger Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerMethod()
	 * @generated
	 * @ordered
	 */
	protected static final TriggerMethod TRIGGER_METHOD_EDEFAULT = TriggerMethod.DEFAULT;

	/**
	 * The default value of the '{@link #getTrailingPercent() <em>Trailing Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrailingPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double TRAILING_PERCENT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getDisplaySize() <em>Display Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplaySize()
	 * @generated
	 * @ordered
	 */
	protected static final int DISPLAY_SIZE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getParentId() <em>Parent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentId()
	 * @generated
	 * @ordered
	 */
	protected static final int PARENT_ID_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getOcaGroup() <em>Oca Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcaGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String OCA_GROUP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrderRef() <em>Order Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderRef()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isUseAdaptive() <em>Use Adaptive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAdaptive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ADAPTIVE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getCashQty() <em>Cash Qty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCashQty()
	 * @generated
	 * @ordered
	 */
	protected static final double CASH_QTY_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.ORDER;
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
	public int getOrderId() {
		return (Integer)eDynamicGet(TradingPackage.ORDER__ORDER_ID, TradingPackage.Literals.ORDER__ORDER_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(int newOrderId) {
		eDynamicSet(TradingPackage.ORDER__ORDER_ID, TradingPackage.Literals.ORDER__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientOrderId() {
		return (String)eDynamicGet(TradingPackage.ORDER__CLIENT_ORDER_ID, TradingPackage.Literals.ORDER__CLIENT_ORDER_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientOrderId(String newClientOrderId) {
		eDynamicSet(TradingPackage.ORDER__CLIENT_ORDER_ID, TradingPackage.Literals.ORDER__CLIENT_ORDER_ID, newClientOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderAction getAction() {
		return (OrderAction)eDynamicGet(TradingPackage.ORDER__ACTION, TradingPackage.Literals.ORDER__ACTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(OrderAction newAction) {
		eDynamicSet(TradingPackage.ORDER__ACTION, TradingPackage.Literals.ORDER__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTotalQuantity() {
		return (BigDecimal)eDynamicGet(TradingPackage.ORDER__TOTAL_QUANTITY, TradingPackage.Literals.ORDER__TOTAL_QUANTITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalQuantity(BigDecimal newTotalQuantity) {
		eDynamicSet(TradingPackage.ORDER__TOTAL_QUANTITY, TradingPackage.Literals.ORDER__TOTAL_QUANTITY, newTotalQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderType getOrderType() {
		return (OrderType)eDynamicGet(TradingPackage.ORDER__ORDER_TYPE, TradingPackage.Literals.ORDER__ORDER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderType(OrderType newOrderType) {
		eDynamicSet(TradingPackage.ORDER__ORDER_TYPE, TradingPackage.Literals.ORDER__ORDER_TYPE, newOrderType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLmtPrice() {
		return (Double)eDynamicGet(TradingPackage.ORDER__LMT_PRICE, TradingPackage.Literals.ORDER__LMT_PRICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLmtPrice(double newLmtPrice) {
		eDynamicSet(TradingPackage.ORDER__LMT_PRICE, TradingPackage.Literals.ORDER__LMT_PRICE, newLmtPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAuxPrice() {
		return (Double)eDynamicGet(TradingPackage.ORDER__AUX_PRICE, TradingPackage.Literals.ORDER__AUX_PRICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuxPrice(double newAuxPrice) {
		eDynamicSet(TradingPackage.ORDER__AUX_PRICE, TradingPackage.Literals.ORDER__AUX_PRICE, newAuxPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeInForce getTif() {
		return (TimeInForce)eDynamicGet(TradingPackage.ORDER__TIF, TradingPackage.Literals.ORDER__TIF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTif(TimeInForce newTif) {
		eDynamicSet(TradingPackage.ORDER__TIF, TradingPackage.Literals.ORDER__TIF, newTif);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGoodTillDate() {
		return (String)eDynamicGet(TradingPackage.ORDER__GOOD_TILL_DATE, TradingPackage.Literals.ORDER__GOOD_TILL_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoodTillDate(String newGoodTillDate) {
		eDynamicSet(TradingPackage.ORDER__GOOD_TILL_DATE, TradingPackage.Literals.ORDER__GOOD_TILL_DATE, newGoodTillDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOutsideRth() {
		return (Boolean)eDynamicGet(TradingPackage.ORDER__OUTSIDE_RTH, TradingPackage.Literals.ORDER__OUTSIDE_RTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutsideRth(boolean newOutsideRth) {
		eDynamicSet(TradingPackage.ORDER__OUTSIDE_RTH, TradingPackage.Literals.ORDER__OUTSIDE_RTH, newOutsideRth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllOrNone() {
		return (Boolean)eDynamicGet(TradingPackage.ORDER__ALL_OR_NONE, TradingPackage.Literals.ORDER__ALL_OR_NONE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllOrNone(boolean newAllOrNone) {
		eDynamicSet(TradingPackage.ORDER__ALL_OR_NONE, TradingPackage.Literals.ORDER__ALL_OR_NONE, newAllOrNone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTransmit() {
		return (Boolean)eDynamicGet(TradingPackage.ORDER__TRANSMIT, TradingPackage.Literals.ORDER__TRANSMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransmit(boolean newTransmit) {
		eDynamicSet(TradingPackage.ORDER__TRANSMIT, TradingPackage.Literals.ORDER__TRANSMIT, newTransmit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerMethod getTriggerMethod() {
		return (TriggerMethod)eDynamicGet(TradingPackage.ORDER__TRIGGER_METHOD, TradingPackage.Literals.ORDER__TRIGGER_METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTriggerMethod(TriggerMethod newTriggerMethod) {
		eDynamicSet(TradingPackage.ORDER__TRIGGER_METHOD, TradingPackage.Literals.ORDER__TRIGGER_METHOD, newTriggerMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTrailingPercent() {
		return (Double)eDynamicGet(TradingPackage.ORDER__TRAILING_PERCENT, TradingPackage.Literals.ORDER__TRAILING_PERCENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrailingPercent(double newTrailingPercent) {
		eDynamicSet(TradingPackage.ORDER__TRAILING_PERCENT, TradingPackage.Literals.ORDER__TRAILING_PERCENT, newTrailingPercent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDisplaySize() {
		return (Integer)eDynamicGet(TradingPackage.ORDER__DISPLAY_SIZE, TradingPackage.Literals.ORDER__DISPLAY_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplaySize(int newDisplaySize) {
		eDynamicSet(TradingPackage.ORDER__DISPLAY_SIZE, TradingPackage.Literals.ORDER__DISPLAY_SIZE, newDisplaySize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getParentId() {
		return (Integer)eDynamicGet(TradingPackage.ORDER__PARENT_ID, TradingPackage.Literals.ORDER__PARENT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentId(int newParentId) {
		eDynamicSet(TradingPackage.ORDER__PARENT_ID, TradingPackage.Literals.ORDER__PARENT_ID, newParentId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOcaGroup() {
		return (String)eDynamicGet(TradingPackage.ORDER__OCA_GROUP, TradingPackage.Literals.ORDER__OCA_GROUP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOcaGroup(String newOcaGroup) {
		eDynamicSet(TradingPackage.ORDER__OCA_GROUP, TradingPackage.Literals.ORDER__OCA_GROUP, newOcaGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderRef() {
		return (String)eDynamicGet(TradingPackage.ORDER__ORDER_REF, TradingPackage.Literals.ORDER__ORDER_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderRef(String newOrderRef) {
		eDynamicSet(TradingPackage.ORDER__ORDER_REF, TradingPackage.Literals.ORDER__ORDER_REF, newOrderRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseAdaptive() {
		return (Boolean)eDynamicGet(TradingPackage.ORDER__USE_ADAPTIVE, TradingPackage.Literals.ORDER__USE_ADAPTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseAdaptive(boolean newUseAdaptive) {
		eDynamicSet(TradingPackage.ORDER__USE_ADAPTIVE, TradingPackage.Literals.ORDER__USE_ADAPTIVE, newUseAdaptive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCashQty() {
		return (Double)eDynamicGet(TradingPackage.ORDER__CASH_QTY, TradingPackage.Literals.ORDER__CASH_QTY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCashQty(double newCashQty) {
		eDynamicSet(TradingPackage.ORDER__CASH_QTY, TradingPackage.Literals.ORDER__CASH_QTY, newCashQty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contract getContract() {
		return (Contract)eDynamicGet(TradingPackage.ORDER__CONTRACT, TradingPackage.Literals.ORDER__CONTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContract(Contract newContract, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newContract, TradingPackage.ORDER__CONTRACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContract(Contract newContract) {
		eDynamicSet(TradingPackage.ORDER__CONTRACT, TradingPackage.Literals.ORDER__CONTRACT, newContract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlgoParams getAlgoParams() {
		return (AlgoParams)eDynamicGet(TradingPackage.ORDER__ALGO_PARAMS, TradingPackage.Literals.ORDER__ALGO_PARAMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgoParams(AlgoParams newAlgoParams, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newAlgoParams, TradingPackage.ORDER__ALGO_PARAMS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgoParams(AlgoParams newAlgoParams) {
		eDynamicSet(TradingPackage.ORDER__ALGO_PARAMS, TradingPackage.Literals.ORDER__ALGO_PARAMS, newAlgoParams);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TradingPackage.ORDER__CONTRACT:
				return basicSetContract(null, msgs);
			case TradingPackage.ORDER__ALGO_PARAMS:
				return basicSetAlgoParams(null, msgs);
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
			case TradingPackage.ORDER__ORDER_ID:
				return getOrderId();
			case TradingPackage.ORDER__CLIENT_ORDER_ID:
				return getClientOrderId();
			case TradingPackage.ORDER__ACTION:
				return getAction();
			case TradingPackage.ORDER__TOTAL_QUANTITY:
				return getTotalQuantity();
			case TradingPackage.ORDER__ORDER_TYPE:
				return getOrderType();
			case TradingPackage.ORDER__LMT_PRICE:
				return getLmtPrice();
			case TradingPackage.ORDER__AUX_PRICE:
				return getAuxPrice();
			case TradingPackage.ORDER__TIF:
				return getTif();
			case TradingPackage.ORDER__GOOD_TILL_DATE:
				return getGoodTillDate();
			case TradingPackage.ORDER__OUTSIDE_RTH:
				return isOutsideRth();
			case TradingPackage.ORDER__ALL_OR_NONE:
				return isAllOrNone();
			case TradingPackage.ORDER__TRANSMIT:
				return isTransmit();
			case TradingPackage.ORDER__TRIGGER_METHOD:
				return getTriggerMethod();
			case TradingPackage.ORDER__TRAILING_PERCENT:
				return getTrailingPercent();
			case TradingPackage.ORDER__DISPLAY_SIZE:
				return getDisplaySize();
			case TradingPackage.ORDER__PARENT_ID:
				return getParentId();
			case TradingPackage.ORDER__OCA_GROUP:
				return getOcaGroup();
			case TradingPackage.ORDER__ORDER_REF:
				return getOrderRef();
			case TradingPackage.ORDER__USE_ADAPTIVE:
				return isUseAdaptive();
			case TradingPackage.ORDER__CASH_QTY:
				return getCashQty();
			case TradingPackage.ORDER__CONTRACT:
				return getContract();
			case TradingPackage.ORDER__ALGO_PARAMS:
				return getAlgoParams();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TradingPackage.ORDER__ORDER_ID:
				setOrderId((Integer)newValue);
				return;
			case TradingPackage.ORDER__CLIENT_ORDER_ID:
				setClientOrderId((String)newValue);
				return;
			case TradingPackage.ORDER__ACTION:
				setAction((OrderAction)newValue);
				return;
			case TradingPackage.ORDER__TOTAL_QUANTITY:
				setTotalQuantity((BigDecimal)newValue);
				return;
			case TradingPackage.ORDER__ORDER_TYPE:
				setOrderType((OrderType)newValue);
				return;
			case TradingPackage.ORDER__LMT_PRICE:
				setLmtPrice((Double)newValue);
				return;
			case TradingPackage.ORDER__AUX_PRICE:
				setAuxPrice((Double)newValue);
				return;
			case TradingPackage.ORDER__TIF:
				setTif((TimeInForce)newValue);
				return;
			case TradingPackage.ORDER__GOOD_TILL_DATE:
				setGoodTillDate((String)newValue);
				return;
			case TradingPackage.ORDER__OUTSIDE_RTH:
				setOutsideRth((Boolean)newValue);
				return;
			case TradingPackage.ORDER__ALL_OR_NONE:
				setAllOrNone((Boolean)newValue);
				return;
			case TradingPackage.ORDER__TRANSMIT:
				setTransmit((Boolean)newValue);
				return;
			case TradingPackage.ORDER__TRIGGER_METHOD:
				setTriggerMethod((TriggerMethod)newValue);
				return;
			case TradingPackage.ORDER__TRAILING_PERCENT:
				setTrailingPercent((Double)newValue);
				return;
			case TradingPackage.ORDER__DISPLAY_SIZE:
				setDisplaySize((Integer)newValue);
				return;
			case TradingPackage.ORDER__PARENT_ID:
				setParentId((Integer)newValue);
				return;
			case TradingPackage.ORDER__OCA_GROUP:
				setOcaGroup((String)newValue);
				return;
			case TradingPackage.ORDER__ORDER_REF:
				setOrderRef((String)newValue);
				return;
			case TradingPackage.ORDER__USE_ADAPTIVE:
				setUseAdaptive((Boolean)newValue);
				return;
			case TradingPackage.ORDER__CASH_QTY:
				setCashQty((Double)newValue);
				return;
			case TradingPackage.ORDER__CONTRACT:
				setContract((Contract)newValue);
				return;
			case TradingPackage.ORDER__ALGO_PARAMS:
				setAlgoParams((AlgoParams)newValue);
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
			case TradingPackage.ORDER__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case TradingPackage.ORDER__CLIENT_ORDER_ID:
				setClientOrderId(CLIENT_ORDER_ID_EDEFAULT);
				return;
			case TradingPackage.ORDER__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case TradingPackage.ORDER__TOTAL_QUANTITY:
				setTotalQuantity(TOTAL_QUANTITY_EDEFAULT);
				return;
			case TradingPackage.ORDER__ORDER_TYPE:
				setOrderType(ORDER_TYPE_EDEFAULT);
				return;
			case TradingPackage.ORDER__LMT_PRICE:
				setLmtPrice(LMT_PRICE_EDEFAULT);
				return;
			case TradingPackage.ORDER__AUX_PRICE:
				setAuxPrice(AUX_PRICE_EDEFAULT);
				return;
			case TradingPackage.ORDER__TIF:
				setTif(TIF_EDEFAULT);
				return;
			case TradingPackage.ORDER__GOOD_TILL_DATE:
				setGoodTillDate(GOOD_TILL_DATE_EDEFAULT);
				return;
			case TradingPackage.ORDER__OUTSIDE_RTH:
				setOutsideRth(OUTSIDE_RTH_EDEFAULT);
				return;
			case TradingPackage.ORDER__ALL_OR_NONE:
				setAllOrNone(ALL_OR_NONE_EDEFAULT);
				return;
			case TradingPackage.ORDER__TRANSMIT:
				setTransmit(TRANSMIT_EDEFAULT);
				return;
			case TradingPackage.ORDER__TRIGGER_METHOD:
				setTriggerMethod(TRIGGER_METHOD_EDEFAULT);
				return;
			case TradingPackage.ORDER__TRAILING_PERCENT:
				setTrailingPercent(TRAILING_PERCENT_EDEFAULT);
				return;
			case TradingPackage.ORDER__DISPLAY_SIZE:
				setDisplaySize(DISPLAY_SIZE_EDEFAULT);
				return;
			case TradingPackage.ORDER__PARENT_ID:
				setParentId(PARENT_ID_EDEFAULT);
				return;
			case TradingPackage.ORDER__OCA_GROUP:
				setOcaGroup(OCA_GROUP_EDEFAULT);
				return;
			case TradingPackage.ORDER__ORDER_REF:
				setOrderRef(ORDER_REF_EDEFAULT);
				return;
			case TradingPackage.ORDER__USE_ADAPTIVE:
				setUseAdaptive(USE_ADAPTIVE_EDEFAULT);
				return;
			case TradingPackage.ORDER__CASH_QTY:
				setCashQty(CASH_QTY_EDEFAULT);
				return;
			case TradingPackage.ORDER__CONTRACT:
				setContract((Contract)null);
				return;
			case TradingPackage.ORDER__ALGO_PARAMS:
				setAlgoParams((AlgoParams)null);
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
			case TradingPackage.ORDER__ORDER_ID:
				return getOrderId() != ORDER_ID_EDEFAULT;
			case TradingPackage.ORDER__CLIENT_ORDER_ID:
				return CLIENT_ORDER_ID_EDEFAULT == null ? getClientOrderId() != null : !CLIENT_ORDER_ID_EDEFAULT.equals(getClientOrderId());
			case TradingPackage.ORDER__ACTION:
				return getAction() != ACTION_EDEFAULT;
			case TradingPackage.ORDER__TOTAL_QUANTITY:
				return TOTAL_QUANTITY_EDEFAULT == null ? getTotalQuantity() != null : !TOTAL_QUANTITY_EDEFAULT.equals(getTotalQuantity());
			case TradingPackage.ORDER__ORDER_TYPE:
				return getOrderType() != ORDER_TYPE_EDEFAULT;
			case TradingPackage.ORDER__LMT_PRICE:
				return getLmtPrice() != LMT_PRICE_EDEFAULT;
			case TradingPackage.ORDER__AUX_PRICE:
				return getAuxPrice() != AUX_PRICE_EDEFAULT;
			case TradingPackage.ORDER__TIF:
				return getTif() != TIF_EDEFAULT;
			case TradingPackage.ORDER__GOOD_TILL_DATE:
				return GOOD_TILL_DATE_EDEFAULT == null ? getGoodTillDate() != null : !GOOD_TILL_DATE_EDEFAULT.equals(getGoodTillDate());
			case TradingPackage.ORDER__OUTSIDE_RTH:
				return isOutsideRth() != OUTSIDE_RTH_EDEFAULT;
			case TradingPackage.ORDER__ALL_OR_NONE:
				return isAllOrNone() != ALL_OR_NONE_EDEFAULT;
			case TradingPackage.ORDER__TRANSMIT:
				return isTransmit() != TRANSMIT_EDEFAULT;
			case TradingPackage.ORDER__TRIGGER_METHOD:
				return getTriggerMethod() != TRIGGER_METHOD_EDEFAULT;
			case TradingPackage.ORDER__TRAILING_PERCENT:
				return getTrailingPercent() != TRAILING_PERCENT_EDEFAULT;
			case TradingPackage.ORDER__DISPLAY_SIZE:
				return getDisplaySize() != DISPLAY_SIZE_EDEFAULT;
			case TradingPackage.ORDER__PARENT_ID:
				return getParentId() != PARENT_ID_EDEFAULT;
			case TradingPackage.ORDER__OCA_GROUP:
				return OCA_GROUP_EDEFAULT == null ? getOcaGroup() != null : !OCA_GROUP_EDEFAULT.equals(getOcaGroup());
			case TradingPackage.ORDER__ORDER_REF:
				return ORDER_REF_EDEFAULT == null ? getOrderRef() != null : !ORDER_REF_EDEFAULT.equals(getOrderRef());
			case TradingPackage.ORDER__USE_ADAPTIVE:
				return isUseAdaptive() != USE_ADAPTIVE_EDEFAULT;
			case TradingPackage.ORDER__CASH_QTY:
				return getCashQty() != CASH_QTY_EDEFAULT;
			case TradingPackage.ORDER__CONTRACT:
				return getContract() != null;
			case TradingPackage.ORDER__ALGO_PARAMS:
				return getAlgoParams() != null;
		}
		return super.eIsSet(featureID);
	}

} //OrderImpl
