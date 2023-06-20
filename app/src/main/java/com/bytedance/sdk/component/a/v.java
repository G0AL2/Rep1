package com.bytedance.sdk.component.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.a.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PermissionConfig.java */
/* loaded from: classes.dex */
class v {

    /* renamed from: b  reason: collision with root package name */
    private final LruCache<String, c> f9293b;

    /* renamed from: c  reason: collision with root package name */
    private final k.a f9294c;

    /* renamed from: d  reason: collision with root package name */
    private final String f9295d;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, List<b>> f9292a = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f9296e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PermissionConfig.java */
    /* loaded from: classes.dex */
    public static class a extends IllegalStateException {
        a(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PermissionConfig.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        Pattern f9299a;

        /* renamed from: b  reason: collision with root package name */
        x f9300b;

        /* renamed from: c  reason: collision with root package name */
        List<String> f9301c;

        /* renamed from: d  reason: collision with root package name */
        List<String> f9302d;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PermissionConfig.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        x f9303a = x.PUBLIC;

        /* renamed from: b  reason: collision with root package name */
        Set<String> f9304b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        Set<String> f9305c = new HashSet();

        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(String str, int i10, k.a aVar, final Executor executor, JSONObject jSONObject) {
        this.f9295d = str;
        if (i10 <= 0) {
            this.f9293b = new LruCache<>(16);
        } else {
            this.f9293b = new LruCache<>(i10);
        }
        this.f9294c = aVar;
        if (jSONObject == null) {
            aVar.a(d(str), new k.a.InterfaceC0143a() { // from class: com.bytedance.sdk.component.a.v.1
            });
        } else {
            a(jSONObject);
        }
    }

    private void b(JSONObject jSONObject) {
        this.f9292a.clear();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(AppLovinEventTypes.USER_VIEWED_CONTENT);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject2.getJSONArray(next);
                LinkedList linkedList = new LinkedList();
                this.f9292a.put(next, linkedList);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    linkedList.add(c(jSONArray.getJSONObject(i10)));
                }
            }
        } catch (JSONException e10) {
            i.b("Parse configurations failed, response: " + jSONObject.toString(), e10);
        }
        this.f9296e = true;
    }

    private List<b> c(String str) throws a {
        if (this.f9296e) {
            return this.f9292a.get(str);
        }
        throw new a("Permission config is outdated!");
    }

    private static String d(String str) {
        return "com.bytedance.ies.web.jsbridge2.PermissionConfig." + str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
        b(jSONObject);
        this.f9294c.a(d(this.f9295d), jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c a(String str, Set<String> set) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String builder = new Uri.Builder().scheme(scheme).authority(authority).path(parse.getPath()).toString();
        c cVar = new c();
        if (authority != null && !authority.isEmpty()) {
            for (String str2 : set) {
                if (!authority.equals(str2)) {
                    if (authority.endsWith("." + str2)) {
                    }
                }
                cVar.f9303a = x.PRIVATE;
                return cVar;
            }
            c cVar2 = this.f9293b.get(builder);
            return cVar2 != null ? cVar2 : a(builder);
        }
        cVar.f9303a = x.PUBLIC;
        return cVar;
    }

    private static b c(JSONObject jSONObject) throws JSONException {
        b bVar = new b();
        bVar.f9299a = Pattern.compile(jSONObject.getString("pattern"));
        bVar.f9300b = x.a(jSONObject.getString("group"));
        bVar.f9301c = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("included_methods");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                bVar.f9301c.add(optJSONArray.getString(i10));
            }
        }
        bVar.f9302d = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("excluded_methods");
        if (optJSONArray2 != null) {
            for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                bVar.f9302d.add(optJSONArray2.getString(i11));
            }
        }
        return bVar;
    }

    private static String b(String str) {
        String[] split;
        int length;
        if (str != null && (length = (split = str.split("[.]")).length) >= 2) {
            if (length == 2) {
                return str;
            }
            return split[length - 2] + "." + split[length - 1];
        }
        return null;
    }

    private c a(String str) throws a {
        c cVar = new c();
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String b10 = b(authority);
        if (!TextUtils.isEmpty(scheme) && !TextUtils.isEmpty(authority) && b10 != null) {
            List<b> c10 = c(b10);
            if (c10 == null) {
                return cVar;
            }
            for (b bVar : c10) {
                if (bVar.f9299a.matcher(str).find()) {
                    if (bVar.f9300b.compareTo(cVar.f9303a) >= 0) {
                        cVar.f9303a = bVar.f9300b;
                    }
                    cVar.f9304b.addAll(bVar.f9301c);
                    cVar.f9305c.addAll(bVar.f9302d);
                }
            }
            this.f9293b.put(str, cVar);
            return cVar;
        }
        cVar.f9303a = x.PUBLIC;
        return cVar;
    }
}
