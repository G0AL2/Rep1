package p8;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import ea.n0;
import j8.p1;
import java.util.Collections;
import java.util.List;

/* compiled from: FlacStreamMetadata.java */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final int f35678a;

    /* renamed from: b  reason: collision with root package name */
    public final int f35679b;

    /* renamed from: c  reason: collision with root package name */
    public final int f35680c;

    /* renamed from: d  reason: collision with root package name */
    public final int f35681d;

    /* renamed from: e  reason: collision with root package name */
    public final int f35682e;

    /* renamed from: f  reason: collision with root package name */
    public final int f35683f;

    /* renamed from: g  reason: collision with root package name */
    public final int f35684g;

    /* renamed from: h  reason: collision with root package name */
    public final int f35685h;

    /* renamed from: i  reason: collision with root package name */
    public final int f35686i;

    /* renamed from: j  reason: collision with root package name */
    public final long f35687j;

    /* renamed from: k  reason: collision with root package name */
    public final a f35688k;

    /* renamed from: l  reason: collision with root package name */
    private final Metadata f35689l;

    /* compiled from: FlacStreamMetadata.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f35690a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f35691b;

        public a(long[] jArr, long[] jArr2) {
            this.f35690a = jArr;
            this.f35691b = jArr2;
        }
    }

    public r(byte[] bArr, int i10) {
        ea.z zVar = new ea.z(bArr);
        zVar.p(i10 * 8);
        this.f35678a = zVar.h(16);
        this.f35679b = zVar.h(16);
        this.f35680c = zVar.h(24);
        this.f35681d = zVar.h(24);
        int h10 = zVar.h(20);
        this.f35682e = h10;
        this.f35683f = j(h10);
        this.f35684g = zVar.h(3) + 1;
        int h11 = zVar.h(5) + 1;
        this.f35685h = h11;
        this.f35686i = e(h11);
        this.f35687j = zVar.j(36);
        this.f35688k = null;
        this.f35689l = null;
    }

    private static int e(int i10) {
        if (i10 != 8) {
            if (i10 != 12) {
                if (i10 != 16) {
                    if (i10 != 20) {
                        return i10 != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public r a(List<PictureFrame> list) {
        return new r(this.f35678a, this.f35679b, this.f35680c, this.f35681d, this.f35682e, this.f35684g, this.f35685h, this.f35687j, this.f35688k, h(new Metadata(list)));
    }

    public r b(a aVar) {
        return new r(this.f35678a, this.f35679b, this.f35680c, this.f35681d, this.f35682e, this.f35684g, this.f35685h, this.f35687j, aVar, this.f35689l);
    }

    public r c(List<String> list) {
        return new r(this.f35678a, this.f35679b, this.f35680c, this.f35681d, this.f35682e, this.f35684g, this.f35685h, this.f35687j, this.f35688k, h(d0.c(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f35681d;
        if (i10 > 0) {
            j10 = (i10 + this.f35680c) / 2;
            j11 = 1;
        } else {
            int i11 = this.f35678a;
            j10 = ((((i11 != this.f35679b || i11 <= 0) ? 4096L : i11) * this.f35684g) * this.f35685h) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f35687j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / this.f35682e;
    }

    public p1 g(byte[] bArr, Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i10 = this.f35681d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new p1.b().e0("audio/flac").W(i10).H(this.f35684g).f0(this.f35682e).T(Collections.singletonList(bArr)).X(h(metadata)).E();
    }

    public Metadata h(Metadata metadata) {
        Metadata metadata2 = this.f35689l;
        return metadata2 == null ? metadata : metadata2.e(metadata);
    }

    public long i(long j10) {
        return n0.r((j10 * this.f35682e) / 1000000, 0L, this.f35687j - 1);
    }

    private r(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, Metadata metadata) {
        this.f35678a = i10;
        this.f35679b = i11;
        this.f35680c = i12;
        this.f35681d = i13;
        this.f35682e = i14;
        this.f35683f = j(i14);
        this.f35684g = i15;
        this.f35685h = i16;
        this.f35686i = e(i16);
        this.f35687j = j10;
        this.f35688k = aVar;
        this.f35689l = metadata;
    }
}
