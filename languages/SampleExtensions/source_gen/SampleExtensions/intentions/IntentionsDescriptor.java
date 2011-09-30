package SampleExtensions.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntentionsDescriptor;
import jetbrains.mps.project.structure.modules.ModuleReference;
import jetbrains.mps.smodel.SModelReference;

public class IntentionsDescriptor extends BaseIntentionsDescriptor {
  public IntentionsDescriptor() {
    super(new ModuleReference("SampleExtensions", "67b828fd-8fbc-4496-b7f7-8b64ac097c62"), SModelReference.fromString("r:c94a864e-ad51-4b38-a592-c0d7623187a1(SampleExtensions.intentions)"));
  }

  public void init() {
    add(new SurroundWithUnless_Intention(), "393299394024647596");
    add(new TurnToIfStatement_Intention(), "393299394024668987");
    add(new UnwrapUnlessBlock_Intention(), "393299394024667052");
  }
}