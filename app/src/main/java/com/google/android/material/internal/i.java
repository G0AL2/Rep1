package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

/* compiled from: VisibilityAwareImageButton.java */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class i extends ImageButton {

    /* renamed from: a  reason: collision with root package name */
    private int f22509a;

    public final void b(int i10, boolean z10) {
        super.setVisibility(i10);
        if (z10) {
            this.f22509a = i10;
        }
    }

    public final int getUserSetVisibility() {
        return this.f22509a;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        b(i10, true);
    }
}
