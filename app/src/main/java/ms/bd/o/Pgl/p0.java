package ms.bd.o.Pgl;

import com.bytedance.frameworks.baselib.network.http.NetworkParams;

/* loaded from: classes3.dex */
public final class p0 extends o0 {

    /* renamed from: a  reason: collision with root package name */
    private long f34540a;

    /* loaded from: classes3.dex */
    class pgla implements NetworkParams.AddSecurityFactorProcessCallback {
        pgla() {
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0159  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.Map<java.lang.String, java.lang.String> onCallToAddSecurityFactor(java.lang.String r19, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r20) {
            /*
                Method dump skipped, instructions count: 424
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.Pgl.p0.pgla.onCallToAddSecurityFactor(java.lang.String, java.util.Map):java.util.Map");
        }
    }

    @Override // ms.bd.o.Pgl.o0
    protected Object a(long j10) {
        this.f34540a = j10;
        pgla pglaVar = new pgla();
        synchronized (this) {
            NetworkParams.setAddSecurityFactorProcessCallback(pglaVar);
        }
        return Boolean.TRUE;
    }

    protected void finalize() throws Throwable {
        pblb.a(50331650, this.f34540a);
        pblk.a(100663298, 0, this.f34540a, null, null);
        this.f34540a = -1L;
        super.finalize();
    }
}
