package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a0;
import ea.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f21236a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21237b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f21238c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f21239d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f21240e;

    /* renamed from: f  reason: collision with root package name */
    public final long f21241f;

    /* renamed from: g  reason: collision with root package name */
    public final long f21242g;

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f21243h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f21244i;

    /* renamed from: j  reason: collision with root package name */
    public final long f21245j;

    /* renamed from: k  reason: collision with root package name */
    public final int f21246k;

    /* renamed from: l  reason: collision with root package name */
    public final int f21247l;

    /* renamed from: m  reason: collision with root package name */
    public final int f21248m;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<SpliceInsertCommand> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SpliceInsertCommand[] newArray(int i10) {
            return new SpliceInsertCommand[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f21249a;

        /* renamed from: b  reason: collision with root package name */
        public final long f21250b;

        /* renamed from: c  reason: collision with root package name */
        public final long f21251c;

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f21249a);
            parcel.writeLong(this.f21250b);
            parcel.writeLong(this.f21251c);
        }

        private b(int i10, long j10, long j11) {
            this.f21249a = i10;
            this.f21250b = j10;
            this.f21251c = j11;
        }
    }

    /* synthetic */ SpliceInsertCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SpliceInsertCommand c(a0 a0Var, long j10, j0 j0Var) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int i10;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        long j13;
        long F = a0Var.F();
        boolean z15 = (a0Var.D() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z15) {
            list = emptyList;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z13 = false;
        } else {
            int D = a0Var.D();
            boolean z16 = (D & 128) != 0;
            boolean z17 = (D & 64) != 0;
            boolean z18 = (D & 32) != 0;
            boolean z19 = (D & 16) != 0;
            long e10 = (!z17 || z19) ? -9223372036854775807L : TimeSignalCommand.e(a0Var, j10);
            if (!z17) {
                int D2 = a0Var.D();
                ArrayList arrayList = new ArrayList(D2);
                for (int i13 = 0; i13 < D2; i13++) {
                    int D3 = a0Var.D();
                    long e11 = !z19 ? TimeSignalCommand.e(a0Var, j10) : -9223372036854775807L;
                    arrayList.add(new b(D3, e11, j0Var.b(e11), null));
                }
                emptyList = arrayList;
            }
            if (z18) {
                long D4 = a0Var.D();
                boolean z20 = (128 & D4) != 0;
                j13 = ((((D4 & 1) << 32) | a0Var.F()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                j13 = -9223372036854775807L;
            }
            i10 = a0Var.J();
            z13 = z17;
            i11 = a0Var.D();
            i12 = a0Var.D();
            list = emptyList;
            long j14 = e10;
            z12 = z14;
            j12 = j13;
            z11 = z19;
            z10 = z16;
            j11 = j14;
        }
        return new SpliceInsertCommand(F, z15, z10, z13, z11, j11, j0Var.b(j11), list, z12, j12, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f21236a);
        parcel.writeByte(this.f21237b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21238c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21239d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21240e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f21241f);
        parcel.writeLong(this.f21242g);
        int size = this.f21243h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f21243h.get(i11).b(parcel);
        }
        parcel.writeByte(this.f21244i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f21245j);
        parcel.writeInt(this.f21246k);
        parcel.writeInt(this.f21247l);
        parcel.writeInt(this.f21248m);
    }

    private SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f21236a = j10;
        this.f21237b = z10;
        this.f21238c = z11;
        this.f21239d = z12;
        this.f21240e = z13;
        this.f21241f = j11;
        this.f21242g = j12;
        this.f21243h = Collections.unmodifiableList(list);
        this.f21244i = z14;
        this.f21245j = j13;
        this.f21246k = i10;
        this.f21247l = i11;
        this.f21248m = i12;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.f21236a = parcel.readLong();
        this.f21237b = parcel.readByte() == 1;
        this.f21238c = parcel.readByte() == 1;
        this.f21239d = parcel.readByte() == 1;
        this.f21240e = parcel.readByte() == 1;
        this.f21241f = parcel.readLong();
        this.f21242g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.f21243h = Collections.unmodifiableList(arrayList);
        this.f21244i = parcel.readByte() == 1;
        this.f21245j = parcel.readLong();
        this.f21246k = parcel.readInt();
        this.f21247l = parcel.readInt();
        this.f21248m = parcel.readInt();
    }
}
