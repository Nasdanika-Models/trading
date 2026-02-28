/**
 */
package org.nasdanika.models.trading;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents an IBKR trading account
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.TradingAccount#getAccountId <em>Account Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingAccount#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingAccount#getAccountType <em>Account Type</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingAccount#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.TradingAccount#isIsActive <em>Is Active</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.trading.TradingPackage#getTradingAccount()
 * @model
 * @generated
 */
public interface TradingAccount extends EObject {
	/**
	 * Returns the value of the '<em><b>Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IBKR account identifier (e.g., U1234567, DU123456 for paper)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account Id</em>' attribute.
	 * @see #setAccountId(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingAccount_AccountId()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getAccountId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingAccount#getAccountId <em>Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Id</em>' attribute.
	 * @see #getAccountId()
	 * @generated
	 */
	void setAccountId(String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User-friendly name for the account
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingAccount_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingAccount#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Account Type</b></em>' attribute.
	 * The default value is <code>"PAPER"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.trading.AccountType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of account (LIVE or PAPER)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account Type</em>' attribute.
	 * @see org.nasdanika.models.trading.AccountType
	 * @see #setAccountType(AccountType)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingAccount_AccountType()
	 * @model default="PAPER"
	 * @generated
	 */
	AccountType getAccountType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingAccount#getAccountType <em>Account Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Type</em>' attribute.
	 * @see org.nasdanika.models.trading.AccountType
	 * @see #getAccountType()
	 * @generated
	 */
	void setAccountType(AccountType value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The default value is <code>"USD"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Base currency of the account
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see #setCurrency(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingAccount_Currency()
	 * @model default="USD"
	 * @generated
	 */
	String getCurrency();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingAccount#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(String value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the account is currently active for trading
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see org.nasdanika.models.trading.TradingPackage#getTradingAccount_IsActive()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.TradingAccount#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

} // TradingAccount
