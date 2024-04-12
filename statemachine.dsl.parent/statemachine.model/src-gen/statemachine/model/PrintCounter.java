/**
 */
package statemachine.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Print Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.model.PrintCounter#getText <em>Text</em>}</li>
 *   <li>{@link statemachine.model.PrintCounter#getValue <em>Value</em>}</li>
 *   <li>{@link statemachine.model.PrintCounter#getText2 <em>Text2</em>}</li>
 * </ul>
 *
 * @see statemachine.model.ModelPackage#getPrintCounter()
 * @model
 * @generated
 */
public interface PrintCounter extends Statement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see statemachine.model.ModelPackage#getPrintCounter_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link statemachine.model.PrintCounter#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see statemachine.model.ModelPackage#getPrintCounter_Value()
	 * @model unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link statemachine.model.PrintCounter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Text2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text2</em>' attribute.
	 * @see #setText2(String)
	 * @see statemachine.model.ModelPackage#getPrintCounter_Text2()
	 * @model unique="false"
	 * @generated
	 */
	String getText2();

	/**
	 * Sets the value of the '{@link statemachine.model.PrintCounter#getText2 <em>Text2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text2</em>' attribute.
	 * @see #getText2()
	 * @generated
	 */
	void setText2(String value);

} // PrintCounter
