package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.r;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public abstract class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final r f19339a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19340b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f19341c;

    /* renamed from: d  reason: collision with root package name */
    public final i[] f19342d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f19343e;

    /* renamed from: f  reason: collision with root package name */
    public int f19344f;

    /* loaded from: classes2.dex */
    public static final class b implements Comparator<i> {
        public b() {
        }

        @Override // java.util.Comparator
        public int compare(i iVar, i iVar2) {
            return iVar2.f19115b - iVar.f19115b;
        }
    }

    public a(r rVar, int... iArr) {
        int i10 = 0;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.b(iArr.length > 0);
        this.f19339a = (r) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(rVar);
        int length = iArr.length;
        this.f19340b = length;
        this.f19342d = new i[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f19342d[i11] = rVar.a(iArr[i11]);
        }
        Arrays.sort(this.f19342d, new b());
        this.f19341c = new int[this.f19340b];
        while (true) {
            int i12 = this.f19340b;
            if (i10 < i12) {
                this.f19341c[i10] = rVar.a(this.f19342d[i10]);
                i10++;
            } else {
                this.f19343e = new long[i12];
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final i a(int i10) {
        return this.f19342d[i10];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final r b() {
        return this.f19339a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final int c(int i10) {
        for (int i11 = 0; i11 < this.f19340b; i11++) {
            if (this.f19341c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19339a == aVar.f19339a && Arrays.equals(this.f19341c, aVar.f19341c);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final int f() {
        return this.f19341c.length;
    }

    public int hashCode() {
        if (this.f19344f == 0) {
            this.f19344f = (System.identityHashCode(this.f19339a) * 31) + Arrays.hashCode(this.f19341c);
        }
        return this.f19344f;
    }

    public final int a(i iVar) {
        for (int i10 = 0; i10 < this.f19340b; i10++) {
            if (this.f19342d[i10] == iVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final int b(int i10) {
        return this.f19341c[i10];
    }

    public final boolean b(int i10, long j10) {
        return this.f19343e[i10] > j10;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final i c() {
        return this.f19342d[e()];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final int a() {
        return this.f19341c[e()];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e
    public final boolean a(int i10, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b10 = b(i10, elapsedRealtime);
        int i11 = 0;
        while (i11 < this.f19340b && !b10) {
            b10 = (i11 == i10 || b(i11, elapsedRealtime)) ? false : true;
            i11++;
        }
        if (b10) {
            long[] jArr = this.f19343e;
            jArr[i10] = Math.max(jArr[i10], elapsedRealtime + j10);
            return true;
        }
        return false;
    }
}
