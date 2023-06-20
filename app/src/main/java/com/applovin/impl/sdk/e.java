package com.applovin.impl.sdk;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class e implements AppLovinCommunicatorSubscriber {

    /* renamed from: a  reason: collision with root package name */
    private final m f8339a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8340b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashMap<String, Bundle> f8341c = new LinkedHashMap<String, Bundle>() { // from class: com.applovin.impl.sdk.e.1
        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, Bundle> entry) {
            return size() > 16;
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private final Set<a> f8342d = Collections.synchronizedSet(new HashSet());

    /* loaded from: classes.dex */
    public interface a {
        void onCreativeIdGenerated(String str, String str2);
    }

    public e(m mVar) {
        this.f8339a = mVar;
        AppLovinCommunicator.getInstance(mVar.L()).subscribe(this, "safedk_ad_info");
    }

    public static String a() {
        return d("getVersion");
    }

    public static String b() {
        return d("getSdkKey");
    }

    private static String d(String str) {
        try {
            return (String) Class.forName("com.applovin.quality.AppLovinQualityService").getMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return "";
        }
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return BundleUtils.getString("ad_review_creative_id", b(str));
    }

    public void a(a aVar) {
        this.f8342d.add(aVar);
    }

    public Bundle b(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f8340b) {
            bundle = this.f8341c.get(str);
        }
        return bundle;
    }

    public void b(a aVar) {
        this.f8342d.remove(aVar);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f8340b) {
            this.f8341c.remove(str);
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return e.class.getSimpleName();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                if (v.a()) {
                    this.f8339a.A().d("AppLovinSdk", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                if (v.a()) {
                    this.f8339a.A().d("AppLovinSdk", "Received SafeDK ad info without private data");
                }
            } else if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                if (v.a()) {
                    this.f8339a.A().d("AppLovinSdk", "Received SafeDK ad info without ad format");
                }
            } else {
                final String string = bundle2.getString("id");
                if (TextUtils.isEmpty(string)) {
                    if (v.a()) {
                        this.f8339a.A().d("AppLovinSdk", "Received SafeDK ad info without serve id");
                        return;
                    }
                    return;
                }
                synchronized (this.f8340b) {
                    v A = this.f8339a.A();
                    A.b("AppLovinSdk", "Storing current SafeDK ad info for serve id: " + string);
                    this.f8341c.put(string, bundle);
                }
                final String string2 = bundle.getString("ad_review_creative_id");
                if (!StringUtils.isValidString(string2) || this.f8342d.isEmpty()) {
                    return;
                }
                Iterator it = new HashSet(this.f8342d).iterator();
                while (it.hasNext()) {
                    final a aVar = (a) it.next();
                    this.f8339a.S().a(new com.applovin.impl.sdk.e.z(this.f8339a, new Runnable() { // from class: com.applovin.impl.sdk.e.2
                        @Override // java.lang.Runnable
                        public void run() {
                            aVar.onCreativeIdGenerated(string, string2);
                        }
                    }), o.a.BACKGROUND);
                }
            }
        }
    }
}
