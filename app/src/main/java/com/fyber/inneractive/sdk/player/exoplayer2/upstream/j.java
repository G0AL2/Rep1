package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f19462a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f19463b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19464c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19465d;

    /* renamed from: e  reason: collision with root package name */
    public final long f19466e;

    /* renamed from: f  reason: collision with root package name */
    public final String f19467f;

    /* renamed from: g  reason: collision with root package name */
    public final int f19468g;

    public j(Uri uri, int i10) {
        this(uri, 0L, -1L, null, i10);
    }

    public boolean a(int i10) {
        return (this.f19468g & i10) == i10;
    }

    public String toString() {
        return "DataSpec[" + this.f19462a + ", " + Arrays.toString(this.f19463b) + ", " + this.f19464c + ", " + this.f19465d + ", " + this.f19466e + ", " + this.f19467f + ", " + this.f19468g + "]";
    }

    public j(Uri uri, long j10, long j11, String str, int i10) {
        this(uri, j10, j10, j11, null, i10);
    }

    public j(Uri uri, long j10, long j11, long j12, String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    public j(Uri uri, byte[] bArr, long j10, long j11, long j12, String str, int i10) {
        boolean z10 = true;
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(j10 >= 0);
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(z10);
        this.f19462a = uri;
        this.f19463b = null;
        this.f19464c = j10;
        this.f19465d = j11;
        this.f19466e = j12;
        this.f19467f = str;
        this.f19468g = i10;
    }
}
