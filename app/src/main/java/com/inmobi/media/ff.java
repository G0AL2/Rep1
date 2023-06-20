package com.inmobi.media;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: NativeScrollableContainer.java */
/* loaded from: classes3.dex */
public abstract class ff extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final byte f25385a;

    /* compiled from: NativeScrollableContainer.java */
    /* loaded from: classes3.dex */
    interface a {
        int a(int i10);
    }

    public ff(Context context, byte b10) {
        super(context);
        this.f25385a = b10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(bv bvVar, fg fgVar, int i10, int i11, a aVar);

    public final byte getType() {
        return this.f25385a;
    }
}
