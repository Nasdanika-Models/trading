/**
 */
package org.nasdanika.models.trading.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.trading.ComboLeg;
import org.nasdanika.models.trading.OrderAction;
import org.nasdanika.models.trading.TradingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combo Leg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.impl.ComboLegImpl#getConId <em>Con Id</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ComboLegImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ComboLegImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.ComboLegImpl#getExchange <em>Exchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComboLegImpl extends MinimalEObjectImpl.Container implements ComboLeg {
	/**
	 * The default value of the '{@link #getConId() <em>Con Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConId()
	 * @generated
	 * @ordered
	 */
	protected static final int CON_ID_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRatio()
	 * @generated
	 * @ordered
	 */
	protected static final int RATIO_EDEFAULT = 1;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final OrderAction ACTION_EDEFAULT = OrderAction.BUY;

	/**
	 * The default value of the '{@link #getExchange() <em>Exchange</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchange()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCHANGE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComboLegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.COMBO_LEG;
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
	public int getConId() {
		return (Integer)eDynamicGet(TradingPackage.COMBO_LEG__CON_ID, TradingPackage.Literals.COMBO_LEG__CON_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConId(int newConId) {
		eDynamicSet(TradingPackage.COMBO_LEG__CON_ID, TradingPackage.Literals.COMBO_LEG__CON_ID, newConId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRatio() {
		return (Integer)eDynamicGet(TradingPackage.COMBO_LEG__RATIO, TradingPackage.Literals.COMBO_LEG__RATIO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRatio(int newRatio) {
		eDynamicSet(TradingPackage.COMBO_LEG__RATIO, TradingPackage.Literals.COMBO_LEG__RATIO, newRatio);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderAction getAction() {
		return (OrderAction)eDynamicGet(TradingPackage.COMBO_LEG__ACTION, TradingPackage.Literals.COMBO_LEG__ACTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAction(OrderAction newAction) {
		eDynamicSet(TradingPackage.COMBO_LEG__ACTION, TradingPackage.Literals.COMBO_LEG__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExchange() {
		return (String)eDynamicGet(TradingPackage.COMBO_LEG__EXCHANGE, TradingPackage.Literals.COMBO_LEG__EXCHANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExchange(String newExchange) {
		eDynamicSet(TradingPackage.COMBO_LEG__EXCHANGE, TradingPackage.Literals.COMBO_LEG__EXCHANGE, newExchange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.COMBO_LEG__CON_ID:
				return getConId();
			case TradingPackage.COMBO_LEG__RATIO:
				return getRatio();
			case TradingPackage.COMBO_LEG__ACTION:
				return getAction();
			case TradingPackage.COMBO_LEG__EXCHANGE:
				return getExchange();
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
			case TradingPackage.COMBO_LEG__CON_ID:
				setConId((Integer)newValue);
				return;
			case TradingPackage.COMBO_LEG__RATIO:
				setRatio((Integer)newValue);
				return;
			case TradingPackage.COMBO_LEG__ACTION:
				setAction((OrderAction)newValue);
				return;
			case TradingPackage.COMBO_LEG__EXCHANGE:
				setExchange((String)newValue);
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
			case TradingPackage.COMBO_LEG__CON_ID:
				setConId(CON_ID_EDEFAULT);
				return;
			case TradingPackage.COMBO_LEG__RATIO:
				setRatio(RATIO_EDEFAULT);
				return;
			case TradingPackage.COMBO_LEG__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case TradingPackage.COMBO_LEG__EXCHANGE:
				setExchange(EXCHANGE_EDEFAULT);
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
			case TradingPackage.COMBO_LEG__CON_ID:
				return getConId() != CON_ID_EDEFAULT;
			case TradingPackage.COMBO_LEG__RATIO:
				return getRatio() != RATIO_EDEFAULT;
			case TradingPackage.COMBO_LEG__ACTION:
				return getAction() != ACTION_EDEFAULT;
			case TradingPackage.COMBO_LEG__EXCHANGE:
				return EXCHANGE_EDEFAULT == null ? getExchange() != null : !EXCHANGE_EDEFAULT.equals(getExchange());
		}
		return super.eIsSet(featureID);
	}

} //ComboLegImpl
