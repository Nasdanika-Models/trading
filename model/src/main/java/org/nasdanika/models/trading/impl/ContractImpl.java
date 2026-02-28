/**
 */
package org.nasdanika.models.trading.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.trading.ComboLeg;
import org.nasdanika.models.trading.Contract;
import org.nasdanika.models.trading.OptionRight;
import org.nasdanika.models.trading.SecurityType;
import org.nasdanika.models.trading.TradingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#getConId <em>Con Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#getSecType <em>Sec Type</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#getExchange <em>Exchange</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#getPrimaryExchange <em>Primary Exchange</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#getLocalSymbol <em>Local Symbol</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#getTradingClass <em>Trading Class</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#getLastTradeDateOrContractMonth <em>Last Trade Date Or Contract Month</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#isIncludeExpired <em>Include Expired</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ContractImpl#getComboLegs <em>Combo Legs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends MinimalEObjectImpl.Container implements Contract {
	/**
	 * The default value of the '{@link #getConId() <em>Con Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConId()
	 * @generated
	 * @ordered
	 */
	protected static final int CON_ID_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSecType() <em>Sec Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecType()
	 * @generated
	 * @ordered
	 */
	protected static final SecurityType SEC_TYPE_EDEFAULT = SecurityType.STK;

	/**
	 * The default value of the '{@link #getExchange() <em>Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchange()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCHANGE_EDEFAULT = "SMART";

	/**
	 * The default value of the '{@link #getPrimaryExchange() <em>Primary Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryExchange()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMARY_EXCHANGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCurrency() <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrency()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENCY_EDEFAULT = "USD";

	/**
	 * The default value of the '{@link #getLocalSymbol() <em>Local Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_SYMBOL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTradingClass() <em>Trading Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTradingClass()
	 * @generated
	 * @ordered
	 */
	protected static final String TRADING_CLASS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLastTradeDateOrContractMonth() <em>Last Trade Date Or Contract Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastTradeDateOrContractMonth()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_TRADE_DATE_OR_CONTRACT_MONTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStrike() <em>Strike</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrike()
	 * @generated
	 * @ordered
	 */
	protected static final double STRIKE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected static final OptionRight RIGHT_EDEFAULT = OptionRight.CALL;

	/**
	 * The default value of the '{@link #getMultiplier() <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplier()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLIER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isIncludeExpired() <em>Include Expired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeExpired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_EXPIRED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.CONTRACT;
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
	public int getConId() {
		return (Integer)eDynamicGet(TradingPackage.CONTRACT__CON_ID, TradingPackage.Literals.CONTRACT__CON_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConId(int newConId) {
		eDynamicSet(TradingPackage.CONTRACT__CON_ID, TradingPackage.Literals.CONTRACT__CON_ID, newConId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbol() {
		return (String)eDynamicGet(TradingPackage.CONTRACT__SYMBOL, TradingPackage.Literals.CONTRACT__SYMBOL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(String newSymbol) {
		eDynamicSet(TradingPackage.CONTRACT__SYMBOL, TradingPackage.Literals.CONTRACT__SYMBOL, newSymbol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityType getSecType() {
		return (SecurityType)eDynamicGet(TradingPackage.CONTRACT__SEC_TYPE, TradingPackage.Literals.CONTRACT__SEC_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecType(SecurityType newSecType) {
		eDynamicSet(TradingPackage.CONTRACT__SEC_TYPE, TradingPackage.Literals.CONTRACT__SEC_TYPE, newSecType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExchange() {
		return (String)eDynamicGet(TradingPackage.CONTRACT__EXCHANGE, TradingPackage.Literals.CONTRACT__EXCHANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExchange(String newExchange) {
		eDynamicSet(TradingPackage.CONTRACT__EXCHANGE, TradingPackage.Literals.CONTRACT__EXCHANGE, newExchange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimaryExchange() {
		return (String)eDynamicGet(TradingPackage.CONTRACT__PRIMARY_EXCHANGE, TradingPackage.Literals.CONTRACT__PRIMARY_EXCHANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryExchange(String newPrimaryExchange) {
		eDynamicSet(TradingPackage.CONTRACT__PRIMARY_EXCHANGE, TradingPackage.Literals.CONTRACT__PRIMARY_EXCHANGE, newPrimaryExchange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrency() {
		return (String)eDynamicGet(TradingPackage.CONTRACT__CURRENCY, TradingPackage.Literals.CONTRACT__CURRENCY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrency(String newCurrency) {
		eDynamicSet(TradingPackage.CONTRACT__CURRENCY, TradingPackage.Literals.CONTRACT__CURRENCY, newCurrency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalSymbol() {
		return (String)eDynamicGet(TradingPackage.CONTRACT__LOCAL_SYMBOL, TradingPackage.Literals.CONTRACT__LOCAL_SYMBOL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalSymbol(String newLocalSymbol) {
		eDynamicSet(TradingPackage.CONTRACT__LOCAL_SYMBOL, TradingPackage.Literals.CONTRACT__LOCAL_SYMBOL, newLocalSymbol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTradingClass() {
		return (String)eDynamicGet(TradingPackage.CONTRACT__TRADING_CLASS, TradingPackage.Literals.CONTRACT__TRADING_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTradingClass(String newTradingClass) {
		eDynamicSet(TradingPackage.CONTRACT__TRADING_CLASS, TradingPackage.Literals.CONTRACT__TRADING_CLASS, newTradingClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastTradeDateOrContractMonth() {
		return (String)eDynamicGet(TradingPackage.CONTRACT__LAST_TRADE_DATE_OR_CONTRACT_MONTH, TradingPackage.Literals.CONTRACT__LAST_TRADE_DATE_OR_CONTRACT_MONTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastTradeDateOrContractMonth(String newLastTradeDateOrContractMonth) {
		eDynamicSet(TradingPackage.CONTRACT__LAST_TRADE_DATE_OR_CONTRACT_MONTH, TradingPackage.Literals.CONTRACT__LAST_TRADE_DATE_OR_CONTRACT_MONTH, newLastTradeDateOrContractMonth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getStrike() {
		return (Double)eDynamicGet(TradingPackage.CONTRACT__STRIKE, TradingPackage.Literals.CONTRACT__STRIKE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrike(double newStrike) {
		eDynamicSet(TradingPackage.CONTRACT__STRIKE, TradingPackage.Literals.CONTRACT__STRIKE, newStrike);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionRight getRight() {
		return (OptionRight)eDynamicGet(TradingPackage.CONTRACT__RIGHT, TradingPackage.Literals.CONTRACT__RIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRight(OptionRight newRight) {
		eDynamicSet(TradingPackage.CONTRACT__RIGHT, TradingPackage.Literals.CONTRACT__RIGHT, newRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMultiplier() {
		return (String)eDynamicGet(TradingPackage.CONTRACT__MULTIPLIER, TradingPackage.Literals.CONTRACT__MULTIPLIER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplier(String newMultiplier) {
		eDynamicSet(TradingPackage.CONTRACT__MULTIPLIER, TradingPackage.Literals.CONTRACT__MULTIPLIER, newMultiplier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIncludeExpired() {
		return (Boolean)eDynamicGet(TradingPackage.CONTRACT__INCLUDE_EXPIRED, TradingPackage.Literals.CONTRACT__INCLUDE_EXPIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludeExpired(boolean newIncludeExpired) {
		eDynamicSet(TradingPackage.CONTRACT__INCLUDE_EXPIRED, TradingPackage.Literals.CONTRACT__INCLUDE_EXPIRED, newIncludeExpired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ComboLeg> getComboLegs() {
		return (EList<ComboLeg>)eDynamicGet(TradingPackage.CONTRACT__COMBO_LEGS, TradingPackage.Literals.CONTRACT__COMBO_LEGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TradingPackage.CONTRACT__COMBO_LEGS:
				return ((InternalEList<?>)getComboLegs()).basicRemove(otherEnd, msgs);
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
			case TradingPackage.CONTRACT__CON_ID:
				return getConId();
			case TradingPackage.CONTRACT__SYMBOL:
				return getSymbol();
			case TradingPackage.CONTRACT__SEC_TYPE:
				return getSecType();
			case TradingPackage.CONTRACT__EXCHANGE:
				return getExchange();
			case TradingPackage.CONTRACT__PRIMARY_EXCHANGE:
				return getPrimaryExchange();
			case TradingPackage.CONTRACT__CURRENCY:
				return getCurrency();
			case TradingPackage.CONTRACT__LOCAL_SYMBOL:
				return getLocalSymbol();
			case TradingPackage.CONTRACT__TRADING_CLASS:
				return getTradingClass();
			case TradingPackage.CONTRACT__LAST_TRADE_DATE_OR_CONTRACT_MONTH:
				return getLastTradeDateOrContractMonth();
			case TradingPackage.CONTRACT__STRIKE:
				return getStrike();
			case TradingPackage.CONTRACT__RIGHT:
				return getRight();
			case TradingPackage.CONTRACT__MULTIPLIER:
				return getMultiplier();
			case TradingPackage.CONTRACT__INCLUDE_EXPIRED:
				return isIncludeExpired();
			case TradingPackage.CONTRACT__COMBO_LEGS:
				return getComboLegs();
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
			case TradingPackage.CONTRACT__CON_ID:
				setConId((Integer)newValue);
				return;
			case TradingPackage.CONTRACT__SYMBOL:
				setSymbol((String)newValue);
				return;
			case TradingPackage.CONTRACT__SEC_TYPE:
				setSecType((SecurityType)newValue);
				return;
			case TradingPackage.CONTRACT__EXCHANGE:
				setExchange((String)newValue);
				return;
			case TradingPackage.CONTRACT__PRIMARY_EXCHANGE:
				setPrimaryExchange((String)newValue);
				return;
			case TradingPackage.CONTRACT__CURRENCY:
				setCurrency((String)newValue);
				return;
			case TradingPackage.CONTRACT__LOCAL_SYMBOL:
				setLocalSymbol((String)newValue);
				return;
			case TradingPackage.CONTRACT__TRADING_CLASS:
				setTradingClass((String)newValue);
				return;
			case TradingPackage.CONTRACT__LAST_TRADE_DATE_OR_CONTRACT_MONTH:
				setLastTradeDateOrContractMonth((String)newValue);
				return;
			case TradingPackage.CONTRACT__STRIKE:
				setStrike((Double)newValue);
				return;
			case TradingPackage.CONTRACT__RIGHT:
				setRight((OptionRight)newValue);
				return;
			case TradingPackage.CONTRACT__MULTIPLIER:
				setMultiplier((String)newValue);
				return;
			case TradingPackage.CONTRACT__INCLUDE_EXPIRED:
				setIncludeExpired((Boolean)newValue);
				return;
			case TradingPackage.CONTRACT__COMBO_LEGS:
				getComboLegs().clear();
				getComboLegs().addAll((Collection<? extends ComboLeg>)newValue);
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
			case TradingPackage.CONTRACT__CON_ID:
				setConId(CON_ID_EDEFAULT);
				return;
			case TradingPackage.CONTRACT__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case TradingPackage.CONTRACT__SEC_TYPE:
				setSecType(SEC_TYPE_EDEFAULT);
				return;
			case TradingPackage.CONTRACT__EXCHANGE:
				setExchange(EXCHANGE_EDEFAULT);
				return;
			case TradingPackage.CONTRACT__PRIMARY_EXCHANGE:
				setPrimaryExchange(PRIMARY_EXCHANGE_EDEFAULT);
				return;
			case TradingPackage.CONTRACT__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case TradingPackage.CONTRACT__LOCAL_SYMBOL:
				setLocalSymbol(LOCAL_SYMBOL_EDEFAULT);
				return;
			case TradingPackage.CONTRACT__TRADING_CLASS:
				setTradingClass(TRADING_CLASS_EDEFAULT);
				return;
			case TradingPackage.CONTRACT__LAST_TRADE_DATE_OR_CONTRACT_MONTH:
				setLastTradeDateOrContractMonth(LAST_TRADE_DATE_OR_CONTRACT_MONTH_EDEFAULT);
				return;
			case TradingPackage.CONTRACT__STRIKE:
				setStrike(STRIKE_EDEFAULT);
				return;
			case TradingPackage.CONTRACT__RIGHT:
				setRight(RIGHT_EDEFAULT);
				return;
			case TradingPackage.CONTRACT__MULTIPLIER:
				setMultiplier(MULTIPLIER_EDEFAULT);
				return;
			case TradingPackage.CONTRACT__INCLUDE_EXPIRED:
				setIncludeExpired(INCLUDE_EXPIRED_EDEFAULT);
				return;
			case TradingPackage.CONTRACT__COMBO_LEGS:
				getComboLegs().clear();
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
			case TradingPackage.CONTRACT__CON_ID:
				return getConId() != CON_ID_EDEFAULT;
			case TradingPackage.CONTRACT__SYMBOL:
				return SYMBOL_EDEFAULT == null ? getSymbol() != null : !SYMBOL_EDEFAULT.equals(getSymbol());
			case TradingPackage.CONTRACT__SEC_TYPE:
				return getSecType() != SEC_TYPE_EDEFAULT;
			case TradingPackage.CONTRACT__EXCHANGE:
				return EXCHANGE_EDEFAULT == null ? getExchange() != null : !EXCHANGE_EDEFAULT.equals(getExchange());
			case TradingPackage.CONTRACT__PRIMARY_EXCHANGE:
				return PRIMARY_EXCHANGE_EDEFAULT == null ? getPrimaryExchange() != null : !PRIMARY_EXCHANGE_EDEFAULT.equals(getPrimaryExchange());
			case TradingPackage.CONTRACT__CURRENCY:
				return CURRENCY_EDEFAULT == null ? getCurrency() != null : !CURRENCY_EDEFAULT.equals(getCurrency());
			case TradingPackage.CONTRACT__LOCAL_SYMBOL:
				return LOCAL_SYMBOL_EDEFAULT == null ? getLocalSymbol() != null : !LOCAL_SYMBOL_EDEFAULT.equals(getLocalSymbol());
			case TradingPackage.CONTRACT__TRADING_CLASS:
				return TRADING_CLASS_EDEFAULT == null ? getTradingClass() != null : !TRADING_CLASS_EDEFAULT.equals(getTradingClass());
			case TradingPackage.CONTRACT__LAST_TRADE_DATE_OR_CONTRACT_MONTH:
				return LAST_TRADE_DATE_OR_CONTRACT_MONTH_EDEFAULT == null ? getLastTradeDateOrContractMonth() != null : !LAST_TRADE_DATE_OR_CONTRACT_MONTH_EDEFAULT.equals(getLastTradeDateOrContractMonth());
			case TradingPackage.CONTRACT__STRIKE:
				return getStrike() != STRIKE_EDEFAULT;
			case TradingPackage.CONTRACT__RIGHT:
				return getRight() != RIGHT_EDEFAULT;
			case TradingPackage.CONTRACT__MULTIPLIER:
				return MULTIPLIER_EDEFAULT == null ? getMultiplier() != null : !MULTIPLIER_EDEFAULT.equals(getMultiplier());
			case TradingPackage.CONTRACT__INCLUDE_EXPIRED:
				return isIncludeExpired() != INCLUDE_EXPIRED_EDEFAULT;
			case TradingPackage.CONTRACT__COMBO_LEGS:
				return !getComboLegs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractImpl
