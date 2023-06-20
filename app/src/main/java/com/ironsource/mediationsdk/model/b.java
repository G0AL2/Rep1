package com.ironsource.mediationsdk.model;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f27220a;

    public b() {
        this(null, 1);
    }

    public b(String str) {
        qe.k.f(str, "auctionData");
        this.f27220a = str;
    }

    private /* synthetic */ b(String str, int i10) {
        this("");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && qe.k.a(this.f27220a, ((b) obj).f27220a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f27220a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ApplicationAuctionSettings(auctionData=" + this.f27220a + ")";
    }
}
