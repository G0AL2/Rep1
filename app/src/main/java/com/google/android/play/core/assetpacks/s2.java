package com.google.android.play.core.assetpacks;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements gb.c {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f23015a;

    private s2(a0 a0Var) {
        this.f23015a = a0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static gb.c a(a0 a0Var) {
        return new s2(a0Var);
    }

    @Override // gb.c
    public final void onSuccess(Object obj) {
        this.f23015a.g((List) obj);
    }
}
