/**
 */
package org.nasdanika.models.trading;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Account Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Type of trading account
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.trading.TradingPackage#getAccountType()
 * @model
 * @generated
 */
public enum AccountType implements Enumerator {
	/**
	 * The '<em><b>LIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Real money account
	 * <!-- end-model-doc -->
	 * @see #LIVE_VALUE
	 * @generated
	 * @ordered
	 */
	LIVE(0, "LIVE", "LIVE"),

	/**
	 * The '<em><b>PAPER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Paper trading account for practice
	 * <!-- end-model-doc -->
	 * @see #PAPER_VALUE
	 * @generated
	 * @ordered
	 */
	PAPER(1, "PAPER", "PAPER");

	/**
	 * The '<em><b>LIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Real money account
	 * <!-- end-model-doc -->
	 * @see #LIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIVE_VALUE = 0;

	/**
	 * The '<em><b>PAPER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Paper trading account for practice
	 * <!-- end-model-doc -->
	 * @see #PAPER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAPER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Account Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccountType[] VALUES_ARRAY =
		new AccountType[] {
			LIVE,
			PAPER,
		};

	/**
	 * A public read-only list of all the '<em><b>Account Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AccountType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Account Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccountType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccountType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Account Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccountType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccountType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Account Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AccountType get(int value) {
		switch (value) {
			case LIVE_VALUE: return LIVE;
			case PAPER_VALUE: return PAPER;
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
	private AccountType(int value, String name, String literal) {
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
	
} //AccountType
