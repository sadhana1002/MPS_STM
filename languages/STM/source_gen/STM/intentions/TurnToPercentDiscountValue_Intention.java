package STM.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TurnToPercentDiscountValue_Intention extends BaseIntention implements Intention {
  public TurnToPercentDiscountValue_Intention() {
  }

  public String getConcept() {
    return "STM.structure.AbsoluteDiscountValue";
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
    return "Turn to Percentage";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode percentDiscountValue = SNodeFactoryOperations.createNewNode("STM.structure.PercentDiscountValue", null);
    SPropertyOperations.set(percentDiscountValue, "percent", "" + SPropertyOperations.getInteger(node, "value"));
    SNodeOperations.replaceWithAnother(node, percentDiscountValue);
  }

  public String getLocationString() {
    return "STM.intentions";
  }
}