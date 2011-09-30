package SampleExtensions.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.SurroundWithIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class SurroundWithUnless_Intention extends SurroundWithIntention implements Intention {
  public SurroundWithUnless_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Statement";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Unless";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode unlessStatement = SNodeFactoryOperations.createNewNode("SampleExtensions.structure.UnlessStatement", null);
    List<SNode> selectedNodes = editorContext.getSelectedNodes();
    SNodeOperations.insertNextSiblingChild(ListSequence.fromList(selectedNodes).last(), unlessStatement);
    for (SNode selectedNode : ListSequence.fromList(selectedNodes)) {
      ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(unlessStatement, "body", true), "statement", true)).addElement(SNodeOperations.getAncestor(selectedNode, "jetbrains.mps.baseLanguage.structure.Statement", true, false));
    }
    editorContext.select(SLinkOperations.getTarget(unlessStatement, "condition", true));

  }

  public String getLocationString() {
    return "SampleExtensions.intentions";
  }
}