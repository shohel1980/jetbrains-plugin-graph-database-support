// This is a generated file. Not intended for manual editing.
package com.neueda.jetbrains.plugin.cypher.psi.impl;

import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.neueda.jetbrains.plugin.cypher.psi.*;

public class CypherSymbolicNameStringImpl extends ASTWrapperPsiElement implements CypherSymbolicNameString {

  public CypherSymbolicNameStringImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CypherVisitor visitor) {
    visitor.visitSymbolicNameString(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CypherVisitor) accept((CypherVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public CypherEscapedSymbolicNameString getEscapedSymbolicNameString() {
    return findChildByClass(CypherEscapedSymbolicNameString.class);
  }

  @Override
  @Nullable
  public CypherUnescapedSymbolicNameString getUnescapedSymbolicNameString() {
    return findChildByClass(CypherUnescapedSymbolicNameString.class);
  }

}