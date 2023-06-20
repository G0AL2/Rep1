package com.ironsource.sdk.h;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private String f28197a;

    public d(String str) {
        this.f28197a = str;
    }

    private boolean d(JSONObject jSONObject) {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), e().getPath()) != 0;
    }

    private c e() {
        c cVar = new c(this.f28197a, "metadata.json");
        if (!cVar.exists()) {
            IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), cVar.getPath());
        }
        return cVar;
    }

    public final synchronized JSONObject a() {
        return new JSONObject(IronSourceStorageUtils.readFile(e()));
    }

    public final synchronized boolean a(String str) {
        JSONObject a10 = a();
        if (a10.has(str)) {
            a10.remove(str);
            return d(a10);
        }
        return true;
    }

    public final boolean a(ArrayList<c> arrayList) {
        Iterator<c> it = arrayList.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z10 = false;
            }
        }
        return z10;
    }

    public final synchronized boolean b(String str, JSONObject jSONObject) {
        JSONObject a10;
        a10 = a();
        JSONObject optJSONObject = a10.optJSONObject(str);
        if (optJSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                optJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            a10.putOpt(str, jSONObject);
        }
        return d(a10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean c(String str, JSONObject jSONObject) {
        JSONObject a10;
        a10 = a();
        a10.put(str, jSONObject);
        return d(a10);
    }
}
