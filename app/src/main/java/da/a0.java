package da;

import com.ironsource.mediationsdk.logger.IronSourceError;
import da.l;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: HttpDataSource.java */
/* loaded from: classes2.dex */
public interface a0 extends l {

    /* compiled from: HttpDataSource.java */
    /* loaded from: classes2.dex */
    public static final class a extends c {
        public a(IOException iOException, p pVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, pVar, 2007, 1);
        }
    }

    /* compiled from: HttpDataSource.java */
    /* loaded from: classes2.dex */
    public interface b extends l.a {
        @Override // da.l.a
        a0 a();
    }

    /* compiled from: HttpDataSource.java */
    /* loaded from: classes2.dex */
    public static class c extends m {
        public c(p pVar, int i10, int i11) {
            super(b(i10, i11));
        }

        private static int b(int i10, int i11) {
            if (i10 == 2000 && i11 == 1) {
                return 2001;
            }
            return i10;
        }

        public static c c(IOException iOException, p pVar, int i10) {
            int i11;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i11 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i11 = IronSourceError.AUCTION_ERROR_EMPTY_WATERFALL;
            } else {
                i11 = (message == null || !ib.b.e(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i11 == 2007) {
                return new a(iOException, pVar);
            }
            return new c(iOException, pVar, i11, i10);
        }

        public c(String str, p pVar, int i10, int i11) {
            super(str, b(i10, i11));
        }

        public c(IOException iOException, p pVar, int i10, int i11) {
            super(iOException, b(i10, i11));
        }

        public c(String str, IOException iOException, p pVar, int i10, int i11) {
            super(str, iOException, b(i10, i11));
        }
    }

    /* compiled from: HttpDataSource.java */
    /* loaded from: classes2.dex */
    public static final class d extends c {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(java.lang.String r3, da.p r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "Invalid content type: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r0 = 2003(0x7d3, float:2.807E-42)
                r1 = 1
                r2.<init>(r3, r4, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: da.a0.d.<init>(java.lang.String, da.p):void");
        }
    }

    /* compiled from: HttpDataSource.java */
    /* loaded from: classes2.dex */
    public static final class e extends c {

        /* renamed from: b  reason: collision with root package name */
        public final int f29120b;

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, List<String>> f29121c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public e(int r7, java.lang.String r8, java.io.IOException r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, da.p r11, byte[] r12) {
            /*
                r6 = this;
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r12 = 26
                r8.<init>(r12)
                java.lang.String r12 = "Response code: "
                r8.append(r12)
                r8.append(r7)
                java.lang.String r1 = r8.toString()
                r4 = 2004(0x7d4, float:2.808E-42)
                r5 = 1
                r0 = r6
                r2 = r9
                r3 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f29120b = r7
                r6.f29121c = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: da.a0.e.<init>(int, java.lang.String, java.io.IOException, java.util.Map, da.p, byte[]):void");
        }
    }

    /* compiled from: HttpDataSource.java */
    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f29122a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        private Map<String, String> f29123b;

        public synchronized void a(Map<String, String> map) {
            this.f29123b = null;
            this.f29122a.clear();
            this.f29122a.putAll(map);
        }

        public synchronized Map<String, String> b() {
            if (this.f29123b == null) {
                this.f29123b = Collections.unmodifiableMap(new HashMap(this.f29122a));
            }
            return this.f29123b;
        }
    }
}
