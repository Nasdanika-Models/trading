/**
 */
package org.nasdanika.models.trading.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.trading.AlgoParams;
import org.nasdanika.models.trading.TradingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Algo Params</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.impl.AlgoParamsImpl#getAlgoStrategy <em>Algo Strategy</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.AlgoParamsImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.AlgoParamsImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.AlgoParamsImpl#isAllowPastEndTime <em>Allow Past End Time</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.AlgoParamsImpl#getMaxPctVol <em>Max Pct Vol</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.AlgoParamsImpl#isNoTakeLiq <em>No Take Liq</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.AlgoParamsImpl#getAdaptivePriority <em>Adaptive Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlgoParamsImpl extends MinimalEObjectImpl.Container implements AlgoParams {
	/**
	 * The default value of the '{@link #getAlgoStrategy() <em>Algo Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgoStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGO_STRATEGY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final String START_TIME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final String END_TIME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isAllowPastEndTime() <em>Allow Past End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowPastEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_PAST_END_TIME_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getMaxPctVol() <em>Max Pct Vol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPctVol()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_PCT_VOL_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isNoTakeLiq() <em>No Take Liq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoTakeLiq()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NO_TAKE_LIQ_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getAdaptivePriority() <em>Adaptive Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdaptivePriority()
	 * @generated
	 * @ordered
	 */
	protected static final String ADAPTIVE_PRIORITY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgoParamsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.ALGO_PARAMS;
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
	public String getAlgoStrategy() {
		return (String)eDynamicGet(TradingPackage.ALGO_PARAMS__ALGO_STRATEGY, TradingPackage.Literals.ALGO_PARAMS__ALGO_STRATEGY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgoStrategy(String newAlgoStrategy) {
		eDynamicSet(TradingPackage.ALGO_PARAMS__ALGO_STRATEGY, TradingPackage.Literals.ALGO_PARAMS__ALGO_STRATEGY, newAlgoStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartTime() {
		return (String)eDynamicGet(TradingPackage.ALGO_PARAMS__START_TIME, TradingPackage.Literals.ALGO_PARAMS__START_TIME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartTime(String newStartTime) {
		eDynamicSet(TradingPackage.ALGO_PARAMS__START_TIME, TradingPackage.Literals.ALGO_PARAMS__START_TIME, newStartTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndTime() {
		return (String)eDynamicGet(TradingPackage.ALGO_PARAMS__END_TIME, TradingPackage.Literals.ALGO_PARAMS__END_TIME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndTime(String newEndTime) {
		eDynamicSet(TradingPackage.ALGO_PARAMS__END_TIME, TradingPackage.Literals.ALGO_PARAMS__END_TIME, newEndTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllowPastEndTime() {
		return (Boolean)eDynamicGet(TradingPackage.ALGO_PARAMS__ALLOW_PAST_END_TIME, TradingPackage.Literals.ALGO_PARAMS__ALLOW_PAST_END_TIME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowPastEndTime(boolean newAllowPastEndTime) {
		eDynamicSet(TradingPackage.ALGO_PARAMS__ALLOW_PAST_END_TIME, TradingPackage.Literals.ALGO_PARAMS__ALLOW_PAST_END_TIME, newAllowPastEndTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxPctVol() {
		return (Double)eDynamicGet(TradingPackage.ALGO_PARAMS__MAX_PCT_VOL, TradingPackage.Literals.ALGO_PARAMS__MAX_PCT_VOL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxPctVol(double newMaxPctVol) {
		eDynamicSet(TradingPackage.ALGO_PARAMS__MAX_PCT_VOL, TradingPackage.Literals.ALGO_PARAMS__MAX_PCT_VOL, newMaxPctVol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNoTakeLiq() {
		return (Boolean)eDynamicGet(TradingPackage.ALGO_PARAMS__NO_TAKE_LIQ, TradingPackage.Literals.ALGO_PARAMS__NO_TAKE_LIQ, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoTakeLiq(boolean newNoTakeLiq) {
		eDynamicSet(TradingPackage.ALGO_PARAMS__NO_TAKE_LIQ, TradingPackage.Literals.ALGO_PARAMS__NO_TAKE_LIQ, newNoTakeLiq);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdaptivePriority() {
		return (String)eDynamicGet(TradingPackage.ALGO_PARAMS__ADAPTIVE_PRIORITY, TradingPackage.Literals.ALGO_PARAMS__ADAPTIVE_PRIORITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdaptivePriority(String newAdaptivePriority) {
		eDynamicSet(TradingPackage.ALGO_PARAMS__ADAPTIVE_PRIORITY, TradingPackage.Literals.ALGO_PARAMS__ADAPTIVE_PRIORITY, newAdaptivePriority);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.ALGO_PARAMS__ALGO_STRATEGY:
				return getAlgoStrategy();
			case TradingPackage.ALGO_PARAMS__START_TIME:
				return getStartTime();
			case TradingPackage.ALGO_PARAMS__END_TIME:
				return getEndTime();
			case TradingPackage.ALGO_PARAMS__ALLOW_PAST_END_TIME:
				return isAllowPastEndTime();
			case TradingPackage.ALGO_PARAMS__MAX_PCT_VOL:
				return getMaxPctVol();
			case TradingPackage.ALGO_PARAMS__NO_TAKE_LIQ:
				return isNoTakeLiq();
			case TradingPackage.ALGO_PARAMS__ADAPTIVE_PRIORITY:
				return getAdaptivePriority();
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
			case TradingPackage.ALGO_PARAMS__ALGO_STRATEGY:
				setAlgoStrategy((String)newValue);
				return;
			case TradingPackage.ALGO_PARAMS__START_TIME:
				setStartTime((String)newValue);
				return;
			case TradingPackage.ALGO_PARAMS__END_TIME:
				setEndTime((String)newValue);
				return;
			case TradingPackage.ALGO_PARAMS__ALLOW_PAST_END_TIME:
				setAllowPastEndTime((Boolean)newValue);
				return;
			case TradingPackage.ALGO_PARAMS__MAX_PCT_VOL:
				setMaxPctVol((Double)newValue);
				return;
			case TradingPackage.ALGO_PARAMS__NO_TAKE_LIQ:
				setNoTakeLiq((Boolean)newValue);
				return;
			case TradingPackage.ALGO_PARAMS__ADAPTIVE_PRIORITY:
				setAdaptivePriority((String)newValue);
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
			case TradingPackage.ALGO_PARAMS__ALGO_STRATEGY:
				setAlgoStrategy(ALGO_STRATEGY_EDEFAULT);
				return;
			case TradingPackage.ALGO_PARAMS__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case TradingPackage.ALGO_PARAMS__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case TradingPackage.ALGO_PARAMS__ALLOW_PAST_END_TIME:
				setAllowPastEndTime(ALLOW_PAST_END_TIME_EDEFAULT);
				return;
			case TradingPackage.ALGO_PARAMS__MAX_PCT_VOL:
				setMaxPctVol(MAX_PCT_VOL_EDEFAULT);
				return;
			case TradingPackage.ALGO_PARAMS__NO_TAKE_LIQ:
				setNoTakeLiq(NO_TAKE_LIQ_EDEFAULT);
				return;
			case TradingPackage.ALGO_PARAMS__ADAPTIVE_PRIORITY:
				setAdaptivePriority(ADAPTIVE_PRIORITY_EDEFAULT);
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
			case TradingPackage.ALGO_PARAMS__ALGO_STRATEGY:
				return ALGO_STRATEGY_EDEFAULT == null ? getAlgoStrategy() != null : !ALGO_STRATEGY_EDEFAULT.equals(getAlgoStrategy());
			case TradingPackage.ALGO_PARAMS__START_TIME:
				return START_TIME_EDEFAULT == null ? getStartTime() != null : !START_TIME_EDEFAULT.equals(getStartTime());
			case TradingPackage.ALGO_PARAMS__END_TIME:
				return END_TIME_EDEFAULT == null ? getEndTime() != null : !END_TIME_EDEFAULT.equals(getEndTime());
			case TradingPackage.ALGO_PARAMS__ALLOW_PAST_END_TIME:
				return isAllowPastEndTime() != ALLOW_PAST_END_TIME_EDEFAULT;
			case TradingPackage.ALGO_PARAMS__MAX_PCT_VOL:
				return getMaxPctVol() != MAX_PCT_VOL_EDEFAULT;
			case TradingPackage.ALGO_PARAMS__NO_TAKE_LIQ:
				return isNoTakeLiq() != NO_TAKE_LIQ_EDEFAULT;
			case TradingPackage.ALGO_PARAMS__ADAPTIVE_PRIORITY:
				return ADAPTIVE_PRIORITY_EDEFAULT == null ? getAdaptivePriority() != null : !ADAPTIVE_PRIORITY_EDEFAULT.equals(getAdaptivePriority());
		}
		return super.eIsSet(featureID);
	}

} //AlgoParamsImpl
