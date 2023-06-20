package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EndIconDelegate.java */
/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    TextInputLayout f22696a;

    /* renamed from: b  reason: collision with root package name */
    Context f22697b;

    /* renamed from: c  reason: collision with root package name */
    CheckableImageButton f22698c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(TextInputLayout textInputLayout) {
        this.f22696a = textInputLayout;
        this.f22697b = textInputLayout.getContext();
        this.f22698c = textInputLayout.getEndIconView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(int i10) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return false;
    }
}
