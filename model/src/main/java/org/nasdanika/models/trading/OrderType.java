/**
 */
package org.nasdanika.models.trading;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Order Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Order types supported by IBKR. See https://www.interactivebrokers.com/campus/ibkr-api-page/order-types/
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.trading.TradingPackage#getOrderType()
 * @model
 * @generated
 */
public enum OrderType implements Enumerator {
	/**
	 * The '<em><b>MKT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Market order - executes immediately at best available price
	 * <!-- end-model-doc -->
	 * @see #MKT_VALUE
	 * @generated
	 * @ordered
	 */
	MKT(0, "MKT", "MKT"),

	/**
	 * The '<em><b>LMT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Limit order - executes at specified price or better
	 * <!-- end-model-doc -->
	 * @see #LMT_VALUE
	 * @generated
	 * @ordered
	 */
	LMT(1, "LMT", "LMT"),

	/**
	 * The '<em><b>STP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop order - becomes market order when stop price is reached
	 * <!-- end-model-doc -->
	 * @see #STP_VALUE
	 * @generated
	 * @ordered
	 */
	STP(2, "STP", "STP"),

	/**
	 * The '<em><b>STP LMT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop limit order - becomes limit order when stop price is reached
	 * <!-- end-model-doc -->
	 * @see #STP_LMT_VALUE
	 * @generated
	 * @ordered
	 */
	STP_LMT(3, "STP_LMT", "STP_LMT"),

	/**
	 * The '<em><b>MIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Market-if-Touched - becomes market order when trigger price is reached
	 * <!-- end-model-doc -->
	 * @see #MIT_VALUE
	 * @generated
	 * @ordered
	 */
	MIT(4, "MIT", "MIT"),

	/**
	 * The '<em><b>LIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Limit-if-Touched - becomes limit order when trigger price is reached
	 * <!-- end-model-doc -->
	 * @see #LIT_VALUE
	 * @generated
	 * @ordered
	 */
	LIT(5, "LIT", "LIT"),

	/**
	 * The '<em><b>TRAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trailing stop order
	 * <!-- end-model-doc -->
	 * @see #TRAIL_VALUE
	 * @generated
	 * @ordered
	 */
	TRAIL(6, "TRAIL", "TRAIL"),

	/**
	 * The '<em><b>TRAIL LIMIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trailing stop limit order
	 * <!-- end-model-doc -->
	 * @see #TRAIL_LIMIT_VALUE
	 * @generated
	 * @ordered
	 */
	TRAIL_LIMIT(7, "TRAIL_LIMIT", "TRAIL_LIMIT"),

	/**
	 * The '<em><b>REL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative/Pegged-to-Primary order
	 * <!-- end-model-doc -->
	 * @see #REL_VALUE
	 * @generated
	 * @ordered
	 */
	REL(8, "REL", "REL"),

	/**
	 * The '<em><b>MOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Market-on-Close order
	 * <!-- end-model-doc -->
	 * @see #MOC_VALUE
	 * @generated
	 * @ordered
	 */
	MOC(9, "MOC", "MOC"),

	/**
	 * The '<em><b>LOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Limit-on-Close order
	 * <!-- end-model-doc -->
	 * @see #LOC_VALUE
	 * @generated
	 * @ordered
	 */
	LOC(10, "LOC", "LOC"),

	/**
	 * The '<em><b>MIDPRICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Midprice order - pegged to midpoint
	 * <!-- end-model-doc -->
	 * @see #MIDPRICE_VALUE
	 * @generated
	 * @ordered
	 */
	MIDPRICE(11, "MIDPRICE", "MIDPRICE"),

	/**
	 * The '<em><b>ADAPTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IB Adaptive algo order
	 * <!-- end-model-doc -->
	 * @see #ADAPTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ADAPTIVE(12, "ADAPTIVE", "ADAPTIVE"),

	/**
	 * The '<em><b>VWAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Volume Weighted Average Price algo
	 * <!-- end-model-doc -->
	 * @see #VWAP_VALUE
	 * @generated
	 * @ordered
	 */
	VWAP(13, "VWAP", "VWAP"),

	/**
	 * The '<em><b>TWAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time Weighted Average Price algo
	 * <!-- end-model-doc -->
	 * @see #TWAP_VALUE
	 * @generated
	 * @ordered
	 */
	TWAP(14, "TWAP", "TWAP");

	/**
	 * The '<em><b>MKT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Market order - executes immediately at best available price
	 * <!-- end-model-doc -->
	 * @see #MKT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MKT_VALUE = 0;

	/**
	 * The '<em><b>LMT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Limit order - executes at specified price or better
	 * <!-- end-model-doc -->
	 * @see #LMT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LMT_VALUE = 1;

	/**
	 * The '<em><b>STP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop order - becomes market order when stop price is reached
	 * <!-- end-model-doc -->
	 * @see #STP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STP_VALUE = 2;

	/**
	 * The '<em><b>STP LMT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stop limit order - becomes limit order when stop price is reached
	 * <!-- end-model-doc -->
	 * @see #STP_LMT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STP_LMT_VALUE = 3;

	/**
	 * The '<em><b>MIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Market-if-Touched - becomes market order when trigger price is reached
	 * <!-- end-model-doc -->
	 * @see #MIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIT_VALUE = 4;

	/**
	 * The '<em><b>LIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Limit-if-Touched - becomes limit order when trigger price is reached
	 * <!-- end-model-doc -->
	 * @see #LIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIT_VALUE = 5;

	/**
	 * The '<em><b>TRAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trailing stop order
	 * <!-- end-model-doc -->
	 * @see #TRAIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAIL_VALUE = 6;

	/**
	 * The '<em><b>TRAIL LIMIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trailing stop limit order
	 * <!-- end-model-doc -->
	 * @see #TRAIL_LIMIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAIL_LIMIT_VALUE = 7;

	/**
	 * The '<em><b>REL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative/Pegged-to-Primary order
	 * <!-- end-model-doc -->
	 * @see #REL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REL_VALUE = 8;

	/**
	 * The '<em><b>MOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Market-on-Close order
	 * <!-- end-model-doc -->
	 * @see #MOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOC_VALUE = 9;

	/**
	 * The '<em><b>LOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Limit-on-Close order
	 * <!-- end-model-doc -->
	 * @see #LOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOC_VALUE = 10;

	/**
	 * The '<em><b>MIDPRICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Midprice order - pegged to midpoint
	 * <!-- end-model-doc -->
	 * @see #MIDPRICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDPRICE_VALUE = 11;

	/**
	 * The '<em><b>ADAPTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IB Adaptive algo order
	 * <!-- end-model-doc -->
	 * @see #ADAPTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADAPTIVE_VALUE = 12;

	/**
	 * The '<em><b>VWAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Volume Weighted Average Price algo
	 * <!-- end-model-doc -->
	 * @see #VWAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VWAP_VALUE = 13;

	/**
	 * The '<em><b>TWAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Time Weighted Average Price algo
	 * <!-- end-model-doc -->
	 * @see #TWAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWAP_VALUE = 14;

	/**
	 * An array of all the '<em><b>Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrderType[] VALUES_ARRAY =
		new OrderType[] {
			MKT,
			LMT,
			STP,
			STP_LMT,
			MIT,
			LIT,
			TRAIL,
			TRAIL_LIMIT,
			REL,
			MOC,
			LOC,
			MIDPRICE,
			ADAPTIVE,
			VWAP,
			TWAP,
		};

	/**
	 * A public read-only list of all the '<em><b>Order Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrderType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Order Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderType get(int value) {
		switch (value) {
			case MKT_VALUE: return MKT;
			case LMT_VALUE: return LMT;
			case STP_VALUE: return STP;
			case STP_LMT_VALUE: return STP_LMT;
			case MIT_VALUE: return MIT;
			case LIT_VALUE: return LIT;
			case TRAIL_VALUE: return TRAIL;
			case TRAIL_LIMIT_VALUE: return TRAIL_LIMIT;
			case REL_VALUE: return REL;
			case MOC_VALUE: return MOC;
			case LOC_VALUE: return LOC;
			case MIDPRICE_VALUE: return MIDPRICE;
			case ADAPTIVE_VALUE: return ADAPTIVE;
			case VWAP_VALUE: return VWAP;
			case TWAP_VALUE: return TWAP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OrderType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //OrderType
