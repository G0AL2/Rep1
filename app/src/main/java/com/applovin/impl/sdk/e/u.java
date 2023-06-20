package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class u<T> extends a implements b.c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.network.c<T> f8452a;

    /* renamed from: c  reason: collision with root package name */
    private final b.c<T> f8453c;

    /* renamed from: d  reason: collision with root package name */
    protected b.a f8454d;

    /* renamed from: e  reason: collision with root package name */
    private o.a f8455e;

    /* renamed from: f  reason: collision with root package name */
    private com.applovin.impl.sdk.c.b<String> f8456f;

    /* renamed from: g  reason: collision with root package name */
    private com.applovin.impl.sdk.c.b<String> f8457g;

    public u(com.applovin.impl.sdk.network.c<T> cVar, com.applovin.impl.sdk.m mVar) {
        this(cVar, mVar, false);
    }

    public u(com.applovin.impl.sdk.network.c<T> cVar, final com.applovin.impl.sdk.m mVar, boolean z10) {
        super("TaskRepeatRequest", mVar, z10);
        this.f8455e = o.a.BACKGROUND;
        this.f8456f = null;
        this.f8457g = null;
        if (cVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f8452a = cVar;
        this.f8454d = new b.a();
        this.f8453c = new b.c<T>() { // from class: com.applovin.impl.sdk.e.u.1
            @Override // com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, T t10) {
                u uVar;
                com.applovin.impl.sdk.c.b bVar;
                boolean z11 = false;
                boolean z12 = i10 < 200 || i10 >= 500;
                boolean z13 = i10 == 429;
                if ((i10 != -1009) && (z12 || z13 || u.this.f8452a.m())) {
                    String f10 = u.this.f8452a.f();
                    if (u.this.f8452a.h() > 0) {
                        if (com.applovin.impl.sdk.v.a()) {
                            u uVar2 = u.this;
                            uVar2.c("Unable to send request due to server failure (code " + i10 + "). " + u.this.f8452a.h() + " attempts left, retrying in " + TimeUnit.MILLISECONDS.toSeconds(u.this.f8452a.k()) + " seconds...");
                        }
                        int h10 = u.this.f8452a.h() - 1;
                        u.this.f8452a.a(h10);
                        if (h10 == 0) {
                            u uVar3 = u.this;
                            uVar3.c(uVar3.f8456f);
                            if (StringUtils.isValidString(f10) && f10.length() >= 4) {
                                if (com.applovin.impl.sdk.v.a()) {
                                    u uVar4 = u.this;
                                    uVar4.b("Switching to backup endpoint " + f10);
                                }
                                u.this.f8452a.a(f10);
                                z11 = true;
                            }
                        }
                        long millis = (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.f8215dd)).booleanValue() && z11) ? 0L : u.this.f8452a.l() ? TimeUnit.SECONDS.toMillis((long) Math.pow(2.0d, u.this.f8452a.i())) : u.this.f8452a.k();
                        o S = mVar.S();
                        u uVar5 = u.this;
                        S.a(uVar5, uVar5.f8455e, millis);
                        return;
                    }
                    if (f10 == null || !f10.equals(u.this.f8452a.a())) {
                        uVar = u.this;
                        bVar = uVar.f8456f;
                    } else {
                        uVar = u.this;
                        bVar = uVar.f8457g;
                    }
                    uVar.c(bVar);
                }
                u.this.a(i10, str, t10);
            }

            @Override // com.applovin.impl.sdk.network.b.c
            public void a(T t10, int i10) {
                u.this.f8452a.a(0);
                u.this.a((u) t10, i10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <ST> void c(com.applovin.impl.sdk.c.b<ST> bVar) {
        if (bVar != null) {
            d().K().a((com.applovin.impl.sdk.c.b<?>) bVar, (Object) bVar.b());
        }
    }

    public abstract void a(int i10, String str, T t10);

    public void a(com.applovin.impl.sdk.c.b<String> bVar) {
        this.f8456f = bVar;
    }

    public void a(o.a aVar) {
        this.f8455e = aVar;
    }

    public abstract void a(T t10, int i10);

    public void b(com.applovin.impl.sdk.c.b<String> bVar) {
        this.f8457g = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        com.applovin.impl.sdk.network.b R = d().R();
        if (!d().c() && !d().d()) {
            if (com.applovin.impl.sdk.v.a()) {
                com.applovin.impl.sdk.v.i("AppLovinSdk", "AppLovin SDK is disabled");
            }
            i10 = -22;
        } else if (StringUtils.isValidString(this.f8452a.a()) && this.f8452a.a().length() >= 4) {
            if (TextUtils.isEmpty(this.f8452a.b())) {
                this.f8452a.b(this.f8452a.e() != null ? "POST" : "GET");
            }
            R.a(this.f8452a, this.f8454d, this.f8453c);
            return;
        } else {
            if (com.applovin.impl.sdk.v.a()) {
                d("Task has an invalid or null request endpoint.");
            }
            i10 = AppLovinErrorCodes.INVALID_URL;
        }
        a(i10, null, null);
    }
}
