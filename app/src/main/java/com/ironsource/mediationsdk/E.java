package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.data.DataKeys;

/* loaded from: classes3.dex */
public final class E {

    /* renamed from: a  reason: collision with root package name */
    final String f26258a;

    /* renamed from: b  reason: collision with root package name */
    final String f26259b;

    public E(String str, String str2) {
        qe.k.f(str, "appKey");
        qe.k.f(str2, DataKeys.USER_ID);
        this.f26258a = str;
        this.f26259b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E) {
                E e10 = (E) obj;
                return qe.k.a(this.f26258a, e10.f26258a) && qe.k.a(this.f26259b, e10.f26259b);
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f26258a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f26259b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "InitConfig(appKey=" + this.f26258a + ", userId=" + this.f26259b + ")";
    }
}
