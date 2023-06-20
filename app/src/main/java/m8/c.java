package m8;

import android.media.MediaCodec;
import ea.n0;

/* compiled from: CryptoInfo.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f34265a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f34266b;

    /* renamed from: c  reason: collision with root package name */
    public int f34267c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f34268d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f34269e;

    /* renamed from: f  reason: collision with root package name */
    public int f34270f;

    /* renamed from: g  reason: collision with root package name */
    public int f34271g;

    /* renamed from: h  reason: collision with root package name */
    public int f34272h;

    /* renamed from: i  reason: collision with root package name */
    private final MediaCodec.CryptoInfo f34273i;

    /* renamed from: j  reason: collision with root package name */
    private final b f34274j;

    /* compiled from: CryptoInfo.java */
    /* loaded from: classes2.dex */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final MediaCodec.CryptoInfo f34275a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f34276b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f34276b.set(i10, i11);
            this.f34275a.setPattern(this.f34276b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f34275a = cryptoInfo;
            this.f34276b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f34273i = cryptoInfo;
        this.f34274j = n0.f29709a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f34273i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f34268d == null) {
            int[] iArr = new int[1];
            this.f34268d = iArr;
            this.f34273i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f34268d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f34270f = i10;
        this.f34268d = iArr;
        this.f34269e = iArr2;
        this.f34266b = bArr;
        this.f34265a = bArr2;
        this.f34267c = i11;
        this.f34271g = i12;
        this.f34272h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f34273i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (n0.f29709a >= 24) {
            ((b) ea.a.e(this.f34274j)).b(i12, i13);
        }
    }
}
