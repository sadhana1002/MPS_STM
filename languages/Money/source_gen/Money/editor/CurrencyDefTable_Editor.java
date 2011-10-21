package Money.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class CurrencyDefTable_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_6q11gp_a(editorContext, node);
  }

  private EditorCell createCollection_6q11gp_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_6q11gp_a");
    editorCell.addEditorCell(this.createConstant_6q11gp_a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNodeList_6q11gp_b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_6q11gp_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "Currencies");
    editorCell.setCellId("Constant_6q11gp_a0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNodeList_6q11gp_b0(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new CurrencyDefTable_Editor.unitsListHandler_6q11gp_b0(node, "units", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_units");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private static class unitsListHandler_6q11gp_b0 extends RefNodeListHandler {
    public unitsListHandler_6q11gp_b0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(editorContext);
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
        }
      }
    }
  }
}
