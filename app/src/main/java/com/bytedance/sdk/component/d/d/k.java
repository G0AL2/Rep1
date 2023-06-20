package com.bytedance.sdk.component.d.d;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: NetVisitor.java */
/* loaded from: classes.dex */
public class k extends a {
    @Override // com.bytedance.sdk.component.d.d.i
    public String a() {
        return "net_request";
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public void a(final com.bytedance.sdk.component.d.c.c cVar) {
        final com.bytedance.sdk.component.d.c.f p10 = cVar.p();
        com.bytedance.sdk.component.d.d c10 = p10.c();
        cVar.a(false);
        try {
            com.bytedance.sdk.component.d.f a10 = c10.a(new com.bytedance.sdk.component.d.b.c(cVar.a(), cVar.j(), cVar.k()));
            int b10 = a10.b();
            cVar.a(a10.a());
            if (a10.b() == 200) {
                final byte[] bArr = (byte[]) a10.c();
                cVar.a(new b(bArr, a10));
                p10.e().submit(new Runnable() { // from class: com.bytedance.sdk.component.d.d.k.1
                    @Override // java.lang.Runnable
                    public void run() {
                        String g10 = cVar.g();
                        com.bytedance.sdk.component.d.b q10 = cVar.q();
                        if (q10.c()) {
                            p10.b(cVar.q()).a(g10, bArr);
                        }
                        if (q10.d()) {
                            p10.c(cVar.q()).a(g10, bArr);
                        }
                    }
                });
                return;
            }
            p10.g().a(String.valueOf(a10));
            Object c11 = a10.c();
            a(b10, a10.d(), c11 instanceof Throwable ? (Throwable) c11 : null, cVar);
        } catch (Throwable th) {
            a(IronSourceError.AUCTION_ERROR_EMPTY_WATERFALL, "net request failed!", th, cVar);
        }
    }

    private void a(int i10, String str, Throwable th, com.bytedance.sdk.component.d.c.c cVar) {
        cVar.a(new h(i10, str, th));
    }
}
