package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RetryNetworkRequest.java */
/* loaded from: classes3.dex */
public class gz extends gx {

    /* renamed from: d  reason: collision with root package name */
    private static final String f25632d = fx.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f25633a;

    /* renamed from: b  reason: collision with root package name */
    int f25634b;

    /* renamed from: c  reason: collision with root package name */
    int f25635c;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f25636e;

    /* JADX INFO: Access modifiers changed from: protected */
    public gz(String str, String str2, ir irVar, String str3, int i10, int i11, String str4) {
        super(str, str2, irVar, ie.f(), str4);
        this.f25633a = new AtomicBoolean(false);
        this.f25634b = 1;
        this.f25635c = 30;
        this.f25634b = i10;
        this.f25635c = i11;
        this.f25624s = str3;
        this.f25636e = null;
    }

    @Override // com.inmobi.media.gx
    public void a() {
        super.a();
        Map<String, String> map = this.f25636e;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!this.f25611f.containsKey(entry.getKey())) {
                    this.f25611f.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public final void b() {
        this.f25633a.compareAndSet(false, true);
    }
}
