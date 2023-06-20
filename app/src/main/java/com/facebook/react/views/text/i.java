package com.facebook.react.views.text;

import com.facebook.react.uimanager.e0;

/* compiled from: ReactRawTextShadowNode.java */
/* loaded from: classes.dex */
public class i extends e0 {

    /* renamed from: y  reason: collision with root package name */
    private String f16204y = null;

    @Override // com.facebook.react.uimanager.e0, com.facebook.react.uimanager.d0
    public boolean R() {
        return true;
    }

    public String p1() {
        return this.f16204y;
    }

    @w6.a(name = "text")
    public void setText(String str) {
        this.f16204y = str;
        x0();
    }

    @Override // com.facebook.react.uimanager.e0
    public String toString() {
        return y() + " [text: " + this.f16204y + "]";
    }
}
