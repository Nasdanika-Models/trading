/**
 */
package org.nasdanika.models.trading;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Order Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Status of an order in the IBKR system
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.trading.TradingPackage#getOrderStatus()
 * @model
 * @generated
 */
public enum OrderStatus implements Enumerator {
	/**
	 * The '<em><b>Pending Submit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order transmitted but not yet confirmed by destination
	 * <!-- end-model-doc -->
	 * @see #PENDING_SUBMIT_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING_SUBMIT(0, "PendingSubmit", "PendingSubmit"),

	/**
	 * The '<em><b>Pending Cancel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancel request sent but not yet confirmed
	 * <!-- end-model-doc -->
	 * @see #PENDING_CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING_CANCEL(1, "PendingCancel", "PendingCancel"),

	/**
	 * The '<em><b>Pre Submitted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simulated order accepted, waiting for trigger
	 * <!-- end-model-doc -->
	 * @see #PRE_SUBMITTED_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_SUBMITTED(2, "PreSubmitted", "PreSubmitted"),

	/**
	 * The '<em><b>Submitted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order accepted by the system
	 * <!-- end-model-doc -->
	 * @see #SUBMITTED_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMITTED(3, "Submitted", "Submitted"),

	/**
	 * The '<em><b>Api Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled by API client before acknowledgement
	 * <!-- end-model-doc -->
	 * @see #API_CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	API_CANCELLED(4, "ApiCancelled", "ApiCancelled"),

	/**
	 * The '<em><b>Cancelled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order cancelled by IB system
	 * <!-- end-model-doc -->
	 * @see #CANCELLED_VALUE
	 * @generated
	 * @ordered
	 */
	CANCELLED(5, "Cancelled", "Cancelled"),

	/**
	 * The '<em><b>Filled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order completely filled
	 * <!-- end-model-doc -->
	 * @see #FILLED_VALUE
	 * @generated
	 * @ordered
	 */
	FILLED(6, "Filled", "Filled"),

	/**
	 * The '<em><b>Inactive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order received but no longer active (rejected or cancelled)
	 * <!-- end-model-doc -->
	 * @see #INACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	INACTIVE(7, "Inactive", "Inactive");

	/**
	 * The '<em><b>Pending Submit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order transmitted but not yet confirmed by destination
	 * <!-- end-model-doc -->
	 * @see #PENDING_SUBMIT
	 * @model name="PendingSubmit"
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_SUBMIT_VALUE = 0;

	/**
	 * The '<em><b>Pending Cancel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancel request sent but not yet confirmed
	 * <!-- end-model-doc -->
	 * @see #PENDING_CANCEL
	 * @model name="PendingCancel"
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_CANCEL_VALUE = 1;

	/**
	 * The '<em><b>Pre Submitted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Simulated order accepted, waiting for trigger
	 * <!-- end-model-doc -->
	 * @see #PRE_SUBMITTED
	 * @model name="PreSubmitted"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_SUBMITTED_VALUE = 2;

	/**
	 * The '<em><b>Submitted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order accepted by the system
	 * <!-- end-model-doc -->
	 * @see #SUBMITTED
	 * @model name="Submitted"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMITTED_VALUE = 3;

	/**
	 * The '<em><b>Api Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cancelled by API client before acknowledgement
	 * <!-- end-model-doc -->
	 * @see #API_CANCELLED
	 * @model name="ApiCancelled"
	 * @generated
	 * @ordered
	 */
	public static final int API_CANCELLED_VALUE = 4;

	/**
	 * The '<em><b>Cancelled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order cancelled by IB system
	 * <!-- end-model-doc -->
	 * @see #CANCELLED
	 * @model name="Cancelled"
	 * @generated
	 * @ordered
	 */
	public static final int CANCELLED_VALUE = 5;

	/**
	 * The '<em><b>Filled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order completely filled
	 * <!-- end-model-doc -->
	 * @see #FILLED
	 * @model name="Filled"
	 * @generated
	 * @ordered
	 */
	public static final int FILLED_VALUE = 6;

	/**
	 * The '<em><b>Inactive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order received but no longer active (rejected or cancelled)
	 * <!-- end-model-doc -->
	 * @see #INACTIVE
	 * @model name="Inactive"
	 * @generated
	 * @ordered
	 */
	public static final int INACTIVE_VALUE = 7;

	/**
	 * An array of all the '<em><b>Order Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrderStatus[] VALUES_ARRAY =
		new OrderStatus[] {
			PENDING_SUBMIT,
			PENDING_CANCEL,
			PRE_SUBMITTED,
			SUBMITTED,
			API_CANCELLED,
			CANCELLED,
			FILLED,
			INACTIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Order Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrderStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Order Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderStatus get(int value) {
		switch (value) {
			case PENDING_SUBMIT_VALUE: return PENDING_SUBMIT;
			case PENDING_CANCEL_VALUE: return PENDING_CANCEL;
			case PRE_SUBMITTED_VALUE: return PRE_SUBMITTED;
			case SUBMITTED_VALUE: return SUBMITTED;
			case API_CANCELLED_VALUE: return API_CANCELLED;
			case CANCELLED_VALUE: return CANCELLED;
			case FILLED_VALUE: return FILLED;
			case INACTIVE_VALUE: return INACTIVE;
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
	private OrderStatus(int value, String name, String literal) {
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
	
} //OrderStatus
