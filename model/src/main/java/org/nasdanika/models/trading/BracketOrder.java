/**
 */
package org.nasdanika.models.trading;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bracket Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A bracket order consisting of an entry order with attached profit taker and stop loss.
 * When the entry order fills, the profit taker and stop loss become active as OCA group.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.BracketOrder#getEntryOrder <em>Entry Order</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.BracketOrder#getProfitTaker <em>Profit Taker</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.BracketOrder#getStopLoss <em>Stop Loss</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.trading.TradingPackage#getBracketOrder()
 * @model
 * @generated
 */
public interface BracketOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Entry Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent/entry order
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entry Order</em>' containment reference.
	 * @see #setEntryOrder(Order)
	 * @see org.nasdanika.models.trading.TradingPackage#getBracketOrder_EntryOrder()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Order getEntryOrder();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.BracketOrder#getEntryOrder <em>Entry Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Order</em>' containment reference.
	 * @see #getEntryOrder()
	 * @generated
	 */
	void setEntryOrder(Order value);

	/**
	 * Returns the value of the '<em><b>Profit Taker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Profit taking order (limit order on opposite side)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profit Taker</em>' containment reference.
	 * @see #setProfitTaker(Order)
	 * @see org.nasdanika.models.trading.TradingPackage#getBracketOrder_ProfitTaker()
	 * @model containment="true"
	 * @generated
	 */
	Order getProfitTaker();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.BracketOrder#getProfitTaker <em>Profit Taker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profit Taker</em>' containment reference.
	 * @see #getProfitTaker()
	 * @generated
	 */
	void setProfitTaker(Order value);

	/**
	 * Returns the value of the '<em><b>Stop Loss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop loss order
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop Loss</em>' containment reference.
	 * @see #setStopLoss(Order)
	 * @see org.nasdanika.models.trading.TradingPackage#getBracketOrder_StopLoss()
	 * @model containment="true"
	 * @generated
	 */
	Order getStopLoss();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.BracketOrder#getStopLoss <em>Stop Loss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Loss</em>' containment reference.
	 * @see #getStopLoss()
	 * @generated
	 */
	void setStopLoss(Order value);

} // BracketOrder
