package Money.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConvertTo extends BaseConcept implements IOperation {
  public static final String concept = "Money.structure.ConvertTo";
  public static final String TARGET_CURRENCY = "targetCurrency";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String CONVERSION_TABLE = "conversionTable";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ConvertTo(SNode node) {
    super(node);
  }

  public String getTargetCurrency() {
    return this.getProperty(ConvertTo.TARGET_CURRENCY);
  }

  public void setTargetCurrency(String value) {
    this.setProperty(ConvertTo.TARGET_CURRENCY, value);
  }

  public String getShortDescription() {
    return this.getProperty(ConvertTo.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConvertTo.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConvertTo.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConvertTo.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConvertTo.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConvertTo.VIRTUAL_PACKAGE, value);
  }

  public Expression getConversionTable() {
    return (Expression) this.getChild(Expression.class, ConvertTo.CONVERSION_TABLE);
  }

  public void setConversionTable(Expression node) {
    super.setChild(ConvertTo.CONVERSION_TABLE, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ConvertTo.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ConvertTo.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ConvertTo.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ConvertTo.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ConvertTo.SMODEL_ATTRIBUTE, node);
  }

  public static ConvertTo newInstance(SModel sm, boolean init) {
    return (ConvertTo) SModelUtil_new.instantiateConceptDeclaration("Money.structure.ConvertTo", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConvertTo newInstance(SModel sm) {
    return ConvertTo.newInstance(sm, false);
  }
}