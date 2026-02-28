/**
 */
package org.nasdanika.models.trading;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algo Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parameters for algorithmic orders (VWAP, TWAP, Adaptive, etc.)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.AlgoParams#getAlgoStrategy <em>Algo Strategy</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.AlgoParams#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.AlgoParams#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.AlgoParams#isAllowPastEndTime <em>Allow Past End Time</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.AlgoParams#getMaxPctVol <em>Max Pct Vol</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.AlgoParams#isNoTakeLiq <em>No Take Liq</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.AlgoParams#getAdaptivePriority <em>Adaptive Priority</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.trading.TradingPackage#getAlgoParams()
 * @model
 * @generated
 */
public interface AlgoParams extends EObject {
	/**
	 * Returns the value of the '<em><b>Algo Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Algo strategy name (e.g., Adaptive, Vwap, Twap)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algo Strategy</em>' attribute.
	 * @see #setAlgoStrategy(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getAlgoParams_AlgoStrategy()
	 * @model
	 * @generated
	 */
	String getAlgoStrategy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.AlgoParams#getAlgoStrategy <em>Algo Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algo Strategy</em>' attribute.
	 * @see #getAlgoStrategy()
	 * @generated
	 */
	void setAlgoStrategy(String value);

	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Start time for VWAP/TWAP orders
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getAlgoParams_StartTime()
	 * @model
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.AlgoParams#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * End time for VWAP/TWAP orders
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getAlgoParams_EndTime()
	 * @model
	 * @generated
	 */
	String getEndTime();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.AlgoParams#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(String value);

	/**
	 * Returns the value of the '<em><b>Allow Past End Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allow algo to continue past end time
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Past End Time</em>' attribute.
	 * @see #setAllowPastEndTime(boolean)
	 * @see org.nasdanika.models.trading.TradingPackage#getAlgoParams_AllowPastEndTime()
	 * @model default="false"
	 * @generated
	 */
	boolean isAllowPastEndTime();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.AlgoParams#isAllowPastEndTime <em>Allow Past End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Past End Time</em>' attribute.
	 * @see #isAllowPastEndTime()
	 * @generated
	 */
	void setAllowPastEndTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Pct Vol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum percentage of average daily volume
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Pct Vol</em>' attribute.
	 * @see #setMaxPctVol(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getAlgoParams_MaxPctVol()
	 * @model
	 * @generated
	 */
	double getMaxPctVol();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.AlgoParams#getMaxPctVol <em>Max Pct Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pct Vol</em>' attribute.
	 * @see #getMaxPctVol()
	 * @generated
	 */
	void setMaxPctVol(double value);

	/**
	 * Returns the value of the '<em><b>No Take Liq</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Do not remove liquidity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Take Liq</em>' attribute.
	 * @see #setNoTakeLiq(boolean)
	 * @see org.nasdanika.models.trading.TradingPackage#getAlgoParams_NoTakeLiq()
	 * @model default="false"
	 * @generated
	 */
	boolean isNoTakeLiq();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.AlgoParams#isNoTakeLiq <em>No Take Liq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Take Liq</em>' attribute.
	 * @see #isNoTakeLiq()
	 * @generated
	 */
	void setNoTakeLiq(boolean value);

	/**
	 * Returns the value of the '<em><b>Adaptive Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Priority for Adaptive algo: Urgent, Normal, Patient
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adaptive Priority</em>' attribute.
	 * @see #setAdaptivePriority(String)
	 * @see org.nasdanika.models.trading.TradingPackage#getAlgoParams_AdaptivePriority()
	 * @model
	 * @generated
	 */
	String getAdaptivePriority();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.AlgoParams#getAdaptivePriority <em>Adaptive Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adaptive Priority</em>' attribute.
	 * @see #getAdaptivePriority()
	 * @generated
	 */
	void setAdaptivePriority(String value);

} // AlgoParams
