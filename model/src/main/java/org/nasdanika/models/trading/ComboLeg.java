/**
 */
package org.nasdanika.models.trading;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combo Leg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a leg in a combo/spread order
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.ComboLeg#getConId <em>Con Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ComboLeg#getRatio <em>Ratio</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ComboLeg#getAction <em>Action</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.ComboLeg#getExchange <em>Exchange</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.trading.TradingPackage#getComboLeg()
 * @model
 * @generated
 */
public interface ComboLeg extends EObject {
	/**
	 * Returns the value of the '<em><b>Con Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contract ID of this leg
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Con Id</em>' attribute.
	 * @see #setConId(int)
	 * @see org.nasdanika.models.trading.TradingPackage#getComboLeg_ConId()
	 * @model required="true"
	 * @generated
	 */
	int getConId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ComboLeg#getConId <em>Con Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Con Id</em>' attribute.
	 * @see #getConId()
	 * @generated
	 */
	void setConId(int value);

	/**
	 * Returns the value of the '<em><b>Ratio</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ratio of this leg relative to combo
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ratio</em>' attribute.
	 * @see #setRatio(int)
	 * @see org.nasdanika.models.trading.TradingPackage#getComboLeg_Ratio()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getRatio();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ComboLeg#getRatio <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio</em>' attribute.
	 * @see #getRatio()
	 * @generated
	 */
	void setRatio(int value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.trading.OrderAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BUY or SELL for this leg
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see org.nasdanika.models.trading.OrderAction
	 * @see #setAction(OrderAction)
	 * @see org.nasdanika.models.trading.TradingPackage#getComboLeg_Action()
	 * @model required="true"
	 * @generated
	 */
	OrderAction getAction();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ComboLeg#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see org.nasdanika.models.trading.OrderAction
	 * @see #getAction()
	 * @generated
	 */
	void setAction(OrderAction value);

	/**
	 * Returns the value of the '<em><b>Exchange</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exchange for this leg
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exchange</em>' attribute.
	 * @see #setExchange(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getComboLeg_Exchange()
	 * @model required="true"
	 * @generated
	 */
	String getExchange();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.ComboLeg#getExchange <em>Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exchange</em>' attribute.
	 * @see #getExchange()
	 * @generated
	 */
	void setExchange(String value);

} // ComboLeg
