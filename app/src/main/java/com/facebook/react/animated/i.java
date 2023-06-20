package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: InterpolationAnimatedNode.java */
/* loaded from: classes.dex */
class i extends s {

    /* renamed from: t  reason: collision with root package name */
    private static final Pattern f15263t = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");

    /* renamed from: i  reason: collision with root package name */
    private final double[] f15264i;

    /* renamed from: j  reason: collision with root package name */
    private final double[] f15265j;

    /* renamed from: k  reason: collision with root package name */
    private String f15266k;

    /* renamed from: l  reason: collision with root package name */
    private double[][] f15267l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f15268m;

    /* renamed from: n  reason: collision with root package name */
    private final Matcher f15269n;

    /* renamed from: o  reason: collision with root package name */
    private final String f15270o;

    /* renamed from: p  reason: collision with root package name */
    private final String f15271p;

    /* renamed from: q  reason: collision with root package name */
    private s f15272q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f15273r;

    /* renamed from: s  reason: collision with root package name */
    private int f15274s;

    public i(ReadableMap readableMap) {
        this.f15264i = o(readableMap.getArray("inputRange"));
        ReadableArray array = readableMap.getArray("outputRange");
        boolean z10 = array.getType(0) == ReadableType.String;
        this.f15268m = z10;
        if (z10) {
            int size = array.size();
            this.f15265j = new double[size];
            String string = array.getString(0);
            this.f15266k = string;
            this.f15273r = string.startsWith("rgb");
            this.f15269n = f15263t.matcher(this.f15266k);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                Matcher matcher = f15263t.matcher(array.getString(i10));
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                while (matcher.find()) {
                    arrayList2.add(Double.valueOf(Double.parseDouble(matcher.group())));
                }
                this.f15265j[i10] = ((Double) arrayList2.get(0)).doubleValue();
            }
            int size2 = ((ArrayList) arrayList.get(0)).size();
            this.f15274s = size2;
            this.f15267l = new double[size2];
            for (int i11 = 0; i11 < this.f15274s; i11++) {
                double[] dArr = new double[size];
                this.f15267l[i11] = dArr;
                for (int i12 = 0; i12 < size; i12++) {
                    dArr[i12] = ((Double) ((ArrayList) arrayList.get(i12)).get(i11)).doubleValue();
                }
            }
        } else {
            this.f15265j = o(array);
            this.f15269n = null;
        }
        this.f15270o = readableMap.getString("extrapolateLeft");
        this.f15271p = readableMap.getString("extrapolateRight");
    }

    private static int n(double d10, double[] dArr) {
        int i10 = 1;
        while (i10 < dArr.length - 1 && dArr[i10] < d10) {
            i10++;
        }
        return i10 - 1;
    }

    private static double[] o(ReadableArray readableArray) {
        int size = readableArray.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = readableArray.getDouble(i10);
        }
        return dArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
        if (r24.equals("clamp") == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static double p(double r13, double r15, double r17, double r19, double r21, java.lang.String r23, java.lang.String r24) {
        /*
            r0 = r23
            r1 = r24
            java.lang.String r2 = "Invalid extrapolation type "
            r3 = 2
            java.lang.String r4 = "clamp"
            r5 = 1
            java.lang.String r6 = "identity"
            r7 = 0
            java.lang.String r8 = "extend"
            r9 = -1
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 >= 0) goto L5a
            r23.hashCode()
            int r11 = r23.hashCode()
            switch(r11) {
                case -1289044198: goto L32;
                case -135761730: goto L29;
                case 94742715: goto L20;
                default: goto L1e;
            }
        L1e:
            r11 = -1
            goto L3a
        L20:
            boolean r11 = r0.equals(r4)
            if (r11 != 0) goto L27
            goto L1e
        L27:
            r11 = 2
            goto L3a
        L29:
            boolean r11 = r0.equals(r6)
            if (r11 != 0) goto L30
            goto L1e
        L30:
            r11 = 1
            goto L3a
        L32:
            boolean r11 = r0.equals(r8)
            if (r11 != 0) goto L39
            goto L1e
        L39:
            r11 = 0
        L3a:
            switch(r11) {
                case 0: goto L5a;
                case 1: goto L59;
                case 2: goto L57;
                default: goto L3d;
            }
        L3d:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r1 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "for left extrapolation"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L57:
            r11 = r15
            goto L5b
        L59:
            return r13
        L5a:
            r11 = r13
        L5b:
            int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r0 <= 0) goto La4
            r24.hashCode()
            int r0 = r24.hashCode()
            switch(r0) {
                case -1289044198: goto L7b;
                case -135761730: goto L72;
                case 94742715: goto L6b;
                default: goto L69;
            }
        L69:
            r3 = -1
            goto L83
        L6b:
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L83
            goto L69
        L72:
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L79
            goto L69
        L79:
            r3 = 1
            goto L83
        L7b:
            boolean r0 = r1.equals(r8)
            if (r0 != 0) goto L82
            goto L69
        L82:
            r3 = 0
        L83:
            switch(r3) {
                case 0: goto La4;
                case 1: goto La3;
                case 2: goto La0;
                default: goto L86;
            }
        L86:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r0 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = "for right extrapolation"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        La0:
            r11 = r17
            goto La4
        La3:
            return r11
        La4:
            int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r0 != 0) goto La9
            return r19
        La9:
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto Lb1
            if (r10 > 0) goto Lb0
            return r19
        Lb0:
            return r21
        Lb1:
            double r0 = r21 - r19
            double r11 = r11 - r15
            double r0 = r0 * r11
            double r2 = r17 - r15
            double r0 = r0 / r2
            double r0 = r19 + r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.i.p(double, double, double, double, double, java.lang.String, java.lang.String):double");
    }

    static double q(double d10, double[] dArr, double[] dArr2, String str, String str2) {
        int n10 = n(d10, dArr);
        int i10 = n10 + 1;
        return p(d10, dArr[n10], dArr[i10], dArr2[n10], dArr2[i10], str, str2);
    }

    @Override // com.facebook.react.animated.b
    public void b(b bVar) {
        if (this.f15272q == null) {
            if (bVar instanceof s) {
                this.f15272q = (s) bVar;
                return;
            }
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
        throw new IllegalStateException("Parent already attached");
    }

    @Override // com.facebook.react.animated.b
    public void c(b bVar) {
        if (bVar == this.f15272q) {
            this.f15272q = null;
            return;
        }
        throw new IllegalArgumentException("Invalid parent node provided");
    }

    @Override // com.facebook.react.animated.s, com.facebook.react.animated.b
    public String d() {
        return "InterpolationAnimatedNode[" + this.f15238d + "] super: " + super.d();
    }

    @Override // com.facebook.react.animated.b
    public void g() {
        s sVar = this.f15272q;
        if (sVar == null) {
            return;
        }
        double k10 = sVar.k();
        double q10 = q(k10, this.f15264i, this.f15265j, this.f15270o, this.f15271p);
        this.f15333f = q10;
        if (this.f15268m) {
            if (this.f15274s > 1) {
                StringBuffer stringBuffer = new StringBuffer(this.f15266k.length());
                this.f15269n.reset();
                int i10 = 0;
                while (this.f15269n.find()) {
                    int i11 = i10 + 1;
                    double q11 = q(k10, this.f15264i, this.f15267l[i10], this.f15270o, this.f15271p);
                    if (this.f15273r) {
                        boolean z10 = i11 == 4;
                        if (z10) {
                            q11 *= 1000.0d;
                        }
                        int round = (int) Math.round(q11);
                        this.f15269n.appendReplacement(stringBuffer, z10 ? Double.toString(round / 1000.0d) : Integer.toString(round));
                    } else {
                        int i12 = (int) q11;
                        this.f15269n.appendReplacement(stringBuffer, ((double) i12) != q11 ? Double.toString(q11) : Integer.toString(i12));
                    }
                    i10 = i11;
                }
                this.f15269n.appendTail(stringBuffer);
                this.f15332e = stringBuffer.toString();
                return;
            }
            this.f15332e = this.f15269n.replaceFirst(String.valueOf(q10));
        }
    }
}
