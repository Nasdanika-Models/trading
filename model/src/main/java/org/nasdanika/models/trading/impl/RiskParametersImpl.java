/**
 */
package org.nasdanika.models.trading.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.trading.RiskParameters;
import org.nasdanika.models.trading.TradingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Risk Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.impl.RiskParametersImpl#getMaxPositionSize <em>Max Position Size</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.RiskParametersImpl#getStopLossPercent <em>Stop Loss Percent</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.RiskParametersImpl#getTakeProfitPercent <em>Take Profit Percent</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.RiskParametersImpl#getMaxDrawdown <em>Max Drawdown</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.RiskParametersImpl#getTrailingStopPercent <em>Trailing Stop Percent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RiskParametersImpl extends MinimalEObjectImpl.Container implements RiskParameters {
	/**
	 * The default value of the '{@link #getMaxPositionSize() <em>Max Position Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPositionSize()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_POSITION_SIZE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getStopLossPercent() <em>Stop Loss Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopLossPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double STOP_LOSS_PERCENT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getTakeProfitPercent() <em>Take Profit Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakeProfitPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double TAKE_PROFIT_PERCENT_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMaxDrawdown() <em>Max Drawdown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDrawdown()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_DRAWDOWN_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getTrailingStopPercent() <em>Trailing Stop Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrailingStopPercent()
	 * @generated
	 * @ordered
	 */
	protected static final double TRAILING_STOP_PERCENT_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RiskParametersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.RISK_PARAMETERS;
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
	public double getMaxPositionSize() {
		return (Double)eDynamicGet(TradingPackage.RISK_PARAMETERS__MAX_POSITION_SIZE, TradingPackage.Literals.RISK_PARAMETERS__MAX_POSITION_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxPositionSize(double newMaxPositionSize) {
		eDynamicSet(TradingPackage.RISK_PARAMETERS__MAX_POSITION_SIZE, TradingPackage.Literals.RISK_PARAMETERS__MAX_POSITION_SIZE, newMaxPositionSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getStopLossPercent() {
		return (Double)eDynamicGet(TradingPackage.RISK_PARAMETERS__STOP_LOSS_PERCENT, TradingPackage.Literals.RISK_PARAMETERS__STOP_LOSS_PERCENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopLossPercent(double newStopLossPercent) {
		eDynamicSet(TradingPackage.RISK_PARAMETERS__STOP_LOSS_PERCENT, TradingPackage.Literals.RISK_PARAMETERS__STOP_LOSS_PERCENT, newStopLossPercent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTakeProfitPercent() {
		return (Double)eDynamicGet(TradingPackage.RISK_PARAMETERS__TAKE_PROFIT_PERCENT, TradingPackage.Literals.RISK_PARAMETERS__TAKE_PROFIT_PERCENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTakeProfitPercent(double newTakeProfitPercent) {
		eDynamicSet(TradingPackage.RISK_PARAMETERS__TAKE_PROFIT_PERCENT, TradingPackage.Literals.RISK_PARAMETERS__TAKE_PROFIT_PERCENT, newTakeProfitPercent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxDrawdown() {
		return (Double)eDynamicGet(TradingPackage.RISK_PARAMETERS__MAX_DRAWDOWN, TradingPackage.Literals.RISK_PARAMETERS__MAX_DRAWDOWN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxDrawdown(double newMaxDrawdown) {
		eDynamicSet(TradingPackage.RISK_PARAMETERS__MAX_DRAWDOWN, TradingPackage.Literals.RISK_PARAMETERS__MAX_DRAWDOWN, newMaxDrawdown);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTrailingStopPercent() {
		return (Double)eDynamicGet(TradingPackage.RISK_PARAMETERS__TRAILING_STOP_PERCENT, TradingPackage.Literals.RISK_PARAMETERS__TRAILING_STOP_PERCENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrailingStopPercent(double newTrailingStopPercent) {
		eDynamicSet(TradingPackage.RISK_PARAMETERS__TRAILING_STOP_PERCENT, TradingPackage.Literals.RISK_PARAMETERS__TRAILING_STOP_PERCENT, newTrailingStopPercent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.RISK_PARAMETERS__MAX_POSITION_SIZE:
				return getMaxPositionSize();
			case TradingPackage.RISK_PARAMETERS__STOP_LOSS_PERCENT:
				return getStopLossPercent();
			case TradingPackage.RISK_PARAMETERS__TAKE_PROFIT_PERCENT:
				return getTakeProfitPercent();
			case TradingPackage.RISK_PARAMETERS__MAX_DRAWDOWN:
				return getMaxDrawdown();
			case TradingPackage.RISK_PARAMETERS__TRAILING_STOP_PERCENT:
				return getTrailingStopPercent();
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
			case TradingPackage.RISK_PARAMETERS__MAX_POSITION_SIZE:
				setMaxPositionSize((Double)newValue);
				return;
			case TradingPackage.RISK_PARAMETERS__STOP_LOSS_PERCENT:
				setStopLossPercent((Double)newValue);
				return;
			case TradingPackage.RISK_PARAMETERS__TAKE_PROFIT_PERCENT:
				setTakeProfitPercent((Double)newValue);
				return;
			case TradingPackage.RISK_PARAMETERS__MAX_DRAWDOWN:
				setMaxDrawdown((Double)newValue);
				return;
			case TradingPackage.RISK_PARAMETERS__TRAILING_STOP_PERCENT:
				setTrailingStopPercent((Double)newValue);
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
			case TradingPackage.RISK_PARAMETERS__MAX_POSITION_SIZE:
				setMaxPositionSize(MAX_POSITION_SIZE_EDEFAULT);
				return;
			case TradingPackage.RISK_PARAMETERS__STOP_LOSS_PERCENT:
				setStopLossPercent(STOP_LOSS_PERCENT_EDEFAULT);
				return;
			case TradingPackage.RISK_PARAMETERS__TAKE_PROFIT_PERCENT:
				setTakeProfitPercent(TAKE_PROFIT_PERCENT_EDEFAULT);
				return;
			case TradingPackage.RISK_PARAMETERS__MAX_DRAWDOWN:
				setMaxDrawdown(MAX_DRAWDOWN_EDEFAULT);
				return;
			case TradingPackage.RISK_PARAMETERS__TRAILING_STOP_PERCENT:
				setTrailingStopPercent(TRAILING_STOP_PERCENT_EDEFAULT);
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
			case TradingPackage.RISK_PARAMETERS__MAX_POSITION_SIZE:
				return getMaxPositionSize() != MAX_POSITION_SIZE_EDEFAULT;
			case TradingPackage.RISK_PARAMETERS__STOP_LOSS_PERCENT:
				return getStopLossPercent() != STOP_LOSS_PERCENT_EDEFAULT;
			case TradingPackage.RISK_PARAMETERS__TAKE_PROFIT_PERCENT:
				return getTakeProfitPercent() != TAKE_PROFIT_PERCENT_EDEFAULT;
			case TradingPackage.RISK_PARAMETERS__MAX_DRAWDOWN:
				return getMaxDrawdown() != MAX_DRAWDOWN_EDEFAULT;
			case TradingPackage.RISK_PARAMETERS__TRAILING_STOP_PERCENT:
				return getTrailingStopPercent() != TRAILING_STOP_PERCENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //RiskParametersImpl
