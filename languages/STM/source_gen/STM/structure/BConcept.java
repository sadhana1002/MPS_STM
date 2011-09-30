package STM.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BConcept extends BaseConcept implements INamedConcept {
  public static final String concept = "STM.structure.BConcept";
  public static final String VALUE = "value";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public BConcept(SNode node) {
    super(node);
  }

  public String getValue() {
    return this.getProperty(BConcept.VALUE);
  }

  public void setValue(String value) {
    this.setProperty(BConcept.VALUE, value);
  }

  public String getName() {
    return this.getProperty(BConcept.NAME);
  }

  public void setName(String value) {
    this.setProperty(BConcept.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(BConcept.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BConcept.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BConcept.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BConcept.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BConcept.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BConcept.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(BConcept.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, BConcept.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, BConcept.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(BConcept.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, BConcept.SMODEL_ATTRIBUTE, node);
  }

  public static BConcept newInstance(SModel sm, boolean init) {
    return (BConcept) SModelUtil_new.instantiateConceptDeclaration("STM.structure.BConcept", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BConcept newInstance(SModel sm) {
    return BConcept.newInstance(sm, false);
  }
}