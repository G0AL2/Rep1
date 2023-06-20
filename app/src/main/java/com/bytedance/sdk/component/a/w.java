package com.bytedance.sdk.component.a;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PermissionConfigRepository.java */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private final Collection<String> f9306a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, v> f9307b;

    /* renamed from: c  reason: collision with root package name */
    private final k f9308c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<a> f9309d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PermissionConfigRepository.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v a(String str) {
        if (!this.f9306a.contains(str) && !TextUtils.equals(str, "host")) {
            throw new IllegalArgumentException("Namespace: " + str + " not registered.");
        }
        return a(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(a aVar) {
        this.f9309d.remove(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f9309d.add(aVar);
    }

    private v a(String str, JSONObject jSONObject) {
        v vVar = this.f9307b.get(str);
        if (vVar == null) {
            v vVar2 = new v(str, this.f9308c.c(), this.f9308c.a(), this.f9308c.b(), jSONObject);
            this.f9307b.put(str, vVar2);
            return vVar2;
        } else if (jSONObject != null) {
            vVar.a(jSONObject);
            return vVar;
        } else {
            return vVar;
        }
    }
}
