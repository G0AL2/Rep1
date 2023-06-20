package com.bytedance.sdk.component.e.b;

import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: NetExecutor.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f10318a;

    /* renamed from: c  reason: collision with root package name */
    protected i f10319c;

    /* renamed from: d  reason: collision with root package name */
    protected String f10320d = null;

    /* renamed from: e  reason: collision with root package name */
    protected final Map<String, String> f10321e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    protected String f10322f = null;

    public c(i iVar) {
        this.f10319c = iVar;
        b(UUID.randomUUID().toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(k.a aVar) {
        if (aVar != null && this.f10321e.size() > 0) {
            for (Map.Entry<String, String> entry : this.f10321e.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    aVar.b(key, value);
                }
            }
        }
    }

    public void a(String str) {
        this.f10322f = str;
    }

    public String b() {
        return this.f10320d;
    }

    public void b(String str) {
        this.f10320d = str;
    }

    public void b(String str, String str2) {
        this.f10321e.put(str, str2);
    }

    public Map<String, Object> c() {
        return this.f10318a;
    }

    public void d(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f10321e.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void e(Map<String, Object> map) {
        this.f10318a = map;
    }
}
