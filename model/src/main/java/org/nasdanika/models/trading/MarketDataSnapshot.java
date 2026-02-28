/**
 */
package org.nasdanika.models.trading;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Market Data Snapshot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Snapshot of market data for a contract
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#getContract <em>Contract</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#getBidPrice <em>Bid Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#getBidSize <em>Bid Size</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#getAskPrice <em>Ask Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#getAskSize <em>Ask Size</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#getLastPrice <em>Last Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#getLastSize <em>Last Size</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#getHigh <em>High</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#getLow <em>Low</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#getOpen <em>Open</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#getClose <em>Close</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.MarketDataSnapshot#isHalted <em>Halted</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot()
 * @model
 * @generated
 */
public interface MarketDataSnapshot extends EObject {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contract this data is for
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference.
	 * @see #setContract(Contract)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_Contract()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#getContract <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' containment reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Contract value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time of the snapshot
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Bid Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current bid price
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bid Price</em>' attribute.
	 * @see #setBidPrice(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_BidPrice()
	 * @model
	 * @generated
	 */
	double getBidPrice();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#getBidPrice <em>Bid Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bid Price</em>' attribute.
	 * @see #getBidPrice()
	 * @generated
	 */
	void setBidPrice(double value);

	/**
	 * Returns the value of the '<em><b>Bid Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size at bid
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bid Size</em>' attribute.
	 * @see #setBidSize(int)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_BidSize()
	 * @model
	 * @generated
	 */
	int getBidSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#getBidSize <em>Bid Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bid Size</em>' attribute.
	 * @see #getBidSize()
	 * @generated
	 */
	void setBidSize(int value);

	/**
	 * Returns the value of the '<em><b>Ask Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current ask price
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ask Price</em>' attribute.
	 * @see #setAskPrice(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_AskPrice()
	 * @model
	 * @generated
	 */
	double getAskPrice();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#getAskPrice <em>Ask Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ask Price</em>' attribute.
	 * @see #getAskPrice()
	 * @generated
	 */
	void setAskPrice(double value);

	/**
	 * Returns the value of the '<em><b>Ask Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size at ask
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ask Size</em>' attribute.
	 * @see #setAskSize(int)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_AskSize()
	 * @model
	 * @generated
	 */
	int getAskSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#getAskSize <em>Ask Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ask Size</em>' attribute.
	 * @see #getAskSize()
	 * @generated
	 */
	void setAskSize(int value);

	/**
	 * Returns the value of the '<em><b>Last Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Last traded price
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Price</em>' attribute.
	 * @see #setLastPrice(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_LastPrice()
	 * @model
	 * @generated
	 */
	double getLastPrice();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#getLastPrice <em>Last Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Price</em>' attribute.
	 * @see #getLastPrice()
	 * @generated
	 */
	void setLastPrice(double value);

	/**
	 * Returns the value of the '<em><b>Last Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Size of last trade
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Size</em>' attribute.
	 * @see #setLastSize(int)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_LastSize()
	 * @model
	 * @generated
	 */
	int getLastSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#getLastSize <em>Last Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Size</em>' attribute.
	 * @see #getLastSize()
	 * @generated
	 */
	void setLastSize(int value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * High price for the day
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>High</em>' attribute.
	 * @see #setHigh(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_High()
	 * @model
	 * @generated
	 */
	double getHigh();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#getHigh <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' attribute.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(double value);

	/**
	 * Returns the value of the '<em><b>Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Low price for the day
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Low</em>' attribute.
	 * @see #setLow(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_Low()
	 * @model
	 * @generated
	 */
	double getLow();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#getLow <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' attribute.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(double value);

	/**
	 * Returns the value of the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opening price
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Open</em>' attribute.
	 * @see #setOpen(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_Open()
	 * @model
	 * @generated
	 */
	double getOpen();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#getOpen <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' attribute.
	 * @see #getOpen()
	 * @generated
	 */
	void setOpen(double value);

	/**
	 * Returns the value of the '<em><b>Close</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Previous close price
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Close</em>' attribute.
	 * @see #setClose(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_Close()
	 * @model
	 * @generated
	 */
	double getClose();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#getClose <em>Close</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Close</em>' attribute.
	 * @see #getClose()
	 * @generated
	 */
	void setClose(double value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trading volume for the day
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(long)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_Volume()
	 * @model
	 * @generated
	 */
	long getVolume();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(long value);

	/**
	 * Returns the value of the '<em><b>Halted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether trading is halted
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Halted</em>' attribute.
	 * @see #setHalted(boolean)
	 * @see org.nasdanika.models.trading.TradingPackage#getMarketDataSnapshot_Halted()
	 * @model default="false"
	 * @generated
	 */
	boolean isHalted();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.MarketDataSnapshot#isHalted <em>Halted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Halted</em>' attribute.
	 * @see #isHalted()
	 * @generated
	 */
	void setHalted(boolean value);

} // MarketDataSnapshot
