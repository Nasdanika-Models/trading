/**
 */
package org.nasdanika.models.trading;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a tradeable financial instrument in IBKR.
 * A Contract uniquely identifies a security for trading, market data, and portfolio queries.
 * At minimum, requires either conId+exchange OR symbol+secType+exchange+currency.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.Contract#getConId <em>Con Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Contract#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Contract#getSecType <em>Sec Type</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Contract#getExchange <em>Exchange</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Contract#getPrimaryExchange <em>Primary Exchange</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Contract#getCurrency <em>Currency</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Contract#getLocalSymbol <em>Local Symbol</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Contract#getTradingClass <em>Trading Class</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Contract#getLastTradeDateOrContractMonth <em>Last Trade Date Or Contract Month</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Contract#getStrike <em>Strike</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Contract#getRight <em>Right</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Contract#getMultiplier <em>Multiplier</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Contract#isIncludeExpired <em>Include Expired</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Contract#getComboLegs <em>Combo Legs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.trading.TradingPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends EObject {
	/**
	 * Returns the value of the '<em><b>Con Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IBKR's unique contract identifier. Use this to specify an exact contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Con Id</em>' attribute.
	 * @see #setConId(int)
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_ConId()
	 * @model
	 * @generated
	 */
	int getConId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Contract#getConId <em>Con Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con Id</em>' attribute.
	 * @see #getConId()
	 * @generated
	 */
	void setConId(int value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ticker symbol of the underlying instrument (e.g., AAPL, IBM, EUR)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Contract#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Sec Type</b></em>' attribute.
	 * The default value is <code>"STK"</code>.
	 * The literals are from the enumeration {@link org.nasdanika.models.trading.SecurityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The security type of the instrument
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sec Type</em>' attribute.
	 * @see org.nasdanika.models.trading.SecurityType
	 * @see #setSecType(SecurityType)
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_SecType()
	 * @model default="STK"
	 * @generated
	 */
	SecurityType getSecType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Contract#getSecType <em>Sec Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sec Type</em>' attribute.
	 * @see org.nasdanika.models.trading.SecurityType
	 * @see #getSecType()
	 * @generated
	 */
	void setSecType(SecurityType value);

	/**
	 * Returns the value of the '<em><b>Exchange</b></em>' attribute.
	 * The default value is <code>"SMART"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exchange for routing. SMART enables IB SmartRouting for best execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange</em>' attribute.
	 * @see #setExchange(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_Exchange()
	 * @model default="SMART"
	 * @generated
	 */
	String getExchange();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Contract#getExchange <em>Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange</em>' attribute.
	 * @see #getExchange()
	 * @generated
	 */
	void setExchange(String value);

	/**
	 * Returns the value of the '<em><b>Primary Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Primary listing exchange (e.g., NASDAQ, NYSE). Helps disambiguate contracts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Exchange</em>' attribute.
	 * @see #setPrimaryExchange(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_PrimaryExchange()
	 * @model
	 * @generated
	 */
	String getPrimaryExchange();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Contract#getPrimaryExchange <em>Primary Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Exchange</em>' attribute.
	 * @see #getPrimaryExchange()
	 * @generated
	 */
	void setPrimaryExchange(String value);

	/**
	 * Returns the value of the '<em><b>Currency</b></em>' attribute.
	 * The default value is <code>"USD"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Currency the contract is traded in (e.g., USD, EUR, GBP)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Currency</em>' attribute.
	 * @see #setCurrency(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_Currency()
	 * @model default="USD"
	 * @generated
	 */
	String getCurrency();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Contract#getCurrency <em>Currency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currency</em>' attribute.
	 * @see #getCurrency()
	 * @generated
	 */
	void setCurrency(String value);

	/**
	 * Returns the value of the '<em><b>Local Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The local trading symbol on the exchange
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Symbol</em>' attribute.
	 * @see #setLocalSymbol(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_LocalSymbol()
	 * @model
	 * @generated
	 */
	String getLocalSymbol();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Contract#getLocalSymbol <em>Local Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Symbol</em>' attribute.
	 * @see #getLocalSymbol()
	 * @generated
	 */
	void setLocalSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Trading Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trading class of the instrument (important for options)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trading Class</em>' attribute.
	 * @see #setTradingClass(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_TradingClass()
	 * @model
	 * @generated
	 */
	String getTradingClass();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Contract#getTradingClass <em>Trading Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trading Class</em>' attribute.
	 * @see #getTradingClass()
	 * @generated
	 */
	void setTradingClass(String value);

	/**
	 * Returns the value of the '<em><b>Last Trade Date Or Contract Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For derivatives: expiration date (YYYYMMDD) or contract month (YYYYMM)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Trade Date Or Contract Month</em>' attribute.
	 * @see #setLastTradeDateOrContractMonth(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_LastTradeDateOrContractMonth()
	 * @model
	 * @generated
	 */
	String getLastTradeDateOrContractMonth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Contract#getLastTradeDateOrContractMonth <em>Last Trade Date Or Contract Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Trade Date Or Contract Month</em>' attribute.
	 * @see #getLastTradeDateOrContractMonth()
	 * @generated
	 */
	void setLastTradeDateOrContractMonth(String value);

	/**
	 * Returns the value of the '<em><b>Strike</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For options: the strike price
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strike</em>' attribute.
	 * @see #setStrike(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_Strike()
	 * @model
	 * @generated
	 */
	double getStrike();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Contract#getStrike <em>Strike</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strike</em>' attribute.
	 * @see #getStrike()
	 * @generated
	 */
	void setStrike(double value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.trading.OptionRight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For options: Call (C) or Put (P)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right</em>' attribute.
	 * @see org.nasdanika.models.trading.OptionRight
	 * @see #setRight(OptionRight)
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_Right()
	 * @model
	 * @generated
	 */
	OptionRight getRight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Contract#getRight <em>Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' attribute.
	 * @see org.nasdanika.models.trading.OptionRight
	 * @see #getRight()
	 * @generated
	 */
	void setRight(OptionRight value);

	/**
	 * Returns the value of the '<em><b>Multiplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For derivatives: contract multiplier (e.g., 100 for US equity options)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiplier</em>' attribute.
	 * @see #setMultiplier(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_Multiplier()
	 * @model
	 * @generated
	 */
	String getMultiplier();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Contract#getMultiplier <em>Multiplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplier</em>' attribute.
	 * @see #getMultiplier()
	 * @generated
	 */
	void setMultiplier(String value);

	/**
	 * Returns the value of the '<em><b>Include Expired</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true to obtain historical data for expired contracts
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include Expired</em>' attribute.
	 * @see #setIncludeExpired(boolean)
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_IncludeExpired()
	 * @model default="false"
	 * @generated
	 */
	boolean isIncludeExpired();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Contract#isIncludeExpired <em>Include Expired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Expired</em>' attribute.
	 * @see #isIncludeExpired()
	 * @generated
	 */
	void setIncludeExpired(boolean value);

	/**
	 * Returns the value of the '<em><b>Combo Legs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.trading.ComboLeg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Combo/Spread legs for BAG security type
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combo Legs</em>' containment reference list.
	 * @see org.nasdanika.models.trading.TradingPackage#getContract_ComboLegs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComboLeg> getComboLegs();

} // Contract
