// This is a generated file. Not intended for manual editing.
package com.neueda.jetbrains.plugin.graphdb.language.cypher.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface CypherCreateIndex extends PsiElement {

  @NotNull
  CypherNodeLabel getNodeLabel();

  @NotNull
  CypherPropertyKeyName getPropertyKeyName();

  @NotNull
  PsiElement getKCreate();

  @NotNull
  PsiElement getKIndex();

  @NotNull
  PsiElement getKOn();

}
