package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.q;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.v;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends com.applovin.impl.sdk.e.a {

    /* renamed from: a  reason: collision with root package name */
    private static final long f8721a = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: c  reason: collision with root package name */
    private final AtomicLong f8722c;

    /* renamed from: d  reason: collision with root package name */
    private final f f8723d;

    /* renamed from: e  reason: collision with root package name */
    private final v f8724e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(f fVar, m mVar) {
        super("PersistentPostbackQueueSaveTask", mVar);
        this.f8722c = new AtomicLong();
        this.f8724e = mVar.A();
        this.f8723d = fVar;
    }

    private void a(List<h> list) {
        JSONArray jSONArray = new JSONArray();
        for (h hVar : list) {
            try {
                jSONArray.put(hVar.n());
            } catch (Throwable th) {
                if (v.a()) {
                    this.f8724e.b("PersistentPostbackQueueSaveTask", "Unable to serialize postback request to JSON.", th);
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pb", jSONArray);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
            q ab2 = this.f8349b.ab();
            ab2.a(byteArrayInputStream, ab2.a("persistent_postback_cache.json", this.f8349b.L()));
            if (v.a()) {
                this.f8724e.b("PersistentPostbackQueueSaveTask", "Wrote updated postback queue to disk.");
            }
        } catch (Throwable th2) {
            if (v.a()) {
                this.f8724e.b("PersistentPostbackQueueSaveTask", "Failed to persist postbacks", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<h> a(int i10) {
        ArrayList<h> arrayList = new ArrayList<>();
        try {
            q ab2 = this.f8349b.ab();
            if (ab2.b("persistent_postback_cache.json", this.f8349b.L())) {
                String a10 = ab2.a(ab2.a("persistent_postback_cache.json", this.f8349b.L()));
                if (StringUtils.isValidString(a10)) {
                    JSONArray jSONArray = new JSONObject(a10).getJSONArray("pb");
                    if (v.a()) {
                        v vVar = this.f8724e;
                        vVar.b("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s).");
                    }
                    arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
                    int intValue = ((Integer) this.f8349b.a(com.applovin.impl.sdk.c.b.cJ)).intValue();
                    for (int i11 = 0; i11 < jSONArray.length() && arrayList.size() < i10; i11++) {
                        h hVar = new h(jSONArray.getJSONObject(i11), this.f8349b);
                        if (hVar.k() < intValue) {
                            arrayList.add(hVar);
                        } else if (v.a()) {
                            v vVar2 = this.f8724e;
                            vVar2.b("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + hVar);
                        }
                    }
                    if (v.a()) {
                        v vVar3 = this.f8724e;
                        vVar3.b("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
                    }
                }
            }
        } catch (Throwable th) {
            if (v.a()) {
                this.f8724e.b("PersistentPostbackQueueSaveTask", "Failed to deserialize postback queue", th);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f8722c.set(System.currentTimeMillis());
        this.f8349b.S().a(this, o.a.POSTBACKS, f8721a);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f8723d.a() > this.f8722c.get()) {
            a(this.f8723d.b());
        }
        a();
    }
}
