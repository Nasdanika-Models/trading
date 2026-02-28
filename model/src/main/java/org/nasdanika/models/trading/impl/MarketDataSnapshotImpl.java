/**
 */
package org.nasdanika.models.trading.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.trading.Contract;
import org.nasdanika.models.trading.MarketDataSnapshot;
import org.nasdanika.models.trading.TradingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Market Data Snapshot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#getBidPrice <em>Bid Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#getBidSize <em>Bid Size</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#getAskPrice <em>Ask Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#getAskSize <em>Ask Size</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#getLastPrice <em>Last Price</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#getLastSize <em>Last Size</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#getHigh <em>High</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#getLow <em>Low</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#getOpen <em>Open</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#getClose <em>Close</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link org.nasdanika.models.trading.impl.MarketDataSnapshotImpl#isHalted <em>Halted</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarketDataSnapshotImpl extends MinimalEObjectImpl.Container implements MarketDataSnapshot {
	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBidPrice() <em>Bid Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double BID_PRICE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getBidSize() <em>Bid Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBidSize()
	 * @generated
	 * @ordered
	 */
	protected static final int BID_SIZE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getAskPrice() <em>Ask Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAskPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double ASK_PRICE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getAskSize() <em>Ask Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAskSize()
	 * @generated
	 * @ordered
	 */
	protected static final int ASK_SIZE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getLastPrice() <em>Last Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double LAST_PRICE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getLastSize() <em>Last Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSize()
	 * @generated
	 * @ordered
	 */
	protected static final int LAST_SIZE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getHigh() <em>High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigh()
	 * @generated
	 * @ordered
	 */
	protected static final double HIGH_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getLow() <em>Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLow()
	 * @generated
	 * @ordered
	 */
	protected static final double LOW_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getOpen() <em>Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen()
	 * @generated
	 * @ordered
	 */
	protected static final double OPEN_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getClose() <em>Close</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClose()
	 * @generated
	 * @ordered
	 */
	protected static final double CLOSE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final long VOLUME_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #isHalted() <em>Halted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHalted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HALTED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarketDataSnapshotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TradingPackage.Literals.MARKET_DATA_SNAPSHOT;
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
	public Contract getContract() {
		return (Contract)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__CONTRACT, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__CONTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContract(Contract newContract, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newContract, TradingPackage.MARKET_DATA_SNAPSHOT__CONTRACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContract(Contract newContract) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__CONTRACT, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__CONTRACT, newContract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return (Date)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__TIMESTAMP, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__TIMESTAMP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Date newTimestamp) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__TIMESTAMP, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__TIMESTAMP, newTimestamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getBidPrice() {
		return (Double)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__BID_PRICE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__BID_PRICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBidPrice(double newBidPrice) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__BID_PRICE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__BID_PRICE, newBidPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBidSize() {
		return (Integer)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__BID_SIZE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__BID_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBidSize(int newBidSize) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__BID_SIZE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__BID_SIZE, newBidSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAskPrice() {
		return (Double)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__ASK_PRICE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__ASK_PRICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAskPrice(double newAskPrice) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__ASK_PRICE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__ASK_PRICE, newAskPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAskSize() {
		return (Integer)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__ASK_SIZE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__ASK_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAskSize(int newAskSize) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__ASK_SIZE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__ASK_SIZE, newAskSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLastPrice() {
		return (Double)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__LAST_PRICE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__LAST_PRICE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastPrice(double newLastPrice) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__LAST_PRICE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__LAST_PRICE, newLastPrice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLastSize() {
		return (Integer)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__LAST_SIZE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__LAST_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastSize(int newLastSize) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__LAST_SIZE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__LAST_SIZE, newLastSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getHigh() {
		return (Double)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__HIGH, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__HIGH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHigh(double newHigh) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__HIGH, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__HIGH, newHigh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getLow() {
		return (Double)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__LOW, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__LOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLow(double newLow) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__LOW, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__LOW, newLow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOpen() {
		return (Double)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__OPEN, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__OPEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpen(double newOpen) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__OPEN, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__OPEN, newOpen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getClose() {
		return (Double)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__CLOSE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__CLOSE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClose(double newClose) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__CLOSE, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__CLOSE, newClose);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getVolume() {
		return (Long)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__VOLUME, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__VOLUME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolume(long newVolume) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__VOLUME, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__VOLUME, newVolume);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHalted() {
		return (Boolean)eDynamicGet(TradingPackage.MARKET_DATA_SNAPSHOT__HALTED, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__HALTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHalted(boolean newHalted) {
		eDynamicSet(TradingPackage.MARKET_DATA_SNAPSHOT__HALTED, TradingPackage.Literals.MARKET_DATA_SNAPSHOT__HALTED, newHalted);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TradingPackage.MARKET_DATA_SNAPSHOT__CONTRACT:
				return basicSetContract(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TradingPackage.MARKET_DATA_SNAPSHOT__CONTRACT:
				return getContract();
			case TradingPackage.MARKET_DATA_SNAPSHOT__TIMESTAMP:
				return getTimestamp();
			case TradingPackage.MARKET_DATA_SNAPSHOT__BID_PRICE:
				return getBidPrice();
			case TradingPackage.MARKET_DATA_SNAPSHOT__BID_SIZE:
				return getBidSize();
			case TradingPackage.MARKET_DATA_SNAPSHOT__ASK_PRICE:
				return getAskPrice();
			case TradingPackage.MARKET_DATA_SNAPSHOT__ASK_SIZE:
				return getAskSize();
			case TradingPackage.MARKET_DATA_SNAPSHOT__LAST_PRICE:
				return getLastPrice();
			case TradingPackage.MARKET_DATA_SNAPSHOT__LAST_SIZE:
				return getLastSize();
			case TradingPackage.MARKET_DATA_SNAPSHOT__HIGH:
				return getHigh();
			case TradingPackage.MARKET_DATA_SNAPSHOT__LOW:
				return getLow();
			case TradingPackage.MARKET_DATA_SNAPSHOT__OPEN:
				return getOpen();
			case TradingPackage.MARKET_DATA_SNAPSHOT__CLOSE:
				return getClose();
			case TradingPackage.MARKET_DATA_SNAPSHOT__VOLUME:
				return getVolume();
			case TradingPackage.MARKET_DATA_SNAPSHOT__HALTED:
				return isHalted();
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
			case TradingPackage.MARKET_DATA_SNAPSHOT__CONTRACT:
				setContract((Contract)newValue);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__BID_PRICE:
				setBidPrice((Double)newValue);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__BID_SIZE:
				setBidSize((Integer)newValue);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__ASK_PRICE:
				setAskPrice((Double)newValue);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__ASK_SIZE:
				setAskSize((Integer)newValue);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__LAST_PRICE:
				setLastPrice((Double)newValue);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__LAST_SIZE:
				setLastSize((Integer)newValue);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__HIGH:
				setHigh((Double)newValue);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__LOW:
				setLow((Double)newValue);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__OPEN:
				setOpen((Double)newValue);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__CLOSE:
				setClose((Double)newValue);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__VOLUME:
				setVolume((Long)newValue);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__HALTED:
				setHalted((Boolean)newValue);
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
			case TradingPackage.MARKET_DATA_SNAPSHOT__CONTRACT:
				setContract((Contract)null);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__BID_PRICE:
				setBidPrice(BID_PRICE_EDEFAULT);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__BID_SIZE:
				setBidSize(BID_SIZE_EDEFAULT);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__ASK_PRICE:
				setAskPrice(ASK_PRICE_EDEFAULT);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__ASK_SIZE:
				setAskSize(ASK_SIZE_EDEFAULT);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__LAST_PRICE:
				setLastPrice(LAST_PRICE_EDEFAULT);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__LAST_SIZE:
				setLastSize(LAST_SIZE_EDEFAULT);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__HIGH:
				setHigh(HIGH_EDEFAULT);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__LOW:
				setLow(LOW_EDEFAULT);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__OPEN:
				setOpen(OPEN_EDEFAULT);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__CLOSE:
				setClose(CLOSE_EDEFAULT);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__VOLUME:
				setVolume(VOLUME_EDEFAULT);
				return;
			case TradingPackage.MARKET_DATA_SNAPSHOT__HALTED:
				setHalted(HALTED_EDEFAULT);
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
			case TradingPackage.MARKET_DATA_SNAPSHOT__CONTRACT:
				return getContract() != null;
			case TradingPackage.MARKET_DATA_SNAPSHOT__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? getTimestamp() != null : !TIMESTAMP_EDEFAULT.equals(getTimestamp());
			case TradingPackage.MARKET_DATA_SNAPSHOT__BID_PRICE:
				return getBidPrice() != BID_PRICE_EDEFAULT;
			case TradingPackage.MARKET_DATA_SNAPSHOT__BID_SIZE:
				return getBidSize() != BID_SIZE_EDEFAULT;
			case TradingPackage.MARKET_DATA_SNAPSHOT__ASK_PRICE:
				return getAskPrice() != ASK_PRICE_EDEFAULT;
			case TradingPackage.MARKET_DATA_SNAPSHOT__ASK_SIZE:
				return getAskSize() != ASK_SIZE_EDEFAULT;
			case TradingPackage.MARKET_DATA_SNAPSHOT__LAST_PRICE:
				return getLastPrice() != LAST_PRICE_EDEFAULT;
			case TradingPackage.MARKET_DATA_SNAPSHOT__LAST_SIZE:
				return getLastSize() != LAST_SIZE_EDEFAULT;
			case TradingPackage.MARKET_DATA_SNAPSHOT__HIGH:
				return getHigh() != HIGH_EDEFAULT;
			case TradingPackage.MARKET_DATA_SNAPSHOT__LOW:
				return getLow() != LOW_EDEFAULT;
			case TradingPackage.MARKET_DATA_SNAPSHOT__OPEN:
				return getOpen() != OPEN_EDEFAULT;
			case TradingPackage.MARKET_DATA_SNAPSHOT__CLOSE:
				return getClose() != CLOSE_EDEFAULT;
			case TradingPackage.MARKET_DATA_SNAPSHOT__VOLUME:
				return getVolume() != VOLUME_EDEFAULT;
			case TradingPackage.MARKET_DATA_SNAPSHOT__HALTED:
				return isHalted() != HALTED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //MarketDataSnapshotImpl
