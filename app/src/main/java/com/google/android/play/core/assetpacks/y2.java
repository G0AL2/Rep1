package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* loaded from: classes3.dex */
public final class y2 implements cb.g0<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final cb.g0<u2> f23107a;

    /* renamed from: b  reason: collision with root package name */
    private final cb.g0<Context> f23108b;

    public y2(cb.g0<u2> g0Var, cb.g0<Context> g0Var2) {
        this.f23107a = g0Var;
        this.f23108b = g0Var2;
    }

    @Override // cb.g0
    public final /* bridge */ /* synthetic */ Object a() {
        u2 a10 = this.f23107a.a();
        Context a11 = ((a3) this.f23108b).a();
        u2 u2Var = a10;
        cb.r.a(a11.getPackageManager(), new ComponentName(a11.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        PlayCoreDialogWrapperActivity.a(a11);
        cb.r.g(u2Var);
        return u2Var;
    }
}
