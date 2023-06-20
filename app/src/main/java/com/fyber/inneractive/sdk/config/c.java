package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.q;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements com.fyber.inneractive.sdk.cache.a<IAConfigManager.a> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f16919a = false;

    @Override // com.fyber.inneractive.sdk.cache.a
    public String a() {
        String str = IAConfigManager.J.f16867c;
        StringBuilder sb2 = new StringBuilder("https://");
        int i10 = e.f16935a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.baseConfigUrl");
        if (TextUtils.isEmpty(property)) {
            sb2.append("cdn2.inner-active.mobi/ia-sdk-config/apps/");
        } else {
            sb2.append(property);
        }
        sb2.append(str);
        sb2.append('/');
        sb2.append(str);
        sb2.append(".json");
        String sb3 = sb2.toString();
        int i11 = IAlog.f20222a;
        IAlog.a(1, null, "%s: %s", "APP_CONFIG_REQUEST", sb3);
        return sb3;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String b() {
        return "IALastModifiedFromHeader";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public String c() {
        return "inneractive.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public boolean d() {
        String string = com.fyber.inneractive.sdk.util.l.f20301a.getSharedPreferences("IAConfigurationPreferences", 0).getString("cached.config.appid", null);
        return string != null && string.equalsIgnoreCase(IAConfigManager.J.f16867c);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public void a(IAConfigManager.a aVar) {
        IAConfigManager.a aVar2 = aVar;
        if (aVar2 == null || aVar2.f16891a == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.l.f20301a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("cached.config.appid", aVar2.f16891a).apply();
    }

    public final void a(Throwable th, String str) {
        String str2;
        String str3;
        String str4;
        if (this.f16919a) {
            return;
        }
        this.f16919a = true;
        if (TextUtils.isEmpty(str)) {
            str2 = "Empty Json Data";
        } else {
            str2 = str.substring(0, str.length() > 501 ? 500 : str.length() - 1);
        }
        if (th != null) {
            str3 = th.getClass().getName();
            str4 = th.getLocalizedMessage();
        } else {
            str3 = "Bad remote configuration";
            str4 = "Internal error";
        }
        String str5 = IAConfigManager.J.f16867c;
        q.a aVar = new q.a(com.fyber.inneractive.sdk.network.o.FATAL_CONFIGURATION_ERROR, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null, (JSONArray) null);
        Object[] objArr = new Object[8];
        objArr[0] = "exception";
        objArr[1] = str3;
        objArr[2] = "message";
        if (str4 == null) {
            str4 = "No message";
        }
        objArr[3] = str4;
        objArr[4] = "data";
        objArr[5] = str2;
        objArr[6] = "appId";
        if (TextUtils.isEmpty(str5)) {
            str5 = "EMPTY_APP_ID";
        }
        objArr[7] = str5;
        aVar.a(objArr).a((String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fyber.inneractive.sdk.config.IAConfigManager.a a(com.fyber.inneractive.sdk.config.remote.e r24) {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.c.a(com.fyber.inneractive.sdk.config.remote.e):com.fyber.inneractive.sdk.config.IAConfigManager$a");
    }

    public static Object a(Object obj, Object... objArr) {
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                return obj2;
            }
        }
        return obj;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public IAConfigManager.a a(String str) throws Exception {
        try {
            IAConfigManager iAConfigManager = IAConfigManager.J;
            iAConfigManager.D.b();
            com.fyber.inneractive.sdk.config.remote.e a10 = com.fyber.inneractive.sdk.config.remote.e.a(new JSONObject(str));
            String str2 = iAConfigManager.f16867c;
            if (a10 != null && str2.equals(a10.f17032a.f17021a)) {
                a10.f17035d = str;
                return a(a10);
            }
            IAlog.b("internal error while parsing local configuration", new Object[0]);
            if (a10 != null && !str2.equals(a10.f17032a.f17021a)) {
                throw new InvalidAppIdException();
            }
            a((Throwable) null, str);
            return null;
        } catch (Throwable th) {
            a(th, str);
            IAlog.b("Exception Error while parsing local configuration", new Object[0]);
            throw th;
        }
    }
}
