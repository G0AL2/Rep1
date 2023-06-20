package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f21252a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<SpliceScheduleCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SpliceScheduleCommand[] newArray(int i10) {
            return new SpliceScheduleCommand[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f21253a;

        /* renamed from: b  reason: collision with root package name */
        public final long f21254b;

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f21253a);
            parcel.writeLong(this.f21254b);
        }

        private b(int i10, long j10) {
            this.f21253a = i10;
            this.f21254b = j10;
        }
    }

    /* synthetic */ SpliceScheduleCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SpliceScheduleCommand c(a0 a0Var) {
        int D = a0Var.D();
        ArrayList arrayList = new ArrayList(D);
        for (int i10 = 0; i10 < D; i10++) {
            arrayList.add(c.e(a0Var));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f21252a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f21252a.get(i11).f(parcel);
        }
    }

    private SpliceScheduleCommand(List<c> list) {
        this.f21252a = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.d(parcel));
        }
        this.f21252a = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f21255a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f21256b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f21257c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f21258d;

        /* renamed from: e  reason: collision with root package name */
        public final long f21259e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b> f21260f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f21261g;

        /* renamed from: h  reason: collision with root package name */
        public final long f21262h;

        /* renamed from: i  reason: collision with root package name */
        public final int f21263i;

        /* renamed from: j  reason: collision with root package name */
        public final int f21264j;

        /* renamed from: k  reason: collision with root package name */
        public final int f21265k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f21255a = j10;
            this.f21256b = z10;
            this.f21257c = z11;
            this.f21258d = z12;
            this.f21260f = Collections.unmodifiableList(list);
            this.f21259e = j11;
            this.f21261g = z13;
            this.f21262h = j12;
            this.f21263i = i10;
            this.f21264j = i11;
            this.f21265k = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(a0 a0Var) {
            ArrayList arrayList;
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int i12;
            boolean z12;
            boolean z13;
            long j12;
            long F = a0Var.F();
            boolean z14 = (a0Var.D() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j10 = -9223372036854775807L;
                z11 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                z12 = false;
            } else {
                int D = a0Var.D();
                boolean z15 = (D & 128) != 0;
                boolean z16 = (D & 64) != 0;
                boolean z17 = (D & 32) != 0;
                long F2 = z16 ? a0Var.F() : -9223372036854775807L;
                if (!z16) {
                    int D2 = a0Var.D();
                    ArrayList arrayList3 = new ArrayList(D2);
                    for (int i13 = 0; i13 < D2; i13++) {
                        arrayList3.add(new b(a0Var.D(), a0Var.F(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long D3 = a0Var.D();
                    boolean z18 = (128 & D3) != 0;
                    j12 = ((((D3 & 1) << 32) | a0Var.F()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j12 = -9223372036854775807L;
                }
                int J = a0Var.J();
                int D4 = a0Var.D();
                z12 = z16;
                i12 = a0Var.D();
                j11 = j12;
                arrayList = arrayList2;
                long j13 = F2;
                i10 = J;
                i11 = D4;
                j10 = j13;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new c(F, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f21255a);
            parcel.writeByte(this.f21256b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f21257c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f21258d ? (byte) 1 : (byte) 0);
            int size = this.f21260f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f21260f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f21259e);
            parcel.writeByte(this.f21261g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f21262h);
            parcel.writeInt(this.f21263i);
            parcel.writeInt(this.f21264j);
            parcel.writeInt(this.f21265k);
        }

        private c(Parcel parcel) {
            this.f21255a = parcel.readLong();
            this.f21256b = parcel.readByte() == 1;
            this.f21257c = parcel.readByte() == 1;
            this.f21258d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.c(parcel));
            }
            this.f21260f = Collections.unmodifiableList(arrayList);
            this.f21259e = parcel.readLong();
            this.f21261g = parcel.readByte() == 1;
            this.f21262h = parcel.readLong();
            this.f21263i = parcel.readInt();
            this.f21264j = parcel.readInt();
            this.f21265k = parcel.readInt();
        }
    }
}
