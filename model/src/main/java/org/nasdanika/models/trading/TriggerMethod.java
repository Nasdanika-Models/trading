/**
 */
package org.nasdanika.models.trading;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trigger Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * How simulated stop orders are triggered
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.trading.TradingPackage#getTriggerMethod()
 * @model
 * @generated
 */
public enum TriggerMethod implements Enumerator {
	/**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default method for instrument
	 * <!-- end-model-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "DEFAULT", "DEFAULT"),

	/**
	 * The '<em><b>DOUBLE BID ASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggered on two consecutive bid/ask prices
	 * <!-- end-model-doc -->
	 * @see #DOUBLE_BID_ASK_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_BID_ASK(1, "DOUBLE_BID_ASK", "DOUBLE_BID_ASK"),

	/**
	 * The '<em><b>LAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggered on last traded price
	 * <!-- end-model-doc -->
	 * @see #LAST_VALUE
	 * @generated
	 * @ordered
	 */
	LAST(2, "LAST", "LAST"),

	/**
	 * The '<em><b>DOUBLE LAST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggered on two consecutive last prices
	 * <!-- end-model-doc -->
	 * @see #DOUBLE_LAST_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_LAST(3, "DOUBLE_LAST", "DOUBLE_LAST"),

	/**
	 * The '<em><b>BID ASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggered on bid/ask price
	 * <!-- end-model-doc -->
	 * @see #BID_ASK_VALUE
	 * @generated
	 * @ordered
	 */
	BID_ASK(4, "BID_ASK", "BID_ASK"),

	/**
	 * The '<em><b>LAST OR BID ASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggered on last or bid/ask
	 * <!-- end-model-doc -->
	 * @see #LAST_OR_BID_ASK_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_OR_BID_ASK(7, "LAST_OR_BID_ASK", "LAST_OR_BID_ASK"),

	/**
	 * The '<em><b>MIDPOINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggered on midpoint
	 * <!-- end-model-doc -->
	 * @see #MIDPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	MIDPOINT(8, "MIDPOINT", "MIDPOINT");

	/**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default method for instrument
	 * <!-- end-model-doc -->
	 * @see #DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>DOUBLE BID ASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggered on two consecutive bid/ask prices
	 * <!-- end-model-doc -->
	 * @see #DOUBLE_BID_ASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_BID_ASK_VALUE = 1;

	/**
	 * The '<em><b>LAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggered on last traded price
	 * <!-- end-model-doc -->
	 * @see #LAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAST_VALUE = 2;

	/**
	 * The '<em><b>DOUBLE LAST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggered on two consecutive last prices
	 * <!-- end-model-doc -->
	 * @see #DOUBLE_LAST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_LAST_VALUE = 3;

	/**
	 * The '<em><b>BID ASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggered on bid/ask price
	 * <!-- end-model-doc -->
	 * @see #BID_ASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BID_ASK_VALUE = 4;

	/**
	 * The '<em><b>LAST OR BID ASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggered on last or bid/ask
	 * <!-- end-model-doc -->
	 * @see #LAST_OR_BID_ASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAST_OR_BID_ASK_VALUE = 7;

	/**
	 * The '<em><b>MIDPOINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Triggered on midpoint
	 * <!-- end-model-doc -->
	 * @see #MIDPOINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDPOINT_VALUE = 8;

	/**
	 * An array of all the '<em><b>Trigger Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TriggerMethod[] VALUES_ARRAY =
		new TriggerMethod[] {
			DEFAULT,
			DOUBLE_BID_ASK,
			LAST,
			DOUBLE_LAST,
			BID_ASK,
			LAST_OR_BID_ASK,
			MIDPOINT,
		};

	/**
	 * A public read-only list of all the '<em><b>Trigger Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TriggerMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trigger Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggerMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggerMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TriggerMethod get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case DOUBLE_BID_ASK_VALUE: return DOUBLE_BID_ASK;
			case LAST_VALUE: return LAST;
			case DOUBLE_LAST_VALUE: return DOUBLE_LAST;
			case BID_ASK_VALUE: return BID_ASK;
			case LAST_OR_BID_ASK_VALUE: return LAST_OR_BID_ASK;
			case MIDPOINT_VALUE: return MIDPOINT;
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
	private TriggerMethod(int value, String name, String literal) {
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
	
} //TriggerMethod
