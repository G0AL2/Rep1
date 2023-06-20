package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class y extends cb.q0 {

    /* renamed from: a  reason: collision with root package name */
    private final cb.e f23101a = new cb.e("AssetPackExtractionService");

    /* renamed from: b  reason: collision with root package name */
    private final Context f23102b;

    /* renamed from: c  reason: collision with root package name */
    private final AssetPackExtractionService f23103c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f23104d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(Context context, AssetPackExtractionService assetPackExtractionService, a0 a0Var) {
        this.f23102b = context;
        this.f23103c = assetPackExtractionService;
        this.f23104d = a0Var;
    }

    @Override // cb.r0
    public final void l(Bundle bundle, cb.t0 t0Var) throws RemoteException {
        String[] packagesForUid;
        this.f23101a.c("updateServiceState AIDL call", new Object[0]);
        if (cb.s.a(this.f23102b) && (packagesForUid = this.f23102b.getPackageManager().getPackagesForUid(Binder.getCallingUid())) != null && Arrays.asList(packagesForUid).contains("com.android.vending")) {
            t0Var.b(this.f23103c.a(bundle), new Bundle());
            return;
        }
        t0Var.a(new Bundle());
        this.f23103c.b();
    }

    @Override // cb.r0
    public final void o(cb.t0 t0Var) throws RemoteException {
        this.f23104d.z();
        t0Var.c(new Bundle());
    }
}
