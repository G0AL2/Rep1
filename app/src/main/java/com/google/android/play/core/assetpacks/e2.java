package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: c  reason: collision with root package name */
    private static final cb.e f22811c = new cb.e("PackageStateCache");

    /* renamed from: a  reason: collision with root package name */
    private final Context f22812a;

    /* renamed from: b  reason: collision with root package name */
    private int f22813b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e2(Context context) {
        this.f22812a = context;
    }

    public final synchronized int a() {
        if (this.f22813b == -1) {
            try {
                this.f22813b = this.f22812a.getPackageManager().getPackageInfo(this.f22812a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f22811c.e("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f22813b;
    }
}
