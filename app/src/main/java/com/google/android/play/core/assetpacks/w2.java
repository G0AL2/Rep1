package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class w2 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23095a;

    public w2(Context context) {
        this.f23095a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context a() {
        return this.f23095a;
    }
}
