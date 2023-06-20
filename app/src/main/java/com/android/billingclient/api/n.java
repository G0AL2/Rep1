package com.android.billingclient.api;

import android.text.TextUtils;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private String f6088a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n(o2.r rVar) {
    }

    public final n a(String str) {
        this.f6088a = str;
        return this;
    }

    public final o b() {
        if (!TextUtils.isEmpty(this.f6088a)) {
            return new o(this.f6088a, null, null, 0, null);
        }
        throw new IllegalArgumentException("SKU must be set.");
    }
}
