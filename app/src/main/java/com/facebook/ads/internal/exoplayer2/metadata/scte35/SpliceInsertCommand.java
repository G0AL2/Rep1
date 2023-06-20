package com.facebook.ads.internal.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.X.C0897Ea;
import com.facebook.ads.redexgen.X.C1004Ij;
import com.facebook.ads.redexgen.X.C1016Iv;
import com.facebook.ads.redexgen.X.EZ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new EZ();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<C0897Ea> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<C0897Ea> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.A06 = j10;
        this.A0B = z10;
        this.A09 = z11;
        this.A0A = z12;
        this.A0C = z13;
        this.A05 = j11;
        this.A04 = j12;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z14;
        this.A03 = j13;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(C0897Ea.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        this.A08 = parcel.readByte() == 1;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, EZ ez) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(C1004Ij c1004Ij, long j10, C1016Iv c1016Iv) {
        long A0M = c1004Ij.A0M();
        boolean z10 = (c1004Ij.A0E() & 128) != 0;
        boolean z11 = false;
        boolean autoReturn = false;
        boolean spliceImmediateFlag = false;
        long programSplicePts = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z12 = false;
        long j11 = -9223372036854775807L;
        if (!z10) {
            int A0E = c1004Ij.A0E();
            z11 = (A0E & 128) != 0;
            autoReturn = (A0E & 64) != 0;
            boolean programSpliceFlag = (A0E & 32) != 0;
            spliceImmediateFlag = (A0E & 16) != 0;
            if (autoReturn && !spliceImmediateFlag) {
                programSplicePts = TimeSignalCommand.A00(c1004Ij, j10);
            }
            if (!autoReturn) {
                int A0E2 = c1004Ij.A0E();
                emptyList = new ArrayList(A0E2);
                for (int i13 = 0; i13 < A0E2; i13++) {
                    int A0E3 = c1004Ij.A0E();
                    long j12 = -9223372036854775807L;
                    if (!spliceImmediateFlag) {
                        j12 = TimeSignalCommand.A00(c1004Ij, j10);
                    }
                    long spliceEventId = j12;
                    emptyList.add(new C0897Ea(A0E3, spliceEventId, c1016Iv.A07(j12), null));
                }
            }
            if (programSpliceFlag) {
                long A0E4 = c1004Ij.A0E();
                z12 = (A0E4 & 128) != 0;
                j11 = (1000 * (((A0E4 & 1) << 32) | c1004Ij.A0M())) / 90;
            }
            i10 = c1004Ij.A0I();
            i11 = c1004Ij.A0E();
            i12 = c1004Ij.A0E();
        }
        return new SpliceInsertCommand(A0M, z10, z11, autoReturn, spliceImmediateFlag, programSplicePts, c1016Iv.A07(programSplicePts), emptyList, z12, j11, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.A07.get(i11).A01(parcel);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
