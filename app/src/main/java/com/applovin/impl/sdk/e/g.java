package com.applovin.impl.sdk.e;

import android.text.TextUtils;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends a {

    /* renamed from: a  reason: collision with root package name */
    private final com.applovin.impl.sdk.network.i f8373a;

    /* renamed from: c  reason: collision with root package name */
    private final AppLovinPostbackListener f8374c;

    /* renamed from: d  reason: collision with root package name */
    private final o.a f8375d;

    public g(com.applovin.impl.sdk.network.i iVar, o.a aVar, com.applovin.impl.sdk.m mVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", mVar);
        if (iVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f8373a = iVar;
        this.f8374c = appLovinPostbackListener;
        this.f8375d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        u<Object> uVar = new u<Object>(this.f8373a, d()) { // from class: com.applovin.impl.sdk.e.g.2

            /* renamed from: a  reason: collision with root package name */
            final String f8377a;

            {
                this.f8377a = g.this.f8373a.a();
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(int i10, String str, Object obj) {
                if (com.applovin.impl.sdk.v.a()) {
                    d("Failed to dispatch postback. Error code: " + i10 + " URL: " + this.f8377a);
                }
                if (g.this.f8374c != null) {
                    g.this.f8374c.onPostbackFailure(this.f8377a, i10);
                }
                if (g.this.f8373a.p()) {
                    this.f8349b.ag().a(g.this.f8373a.q(), this.f8377a, i10, obj, str, false);
                }
            }

            @Override // com.applovin.impl.sdk.e.u, com.applovin.impl.sdk.network.b.c
            public void a(Object obj, int i10) {
                if (obj instanceof String) {
                    for (String str : this.f8349b.b(com.applovin.impl.sdk.c.b.aO)) {
                        if (str.startsWith(str)) {
                            String str2 = (String) obj;
                            if (TextUtils.isEmpty(str2)) {
                                continue;
                            } else {
                                try {
                                    JSONObject jSONObject = new JSONObject(str2);
                                    com.applovin.impl.sdk.utils.h.d(jSONObject, this.f8349b);
                                    com.applovin.impl.sdk.utils.h.c(jSONObject, this.f8349b);
                                    com.applovin.impl.sdk.utils.h.e(jSONObject, this.f8349b);
                                    break;
                                } catch (JSONException unused) {
                                }
                            }
                        }
                    }
                }
                if (g.this.f8374c != null) {
                    g.this.f8374c.onPostbackSuccess(this.f8377a);
                }
                if (g.this.f8373a.p()) {
                    this.f8349b.ag().a(g.this.f8373a.q(), this.f8377a, i10, obj, null, true);
                }
            }
        };
        uVar.a(this.f8375d);
        d().S().a((a) uVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f8373a.a())) {
            if (this.f8373a.r()) {
                com.applovin.impl.adview.d.a(this.f8373a, d(), new AppLovinPostbackListener() { // from class: com.applovin.impl.sdk.e.g.1
                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackFailure(String str, int i10) {
                        g.this.a();
                    }

                    @Override // com.applovin.sdk.AppLovinPostbackListener
                    public void onPostbackSuccess(String str) {
                        if (g.this.f8374c != null) {
                            g.this.f8374c.onPostbackSuccess(g.this.f8373a.a());
                        }
                    }
                });
                return;
            } else {
                a();
                return;
            }
        }
        if (com.applovin.impl.sdk.v.a()) {
            b("Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f8374c;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f8373a.a(), AppLovinErrorCodes.INVALID_URL);
        }
    }
}
