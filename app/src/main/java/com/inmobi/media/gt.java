package com.inmobi.media;

import org.json.JSONObject;

/* compiled from: InMobiNetworkClient.java */
/* loaded from: classes3.dex */
public class gt<T> implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private static final String f25598b = gt.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    Class<T> f25599a;

    /* renamed from: c  reason: collision with root package name */
    private gz f25600c;

    /* renamed from: d  reason: collision with root package name */
    private gu f25601d;

    public gt(gu<T> guVar, gz gzVar, Class<T> cls) {
        this.f25601d = guVar;
        this.f25600c = gzVar;
        this.f25599a = cls;
    }

    public final void a() {
        new Thread(this).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        for (int i10 = 0; i10 <= this.f25600c.f25634b; i10++) {
            gy a10 = new gv(this.f25600c).a();
            if (this.f25600c.f25633a.get()) {
                return;
            }
            if (a10.a()) {
                if (i10 == this.f25600c.f25634b) {
                    this.f25601d.a(a10.f25627a);
                    return;
                }
            } else {
                try {
                    if (this.f25601d != null) {
                        JSONObject jSONObject = new JSONObject(a10.b());
                        if (this.f25599a.equals(JSONObject.class)) {
                            this.f25601d.a((gu) jSONObject);
                            return;
                        }
                        this.f25601d.a((gu) new ij().a(jSONObject, (Class<Object>) this.f25599a));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    gu guVar = this.f25601d;
                    if (guVar != null && i10 == this.f25600c.f25634b) {
                        guVar.a(new gw(-10, e10.getMessage()));
                        return;
                    }
                }
            }
            try {
                Thread.sleep(this.f25600c.f25635c * 1000);
            } catch (InterruptedException unused) {
            }
            if (this.f25600c.f25633a.get()) {
                return;
            }
        }
    }
}
