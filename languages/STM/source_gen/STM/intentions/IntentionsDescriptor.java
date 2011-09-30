package STM.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntentionsDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelReference;

public class IntentionsDescriptor extends BaseIntentionsDescriptor {
  public IntentionsDescriptor() {
    super(new ModuleReference("STM", "be19a6e9-e972-4c4e-867f-04466d2dde44"), SModelReference.fromString("r:e5d1ed82-ce03-4f2e-97f7-95ba919eb0ab(STM.intentions)"));
  }

  public void init() {
    add(new CreateDefaultVolumeDiscount_Intention(), "3399367608522535774");
    add(new CreateEmptyVolumeDiscount_Intention(), "3399367608522560555");
    add(new MakeSurroundWith_Intention(), "5375423026569891159");
    add(new SuroundWithAtomicExpression_Intention(), "3972610319144769251");
    add(new SurroundWithAtomic_Intention(), "7434600580015926423");
    add(new SurroundWithAtomicBlock_Intention(), "4268640335983753294");
    add(new TurnToAbsoluteDiscountValue_Intention(), "3399367608522478871");
    add(new TurnToPercentDiscountValue_Intention(), "3399367608522427179");
    add(new UnwrapAtomicBlock_Intention(), "5375423026569892148");
    add(new UnwrapAtomicExpression_Intention(), "4268640335983737736");
  }
}