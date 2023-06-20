package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Ee {
    public static String[] A0B = {"s27kRN", "abG5pKADna", "w2jztrB", "I7geUVX8H5XW4NGFgS7QGYJa3", "W37aGUNVZO5G", "W3qhVhIXcY", "2nbP2bKsNJFzfOABHc993I7Qj", "6HcftuEFFeXx4hy"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C0900Ed> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public Ee(long j10, boolean z10, boolean z11, boolean z12, List<C0900Ed> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
        this.A04 = j10;
        this.A0A = z10;
        this.A08 = z11;
        this.A09 = z12;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j11;
        this.A07 = z13;
        this.A03 = j12;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public Ee(Parcel parcel) {
        C0900Ed A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            A00 = C0900Ed.A00(parcel);
            arrayList.add(A00);
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        this.A07 = parcel.readByte() == 1;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public static Ee A00(Parcel parcel) {
        return new Ee(parcel);
    }

    public static /* synthetic */ Ee A01(Parcel parcel) {
        return A00(parcel);
    }

    public static Ee A02(C1004Ij c1004Ij) {
        long A0M = c1004Ij.A0M();
        boolean autoReturn = (c1004Ij.A0E() & 128) != 0;
        boolean z10 = false;
        boolean z11 = false;
        long j10 = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int headerByte = 0;
        int i11 = 0;
        boolean z12 = false;
        long j11 = -9223372036854775807L;
        if (!autoReturn) {
            int A0E = c1004Ij.A0E();
            if (A0B[2].length() != 7) {
                throw new RuntimeException();
            }
            A0B[6] = "oYMFgXMCdR9ldlOsYeO";
            z10 = (A0E & 128) != 0;
            z11 = (A0E & 64) != 0;
            boolean z13 = (A0E & 32) != 0;
            if (z11) {
                j10 = c1004Ij.A0M();
            }
            if (!z11) {
                int A0E2 = c1004Ij.A0E();
                arrayList = new ArrayList(A0E2);
                for (int i12 = 0; i12 < A0E2; i12++) {
                    arrayList.add(new C0900Ed(c1004Ij.A0E(), c1004Ij.A0M(), null));
                }
            }
            if (z13) {
                int componentCount = c1004Ij.A0E();
                long j12 = componentCount;
                int i13 = ((128 & j12) > 0L ? 1 : ((128 & j12) == 0L ? 0 : -1));
                z12 = i13 != 0;
                long breakDuration90khz = ((1 & j12) << 32) | c1004Ij.A0M();
                j11 = (1000 * breakDuration90khz) / 90;
            }
            i10 = c1004Ij.A0I();
            headerByte = c1004Ij.A0E();
            i11 = c1004Ij.A0E();
        }
        return new Ee(A0M, autoReturn, z10, z11, arrayList, j10, z12, j11, i10, headerByte, i11);
    }

    public static /* synthetic */ Ee A03(C1004Ij c1004Ij) {
        return A02(c1004Ij);
    }

    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.A06.get(i10).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public static /* synthetic */ void A05(Ee ee2, Parcel parcel) {
        ee2.A04(parcel);
    }
}
