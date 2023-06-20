package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f20427a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f20428b;

    public e(d dVar, Context context) {
        this.f20428b = dVar;
        this.f20427a = context;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        c cVar = this.f20428b.f20365b;
        if (cVar != null) {
            cVar.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f20428b.a(this.f20427a, true);
            return false;
        }
        return false;
    }
}
