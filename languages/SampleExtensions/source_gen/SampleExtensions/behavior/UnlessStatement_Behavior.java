package SampleExtensions.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class UnlessStatement_Behavior {
  public static void init(SNode thisNode) {
    SLinkOperations.addNewChild(SLinkOperations.getTarget(thisNode, "body", true), "statement", "jetbrains.mps.baseLanguage.structure.Statement");
  }
}