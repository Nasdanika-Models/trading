/**
 */
package org.nasdanika.models.trading;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Risk management parameters for a trading proposal
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.RiskParameters#getMaxPositionSize <em>Max Position Size</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.RiskParameters#getStopLossPercent <em>Stop Loss Percent</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.RiskParameters#getTakeProfitPercent <em>Take Profit Percent</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.RiskParameters#getMaxDrawdown <em>Max Drawdown</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.RiskParameters#getTrailingStopPercent <em>Trailing Stop Percent</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.trading.TradingPackage#getRiskParameters()
 * @model
 * @generated
 */
public interface RiskParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Position Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum position size as percentage of portfolio
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Position Size</em>' attribute.
	 * @see #setMaxPositionSize(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getRiskParameters_MaxPositionSize()
	 * @model
	 * @generated
	 */
	double getMaxPositionSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.RiskParameters#getMaxPositionSize <em>Max Position Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Position Size</em>' attribute.
	 * @see #getMaxPositionSize()
	 * @generated
	 */
	void setMaxPositionSize(double value);

	/**
	 * Returns the value of the '<em><b>Stop Loss Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop loss level as percentage from entry
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop Loss Percent</em>' attribute.
	 * @see #setStopLossPercent(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getRiskParameters_StopLossPercent()
	 * @model
	 * @generated
	 */
	double getStopLossPercent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.RiskParameters#getStopLossPercent <em>Stop Loss Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Loss Percent</em>' attribute.
	 * @see #getStopLossPercent()
	 * @generated
	 */
	void setStopLossPercent(double value);

	/**
	 * Returns the value of the '<em><b>Take Profit Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Take profit level as percentage from entry
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Take Profit Percent</em>' attribute.
	 * @see #setTakeProfitPercent(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getRiskParameters_TakeProfitPercent()
	 * @model
	 * @generated
	 */
	double getTakeProfitPercent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.RiskParameters#getTakeProfitPercent <em>Take Profit Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Take Profit Percent</em>' attribute.
	 * @see #getTakeProfitPercent()
	 * @generated
	 */
	void setTakeProfitPercent(double value);

	/**
	 * Returns the value of the '<em><b>Max Drawdown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum acceptable drawdown percentage
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Drawdown</em>' attribute.
	 * @see #setMaxDrawdown(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getRiskParameters_MaxDrawdown()
	 * @model
	 * @generated
	 */
	double getMaxDrawdown();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.RiskParameters#getMaxDrawdown <em>Max Drawdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Drawdown</em>' attribute.
	 * @see #getMaxDrawdown()
	 * @generated
	 */
	void setMaxDrawdown(double value);

	/**
	 * Returns the value of the '<em><b>Trailing Stop Percent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trailing stop percentage if applicable
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trailing Stop Percent</em>' attribute.
	 * @see #setTrailingStopPercent(double)
	 * @see org.nasdanika.models.trading.TradingPackage#getRiskParameters_TrailingStopPercent()
	 * @model
	 * @generated
	 */
	double getTrailingStopPercent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.trading.RiskParameters#getTrailingStopPercent <em>Trailing Stop Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trailing Stop Percent</em>' attribute.
	 * @see #getTrailingStopPercent()
	 * @generated
	 */
	void setTrailingStopPercent(double value);

} // RiskParameters
