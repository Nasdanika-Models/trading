/**
 */
package org.nasdanika.models.trading;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a position held in an account
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.Position#getContract <em>Contract</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Position#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Position#getAvgCost <em>Avg Cost</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Position#getMarketPrice <em>Market Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Position#getMarketValue <em>Market Value</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Position#getUnrealizedPnL <em>Unrealized Pn L</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Position#getRealizedPnL <em>Realized Pn L</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.Position#getAccountId <em>Account Id</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.trading.TradingPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contract for this position
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference.
	 * @see #setContract(Contract)
	 * @see org.nasdanika.models.trading.TradingPackage#getPosition_Contract()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Position#getContract <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' containment reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Contract value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of shares/contracts held. Negative for short positions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(BigDecimal)
	 * @see org.nasdanika.models.trading.TradingPackage#getPosition_Quantity()
	 * @model required="true"
	 * @generated
	 */
	BigDecimal getQuantity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Position#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Avg Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Average cost per share/contract
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Avg Cost</em>' attribute.
	 * @see #setAvgCost(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getPosition_AvgCost()
	 * @model
	 * @generated
	 */
	double getAvgCost();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Position#getAvgCost <em>Avg Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Cost</em>' attribute.
	 * @see #getAvgCost()
	 * @generated
	 */
	void setAvgCost(double value);

	/**
	 * Returns the value of the '<em><b>Market Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current market price
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Market Price</em>' attribute.
	 * @see #setMarketPrice(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getPosition_MarketPrice()
	 * @model
	 * @generated
	 */
	double getMarketPrice();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Position#getMarketPrice <em>Market Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market Price</em>' attribute.
	 * @see #getMarketPrice()
	 * @generated
	 */
	void setMarketPrice(double value);

	/**
	 * Returns the value of the '<em><b>Market Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current market value of the position
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Market Value</em>' attribute.
	 * @see #setMarketValue(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getPosition_MarketValue()
	 * @model
	 * @generated
	 */
	double getMarketValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Position#getMarketValue <em>Market Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Market Value</em>' attribute.
	 * @see #getMarketValue()
	 * @generated
	 */
	void setMarketValue(double value);

	/**
	 * Returns the value of the '<em><b>Unrealized Pn L</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unrealized profit/loss
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unrealized Pn L</em>' attribute.
	 * @see #setUnrealizedPnL(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getPosition_UnrealizedPnL()
	 * @model
	 * @generated
	 */
	double getUnrealizedPnL();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Position#getUnrealizedPnL <em>Unrealized Pn L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unrealized Pn L</em>' attribute.
	 * @see #getUnrealizedPnL()
	 * @generated
	 */
	void setUnrealizedPnL(double value);

	/**
	 * Returns the value of the '<em><b>Realized Pn L</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Realized profit/loss from closed portions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realized Pn L</em>' attribute.
	 * @see #setRealizedPnL(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getPosition_RealizedPnL()
	 * @model
	 * @generated
	 */
	double getRealizedPnL();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Position#getRealizedPnL <em>Realized Pn L</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realized Pn L</em>' attribute.
	 * @see #getRealizedPnL()
	 * @generated
	 */
	void setRealizedPnL(double value);

	/**
	 * Returns the value of the '<em><b>Account Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Account holding this position
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Account Id</em>' attribute.
	 * @see #setAccountId(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getPosition_AccountId()
	 * @model
	 * @generated
	 */
	String getAccountId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.Position#getAccountId <em>Account Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Id</em>' attribute.
	 * @see #getAccountId()
	 * @generated
	 */
	void setAccountId(String value);

} // Position
