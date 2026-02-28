/**
 */
package org.nasdanika.models.trading.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.trading.BracketOrder;
import org.nasdanika.models.trading.Order;
import org.nasdanika.models.trading.TradingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bracket Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.impl.BracketOrderImpl#getEntryOrder <em>Entry Order</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.BracketOrderImpl#getProfitTaker <em>Profit Taker</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.BracketOrderImpl#getStopLoss <em>Stop Loss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BracketOrderImpl extends MinimalEObjectImpl.Container implements BracketOrder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BracketOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.BRACKET_ORDER;
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
	public Order getEntryOrder() {
		return (Order)eDynamicGet(TradingPackage.BRACKET_ORDER__ENTRY_ORDER, TradingPackage.Literals.BRACKET_ORDER__ENTRY_ORDER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryOrder(Order newEntryOrder, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEntryOrder, TradingPackage.BRACKET_ORDER__ENTRY_ORDER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryOrder(Order newEntryOrder) {
		eDynamicSet(TradingPackage.BRACKET_ORDER__ENTRY_ORDER, TradingPackage.Literals.BRACKET_ORDER__ENTRY_ORDER, newEntryOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order getProfitTaker() {
		return (Order)eDynamicGet(TradingPackage.BRACKET_ORDER__PROFIT_TAKER, TradingPackage.Literals.BRACKET_ORDER__PROFIT_TAKER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProfitTaker(Order newProfitTaker, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProfitTaker, TradingPackage.BRACKET_ORDER__PROFIT_TAKER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProfitTaker(Order newProfitTaker) {
		eDynamicSet(TradingPackage.BRACKET_ORDER__PROFIT_TAKER, TradingPackage.Literals.BRACKET_ORDER__PROFIT_TAKER, newProfitTaker);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Order getStopLoss() {
		return (Order)eDynamicGet(TradingPackage.BRACKET_ORDER__STOP_LOSS, TradingPackage.Literals.BRACKET_ORDER__STOP_LOSS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopLoss(Order newStopLoss, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStopLoss, TradingPackage.BRACKET_ORDER__STOP_LOSS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopLoss(Order newStopLoss) {
		eDynamicSet(TradingPackage.BRACKET_ORDER__STOP_LOSS, TradingPackage.Literals.BRACKET_ORDER__STOP_LOSS, newStopLoss);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TradingPackage.BRACKET_ORDER__ENTRY_ORDER:
				return basicSetEntryOrder(null, msgs);
			case TradingPackage.BRACKET_ORDER__PROFIT_TAKER:
				return basicSetProfitTaker(null, msgs);
			case TradingPackage.BRACKET_ORDER__STOP_LOSS:
				return basicSetStopLoss(null, msgs);
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
			case TradingPackage.BRACKET_ORDER__ENTRY_ORDER:
				return getEntryOrder();
			case TradingPackage.BRACKET_ORDER__PROFIT_TAKER:
				return getProfitTaker();
			case TradingPackage.BRACKET_ORDER__STOP_LOSS:
				return getStopLoss();
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
			case TradingPackage.BRACKET_ORDER__ENTRY_ORDER:
				setEntryOrder((Order)newValue);
				return;
			case TradingPackage.BRACKET_ORDER__PROFIT_TAKER:
				setProfitTaker((Order)newValue);
				return;
			case TradingPackage.BRACKET_ORDER__STOP_LOSS:
				setStopLoss((Order)newValue);
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
			case TradingPackage.BRACKET_ORDER__ENTRY_ORDER:
				setEntryOrder((Order)null);
				return;
			case TradingPackage.BRACKET_ORDER__PROFIT_TAKER:
				setProfitTaker((Order)null);
				return;
			case TradingPackage.BRACKET_ORDER__STOP_LOSS:
				setStopLoss((Order)null);
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
			case TradingPackage.BRACKET_ORDER__ENTRY_ORDER:
				return getEntryOrder() != null;
			case TradingPackage.BRACKET_ORDER__PROFIT_TAKER:
				return getProfitTaker() != null;
			case TradingPackage.BRACKET_ORDER__STOP_LOSS:
				return getStopLoss() != null;
		}
		return super.eIsSet(featureID);
	}

} //BracketOrderImpl
