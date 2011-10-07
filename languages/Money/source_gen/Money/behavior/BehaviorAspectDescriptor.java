package Money.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  private static String[] stringSwitchCases_846f5o_a0a0a = new String[]{"Money.structure.ConvertTo", "Money.structure.GetAmount", "Money.structure.GetCurrency", "Money.structure.MoneyConversionType", "Money.structure.MoneyLiteral", "Money.structure.MoneyType"};

  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0a, fqName)) {
      case 4:
        return new MoneyLiteral_BehaviorDescriptor();
      case 5:
        return new MoneyType_BehaviorDescriptor();
      case 1:
        return new GetAmount_BehaviorDescriptor();
      case 2:
        return new GetCurrency_BehaviorDescriptor();
      case 0:
        return new ConvertTo_BehaviorDescriptor();
      case 3:
        return new MoneyConversionType_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }
}