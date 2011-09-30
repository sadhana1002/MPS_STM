package SampleExtensions.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class TurnToIfStatement_Intention extends BaseIntention implements Intention {
  public TurnToIfStatement_Intention() {
  }

  public String getConcept() {
    return "SampleExtensions.structure.UnlessStatement";
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
    return "Turn to an If Statement";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    // Invert condition 
    SNode condition = SLinkOperations.getTarget(node, "condition", true);
    if ((condition != null)) {
      if (SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.NotExpression")) {
        condition = SLinkOperations.getTarget(SNodeOperations.cast(condition, "jetbrains.mps.baseLanguage.structure.NotExpression"), "expression", true);
      } else {
        SNode newCondition = null;
        if (SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.EqualsExpression")) {
          newCondition = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.NotEqualsExpression", null);
        } else
        if (SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.NotEqualsExpression")) {
          newCondition = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.EqualsExpression", null);
        } else
        if (SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.GreaterThanExpression")) {
          newCondition = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LessThanOrEqualsExpression", null);
        } else
        if (SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression")) {
          newCondition = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.LessThanExpression", null);
        } else
        if (SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.LessThanExpression")) {
          newCondition = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.GreaterThanOrEqualsExpression", null);
        } else
        if (SNodeOperations.isInstanceOf(condition, "jetbrains.mps.baseLanguage.structure.LessThanOrEqualsExpression")) {
          newCondition = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.GreaterThanExpression", null);
        }
        if (newCondition != null) {
          SLinkOperations.setTarget(newCondition, "leftExpression", SLinkOperations.getTarget(SNodeOperations.cast(condition, "jetbrains.mps.baseLanguage.structure.BinaryOperation"), "leftExpression", true), true);
          SLinkOperations.setTarget(newCondition, "rightExpression", SLinkOperations.getTarget(SNodeOperations.cast(condition, "jetbrains.mps.baseLanguage.structure.BinaryOperation"), "rightExpression", true), true);
          condition = newCondition;
        } else {
          SNode notExpression = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.NotExpression", null);
          SLinkOperations.setTarget(notExpression, "expression", condition, true);
          condition = notExpression;
        }
      }
      SNode ifStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.IfStatement", null);
      SLinkOperations.setTarget(ifStatement, "condition", condition, true);
      SLinkOperations.setTarget(ifStatement, "ifTrue", SLinkOperations.getTarget(node, "body", true), true);
      SNodeOperations.replaceWithAnother(node, ifStatement);
    }
  }

  public String getLocationString() {
    return "SampleExtensions.intentions";
  }
}