package com.raket.silverstripe.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import com.raket.silverstripe.psi.SilverStripeNamedElement;
import com.raket.silverstripe.psi.SilverStripeTypes;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class SilverStripeIncludeImpl extends SilverStripeNamedElementImpl implements SilverStripeNamedElement {

	public SilverStripeIncludeImpl(@NotNull ASTNode node) {
		super(node);
	}

	@Nullable
	@Override
	public PsiElement getNameIdentifier() {
		ASTNode keyNode = this.getNode().findChildByType(SilverStripeTypes.SS_INCLUDE_FILE);
		if (keyNode != null) {
			return keyNode.getPsi();
		} else {
			return null;
		}
	}

	public String getName() {
		ASTNode keyNode = this.getNode().findChildByType(SilverStripeTypes.SS_INCLUDE_FILE);
		if (keyNode != null) {
			return keyNode.getText();
		} else {
			return null;
		}
	}

	@Override
	public PsiElement setName(@NonNls @NotNull String name) throws IncorrectOperationException {
		return this;
	}

	@Nullable
	public TextRange getReferenceTextRange() {
		ASTNode keyNode = this.getNode().findChildByType(SilverStripeTypes.SS_INCLUDE_FILE);

		if (keyNode != null) {
			int textStart = keyNode.getPsi().getTextOffset();
			int textLength = this.getTextLength();
			return new TextRange(0, textLength);
		} else {
			return null;
		}
	}
}
