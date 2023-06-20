package com.facebook.ads.redexgen.X;

import android.os.Parcel;

/* renamed from: com.facebook.ads.redexgen.X.Ed  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0900Ed {
    public final int A00;
    public final long A01;

    public C0900Ed(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public /* synthetic */ C0900Ed(int i10, long j10, C0899Ec c0899Ec) {
        this(i10, j10);
    }

    public static C0900Ed A00(Parcel parcel) {
        return new C0900Ed(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
