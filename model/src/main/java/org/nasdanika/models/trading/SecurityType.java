/**
 */
package org.nasdanika.models.trading;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Security Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Available security types for trading instruments
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.trading.TradingPackage#getSecurityType()
 * @model
 * @generated
 */
public enum SecurityType implements Enumerator {
	/**
	 * The '<em><b>STK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stock or ETF
	 * <!-- end-model-doc -->
	 * @see #STK_VALUE
	 * @generated
	 * @ordered
	 */
	STK(0, "STK", "STK"),

	/**
	 * The '<em><b>OPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Option
	 * <!-- end-model-doc -->
	 * @see #OPT_VALUE
	 * @generated
	 * @ordered
	 */
	OPT(1, "OPT", "OPT"),

	/**
	 * The '<em><b>FUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Future
	 * <!-- end-model-doc -->
	 * @see #FUT_VALUE
	 * @generated
	 * @ordered
	 */
	FUT(2, "FUT", "FUT"),

	/**
	 * The '<em><b>FOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Futures Option
	 * <!-- end-model-doc -->
	 * @see #FOP_VALUE
	 * @generated
	 * @ordered
	 */
	FOP(3, "FOP", "FOP"),

	/**
	 * The '<em><b>CFD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contract for Difference
	 * <!-- end-model-doc -->
	 * @see #CFD_VALUE
	 * @generated
	 * @ordered
	 */
	CFD(4, "CFD", "CFD"),

	/**
	 * The '<em><b>CASH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Forex pair
	 * <!-- end-model-doc -->
	 * @see #CASH_VALUE
	 * @generated
	 * @ordered
	 */
	CASH(5, "CASH", "CASH"),

	/**
	 * The '<em><b>BOND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bond
	 * <!-- end-model-doc -->
	 * @see #BOND_VALUE
	 * @generated
	 * @ordered
	 */
	BOND(6, "BOND", "BOND"),

	/**
	 * The '<em><b>WAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Warrant
	 * <!-- end-model-doc -->
	 * @see #WAR_VALUE
	 * @generated
	 * @ordered
	 */
	WAR(7, "WAR", "WAR"),

	/**
	 * The '<em><b>FUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mutual Fund
	 * <!-- end-model-doc -->
	 * @see #FUND_VALUE
	 * @generated
	 * @ordered
	 */
	FUND(8, "FUND", "FUND"),

	/**
	 * The '<em><b>CRYPTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cryptocurrency
	 * <!-- end-model-doc -->
	 * @see #CRYPTO_VALUE
	 * @generated
	 * @ordered
	 */
	CRYPTO(9, "CRYPTO", "CRYPTO"),

	/**
	 * The '<em><b>IND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Index
	 * <!-- end-model-doc -->
	 * @see #IND_VALUE
	 * @generated
	 * @ordered
	 */
	IND(10, "IND", "IND"),

	/**
	 * The '<em><b>CMDTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commodity
	 * <!-- end-model-doc -->
	 * @see #CMDTY_VALUE
	 * @generated
	 * @ordered
	 */
	CMDTY(11, "CMDTY", "CMDTY"),

	/**
	 * The '<em><b>BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Combo/Spread
	 * <!-- end-model-doc -->
	 * @see #BAG_VALUE
	 * @generated
	 * @ordered
	 */
	BAG(12, "BAG", "BAG"),

	/**
	 * The '<em><b>IOPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issuer Option
	 * <!-- end-model-doc -->
	 * @see #IOPT_VALUE
	 * @generated
	 * @ordered
	 */
	IOPT(13, "IOPT", "IOPT");

	/**
	 * The '<em><b>STK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stock or ETF
	 * <!-- end-model-doc -->
	 * @see #STK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STK_VALUE = 0;

	/**
	 * The '<em><b>OPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Option
	 * <!-- end-model-doc -->
	 * @see #OPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPT_VALUE = 1;

	/**
	 * The '<em><b>FUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Future
	 * <!-- end-model-doc -->
	 * @see #FUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUT_VALUE = 2;

	/**
	 * The '<em><b>FOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Futures Option
	 * <!-- end-model-doc -->
	 * @see #FOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOP_VALUE = 3;

	/**
	 * The '<em><b>CFD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contract for Difference
	 * <!-- end-model-doc -->
	 * @see #CFD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CFD_VALUE = 4;

	/**
	 * The '<em><b>CASH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Forex pair
	 * <!-- end-model-doc -->
	 * @see #CASH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASH_VALUE = 5;

	/**
	 * The '<em><b>BOND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bond
	 * <!-- end-model-doc -->
	 * @see #BOND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOND_VALUE = 6;

	/**
	 * The '<em><b>WAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Warrant
	 * <!-- end-model-doc -->
	 * @see #WAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAR_VALUE = 7;

	/**
	 * The '<em><b>FUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mutual Fund
	 * <!-- end-model-doc -->
	 * @see #FUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FUND_VALUE = 8;

	/**
	 * The '<em><b>CRYPTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cryptocurrency
	 * <!-- end-model-doc -->
	 * @see #CRYPTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRYPTO_VALUE = 9;

	/**
	 * The '<em><b>IND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Index
	 * <!-- end-model-doc -->
	 * @see #IND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IND_VALUE = 10;

	/**
	 * The '<em><b>CMDTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commodity
	 * <!-- end-model-doc -->
	 * @see #CMDTY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CMDTY_VALUE = 11;

	/**
	 * The '<em><b>BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Combo/Spread
	 * <!-- end-model-doc -->
	 * @see #BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAG_VALUE = 12;

	/**
	 * The '<em><b>IOPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issuer Option
	 * <!-- end-model-doc -->
	 * @see #IOPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IOPT_VALUE = 13;

	/**
	 * An array of all the '<em><b>Security Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SecurityType[] VALUES_ARRAY =
		new SecurityType[] {
			STK,
			OPT,
			FUT,
			FOP,
			CFD,
			CASH,
			BOND,
			WAR,
			FUND,
			CRYPTO,
			IND,
			CMDTY,
			BAG,
			IOPT,
		};

	/**
	 * A public read-only list of all the '<em><b>Security Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SecurityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Security Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SecurityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Security Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SecurityType get(int value) {
		switch (value) {
			case STK_VALUE: return STK;
			case OPT_VALUE: return OPT;
			case FUT_VALUE: return FUT;
			case FOP_VALUE: return FOP;
			case CFD_VALUE: return CFD;
			case CASH_VALUE: return CASH;
			case BOND_VALUE: return BOND;
			case WAR_VALUE: return WAR;
			case FUND_VALUE: return FUND;
			case CRYPTO_VALUE: return CRYPTO;
			case IND_VALUE: return IND;
			case CMDTY_VALUE: return CMDTY;
			case BAG_VALUE: return BAG;
			case IOPT_VALUE: return IOPT;
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
	private SecurityType(int value, String name, String literal) {
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
	
} //SecurityType
