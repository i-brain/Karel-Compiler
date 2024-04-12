/**
 */
package statemachine.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.model.EventHandler#getKind <em>Kind</em>}</li>
 *   <li>{@link statemachine.model.EventHandler#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see statemachine.model.ModelPackage#getEventHandler()
 * @model
 * @generated
 */
public interface EventHandler extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link statemachine.model.EventHandlerKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see statemachine.model.EventHandlerKind
	 * @see #setKind(EventHandlerKind)
	 * @see statemachine.model.ModelPackage#getEventHandler_Kind()
	 * @model unique="false"
	 * @generated
	 */
	EventHandlerKind getKind();

	/**
	 * Sets the value of the '{@link statemachine.model.EventHandler#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see statemachine.model.EventHandlerKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(EventHandlerKind value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.model.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see statemachine.model.ModelPackage#getEventHandler_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // EventHandler
