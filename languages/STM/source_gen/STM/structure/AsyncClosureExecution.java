package STM.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AsyncClosureExecution extends ClosureLiteral {
  public static final String concept = "STM.structure.AsyncClosureExecution";

  public AsyncClosureExecution(SNode node) {
    super(node);
  }

  public static AsyncClosureExecution newInstance(SModel sm, boolean init) {
    return (AsyncClosureExecution) SModelUtil_new.instantiateConceptDeclaration("STM.structure.AsyncClosureExecution", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AsyncClosureExecution newInstance(SModel sm) {
    return AsyncClosureExecution.newInstance(sm, false);
  }
}