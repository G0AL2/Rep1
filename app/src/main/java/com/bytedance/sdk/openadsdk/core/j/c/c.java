package com.bytedance.sdk.openadsdk.core.j.c;

import android.text.TextUtils;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: VastMacroHelper.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f12465a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<b, String> f12466b;

    public c(List<String> list) {
        this.f12465a = list;
        HashMap hashMap = new HashMap();
        this.f12466b = hashMap;
        hashMap.put(b.CACHEBUSTING, b());
    }

    private String b() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    public List<String> a() {
        b[] values;
        ArrayList arrayList = new ArrayList();
        for (String str : this.f12465a) {
            if (!TextUtils.isEmpty(str)) {
                for (b bVar : b.values()) {
                    String str2 = this.f12466b.get(bVar);
                    if (str2 == null) {
                        str2 = "";
                    }
                    str = str.replaceAll("\\[" + bVar.name() + "\\]", str2);
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private String b(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format("%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j10) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j10 % 1000));
    }

    public c a(com.bytedance.sdk.openadsdk.core.j.a.a aVar) {
        if (aVar != null) {
            this.f12466b.put(b.ERRORCODE, aVar.a());
        }
        return this;
    }

    public c a(long j10) {
        if (j10 >= 0) {
            String b10 = b(j10);
            if (!TextUtils.isEmpty(b10)) {
                this.f12466b.put(b.CONTENTPLAYHEAD, b10);
            }
        }
        return this;
    }

    public c a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.f12466b.put(b.ASSETURI, str);
        }
        return this;
    }
}
