package com.bytedance.sdk.openadsdk.component.reward.b;

import android.app.Activity;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.d;
import com.bytedance.sdk.openadsdk.core.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;

/* compiled from: RewardFullAdType.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected Activity f11540a;

    /* renamed from: b  reason: collision with root package name */
    protected n f11541b;

    /* renamed from: c  reason: collision with root package name */
    protected int f11542c;

    /* renamed from: d  reason: collision with root package name */
    protected int f11543d;

    /* renamed from: e  reason: collision with root package name */
    protected int f11544e;

    /* renamed from: f  reason: collision with root package name */
    protected float f11545f;

    /* renamed from: g  reason: collision with root package name */
    protected String f11546g;

    /* renamed from: h  reason: collision with root package name */
    protected e f11547h;

    /* compiled from: RewardFullAdType.java */
    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0166a {
        void a(boolean z10);
    }

    public a(Activity activity, n nVar, int i10, int i11) {
        this.f11540a = activity;
        this.f11541b = nVar;
        this.f11542c = i10;
        this.f11543d = i11;
    }

    public InterfaceC0166a a() {
        return null;
    }

    public final void a(int i10) {
        this.f11544e = i10;
    }

    public abstract void a(FrameLayout frameLayout);

    public abstract void a(com.bytedance.sdk.openadsdk.component.reward.a.c cVar, d dVar);

    public abstract boolean b();

    public abstract boolean c();

    public final void a(float f10) {
        this.f11545f = f10;
    }

    public final void a(String str) {
        this.f11546g = str;
    }

    public final void a(e eVar) {
        this.f11547h = eVar;
    }
}
