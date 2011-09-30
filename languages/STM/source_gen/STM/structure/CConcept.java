package STM.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CConcept extends BaseConcept {
  public static final String concept = "STM.structure.CConcept";
  public static final String ACONCEPT = "aconcept";

  public CConcept(SNode node) {
    super(node);
  }

  public int getAconceptsCount() {
    return this.getChildCount(CConcept.ACONCEPT);
  }

  public Iterator<AConcept> aconcepts() {
    return this.children(AConcept.class, CConcept.ACONCEPT);
  }

  public List<AConcept> getAconcepts() {
    return this.getChildren(AConcept.class, CConcept.ACONCEPT);
  }

  public void addAconcept(AConcept node) {
    this.addChild(CConcept.ACONCEPT, node);
  }

  public void insertAconcept(AConcept prev, AConcept node) {
    this.insertChild(prev, CConcept.ACONCEPT, node);
  }

  public static CConcept newInstance(SModel sm, boolean init) {
    return (CConcept) SModelUtil_new.instantiateConceptDeclaration("STM.structure.CConcept", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CConcept newInstance(SModel sm) {
    return CConcept.newInstance(sm, false);
  }
}