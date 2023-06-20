package gf;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.common.api.Api;

/* compiled from: Settings.kt */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private int f31045a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f31046b = new int[10];

    /* compiled from: Settings.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    static {
        new a(null);
    }

    public final int a(int i10) {
        return this.f31046b[i10];
    }

    public final int b() {
        if ((this.f31045a & 2) != 0) {
            return this.f31046b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f31045a & 128) != 0) {
            return this.f31046b[7];
        }
        return 65535;
    }

    public final int d() {
        return (this.f31045a & 16) != 0 ? this.f31046b[4] : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final int e(int i10) {
        return (this.f31045a & 32) != 0 ? this.f31046b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f31045a) != 0;
    }

    public final void g(m mVar) {
        qe.k.f(mVar, InneractiveMediationNameConsts.OTHER);
        for (int i10 = 0; i10 < 10; i10++) {
            if (mVar.f(i10)) {
                h(i10, mVar.a(i10));
            }
        }
    }

    public final m h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f31046b;
            if (i10 < iArr.length) {
                this.f31045a = (1 << i10) | this.f31045a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f31045a);
    }
}
