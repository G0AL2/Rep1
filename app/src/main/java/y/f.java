package y;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientColorInflaterCompat.java */
/* loaded from: classes.dex */
public final class f {
    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        if (aVar != null) {
            return aVar;
        }
        if (z10) {
            return new a(i10, i12, i11);
        }
        return new a(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            TypedArray k10 = i.k(resources, theme, attributeSet, w.d.f38145z);
            float f10 = i.f(k10, xmlPullParser, "startX", w.d.I, 0.0f);
            float f11 = i.f(k10, xmlPullParser, "startY", w.d.J, 0.0f);
            float f12 = i.f(k10, xmlPullParser, "endX", w.d.K, 0.0f);
            float f13 = i.f(k10, xmlPullParser, "endY", w.d.L, 0.0f);
            float f14 = i.f(k10, xmlPullParser, "centerX", w.d.D, 0.0f);
            float f15 = i.f(k10, xmlPullParser, "centerY", w.d.E, 0.0f);
            int g10 = i.g(k10, xmlPullParser, "type", w.d.C, 0);
            int b10 = i.b(k10, xmlPullParser, "startColor", w.d.A, 0);
            boolean j10 = i.j(xmlPullParser, "centerColor");
            int b11 = i.b(k10, xmlPullParser, "centerColor", w.d.H, 0);
            int b12 = i.b(k10, xmlPullParser, "endColor", w.d.B, 0);
            int g11 = i.g(k10, xmlPullParser, "tileMode", w.d.G, 0);
            float f16 = i.f(k10, xmlPullParser, "gradientRadius", w.d.F, 0.0f);
            k10.recycle();
            a a10 = a(c(resources, xmlPullParser, attributeSet, theme), b10, b12, j10, b11);
            if (g10 != 1) {
                if (g10 != 2) {
                    return new LinearGradient(f10, f11, f12, f13, a10.f38930a, a10.f38931b, d(g11));
                }
                return new SweepGradient(f14, f15, a10.f38930a, a10.f38931b);
            } else if (f16 > 0.0f) {
                return new RadialGradient(f14, f15, f16, a10.f38930a, a10.f38931b, d(g11));
            } else {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static y.f.a c(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = w.d.M
            android.content.res.TypedArray r3 = y.i.k(r9, r12, r11, r3)
            int r5 = w.d.N
            boolean r6 = r3.hasValue(r5)
            int r7 = w.d.O
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            y.f$a r9 = new y.f$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):y.f$a");
    }

    private static Shader.TileMode d(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GradientColorInflaterCompat.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final int[] f38930a;

        /* renamed from: b  reason: collision with root package name */
        final float[] f38931b;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f38930a = new int[size];
            this.f38931b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f38930a[i10] = list.get(i10).intValue();
                this.f38931b[i10] = list2.get(i10).floatValue();
            }
        }

        a(int i10, int i11) {
            this.f38930a = new int[]{i10, i11};
            this.f38931b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f38930a = new int[]{i10, i11, i12};
            this.f38931b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
