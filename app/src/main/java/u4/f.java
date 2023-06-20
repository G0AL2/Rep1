package u4;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* compiled from: FadeDrawable.java */
/* loaded from: classes.dex */
public class f extends u4.a {

    /* renamed from: i  reason: collision with root package name */
    private final Drawable[] f37450i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f37451j;

    /* renamed from: k  reason: collision with root package name */
    private final int f37452k;

    /* renamed from: l  reason: collision with root package name */
    private final int f37453l;

    /* renamed from: m  reason: collision with root package name */
    int f37454m;

    /* renamed from: n  reason: collision with root package name */
    int f37455n;

    /* renamed from: o  reason: collision with root package name */
    long f37456o;

    /* renamed from: p  reason: collision with root package name */
    int[] f37457p;

    /* renamed from: q  reason: collision with root package name */
    int[] f37458q;

    /* renamed from: r  reason: collision with root package name */
    int f37459r;

    /* renamed from: s  reason: collision with root package name */
    boolean[] f37460s;

    /* renamed from: t  reason: collision with root package name */
    int f37461t;

    /* renamed from: u  reason: collision with root package name */
    private a f37462u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f37463v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f37464w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f37465x;

    /* compiled from: FadeDrawable.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();

        void c();
    }

    public f(Drawable[] drawableArr, boolean z10, int i10) {
        super(drawableArr);
        this.f37465x = true;
        y3.k.j(drawableArr.length >= 1, "At least one layer required!");
        this.f37450i = drawableArr;
        this.f37457p = new int[drawableArr.length];
        this.f37458q = new int[drawableArr.length];
        this.f37459r = 255;
        this.f37460s = new boolean[drawableArr.length];
        this.f37461t = 0;
        this.f37451j = z10;
        this.f37452k = z10 ? 255 : 0;
        this.f37453l = i10;
        t();
    }

    private void i(Canvas canvas, Drawable drawable, int i10) {
        if (drawable == null || i10 <= 0) {
            return;
        }
        this.f37461t++;
        if (this.f37465x) {
            drawable.mutate();
        }
        drawable.setAlpha(i10);
        this.f37461t--;
        drawable.draw(canvas);
    }

    private void q() {
        if (this.f37463v) {
            this.f37463v = false;
            a aVar = this.f37462u;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    private void r() {
        int i10;
        if (!this.f37463v && (i10 = this.f37453l) >= 0) {
            boolean[] zArr = this.f37460s;
            if (i10 < zArr.length && zArr[i10]) {
                this.f37463v = true;
                a aVar = this.f37462u;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    private void s() {
        if (this.f37464w && this.f37454m == 2 && this.f37460s[this.f37453l]) {
            a aVar = this.f37462u;
            if (aVar != null) {
                aVar.b();
            }
            this.f37464w = false;
        }
    }

    private void t() {
        this.f37454m = 2;
        Arrays.fill(this.f37457p, this.f37452k);
        this.f37457p[0] = 255;
        Arrays.fill(this.f37458q, this.f37452k);
        this.f37458q[0] = 255;
        Arrays.fill(this.f37460s, this.f37451j);
        this.f37460s[0] = true;
    }

    private boolean w(float f10) {
        boolean z10 = true;
        for (int i10 = 0; i10 < this.f37450i.length; i10++) {
            boolean[] zArr = this.f37460s;
            int i11 = zArr[i10] ? 1 : -1;
            int[] iArr = this.f37458q;
            iArr[i10] = (int) (this.f37457p[i10] + (i11 * 255 * f10));
            if (iArr[i10] < 0) {
                iArr[i10] = 0;
            }
            if (iArr[i10] > 255) {
                iArr[i10] = 255;
            }
            if (zArr[i10] && iArr[i10] < 255) {
                z10 = false;
            }
            if (!zArr[i10] && iArr[i10] > 0) {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056 A[LOOP:0: B:25:0x0051->B:27:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072 A[EDGE_INSN: B:32:0x0072->B:28:0x0072 ?: BREAK  , SYNTHETIC] */
    @Override // u4.a, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.f37454m
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 == r3) goto La
            goto L51
        La:
            int r0 = r8.f37455n
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            y3.k.i(r0)
            long r4 = r8.p()
            long r6 = r8.f37456o
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.f37455n
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.w(r0)
            if (r0 == 0) goto L27
            goto L28
        L27:
            r1 = 1
        L28:
            r8.f37454m = r1
            goto L50
        L2b:
            int[] r0 = r8.f37458q
            int[] r4 = r8.f37457p
            android.graphics.drawable.Drawable[] r5 = r8.f37450i
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            long r4 = r8.p()
            r8.f37456o = r4
            int r0 = r8.f37455n
            if (r0 != 0) goto L42
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L43
        L42:
            r0 = 0
        L43:
            boolean r0 = r8.w(r0)
            r8.r()
            if (r0 == 0) goto L4d
            goto L4e
        L4d:
            r1 = 1
        L4e:
            r8.f37454m = r1
        L50:
            r3 = r0
        L51:
            android.graphics.drawable.Drawable[] r0 = r8.f37450i
            int r1 = r0.length
            if (r2 >= r1) goto L72
            r0 = r0[r2]
            int[] r1 = r8.f37458q
            r1 = r1[r2]
            int r4 = r8.f37459r
            int r1 = r1 * r4
            double r4 = (double) r1
            r6 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)
            int r1 = (int) r4
            r8.i(r9, r0, r1)
            int r2 = r2 + 1
            goto L51
        L72:
            if (r3 == 0) goto L7b
            r8.q()
            r8.s()
            goto L7e
        L7b:
            r8.invalidateSelf()
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.f.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f37459r;
    }

    public void h() {
        this.f37461t++;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f37461t == 0) {
            super.invalidateSelf();
        }
    }

    public void j() {
        this.f37461t--;
        invalidateSelf();
    }

    public void k() {
        this.f37454m = 0;
        Arrays.fill(this.f37460s, true);
        invalidateSelf();
    }

    public void l(int i10) {
        this.f37454m = 0;
        this.f37460s[i10] = true;
        invalidateSelf();
    }

    public void m(int i10) {
        this.f37454m = 0;
        this.f37460s[i10] = false;
        invalidateSelf();
    }

    public void n() {
        this.f37454m = 2;
        for (int i10 = 0; i10 < this.f37450i.length; i10++) {
            this.f37458q[i10] = this.f37460s[i10] ? 255 : 0;
        }
        invalidateSelf();
    }

    protected long p() {
        return SystemClock.uptimeMillis();
    }

    @Override // u4.a, android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f37459r != i10) {
            this.f37459r = i10;
            invalidateSelf();
        }
    }

    public void u(a aVar) {
        this.f37462u = aVar;
    }

    public void v(int i10) {
        this.f37455n = i10;
        if (this.f37454m == 1) {
            this.f37454m = 0;
        }
    }
}
