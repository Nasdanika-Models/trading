/**
 */
package org.nasdanika.models.trading;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Proposal Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Status of a trading proposal from an agent
 * <!-- end-model-doc -->
 * @see org.nasdanika.models.trading.TradingPackage#getProposalStatus()
 * @model
 * @generated
 */
public enum ProposalStatus implements Enumerator {
	/**
	 * The '<em><b>DRAFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal being created, not ready for review
	 * <!-- end-model-doc -->
	 * @see #DRAFT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAFT(0, "DRAFT", "DRAFT"),

	/**
	 * The '<em><b>PENDING REVIEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal submitted for human review
	 * <!-- end-model-doc -->
	 * @see #PENDING_REVIEW_VALUE
	 * @generated
	 * @ordered
	 */
	PENDING_REVIEW(1, "PENDING_REVIEW", "PENDING_REVIEW"),

	/**
	 * The '<em><b>APPROVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal approved for execution
	 * <!-- end-model-doc -->
	 * @see #APPROVED_VALUE
	 * @generated
	 * @ordered
	 */
	APPROVED(2, "APPROVED", "APPROVED"),

	/**
	 * The '<em><b>REJECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal rejected, will not be executed
	 * <!-- end-model-doc -->
	 * @see #REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REJECTED(3, "REJECTED", "REJECTED"),

	/**
	 * The '<em><b>EXECUTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal is being executed
	 * <!-- end-model-doc -->
	 * @see #EXECUTING_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTING(4, "EXECUTING", "EXECUTING"),

	/**
	 * The '<em><b>EXECUTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All orders in proposal have been executed
	 * <!-- end-model-doc -->
	 * @see #EXECUTED_VALUE
	 * @generated
	 * @ordered
	 */
	EXECUTED(5, "EXECUTED", "EXECUTED"),

	/**
	 * The '<em><b>PARTIALLY EXECUTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some orders executed, others pending or failed
	 * <!-- end-model-doc -->
	 * @see #PARTIALLY_EXECUTED_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLY_EXECUTED(6, "PARTIALLY_EXECUTED", "PARTIALLY_EXECUTED"),

	/**
	 * The '<em><b>FAILED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Execution failed
	 * <!-- end-model-doc -->
	 * @see #FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED(7, "FAILED", "FAILED"),

	/**
	 * The '<em><b>EXPIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal expired without being executed
	 * <!-- end-model-doc -->
	 * @see #EXPIRED_VALUE
	 * @generated
	 * @ordered
	 */
	EXPIRED(8, "EXPIRED", "EXPIRED");

	/**
	 * The '<em><b>DRAFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal being created, not ready for review
	 * <!-- end-model-doc -->
	 * @see #DRAFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRAFT_VALUE = 0;

	/**
	 * The '<em><b>PENDING REVIEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal submitted for human review
	 * <!-- end-model-doc -->
	 * @see #PENDING_REVIEW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PENDING_REVIEW_VALUE = 1;

	/**
	 * The '<em><b>APPROVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal approved for execution
	 * <!-- end-model-doc -->
	 * @see #APPROVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPROVED_VALUE = 2;

	/**
	 * The '<em><b>REJECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal rejected, will not be executed
	 * <!-- end-model-doc -->
	 * @see #REJECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REJECTED_VALUE = 3;

	/**
	 * The '<em><b>EXECUTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal is being executed
	 * <!-- end-model-doc -->
	 * @see #EXECUTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTING_VALUE = 4;

	/**
	 * The '<em><b>EXECUTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All orders in proposal have been executed
	 * <!-- end-model-doc -->
	 * @see #EXECUTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXECUTED_VALUE = 5;

	/**
	 * The '<em><b>PARTIALLY EXECUTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some orders executed, others pending or failed
	 * <!-- end-model-doc -->
	 * @see #PARTIALLY_EXECUTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLY_EXECUTED_VALUE = 6;

	/**
	 * The '<em><b>FAILED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Execution failed
	 * <!-- end-model-doc -->
	 * @see #FAILED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_VALUE = 7;

	/**
	 * The '<em><b>EXPIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Proposal expired without being executed
	 * <!-- end-model-doc -->
	 * @see #EXPIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPIRED_VALUE = 8;

	/**
	 * An array of all the '<em><b>Proposal Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProposalStatus[] VALUES_ARRAY =
		new ProposalStatus[] {
			DRAFT,
			PENDING_REVIEW,
			APPROVED,
			REJECTED,
			EXECUTING,
			EXECUTED,
			PARTIALLY_EXECUTED,
			FAILED,
			EXPIRED,
		};

	/**
	 * A public read-only list of all the '<em><b>Proposal Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProposalStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Proposal Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProposalStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProposalStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Proposal Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProposalStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProposalStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Proposal Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProposalStatus get(int value) {
		switch (value) {
			case DRAFT_VALUE: return DRAFT;
			case PENDING_REVIEW_VALUE: return PENDING_REVIEW;
			case APPROVED_VALUE: return APPROVED;
			case REJECTED_VALUE: return REJECTED;
			case EXECUTING_VALUE: return EXECUTING;
			case EXECUTED_VALUE: return EXECUTED;
			case PARTIALLY_EXECUTED_VALUE: return PARTIALLY_EXECUTED;
			case FAILED_VALUE: return FAILED;
			case EXPIRED_VALUE: return EXPIRED;
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
	private ProposalStatus(int value, String name, String literal) {
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
	
} //ProposalStatus
