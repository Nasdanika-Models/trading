/**
 */
package org.nasdanika.models.trading;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Time In Force</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Time in Force - how long the order remains active
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.trading.TradingPackage#getTimeInForce()
 * @model
 * @generated
 */
public enum TimeInForce implements Enumerator {
	/**
	 * The '<em><b>DAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Valid for the trading day only
	 * <!-- end-model-doc -->
	 * @see #DAY_VALUE
	 * @generated
	 * @ordered
	 */
	DAY(0, "DAY", "DAY"),

	/**
	 * The '<em><b>GTC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Good-Til-Cancelled - remains active until filled or cancelled
	 * <!-- end-model-doc -->
	 * @see #GTC_VALUE
	 * @generated
	 * @ordered
	 */
	GTC(1, "GTC", "GTC"),

	/**
	 * The '<em><b>IOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immediate-or-Cancel - fills immediately or cancels unfilled portion
	 * <!-- end-model-doc -->
	 * @see #IOC_VALUE
	 * @generated
	 * @ordered
	 */
	IOC(2, "IOC", "IOC"),

	/**
	 * The '<em><b>GTD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Good-Til-Date - remains active until specified date
	 * <!-- end-model-doc -->
	 * @see #GTD_VALUE
	 * @generated
	 * @ordered
	 */
	GTD(3, "GTD", "GTD"),

	/**
	 * The '<em><b>OPG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At-the-Opening - executes at market open
	 * <!-- end-model-doc -->
	 * @see #OPG_VALUE
	 * @generated
	 * @ordered
	 */
	OPG(4, "OPG", "OPG"),

	/**
	 * The '<em><b>FOK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fill-or-Kill - must be filled entirely immediately or cancelled
	 * <!-- end-model-doc -->
	 * @see #FOK_VALUE
	 * @generated
	 * @ordered
	 */
	FOK(5, "FOK", "FOK"),

	/**
	 * The '<em><b>DTC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Day-Til-Cancelled
	 * <!-- end-model-doc -->
	 * @see #DTC_VALUE
	 * @generated
	 * @ordered
	 */
	DTC(6, "DTC", "DTC");

	/**
	 * The '<em><b>DAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Valid for the trading day only
	 * <!-- end-model-doc -->
	 * @see #DAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DAY_VALUE = 0;

	/**
	 * The '<em><b>GTC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Good-Til-Cancelled - remains active until filled or cancelled
	 * <!-- end-model-doc -->
	 * @see #GTC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GTC_VALUE = 1;

	/**
	 * The '<em><b>IOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immediate-or-Cancel - fills immediately or cancels unfilled portion
	 * <!-- end-model-doc -->
	 * @see #IOC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IOC_VALUE = 2;

	/**
	 * The '<em><b>GTD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Good-Til-Date - remains active until specified date
	 * <!-- end-model-doc -->
	 * @see #GTD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GTD_VALUE = 3;

	/**
	 * The '<em><b>OPG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At-the-Opening - executes at market open
	 * <!-- end-model-doc -->
	 * @see #OPG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPG_VALUE = 4;

	/**
	 * The '<em><b>FOK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fill-or-Kill - must be filled entirely immediately or cancelled
	 * <!-- end-model-doc -->
	 * @see #FOK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOK_VALUE = 5;

	/**
	 * The '<em><b>DTC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Day-Til-Cancelled
	 * <!-- end-model-doc -->
	 * @see #DTC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DTC_VALUE = 6;

	/**
	 * An array of all the '<em><b>Time In Force</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TimeInForce[] VALUES_ARRAY =
		new TimeInForce[] {
			DAY,
			GTC,
			IOC,
			GTD,
			OPG,
			FOK,
			DTC,
		};

	/**
	 * A public read-only list of all the '<em><b>Time In Force</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TimeInForce> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Time In Force</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeInForce get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeInForce result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time In Force</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeInForce getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TimeInForce result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Time In Force</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TimeInForce get(int value) {
		switch (value) {
			case DAY_VALUE: return DAY;
			case GTC_VALUE: return GTC;
			case IOC_VALUE: return IOC;
			case GTD_VALUE: return GTD;
			case OPG_VALUE: return OPG;
			case FOK_VALUE: return FOK;
			case DTC_VALUE: return DTC;
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
	private TimeInForce(int value, String name, String literal) {
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
	
} //TimeInForce
