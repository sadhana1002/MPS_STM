package Money.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ITranslator2;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class QueriesGenerated {
  public static List<INodeSubstituteAction> sideTransform_ActionsFactory_IntegerLiteral_3607579524910547545(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<INodeSubstituteAction> result = ListSequence.fromList(new ArrayList<INodeSubstituteAction>());
    {
      SNode concept = SConceptOperations.findConceptDeclaration("Money.structure.MoneyLiteral");
      ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(concept, _context.getSourceNode()) {
        public SNode doSubstitute(final String pattern) {
          Iterable<SNode> units = ListSequence.fromList(SModelOperations.getRoots(SNodeOperations.getModel(_context.getSourceNode()), "Money.structure.CurrencyDefTable")).translate(new ITranslator2<SNode, SNode>() {
            public Iterable<SNode> translate(SNode it) {
              return SLinkOperations.getTargets(it, "units", true);
            }
          });
          SNode unit = Sequence.fromIterable(units).findFirst(new IWhereFilter<SNode>() {
            public boolean accept(SNode it) {
              return SPropertyOperations.getString(it, "name").equals(pattern);
            }
          });
          if (unit != null) {
            SNode ml = SConceptOperations.createNewNode("Money.structure.MoneyLiteral", null);
            SLinkOperations.setTarget(ml, "unit", unit, false);
            SPropertyOperations.set(ml, "amount", "" + SPropertyOperations.getInteger(SNodeOperations.cast(_context.getSourceNode(), "jetbrains.mps.baseLanguage.structure.IntegerConstant"), "value"));
            SNodeOperations.replaceWithAnother(_context.getSourceNode(), ml);
            return SLinkOperations.getTarget(ml, "unit", false);
          }
          return _context.getSourceNode();
        }

        public String getMatchingText(String pattern) {
          Iterable<SNode> units = ListSequence.fromList(SModelOperations.getRoots(SNodeOperations.getModel(_context.getSourceNode()), "Money.structure.CurrencyDefTable")).translate(new ITranslator2<SNode, SNode>() {
            public Iterable<SNode> translate(SNode it) {
              return SLinkOperations.getTargets(it, "units", true);
            }
          });
          for (SNode u : Sequence.fromIterable(units)) {
            if (SPropertyOperations.getString(u, "name").startsWith(pattern)) {
              return SPropertyOperations.getString(u, "name");
            }
          }
          return null;
        }

        public String getVisibleMatchingText(String pattern) {
          return this.getMatchingText(pattern);
        }
      });
    }
    return result;
  }
}
