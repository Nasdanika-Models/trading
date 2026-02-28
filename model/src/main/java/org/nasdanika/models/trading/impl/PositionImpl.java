/**
 */
package org.nasdanika.models.trading.impl;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.trading.Contract;
import org.nasdanika.models.trading.Position;
import org.nasdanika.models.trading.TradingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.impl.PositionImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.PositionImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.PositionImpl#getAvgCost <em>Avg Cost</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.PositionImpl#getMarketPrice <em>Market Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.PositionImpl#getMarketValue <em>Market Value</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.PositionImpl#getUnrealizedPnL <em>Unrealized Pn L</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.PositionImpl#getRealizedPnL <em>Realized Pn L</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.PositionImpl#getAccountId <em>Account Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends MinimalEObjectImpl.Container implements Position {
	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal QUANTITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAvgCost() <em>Avg Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgCost()
	 * @generated
	 * @ordered
	 */
	protected static final double AVG_COST_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMarketPrice() <em>Market Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double MARKET_PRICE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMarketValue() <em>Market Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MARKET_VALUE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getUnrealizedPnL() <em>Unrealized Pn L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnrealizedPnL()
	 * @generated
	 * @ordered
	 */
	protected static final double UNREALIZED_PN_L_EDEFAULT = 0.0;

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
	 * The default value of the '{@link #getAccountId() <em>Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountId()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.POSITION;
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
	public Contract getContract() {
		return (Contract)eDynamicGet(TradingPackage.POSITION__CONTRACT, TradingPackage.Literals.POSITION__CONTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContract(Contract newContract, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newContract, TradingPackage.POSITION__CONTRACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContract(Contract newContract) {
		eDynamicSet(TradingPackage.POSITION__CONTRACT, TradingPackage.Literals.POSITION__CONTRACT, newContract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getQuantity() {
		return (BigDecimal)eDynamicGet(TradingPackage.POSITION__QUANTITY, TradingPackage.Literals.POSITION__QUANTITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(BigDecimal newQuantity) {
		eDynamicSet(TradingPackage.POSITION__QUANTITY, TradingPackage.Literals.POSITION__QUANTITY, newQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAvgCost() {
		return (Double)eDynamicGet(TradingPackage.POSITION__AVG_COST, TradingPackage.Literals.POSITION__AVG_COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvgCost(double newAvgCost) {
		eDynamicSet(TradingPackage.POSITION__AVG_COST, TradingPackage.Literals.POSITION__AVG_COST, newAvgCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMarketPrice() {
		return (Double)eDynamicGet(TradingPackage.POSITION__MARKET_PRICE, TradingPackage.Literals.POSITION__MARKET_PRICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarketPrice(double newMarketPrice) {
		eDynamicSet(TradingPackage.POSITION__MARKET_PRICE, TradingPackage.Literals.POSITION__MARKET_PRICE, newMarketPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMarketValue() {
		return (Double)eDynamicGet(TradingPackage.POSITION__MARKET_VALUE, TradingPackage.Literals.POSITION__MARKET_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMarketValue(double newMarketValue) {
		eDynamicSet(TradingPackage.POSITION__MARKET_VALUE, TradingPackage.Literals.POSITION__MARKET_VALUE, newMarketValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getUnrealizedPnL() {
		return (Double)eDynamicGet(TradingPackage.POSITION__UNREALIZED_PN_L, TradingPackage.Literals.POSITION__UNREALIZED_PN_L, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnrealizedPnL(double newUnrealizedPnL) {
		eDynamicSet(TradingPackage.POSITION__UNREALIZED_PN_L, TradingPackage.Literals.POSITION__UNREALIZED_PN_L, newUnrealizedPnL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRealizedPnL() {
		return (Double)eDynamicGet(TradingPackage.POSITION__REALIZED_PN_L, TradingPackage.Literals.POSITION__REALIZED_PN_L, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealizedPnL(double newRealizedPnL) {
		eDynamicSet(TradingPackage.POSITION__REALIZED_PN_L, TradingPackage.Literals.POSITION__REALIZED_PN_L, newRealizedPnL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccountId() {
		return (String)eDynamicGet(TradingPackage.POSITION__ACCOUNT_ID, TradingPackage.Literals.POSITION__ACCOUNT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountId(String newAccountId) {
		eDynamicSet(TradingPackage.POSITION__ACCOUNT_ID, TradingPackage.Literals.POSITION__ACCOUNT_ID, newAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TradingPackage.POSITION__CONTRACT:
				return basicSetContract(null, msgs);
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
			case TradingPackage.POSITION__CONTRACT:
				return getContract();
			case TradingPackage.POSITION__QUANTITY:
				return getQuantity();
			case TradingPackage.POSITION__AVG_COST:
				return getAvgCost();
			case TradingPackage.POSITION__MARKET_PRICE:
				return getMarketPrice();
			case TradingPackage.POSITION__MARKET_VALUE:
				return getMarketValue();
			case TradingPackage.POSITION__UNREALIZED_PN_L:
				return getUnrealizedPnL();
			case TradingPackage.POSITION__REALIZED_PN_L:
				return getRealizedPnL();
			case TradingPackage.POSITION__ACCOUNT_ID:
				return getAccountId();
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
			case TradingPackage.POSITION__CONTRACT:
				setContract((Contract)newValue);
				return;
			case TradingPackage.POSITION__QUANTITY:
				setQuantity((BigDecimal)newValue);
				return;
			case TradingPackage.POSITION__AVG_COST:
				setAvgCost((Double)newValue);
				return;
			case TradingPackage.POSITION__MARKET_PRICE:
				setMarketPrice((Double)newValue);
				return;
			case TradingPackage.POSITION__MARKET_VALUE:
				setMarketValue((Double)newValue);
				return;
			case TradingPackage.POSITION__UNREALIZED_PN_L:
				setUnrealizedPnL((Double)newValue);
				return;
			case TradingPackage.POSITION__REALIZED_PN_L:
				setRealizedPnL((Double)newValue);
				return;
			case TradingPackage.POSITION__ACCOUNT_ID:
				setAccountId((String)newValue);
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
			case TradingPackage.POSITION__CONTRACT:
				setContract((Contract)null);
				return;
			case TradingPackage.POSITION__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case TradingPackage.POSITION__AVG_COST:
				setAvgCost(AVG_COST_EDEFAULT);
				return;
			case TradingPackage.POSITION__MARKET_PRICE:
				setMarketPrice(MARKET_PRICE_EDEFAULT);
				return;
			case TradingPackage.POSITION__MARKET_VALUE:
				setMarketValue(MARKET_VALUE_EDEFAULT);
				return;
			case TradingPackage.POSITION__UNREALIZED_PN_L:
				setUnrealizedPnL(UNREALIZED_PN_L_EDEFAULT);
				return;
			case TradingPackage.POSITION__REALIZED_PN_L:
				setRealizedPnL(REALIZED_PN_L_EDEFAULT);
				return;
			case TradingPackage.POSITION__ACCOUNT_ID:
				setAccountId(ACCOUNT_ID_EDEFAULT);
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
			case TradingPackage.POSITION__CONTRACT:
				return getContract() != null;
			case TradingPackage.POSITION__QUANTITY:
				return QUANTITY_EDEFAULT == null ? getQuantity() != null : !QUANTITY_EDEFAULT.equals(getQuantity());
			case TradingPackage.POSITION__AVG_COST:
				return getAvgCost() != AVG_COST_EDEFAULT;
			case TradingPackage.POSITION__MARKET_PRICE:
				return getMarketPrice() != MARKET_PRICE_EDEFAULT;
			case TradingPackage.POSITION__MARKET_VALUE:
				return getMarketValue() != MARKET_VALUE_EDEFAULT;
			case TradingPackage.POSITION__UNREALIZED_PN_L:
				return getUnrealizedPnL() != UNREALIZED_PN_L_EDEFAULT;
			case TradingPackage.POSITION__REALIZED_PN_L:
				return getRealizedPnL() != REALIZED_PN_L_EDEFAULT;
			case TradingPackage.POSITION__ACCOUNT_ID:
				return ACCOUNT_ID_EDEFAULT == null ? getAccountId() != null : !ACCOUNT_ID_EDEFAULT.equals(getAccountId());
		}
		return super.eIsSet(featureID);
	}

} //PositionImpl
