package com.applovin.impl.mediation.c;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
import java.util.List;

/* loaded from: classes.dex */
public class a extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<com.applovin.impl.mediation.a.f> f7359a;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f7360c;

    /* renamed from: com.applovin.impl.mediation.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0116a extends com.applovin.impl.sdk.e.a {

        /* renamed from: a  reason: collision with root package name */
        private final com.applovin.impl.mediation.a.f f7363a;

        /* renamed from: c  reason: collision with root package name */
        private final List<com.applovin.impl.mediation.a.f> f7364c;

        /* renamed from: d  reason: collision with root package name */
        private final Activity f7365d;

        private C0116a(com.applovin.impl.mediation.a.f fVar, List<com.applovin.impl.mediation.a.f> list, m mVar, Activity activity) {
            super("TaskSequentialInitAdapter:" + fVar.K(), mVar, true);
            this.f7365d = activity;
            this.f7363a = fVar;
            this.f7364c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v.a()) {
                a("Auto-initing " + this.f7363a + "...");
            }
            this.f8349b.D().a(this.f7363a, this.f7365d, new Runnable() { // from class: com.applovin.impl.mediation.c.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (v.a()) {
                        C0116a c0116a = C0116a.this;
                        c0116a.a("Initialization task for adapter '" + C0116a.this.f7363a.L() + "' finished");
                    }
                    int indexOf = C0116a.this.f7364c.indexOf(C0116a.this.f7363a);
                    if (indexOf < C0116a.this.f7364c.size() - 1) {
                        com.applovin.impl.mediation.a.f fVar = (com.applovin.impl.mediation.a.f) C0116a.this.f7364c.get(indexOf + 1);
                        ((com.applovin.impl.sdk.e.a) C0116a.this).f8349b.S().a(new C0116a(fVar, C0116a.this.f7364c, ((com.applovin.impl.sdk.e.a) C0116a.this).f8349b, C0116a.this.f7365d), o.a.MAIN, fVar.Y());
                    } else if (v.a()) {
                        C0116a.this.a("Finished initializing adapters");
                    }
                }
            });
        }
    }

    public a(List<com.applovin.impl.mediation.a.f> list, Activity activity, m mVar) {
        super("TaskAutoInitAdapters", mVar, true);
        this.f7359a = list;
        this.f7360c = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f7359a.size() > 0) {
                if (v.a()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Auto-initing ");
                    sb2.append(this.f7359a.size());
                    sb2.append(" adapters");
                    sb2.append(this.f8349b.J().a() ? " in test mode" : "");
                    sb2.append("...");
                    a(sb2.toString());
                }
                if (TextUtils.isEmpty(this.f8349b.t())) {
                    this.f8349b.c("max");
                } else if (!this.f8349b.f() && v.a()) {
                    v.i("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f8349b.t());
                }
                if (v.a() && this.f7360c == null) {
                    v.i("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
                }
                if (((Boolean) this.f8349b.a(com.applovin.impl.sdk.c.a.Q)).booleanValue()) {
                    com.applovin.impl.mediation.a.f fVar = this.f7359a.get(0);
                    this.f8349b.S().a(new C0116a(fVar, this.f7359a, this.f8349b, this.f7360c), o.a.MAIN, fVar.Y());
                    return;
                }
                for (final com.applovin.impl.mediation.a.f fVar2 : this.f7359a) {
                    this.f8349b.S().a(new Runnable() { // from class: com.applovin.impl.mediation.c.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (v.a()) {
                                a aVar = a.this;
                                aVar.a("Auto-initing adapter: " + fVar2);
                            }
                            ((com.applovin.impl.sdk.e.a) a.this).f8349b.D().a(fVar2, a.this.f7360c);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            if (v.a()) {
                a("Failed to auto-init adapters", th);
            }
        }
    }
}
