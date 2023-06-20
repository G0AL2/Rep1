package lf;

import java.io.IOException;
import qe.k;
import ve.o;
import ve.p;
import ve.q;
import ye.t;

/* compiled from: WebSocketExtensions.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: g  reason: collision with root package name */
    public static final a f34097g = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f34098a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f34099b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f34100c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f34101d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f34102e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f34103f;

    /* compiled from: WebSocketExtensions.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final e a(t tVar) throws IOException {
            boolean l10;
            boolean l11;
            boolean l12;
            boolean l13;
            boolean l14;
            boolean l15;
            Integer f10;
            Integer f11;
            k.f(tVar, "responseHeaders");
            int size = tVar.size();
            boolean z10 = false;
            Integer num = null;
            boolean z11 = false;
            Integer num2 = null;
            boolean z12 = false;
            boolean z13 = false;
            for (int i10 = 0; i10 < size; i10++) {
                l10 = p.l(tVar.c(i10), "Sec-WebSocket-Extensions", true);
                if (l10) {
                    String h10 = tVar.h(i10);
                    int i11 = 0;
                    while (i11 < h10.length()) {
                        int o10 = ze.c.o(h10, ',', i11, 0, 4, null);
                        int m10 = ze.c.m(h10, ';', i11, o10);
                        String V = ze.c.V(h10, i11, m10);
                        int i12 = m10 + 1;
                        l11 = p.l(V, "permessage-deflate", true);
                        if (l11) {
                            if (z10) {
                                z13 = true;
                            }
                            while (i12 < o10) {
                                int m11 = ze.c.m(h10, ';', i12, o10);
                                int m12 = ze.c.m(h10, '=', i12, m11);
                                String V2 = ze.c.V(h10, i12, m12);
                                String e02 = m12 < m11 ? q.e0(ze.c.V(h10, m12 + 1, m11), "\"") : null;
                                int i13 = m11 + 1;
                                l12 = p.l(V2, "client_max_window_bits", true);
                                if (l12) {
                                    if (num != null) {
                                        z13 = true;
                                    }
                                    if (e02 != null) {
                                        f11 = o.f(e02);
                                        num = f11;
                                    } else {
                                        num = null;
                                    }
                                    if (num != null) {
                                        i12 = i13;
                                    }
                                    z13 = true;
                                    i12 = i13;
                                } else {
                                    l13 = p.l(V2, "client_no_context_takeover", true);
                                    if (l13) {
                                        if (z11) {
                                            z13 = true;
                                        }
                                        if (e02 != null) {
                                            z13 = true;
                                        }
                                        z11 = true;
                                    } else {
                                        l14 = p.l(V2, "server_max_window_bits", true);
                                        if (l14) {
                                            if (num2 != null) {
                                                z13 = true;
                                            }
                                            if (e02 != null) {
                                                f10 = o.f(e02);
                                                num2 = f10;
                                            } else {
                                                num2 = null;
                                            }
                                            if (num2 != null) {
                                            }
                                            z13 = true;
                                        } else {
                                            l15 = p.l(V2, "server_no_context_takeover", true);
                                            if (l15) {
                                                if (z12) {
                                                    z13 = true;
                                                }
                                                if (e02 != null) {
                                                    z13 = true;
                                                }
                                                z12 = true;
                                            }
                                            z13 = true;
                                        }
                                    }
                                    i12 = i13;
                                }
                            }
                            i11 = i12;
                            z10 = true;
                        } else {
                            i11 = i12;
                            z13 = true;
                        }
                    }
                }
            }
            return new e(z10, num, z11, num2, z12, z13);
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    public e() {
        this(false, null, false, null, false, false, 63, null);
    }

    public e(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.f34098a = z10;
        this.f34099b = num;
        this.f34100c = z11;
        this.f34101d = num2;
        this.f34102e = z12;
        this.f34103f = z13;
    }

    public final boolean a(boolean z10) {
        if (z10) {
            return this.f34100c;
        }
        return this.f34102e;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                return this.f34098a == eVar.f34098a && k.a(this.f34099b, eVar.f34099b) && this.f34100c == eVar.f34100c && k.a(this.f34101d, eVar.f34101d) && this.f34102e == eVar.f34102e && this.f34103f == eVar.f34103f;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z10 = this.f34098a;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        Integer num = this.f34099b;
        int hashCode = (i10 + (num != null ? num.hashCode() : 0)) * 31;
        ?? r22 = this.f34100c;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        Integer num2 = this.f34101d;
        int hashCode2 = (i12 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r23 = this.f34102e;
        int i13 = r23;
        if (r23 != 0) {
            i13 = 1;
        }
        int i14 = (hashCode2 + i13) * 31;
        boolean z11 = this.f34103f;
        return i14 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f34098a + ", clientMaxWindowBits=" + this.f34099b + ", clientNoContextTakeover=" + this.f34100c + ", serverMaxWindowBits=" + this.f34101d + ", serverNoContextTakeover=" + this.f34102e + ", unknownValues=" + this.f34103f + ")";
    }

    public /* synthetic */ e(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, qe.g gVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? false : z11, (i10 & 8) == 0 ? num2 : null, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13);
    }
}
