/**
 */
package org.nasdanika.models.trading.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.trading.AccountType;
import org.nasdanika.models.trading.TradingAccount;
import org.nasdanika.models.trading.TradingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingAccountImpl#getAccountId <em>Account Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingAccountImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingAccountImpl#getAccountType <em>Account Type</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingAccountImpl#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.TradingAccountImpl#isIsActive <em>Is Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TradingAccountImpl extends MinimalEObjectImpl.Container implements TradingAccount {
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
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAccountType() <em>Account Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountType()
	 * @generated
	 * @ordered
	 */
	protected static final AccountType ACCOUNT_TYPE_EDEFAULT = AccountType.PAPER;

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
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = true;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TradingAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.TRADING_ACCOUNT;
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
	public String getAccountId() {
		return (String)eDynamicGet(TradingPackage.TRADING_ACCOUNT__ACCOUNT_ID, TradingPackage.Literals.TRADING_ACCOUNT__ACCOUNT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountId(String newAccountId) {
		eDynamicSet(TradingPackage.TRADING_ACCOUNT__ACCOUNT_ID, TradingPackage.Literals.TRADING_ACCOUNT__ACCOUNT_ID, newAccountId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlias() {
		return (String)eDynamicGet(TradingPackage.TRADING_ACCOUNT__ALIAS, TradingPackage.Literals.TRADING_ACCOUNT__ALIAS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlias(String newAlias) {
		eDynamicSet(TradingPackage.TRADING_ACCOUNT__ALIAS, TradingPackage.Literals.TRADING_ACCOUNT__ALIAS, newAlias);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccountType getAccountType() {
		return (AccountType)eDynamicGet(TradingPackage.TRADING_ACCOUNT__ACCOUNT_TYPE, TradingPackage.Literals.TRADING_ACCOUNT__ACCOUNT_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccountType(AccountType newAccountType) {
		eDynamicSet(TradingPackage.TRADING_ACCOUNT__ACCOUNT_TYPE, TradingPackage.Literals.TRADING_ACCOUNT__ACCOUNT_TYPE, newAccountType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCurrency() {
		return (String)eDynamicGet(TradingPackage.TRADING_ACCOUNT__CURRENCY, TradingPackage.Literals.TRADING_ACCOUNT__CURRENCY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrency(String newCurrency) {
		eDynamicSet(TradingPackage.TRADING_ACCOUNT__CURRENCY, TradingPackage.Literals.TRADING_ACCOUNT__CURRENCY, newCurrency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsActive() {
		return (Boolean)eDynamicGet(TradingPackage.TRADING_ACCOUNT__IS_ACTIVE, TradingPackage.Literals.TRADING_ACCOUNT__IS_ACTIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsActive(boolean newIsActive) {
		eDynamicSet(TradingPackage.TRADING_ACCOUNT__IS_ACTIVE, TradingPackage.Literals.TRADING_ACCOUNT__IS_ACTIVE, newIsActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.TRADING_ACCOUNT__ACCOUNT_ID:
				return getAccountId();
			case TradingPackage.TRADING_ACCOUNT__ALIAS:
				return getAlias();
			case TradingPackage.TRADING_ACCOUNT__ACCOUNT_TYPE:
				return getAccountType();
			case TradingPackage.TRADING_ACCOUNT__CURRENCY:
				return getCurrency();
			case TradingPackage.TRADING_ACCOUNT__IS_ACTIVE:
				return isIsActive();
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
			case TradingPackage.TRADING_ACCOUNT__ACCOUNT_ID:
				setAccountId((String)newValue);
				return;
			case TradingPackage.TRADING_ACCOUNT__ALIAS:
				setAlias((String)newValue);
				return;
			case TradingPackage.TRADING_ACCOUNT__ACCOUNT_TYPE:
				setAccountType((AccountType)newValue);
				return;
			case TradingPackage.TRADING_ACCOUNT__CURRENCY:
				setCurrency((String)newValue);
				return;
			case TradingPackage.TRADING_ACCOUNT__IS_ACTIVE:
				setIsActive((Boolean)newValue);
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
			case TradingPackage.TRADING_ACCOUNT__ACCOUNT_ID:
				setAccountId(ACCOUNT_ID_EDEFAULT);
				return;
			case TradingPackage.TRADING_ACCOUNT__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case TradingPackage.TRADING_ACCOUNT__ACCOUNT_TYPE:
				setAccountType(ACCOUNT_TYPE_EDEFAULT);
				return;
			case TradingPackage.TRADING_ACCOUNT__CURRENCY:
				setCurrency(CURRENCY_EDEFAULT);
				return;
			case TradingPackage.TRADING_ACCOUNT__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
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
			case TradingPackage.TRADING_ACCOUNT__ACCOUNT_ID:
				return ACCOUNT_ID_EDEFAULT == null ? getAccountId() != null : !ACCOUNT_ID_EDEFAULT.equals(getAccountId());
			case TradingPackage.TRADING_ACCOUNT__ALIAS:
				return ALIAS_EDEFAULT == null ? getAlias() != null : !ALIAS_EDEFAULT.equals(getAlias());
			case TradingPackage.TRADING_ACCOUNT__ACCOUNT_TYPE:
				return getAccountType() != ACCOUNT_TYPE_EDEFAULT;
			case TradingPackage.TRADING_ACCOUNT__CURRENCY:
				return CURRENCY_EDEFAULT == null ? getCurrency() != null : !CURRENCY_EDEFAULT.equals(getCurrency());
			case TradingPackage.TRADING_ACCOUNT__IS_ACTIVE:
				return isIsActive() != IS_ACTIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //TradingAccountImpl
