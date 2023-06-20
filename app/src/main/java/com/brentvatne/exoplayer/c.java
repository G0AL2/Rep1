package com.brentvatne.exoplayer;

import android.content.Context;
import da.d0;
import da.s;
import da.y;

/* compiled from: DefaultReactExoplayerConfig.java */
/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private final s f9104a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f9105b = false;

    public c(Context context) {
        this.f9104a = new s.b(context).a();
    }

    @Override // com.brentvatne.exoplayer.e
    public void a(boolean z10) {
        this.f9105b = z10;
    }

    @Override // com.brentvatne.exoplayer.e
    public d0 b(int i10) {
        if (this.f9105b) {
            return new f(i10);
        }
        return new y(i10);
    }

    @Override // com.brentvatne.exoplayer.e
    public s c() {
        return this.f9104a;
    }
}
