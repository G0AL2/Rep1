package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.e.m;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinVariableService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class VariableServiceImpl implements AppLovinVariableService {

    /* renamed from: a  reason: collision with root package name */
    private final m f7976a;

    /* renamed from: d  reason: collision with root package name */
    private AppLovinVariableService.OnVariablesUpdateListener f7979d;

    /* renamed from: e  reason: collision with root package name */
    private Bundle f7980e;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f7977b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f7978c = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    private final Object f7981f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public VariableServiceImpl(m mVar) {
        this.f7976a = mVar;
        String str = (String) mVar.a(com.applovin.impl.sdk.c.d.f8240j);
        if (StringUtils.isValidString(str)) {
            updateVariables(JsonUtils.deserialize(str));
        }
    }

    private Object a(String str, Object obj, Class<?> cls) {
        if (TextUtils.isEmpty(str)) {
            if (v.a()) {
                v.i("AppLovinVariableService", "Unable to retrieve variable value for empty name");
            }
            return obj;
        }
        if (v.a() && !this.f7976a.d()) {
            v.h("AppLovinSdk", "Attempted to retrieve variable before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        synchronized (this.f7981f) {
            if (this.f7980e == null) {
                if (v.a()) {
                    v.i("AppLovinVariableService", "Unable to retrieve variable value for name \"" + str + "\". No variables returned by the server.");
                }
                return obj;
            } else if (cls.equals(String.class)) {
                return this.f7980e.getString(str, (String) obj);
            } else if (cls.equals(Boolean.class)) {
                return Boolean.valueOf(this.f7980e.getBoolean(str, ((Boolean) obj).booleanValue()));
            } else {
                throw new IllegalStateException("Unable to retrieve variable value for " + str);
            }
        }
    }

    private void a() {
        Bundle bundle;
        synchronized (this.f7981f) {
            if (this.f7979d != null && (bundle = this.f7980e) != null) {
                final Bundle bundle2 = (Bundle) bundle.clone();
                AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.sdk.VariableServiceImpl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        VariableServiceImpl.this.f7979d.onVariablesUpdate(bundle2);
                    }
                });
            }
        }
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public boolean getBoolean(String str, boolean z10) {
        return ((Boolean) a(str, Boolean.valueOf(z10), Boolean.class)).booleanValue();
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public String getString(String str) {
        return getString(str, null);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    public String getString(String str, String str2) {
        return (String) a(str, str2, String.class);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    @Deprecated
    public void loadVariables() {
        String str;
        if (this.f7976a.d()) {
            if (this.f7977b.compareAndSet(false, true)) {
                this.f7976a.S().a(new com.applovin.impl.sdk.e.m(this.f7976a, new m.a() { // from class: com.applovin.impl.sdk.VariableServiceImpl.1
                    @Override // com.applovin.impl.sdk.e.m.a
                    public void a() {
                        VariableServiceImpl.this.f7977b.set(false);
                    }
                }), o.a.BACKGROUND);
                return;
            } else if (!v.a()) {
                return;
            } else {
                str = "Ignored explicit variables load. Service is already in the process of retrieving the latest set of variables.";
            }
        } else if (!v.a()) {
            return;
        } else {
            str = "The AppLovin SDK is waiting for the initial variables to be returned upon completing initialization.";
        }
        v.i("AppLovinVariableService", str);
    }

    @Override // com.applovin.sdk.AppLovinVariableService
    @Deprecated
    public void setOnVariablesUpdateListener(AppLovinVariableService.OnVariablesUpdateListener onVariablesUpdateListener) {
        this.f7979d = onVariablesUpdateListener;
        synchronized (this.f7981f) {
            if (onVariablesUpdateListener != null) {
                if (this.f7980e != null && this.f7978c.compareAndSet(false, true)) {
                    if (v.a()) {
                        this.f7976a.A().b("AppLovinVariableService", "Setting initial listener");
                    }
                    a();
                }
            }
        }
    }

    public String toString() {
        return "VariableService{variables=" + this.f7980e + ", listener=" + this.f7979d + '}';
    }

    public void updateVariables(JSONObject jSONObject) {
        if (v.a()) {
            v A = this.f7976a.A();
            A.b("AppLovinVariableService", "Updating variables: " + jSONObject + "...");
        }
        synchronized (this.f7981f) {
            this.f7980e = JsonUtils.toBundle(jSONObject);
            a();
            this.f7976a.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.f8240j, (com.applovin.impl.sdk.c.d<String>) jSONObject.toString());
        }
    }
}
