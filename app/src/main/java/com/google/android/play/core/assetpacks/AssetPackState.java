package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* loaded from: classes3.dex */
public abstract class AssetPackState {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static AssetPackState a(Bundle bundle, String str, w0 w0Var, x xVar) {
        return b(str, xVar.a(bundle.getInt(cb.h0.a("status", str)), str), bundle.getInt(cb.h0.a("error_code", str)), bundle.getLong(cb.h0.a("bytes_downloaded", str)), bundle.getLong(cb.h0.a("total_bytes_to_download", str)), w0Var.c(str));
    }

    public static AssetPackState b(String str, int i10, int i11, long j10, long j11, double d10) {
        return new f0(str, i10, i11, j10, j11, (int) Math.rint(100.0d * d10));
    }

    public abstract long c();

    public abstract int d();

    public abstract String e();

    public abstract int f();

    public abstract long g();

    public abstract int h();
}
