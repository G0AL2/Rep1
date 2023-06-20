package com.google.android.play.core.assetpacks;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements gb.b {

    /* renamed from: a  reason: collision with root package name */
    static final gb.b f23034a = new t2();

    private t2() {
    }

    @Override // gb.b
    public final void onFailure(Exception exc) {
        u2.f23053e.g(String.format("Could not sync active asset packs. %s", exc), new Object[0]);
    }
}
