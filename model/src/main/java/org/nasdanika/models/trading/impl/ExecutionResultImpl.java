/**
 */
package org.nasdanika.models.trading.impl;

import java.math.BigDecimal;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.trading.ExecutionResult;
import org.nasdanika.models.trading.OrderStatus;
import org.nasdanika.models.trading.TradingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.impl.ExecutionResultImpl#getExecutionId <em>Execution Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ExecutionResultImpl#getOrderId <em>Order Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ExecutionResultImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ExecutionResultImpl#getFilledQuantity <em>Filled Quantity</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ExecutionResultImpl#getRemainingQuantity <em>Remaining Quantity</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ExecutionResultImpl#getAvgFillPrice <em>Avg Fill Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ExecutionResultImpl#getLastFillPrice <em>Last Fill Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ExecutionResultImpl#getCommission <em>Commission</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ExecutionResultImpl#getRealizedPnL <em>Realized Pn L</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ExecutionResultImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ExecutionResultImpl#getExchange <em>Exchange</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ExecutionResultImpl#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutionResultImpl extends MinimalEObjectImpl.Container implements ExecutionResult {
	/**
	 * The default value of the '{@link #getExecutionId() <em>Execution Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_ID_EDEFAULT = null;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final OrderStatus STATUS_EDEFAULT = OrderStatus.PENDING_SUBMIT;

	/**
	 * The default value of the '{@link #getFilledQuantity() <em>Filled Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilledQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal FILLED_QUANTITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRemainingQuantity() <em>Remaining Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal REMAINING_QUANTITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAvgFillPrice() <em>Avg Fill Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgFillPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_FILL_PRICE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getLastFillPrice() <em>Last Fill Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastFillPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double LAST_FILL_PRICE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getCommission() <em>Commission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommission()
	 * @generated
	 * @ordered
	 */
	protected static final double COMMISSION_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getRealizedPnL() <em>Realized Pn L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizedPnL()
	 * @generated
	 * @ordered
	 */
	protected static final double REALIZED_PN_L_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getExecutionTime() <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXECUTION_TIME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExchange() <em>Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchange()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCHANGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getErrorMessage() <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_MESSAGE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.EXECUTION_RESULT;
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
	public String getExecutionId() {
		return (String)eDynamicGet(TradingPackage.EXECUTION_RESULT__EXECUTION_ID, TradingPackage.Literals.EXECUTION_RESULT__EXECUTION_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionId(String newExecutionId) {
		eDynamicSet(TradingPackage.EXECUTION_RESULT__EXECUTION_ID, TradingPackage.Literals.EXECUTION_RESULT__EXECUTION_ID, newExecutionId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOrderId() {
		return (Integer)eDynamicGet(TradingPackage.EXECUTION_RESULT__ORDER_ID, TradingPackage.Literals.EXECUTION_RESULT__ORDER_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderId(int newOrderId) {
		eDynamicSet(TradingPackage.EXECUTION_RESULT__ORDER_ID, TradingPackage.Literals.EXECUTION_RESULT__ORDER_ID, newOrderId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderStatus getStatus() {
		return (OrderStatus)eDynamicGet(TradingPackage.EXECUTION_RESULT__STATUS, TradingPackage.Literals.EXECUTION_RESULT__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(OrderStatus newStatus) {
		eDynamicSet(TradingPackage.EXECUTION_RESULT__STATUS, TradingPackage.Literals.EXECUTION_RESULT__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getFilledQuantity() {
		return (BigDecimal)eDynamicGet(TradingPackage.EXECUTION_RESULT__FILLED_QUANTITY, TradingPackage.Literals.EXECUTION_RESULT__FILLED_QUANTITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilledQuantity(BigDecimal newFilledQuantity) {
		eDynamicSet(TradingPackage.EXECUTION_RESULT__FILLED_QUANTITY, TradingPackage.Literals.EXECUTION_RESULT__FILLED_QUANTITY, newFilledQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getRemainingQuantity() {
		return (BigDecimal)eDynamicGet(TradingPackage.EXECUTION_RESULT__REMAINING_QUANTITY, TradingPackage.Literals.EXECUTION_RESULT__REMAINING_QUANTITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemainingQuantity(BigDecimal newRemainingQuantity) {
		eDynamicSet(TradingPackage.EXECUTION_RESULT__REMAINING_QUANTITY, TradingPackage.Literals.EXECUTION_RESULT__REMAINING_QUANTITY, newRemainingQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAvgFillPrice() {
		return (Double)eDynamicGet(TradingPackage.EXECUTION_RESULT__AVG_FILL_PRICE, TradingPackage.Literals.EXECUTION_RESULT__AVG_FILL_PRICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvgFillPrice(double newAvgFillPrice) {
		eDynamicSet(TradingPackage.EXECUTION_RESULT__AVG_FILL_PRICE, TradingPackage.Literals.EXECUTION_RESULT__AVG_FILL_PRICE, newAvgFillPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLastFillPrice() {
		return (Double)eDynamicGet(TradingPackage.EXECUTION_RESULT__LAST_FILL_PRICE, TradingPackage.Literals.EXECUTION_RESULT__LAST_FILL_PRICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastFillPrice(double newLastFillPrice) {
		eDynamicSet(TradingPackage.EXECUTION_RESULT__LAST_FILL_PRICE, TradingPackage.Literals.EXECUTION_RESULT__LAST_FILL_PRICE, newLastFillPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCommission() {
		return (Double)eDynamicGet(TradingPackage.EXECUTION_RESULT__COMMISSION, TradingPackage.Literals.EXECUTION_RESULT__COMMISSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommission(double newCommission) {
		eDynamicSet(TradingPackage.EXECUTION_RESULT__COMMISSION, TradingPackage.Literals.EXECUTION_RESULT__COMMISSION, newCommission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRealizedPnL() {
		return (Double)eDynamicGet(TradingPackage.EXECUTION_RESULT__REALIZED_PN_L, TradingPackage.Literals.EXECUTION_RESULT__REALIZED_PN_L, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealizedPnL(double newRealizedPnL) {
		eDynamicSet(TradingPackage.EXECUTION_RESULT__REALIZED_PN_L, TradingPackage.Literals.EXECUTION_RESULT__REALIZED_PN_L, newRealizedPnL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExecutionTime() {
		return (Date)eDynamicGet(TradingPackage.EXECUTION_RESULT__EXECUTION_TIME, TradingPackage.Literals.EXECUTION_RESULT__EXECUTION_TIME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionTime(Date newExecutionTime) {
		eDynamicSet(TradingPackage.EXECUTION_RESULT__EXECUTION_TIME, TradingPackage.Literals.EXECUTION_RESULT__EXECUTION_TIME, newExecutionTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExchange() {
		return (String)eDynamicGet(TradingPackage.EXECUTION_RESULT__EXCHANGE, TradingPackage.Literals.EXECUTION_RESULT__EXCHANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExchange(String newExchange) {
		eDynamicSet(TradingPackage.EXECUTION_RESULT__EXCHANGE, TradingPackage.Literals.EXECUTION_RESULT__EXCHANGE, newExchange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErrorMessage() {
		return (String)eDynamicGet(TradingPackage.EXECUTION_RESULT__ERROR_MESSAGE, TradingPackage.Literals.EXECUTION_RESULT__ERROR_MESSAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorMessage(String newErrorMessage) {
		eDynamicSet(TradingPackage.EXECUTION_RESULT__ERROR_MESSAGE, TradingPackage.Literals.EXECUTION_RESULT__ERROR_MESSAGE, newErrorMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.EXECUTION_RESULT__EXECUTION_ID:
				return getExecutionId();
			case TradingPackage.EXECUTION_RESULT__ORDER_ID:
				return getOrderId();
			case TradingPackage.EXECUTION_RESULT__STATUS:
				return getStatus();
			case TradingPackage.EXECUTION_RESULT__FILLED_QUANTITY:
				return getFilledQuantity();
			case TradingPackage.EXECUTION_RESULT__REMAINING_QUANTITY:
				return getRemainingQuantity();
			case TradingPackage.EXECUTION_RESULT__AVG_FILL_PRICE:
				return getAvgFillPrice();
			case TradingPackage.EXECUTION_RESULT__LAST_FILL_PRICE:
				return getLastFillPrice();
			case TradingPackage.EXECUTION_RESULT__COMMISSION:
				return getCommission();
			case TradingPackage.EXECUTION_RESULT__REALIZED_PN_L:
				return getRealizedPnL();
			case TradingPackage.EXECUTION_RESULT__EXECUTION_TIME:
				return getExecutionTime();
			case TradingPackage.EXECUTION_RESULT__EXCHANGE:
				return getExchange();
			case TradingPackage.EXECUTION_RESULT__ERROR_MESSAGE:
				return getErrorMessage();
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
			case TradingPackage.EXECUTION_RESULT__EXECUTION_ID:
				setExecutionId((String)newValue);
				return;
			case TradingPackage.EXECUTION_RESULT__ORDER_ID:
				setOrderId((Integer)newValue);
				return;
			case TradingPackage.EXECUTION_RESULT__STATUS:
				setStatus((OrderStatus)newValue);
				return;
			case TradingPackage.EXECUTION_RESULT__FILLED_QUANTITY:
				setFilledQuantity((BigDecimal)newValue);
				return;
			case TradingPackage.EXECUTION_RESULT__REMAINING_QUANTITY:
				setRemainingQuantity((BigDecimal)newValue);
				return;
			case TradingPackage.EXECUTION_RESULT__AVG_FILL_PRICE:
				setAvgFillPrice((Double)newValue);
				return;
			case TradingPackage.EXECUTION_RESULT__LAST_FILL_PRICE:
				setLastFillPrice((Double)newValue);
				return;
			case TradingPackage.EXECUTION_RESULT__COMMISSION:
				setCommission((Double)newValue);
				return;
			case TradingPackage.EXECUTION_RESULT__REALIZED_PN_L:
				setRealizedPnL((Double)newValue);
				return;
			case TradingPackage.EXECUTION_RESULT__EXECUTION_TIME:
				setExecutionTime((Date)newValue);
				return;
			case TradingPackage.EXECUTION_RESULT__EXCHANGE:
				setExchange((String)newValue);
				return;
			case TradingPackage.EXECUTION_RESULT__ERROR_MESSAGE:
				setErrorMessage((String)newValue);
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
			case TradingPackage.EXECUTION_RESULT__EXECUTION_ID:
				setExecutionId(EXECUTION_ID_EDEFAULT);
				return;
			case TradingPackage.EXECUTION_RESULT__ORDER_ID:
				setOrderId(ORDER_ID_EDEFAULT);
				return;
			case TradingPackage.EXECUTION_RESULT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case TradingPackage.EXECUTION_RESULT__FILLED_QUANTITY:
				setFilledQuantity(FILLED_QUANTITY_EDEFAULT);
				return;
			case TradingPackage.EXECUTION_RESULT__REMAINING_QUANTITY:
				setRemainingQuantity(REMAINING_QUANTITY_EDEFAULT);
				return;
			case TradingPackage.EXECUTION_RESULT__AVG_FILL_PRICE:
				setAvgFillPrice(AVG_FILL_PRICE_EDEFAULT);
				return;
			case TradingPackage.EXECUTION_RESULT__LAST_FILL_PRICE:
				setLastFillPrice(LAST_FILL_PRICE_EDEFAULT);
				return;
			case TradingPackage.EXECUTION_RESULT__COMMISSION:
				setCommission(COMMISSION_EDEFAULT);
				return;
			case TradingPackage.EXECUTION_RESULT__REALIZED_PN_L:
				setRealizedPnL(REALIZED_PN_L_EDEFAULT);
				return;
			case TradingPackage.EXECUTION_RESULT__EXECUTION_TIME:
				setExecutionTime(EXECUTION_TIME_EDEFAULT);
				return;
			case TradingPackage.EXECUTION_RESULT__EXCHANGE:
				setExchange(EXCHANGE_EDEFAULT);
				return;
			case TradingPackage.EXECUTION_RESULT__ERROR_MESSAGE:
				setErrorMessage(ERROR_MESSAGE_EDEFAULT);
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
			case TradingPackage.EXECUTION_RESULT__EXECUTION_ID:
				return EXECUTION_ID_EDEFAULT == null ? getExecutionId() != null : !EXECUTION_ID_EDEFAULT.equals(getExecutionId());
			case TradingPackage.EXECUTION_RESULT__ORDER_ID:
				return getOrderId() != ORDER_ID_EDEFAULT;
			case TradingPackage.EXECUTION_RESULT__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case TradingPackage.EXECUTION_RESULT__FILLED_QUANTITY:
				return FILLED_QUANTITY_EDEFAULT == null ? getFilledQuantity() != null : !FILLED_QUANTITY_EDEFAULT.equals(getFilledQuantity());
			case TradingPackage.EXECUTION_RESULT__REMAINING_QUANTITY:
				return REMAINING_QUANTITY_EDEFAULT == null ? getRemainingQuantity() != null : !REMAINING_QUANTITY_EDEFAULT.equals(getRemainingQuantity());
			case TradingPackage.EXECUTION_RESULT__AVG_FILL_PRICE:
				return getAvgFillPrice() != AVG_FILL_PRICE_EDEFAULT;
			case TradingPackage.EXECUTION_RESULT__LAST_FILL_PRICE:
				return getLastFillPrice() != LAST_FILL_PRICE_EDEFAULT;
			case TradingPackage.EXECUTION_RESULT__COMMISSION:
				return getCommission() != COMMISSION_EDEFAULT;
			case TradingPackage.EXECUTION_RESULT__REALIZED_PN_L:
				return getRealizedPnL() != REALIZED_PN_L_EDEFAULT;
			case TradingPackage.EXECUTION_RESULT__EXECUTION_TIME:
				return EXECUTION_TIME_EDEFAULT == null ? getExecutionTime() != null : !EXECUTION_TIME_EDEFAULT.equals(getExecutionTime());
			case TradingPackage.EXECUTION_RESULT__EXCHANGE:
				return EXCHANGE_EDEFAULT == null ? getExchange() != null : !EXCHANGE_EDEFAULT.equals(getExchange());
			case TradingPackage.EXECUTION_RESULT__ERROR_MESSAGE:
				return ERROR_MESSAGE_EDEFAULT == null ? getErrorMessage() != null : !ERROR_MESSAGE_EDEFAULT.equals(getErrorMessage());
		}
		return super.eIsSet(featureID);
	}

} //ExecutionResultImpl
