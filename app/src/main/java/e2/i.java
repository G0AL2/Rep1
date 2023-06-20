package e2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import b2.b;
import c2.k;
import com.airbnb.lottie.d0;
import com.airbnb.lottie.i0;
import d2.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z1.o;
import z1.q;

/* compiled from: TextLayer.java */
/* loaded from: classes.dex */
public class i extends e2.b {
    private final StringBuilder D;
    private final RectF E;
    private final Matrix F;
    private final Paint G;
    private final Paint H;
    private final Map<b2.d, List<y1.d>> I;
    private final androidx.collection.d<String> J;
    private final o K;
    private final d0 L;
    private final com.airbnb.lottie.h M;
    private z1.a<Integer, Integer> N;
    private z1.a<Integer, Integer> O;
    private z1.a<Integer, Integer> P;
    private z1.a<Integer, Integer> Q;
    private z1.a<Float, Float> R;
    private z1.a<Float, Float> S;
    private z1.a<Float, Float> T;
    private z1.a<Float, Float> U;
    private z1.a<Float, Float> V;
    private z1.a<Typeface, Typeface> W;

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    class a extends Paint {
        a(i iVar, int i10) {
            super(i10);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    class b extends Paint {
        b(i iVar, int i10) {
            super(i10);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29552a;

        static {
            int[] iArr = new int[b.a.values().length];
            f29552a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29552a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29552a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(d0 d0Var, e eVar) {
        super(d0Var, eVar);
        c2.b bVar;
        c2.b bVar2;
        c2.a aVar;
        c2.a aVar2;
        this.D = new StringBuilder(2);
        this.E = new RectF();
        this.F = new Matrix();
        this.G = new a(this, 1);
        this.H = new b(this, 1);
        this.I = new HashMap();
        this.J = new androidx.collection.d<>();
        this.L = d0Var;
        this.M = eVar.b();
        o a10 = eVar.s().a();
        this.K = a10;
        a10.a(this);
        i(a10);
        k t10 = eVar.t();
        if (t10 != null && (aVar2 = t10.f5294a) != null) {
            z1.a<Integer, Integer> a11 = aVar2.a();
            this.N = a11;
            a11.a(this);
            i(this.N);
        }
        if (t10 != null && (aVar = t10.f5295b) != null) {
            z1.a<Integer, Integer> a12 = aVar.a();
            this.P = a12;
            a12.a(this);
            i(this.P);
        }
        if (t10 != null && (bVar2 = t10.f5296c) != null) {
            z1.a<Float, Float> a13 = bVar2.a();
            this.R = a13;
            a13.a(this);
            i(this.R);
        }
        if (t10 == null || (bVar = t10.f5297d) == null) {
            return;
        }
        z1.a<Float, Float> a14 = bVar.a();
        this.T = a14;
        a14.a(this);
        i(this.T);
    }

    private void O(b.a aVar, Canvas canvas, float f10) {
        int i10 = c.f29552a[aVar.ordinal()];
        if (i10 == 2) {
            canvas.translate(-f10, 0.0f);
        } else if (i10 != 3) {
        } else {
            canvas.translate((-f10) / 2.0f, 0.0f);
        }
    }

    private String P(String str, int i10) {
        int codePointAt = str.codePointAt(i10);
        int charCount = Character.charCount(codePointAt) + i10;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!c0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j10 = codePointAt;
        if (this.J.d(j10)) {
            return this.J.f(j10);
        }
        this.D.setLength(0);
        while (i10 < charCount) {
            int codePointAt3 = str.codePointAt(i10);
            this.D.appendCodePoint(codePointAt3);
            i10 += Character.charCount(codePointAt3);
        }
        String sb2 = this.D.toString();
        this.J.k(j10, sb2);
        return sb2;
    }

    private void Q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void R(b2.d dVar, Matrix matrix, float f10, b2.b bVar, Canvas canvas) {
        List<y1.d> Y = Y(dVar);
        for (int i10 = 0; i10 < Y.size(); i10++) {
            Path path = Y.get(i10).getPath();
            path.computeBounds(this.E, false);
            this.F.set(matrix);
            this.F.preTranslate(0.0f, (-bVar.f4780g) * i2.h.e());
            this.F.preScale(f10, f10);
            path.transform(this.F);
            if (bVar.f4784k) {
                U(path, this.G, canvas);
                U(path, this.H, canvas);
            } else {
                U(path, this.H, canvas);
                U(path, this.G, canvas);
            }
        }
    }

    private void S(String str, b2.b bVar, Canvas canvas) {
        if (bVar.f4784k) {
            Q(str, this.G, canvas);
            Q(str, this.H, canvas);
            return;
        }
        Q(str, this.H, canvas);
        Q(str, this.G, canvas);
    }

    private void T(String str, b2.b bVar, Canvas canvas, float f10) {
        int i10 = 0;
        while (i10 < str.length()) {
            String P = P(str, i10);
            i10 += P.length();
            S(P, bVar, canvas);
            canvas.translate(this.G.measureText(P) + f10, 0.0f);
        }
    }

    private void U(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void V(String str, b2.b bVar, Matrix matrix, b2.c cVar, Canvas canvas, float f10, float f11) {
        float floatValue;
        for (int i10 = 0; i10 < str.length(); i10++) {
            b2.d e10 = this.M.c().e(b2.d.c(str.charAt(i10), cVar.a(), cVar.c()));
            if (e10 != null) {
                R(e10, matrix, f11, bVar, canvas);
                float b10 = ((float) e10.b()) * f11 * i2.h.e() * f10;
                float f12 = bVar.f4778e / 10.0f;
                z1.a<Float, Float> aVar = this.U;
                if (aVar != null) {
                    floatValue = aVar.h().floatValue();
                } else {
                    z1.a<Float, Float> aVar2 = this.T;
                    if (aVar2 != null) {
                        floatValue = aVar2.h().floatValue();
                    }
                    canvas.translate(b10 + (f12 * f10), 0.0f);
                }
                f12 += floatValue;
                canvas.translate(b10 + (f12 * f10), 0.0f);
            }
        }
    }

    private void W(b2.b bVar, Matrix matrix, b2.c cVar, Canvas canvas) {
        float f10;
        z1.a<Float, Float> aVar = this.V;
        if (aVar != null) {
            f10 = aVar.h().floatValue();
        } else {
            f10 = bVar.f4776c;
        }
        float f11 = f10 / 100.0f;
        float g10 = i2.h.g(matrix);
        String str = bVar.f4774a;
        float e10 = bVar.f4779f * i2.h.e();
        List<String> a02 = a0(str);
        int size = a02.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = a02.get(i10);
            float Z = Z(str2, cVar, f11, g10);
            canvas.save();
            O(bVar.f4777d, canvas, Z);
            canvas.translate(0.0f, (i10 * e10) - (((size - 1) * e10) / 2.0f));
            V(str2, bVar, matrix, cVar, canvas, g10, f11);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[LOOP:0: B:20:0x0091->B:21:0x0093, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void X(b2.b r8, b2.c r9, android.graphics.Canvas r10) {
        /*
            r7 = this;
            android.graphics.Typeface r9 = r7.b0(r9)
            if (r9 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r8.f4774a
            com.airbnb.lottie.d0 r1 = r7.L
            com.airbnb.lottie.r0 r1 = r1.W()
            if (r1 == 0) goto L19
            java.lang.String r2 = r7.getName()
            java.lang.String r0 = r1.c(r2, r0)
        L19:
            android.graphics.Paint r1 = r7.G
            r1.setTypeface(r9)
            z1.a<java.lang.Float, java.lang.Float> r9 = r7.V
            if (r9 == 0) goto L2d
            java.lang.Object r9 = r9.h()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L2f
        L2d:
            float r9 = r8.f4776c
        L2f:
            android.graphics.Paint r1 = r7.G
            float r2 = i2.h.e()
            float r2 = r2 * r9
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.H
            android.graphics.Paint r2 = r7.G
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.H
            android.graphics.Paint r2 = r7.G
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            float r1 = r8.f4779f
            float r2 = i2.h.e()
            float r1 = r1 * r2
            int r2 = r8.f4778e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            z1.a<java.lang.Float, java.lang.Float> r3 = r7.U
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6c:
            float r2 = r2 + r3
            goto L7d
        L6e:
            z1.a<java.lang.Float, java.lang.Float> r3 = r7.T
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r3.h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6c
        L7d:
            float r3 = i2.h.e()
            float r2 = r2 * r3
            float r2 = r2 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r9
            java.util.List r9 = r7.a0(r0)
            int r0 = r9.size()
            r3 = 0
        L91:
            if (r3 >= r0) goto Lca
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.H
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10.save()
            b2.b$a r6 = r8.f4777d
            r7.O(r6, r10, r5)
            int r5 = r0 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r3
            float r6 = r6 * r1
            float r6 = r6 - r5
            r5 = 0
            r10.translate(r5, r6)
            r7.T(r4, r8, r10, r2)
            r10.restore()
            int r3 = r3 + 1
            goto L91
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.i.X(b2.b, b2.c, android.graphics.Canvas):void");
    }

    private List<y1.d> Y(b2.d dVar) {
        if (this.I.containsKey(dVar)) {
            return this.I.get(dVar);
        }
        List<p> a10 = dVar.a();
        int size = a10.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new y1.d(this.L, this, a10.get(i10)));
        }
        this.I.put(dVar, arrayList);
        return arrayList;
    }

    private float Z(String str, b2.c cVar, float f10, float f11) {
        float f12 = 0.0f;
        for (int i10 = 0; i10 < str.length(); i10++) {
            b2.d e10 = this.M.c().e(b2.d.c(str.charAt(i10), cVar.a(), cVar.c()));
            if (e10 != null) {
                f12 = (float) (f12 + (e10.b() * f10 * i2.h.e() * f11));
            }
        }
        return f12;
    }

    private List<String> a0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface b0(b2.c cVar) {
        Typeface h10;
        z1.a<Typeface, Typeface> aVar = this.W;
        if (aVar == null || (h10 = aVar.h()) == null) {
            Typeface X = this.L.X(cVar.a(), cVar.c());
            return X != null ? X : cVar.d();
        }
        return h10;
    }

    private boolean c0(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    @Override // e2.b, b2.f
    public <T> void e(T t10, j2.c<T> cVar) {
        super.e(t10, cVar);
        if (t10 == i0.f5803a) {
            z1.a<Integer, Integer> aVar = this.O;
            if (aVar != null) {
                G(aVar);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            q qVar = new q(cVar);
            this.O = qVar;
            qVar.a(this);
            i(this.O);
        } else if (t10 == i0.f5804b) {
            z1.a<Integer, Integer> aVar2 = this.Q;
            if (aVar2 != null) {
                G(aVar2);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            q qVar2 = new q(cVar);
            this.Q = qVar2;
            qVar2.a(this);
            i(this.Q);
        } else if (t10 == i0.f5821s) {
            z1.a<Float, Float> aVar3 = this.S;
            if (aVar3 != null) {
                G(aVar3);
            }
            if (cVar == null) {
                this.S = null;
                return;
            }
            q qVar3 = new q(cVar);
            this.S = qVar3;
            qVar3.a(this);
            i(this.S);
        } else if (t10 == i0.f5822t) {
            z1.a<Float, Float> aVar4 = this.U;
            if (aVar4 != null) {
                G(aVar4);
            }
            if (cVar == null) {
                this.U = null;
                return;
            }
            q qVar4 = new q(cVar);
            this.U = qVar4;
            qVar4.a(this);
            i(this.U);
        } else if (t10 == i0.F) {
            z1.a<Float, Float> aVar5 = this.V;
            if (aVar5 != null) {
                G(aVar5);
            }
            if (cVar == null) {
                this.V = null;
                return;
            }
            q qVar5 = new q(cVar);
            this.V = qVar5;
            qVar5.a(this);
            i(this.V);
        } else if (t10 == i0.M) {
            z1.a<Typeface, Typeface> aVar6 = this.W;
            if (aVar6 != null) {
                G(aVar6);
            }
            if (cVar == null) {
                this.W = null;
                return;
            }
            q qVar6 = new q(cVar);
            this.W = qVar6;
            qVar6.a(this);
            i(this.W);
        } else if (t10 == i0.O) {
            this.K.q(cVar);
        }
    }

    @Override // e2.b, y1.e
    public void f(RectF rectF, Matrix matrix, boolean z10) {
        super.f(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.M.b().width(), this.M.b().height());
    }

    @Override // e2.b
    void t(Canvas canvas, Matrix matrix, int i10) {
        canvas.save();
        if (!this.L.X0()) {
            canvas.concat(matrix);
        }
        b2.b h10 = this.K.h();
        b2.c cVar = this.M.g().get(h10.f4775b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        z1.a<Integer, Integer> aVar = this.O;
        if (aVar != null) {
            this.G.setColor(aVar.h().intValue());
        } else {
            z1.a<Integer, Integer> aVar2 = this.N;
            if (aVar2 != null) {
                this.G.setColor(aVar2.h().intValue());
            } else {
                this.G.setColor(h10.f4781h);
            }
        }
        z1.a<Integer, Integer> aVar3 = this.Q;
        if (aVar3 != null) {
            this.H.setColor(aVar3.h().intValue());
        } else {
            z1.a<Integer, Integer> aVar4 = this.P;
            if (aVar4 != null) {
                this.H.setColor(aVar4.h().intValue());
            } else {
                this.H.setColor(h10.f4782i);
            }
        }
        int intValue = ((this.f29507x.h() == null ? 100 : this.f29507x.h().h().intValue()) * 255) / 100;
        this.G.setAlpha(intValue);
        this.H.setAlpha(intValue);
        z1.a<Float, Float> aVar5 = this.S;
        if (aVar5 != null) {
            this.H.setStrokeWidth(aVar5.h().floatValue());
        } else {
            z1.a<Float, Float> aVar6 = this.R;
            if (aVar6 != null) {
                this.H.setStrokeWidth(aVar6.h().floatValue());
            } else {
                this.H.setStrokeWidth(h10.f4783j * i2.h.e() * i2.h.g(matrix));
            }
        }
        if (this.L.X0()) {
            W(h10, matrix, cVar, canvas);
        } else {
            X(h10, cVar, canvas);
        }
        canvas.restore();
    }
}
