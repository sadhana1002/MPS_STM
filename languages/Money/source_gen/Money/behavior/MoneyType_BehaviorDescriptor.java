package Money.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Type_BehaviorDescriptor;
import java.util.List;
import jetbrains.mps.smodel.SNode;

public class MoneyType_BehaviorDescriptor extends Type_BehaviorDescriptor {
  public MoneyType_BehaviorDescriptor() {
  }

  public List<String> virtual_getVariableSuffixes_1213877337304(SNode thisNode) {
    return MoneyType_Behavior.virtual_getVariableSuffixes_1213877337304(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "Money.structure.MoneyType";
  }
}
