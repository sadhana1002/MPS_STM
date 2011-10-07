package SampleExtensions.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TrueFlow extends Flow {
  public static final String concept = "SampleExtensions.structure.TrueFlow";

  public TrueFlow(SNode node) {
    super(node);
  }

  public static TrueFlow newInstance(SModel sm, boolean init) {
    return (TrueFlow) SModelUtil_new.instantiateConceptDeclaration("SampleExtensions.structure.TrueFlow", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TrueFlow newInstance(SModel sm) {
    return TrueFlow.newInstance(sm, false);
  }
}