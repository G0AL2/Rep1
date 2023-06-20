package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.i;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import com.google.android.gms.common.api.Api;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class b extends d {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f19345e = new int[0];

    /* renamed from: c  reason: collision with root package name */
    public final e.a f19346c = null;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<C0260b> f19347d = new AtomicReference<>(new C0260b());

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f19348a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19349b;

        /* renamed from: c  reason: collision with root package name */
        public final String f19350c;

        public a(int i10, int i11, String str) {
            this.f19348a = i10;
            this.f19349b = i11;
            this.f19350c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f19348a == aVar.f19348a && this.f19349b == aVar.f19349b && TextUtils.equals(this.f19350c, aVar.f19350c);
        }

        public int hashCode() {
            int i10 = ((this.f19348a * 31) + this.f19349b) * 31;
            String str = this.f19350c;
            return i10 + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0260b {

        /* renamed from: a  reason: collision with root package name */
        public final String f19351a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19352b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f19353c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f19354d;

        /* renamed from: e  reason: collision with root package name */
        public final int f19355e;

        /* renamed from: f  reason: collision with root package name */
        public final int f19356f;

        /* renamed from: g  reason: collision with root package name */
        public final int f19357g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f19358h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f19359i;

        /* renamed from: j  reason: collision with root package name */
        public final int f19360j;

        /* renamed from: k  reason: collision with root package name */
        public final int f19361k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f19362l;

        public C0260b() {
            this(null, null, false, true, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, true, true, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0260b.class != obj.getClass()) {
                return false;
            }
            C0260b c0260b = (C0260b) obj;
            return this.f19353c == c0260b.f19353c && this.f19354d == c0260b.f19354d && this.f19355e == c0260b.f19355e && this.f19356f == c0260b.f19356f && this.f19358h == c0260b.f19358h && this.f19359i == c0260b.f19359i && this.f19362l == c0260b.f19362l && this.f19360j == c0260b.f19360j && this.f19361k == c0260b.f19361k && this.f19357g == c0260b.f19357g && TextUtils.equals(this.f19351a, c0260b.f19351a) && TextUtils.equals(this.f19352b, c0260b.f19352b);
        }

        public int hashCode() {
            return (((((((((((((((((((((this.f19351a.hashCode() * 31) + this.f19352b.hashCode()) * 31) + (this.f19353c ? 1 : 0)) * 31) + (this.f19354d ? 1 : 0)) * 31) + this.f19355e) * 31) + this.f19356f) * 31) + this.f19357g) * 31) + (this.f19358h ? 1 : 0)) * 31) + (this.f19359i ? 1 : 0)) * 31) + (this.f19362l ? 1 : 0)) * 31) + this.f19360j) * 31) + this.f19361k;
        }

        public C0260b(String str, String str2, boolean z10, boolean z11, int i10, int i11, int i12, boolean z12, boolean z13, int i13, int i14, boolean z14) {
            this.f19351a = null;
            this.f19352b = null;
            this.f19353c = z10;
            this.f19354d = z11;
            this.f19355e = i10;
            this.f19356f = i11;
            this.f19357g = i12;
            this.f19358h = z12;
            this.f19359i = z13;
            this.f19360j = i13;
            this.f19361k = i14;
            this.f19362l = z14;
        }
    }

    public b(e.a aVar) {
    }

    public static int a(int i10, int i11) {
        if (i10 == -1) {
            return i11 == -1 ? 0 : -1;
        } else if (i11 == -1) {
            return 1;
        } else {
            return i10 - i11;
        }
    }

    public static boolean a(int i10, boolean z10) {
        int i11 = i10 & 3;
        return i11 == 3 || (z10 && i11 == 2);
    }

    public static boolean a(i iVar, String str, int i10, int i11, int i12, int i13, int i14) {
        if (!a(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str == null || u.a(iVar.f19119f, str)) {
            int i15 = iVar.f19123j;
            if (i15 == -1 || i15 <= i12) {
                int i16 = iVar.f19124k;
                if (i16 == -1 || i16 <= i13) {
                    int i17 = iVar.f19115b;
                    return i17 == -1 || i17 <= i14;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean a(i iVar, int i10, a aVar) {
        if (a(i10, false) && iVar.f19131r == aVar.f19348a && iVar.f19132s == aVar.f19349b) {
            String str = aVar.f19350c;
            return str == null || TextUtils.equals(str, iVar.f19119f);
        }
        return false;
    }

    public static boolean a(i iVar, String str) {
        if (str != null) {
            String str2 = iVar.f19138y;
            int i10 = u.f19606a;
            if (TextUtils.equals(str, str2 == null ? null : new Locale(str2).getLanguage())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.Integer> a(com.fyber.inneractive.sdk.player.exoplayer2.source.r r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f19329a
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L9:
            int r3 = r12.f19329a
            if (r2 >= r3) goto L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L9
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto La6
            if (r14 != r2) goto L20
            goto La6
        L20:
            r3 = 0
            r4 = 2147483647(0x7fffffff, float:NaN)
        L24:
            int r5 = r12.f19329a
            r6 = 1
            if (r3 >= r5) goto L80
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r5 = r12.f19330b
            r5 = r5[r3]
            int r7 = r5.f19123j
            if (r7 <= 0) goto L7d
            int r8 = r5.f19124k
            if (r8 <= 0) goto L7d
            if (r15 == 0) goto L45
            if (r7 <= r8) goto L3b
            r9 = 1
            goto L3c
        L3b:
            r9 = 0
        L3c:
            if (r13 <= r14) goto L3f
            goto L40
        L3f:
            r6 = 0
        L40:
            if (r9 == r6) goto L45
            r6 = r13
            r9 = r14
            goto L47
        L45:
            r9 = r13
            r6 = r14
        L47:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L57
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(r11, r7)
            r6.<init>(r9, r7)
            goto L61
        L57:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.util.u.a(r10, r8)
            r7.<init>(r8, r6)
            r6 = r7
        L61:
            int r7 = r5.f19123j
            int r5 = r5.f19124k
            int r8 = r7 * r5
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L7d
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L7d
            if (r8 >= r4) goto L7d
            r4 = r8
        L7d:
            int r3 = r3 + 1
            goto L24
        L80:
            if (r4 == r2) goto La6
            int r13 = r0.size()
            int r13 = r13 - r6
        L87:
            if (r13 < 0) goto La6
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r15 = r12.f19330b
            r14 = r15[r14]
            int r14 = r14.b()
            r15 = -1
            if (r14 == r15) goto La0
            if (r14 <= r4) goto La3
        La0:
            r0.remove(r13)
        La3:
            int r13 = r13 + (-1)
            goto L87
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b.a(com.fyber.inneractive.sdk.player.exoplayer2.source.r, int, int, boolean):java.util.List");
    }
}
