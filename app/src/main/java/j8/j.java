package j8;

import com.inmobi.media.jh;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* compiled from: DefaultLoadControl.java */
/* loaded from: classes2.dex */
public class j implements v1 {

    /* renamed from: a  reason: collision with root package name */
    private final da.q f32490a;

    /* renamed from: b  reason: collision with root package name */
    private final long f32491b;

    /* renamed from: c  reason: collision with root package name */
    private final long f32492c;

    /* renamed from: d  reason: collision with root package name */
    private final long f32493d;

    /* renamed from: e  reason: collision with root package name */
    private final long f32494e;

    /* renamed from: f  reason: collision with root package name */
    private final int f32495f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f32496g;

    /* renamed from: h  reason: collision with root package name */
    private final long f32497h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f32498i;

    /* renamed from: j  reason: collision with root package name */
    private int f32499j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f32500k;

    public j() {
        this(new da.q(true, Constants.MIN_PROGRESS_STEP), 50000, 50000, IronSourceConstants.IS_INSTANCE_NOT_FOUND, jh.DEFAULT_BITMAP_TIMEOUT, -1, false, 0, false);
    }

    private static void i(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" cannot be less than ");
        sb2.append(str2);
        ea.a.b(z10, sb2.toString());
    }

    private static int k(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void l(boolean z10) {
        int i10 = this.f32495f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f32499j = i10;
        this.f32500k = false;
        if (z10) {
            this.f32490a.g();
        }
    }

    @Override // j8.v1
    public boolean a() {
        return this.f32498i;
    }

    @Override // j8.v1
    public long b() {
        return this.f32497h;
    }

    @Override // j8.v1
    public boolean c(long j10, float f10, boolean z10, long j11) {
        long g02 = ea.n0.g0(j10, f10);
        long j12 = z10 ? this.f32494e : this.f32493d;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || g02 >= j12 || (!this.f32496g && this.f32490a.c() >= this.f32499j);
    }

    @Override // j8.v1
    public da.b d() {
        return this.f32490a;
    }

    @Override // j8.v1
    public void e() {
        l(true);
    }

    @Override // j8.v1
    public void f(w2[] w2VarArr, i9.y0 y0Var, ba.q[] qVarArr) {
        int i10 = this.f32495f;
        if (i10 == -1) {
            i10 = j(w2VarArr, qVarArr);
        }
        this.f32499j = i10;
        this.f32490a.h(i10);
    }

    @Override // j8.v1
    public void g() {
        l(true);
    }

    @Override // j8.v1
    public boolean h(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f32490a.c() >= this.f32499j;
        long j12 = this.f32491b;
        if (f10 > 1.0f) {
            j12 = Math.min(ea.n0.b0(j12, f10), this.f32492c);
        }
        if (j11 < Math.max(j12, 500000L)) {
            if (!this.f32496g && z11) {
                z10 = false;
            }
            this.f32500k = z10;
            if (!z10 && j11 < 500000) {
                ea.r.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f32492c || z11) {
            this.f32500k = false;
        }
        return this.f32500k;
    }

    protected int j(w2[] w2VarArr, ba.q[] qVarArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < w2VarArr.length; i11++) {
            if (qVarArr[i11] != null) {
                i10 += k(w2VarArr[i11].e());
            }
        }
        return Math.max(13107200, i10);
    }

    @Override // j8.v1
    public void onPrepared() {
        l(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public j(da.q qVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        i(i12, 0, "bufferForPlaybackMs", "0");
        i(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        i(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        i(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        i(i11, i10, "maxBufferMs", "minBufferMs");
        i(i15, 0, "backBufferDurationMs", "0");
        this.f32490a = qVar;
        this.f32491b = ea.n0.C0(i10);
        this.f32492c = ea.n0.C0(i11);
        this.f32493d = ea.n0.C0(i12);
        this.f32494e = ea.n0.C0(i13);
        this.f32495f = i14;
        this.f32499j = i14 == -1 ? 13107200 : i14;
        this.f32496g = z10;
        this.f32497h = ea.n0.C0(i15);
        this.f32498i = z11;
    }
}
