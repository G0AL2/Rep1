package com.applovin.impl.mediation.debugger;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.mediation.debugger.b.b.b;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements b.c<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private static WeakReference<MaxDebuggerActivity> f7450a;

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f7451b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final m f7452c;

    /* renamed from: d  reason: collision with root package name */
    private final v f7453d;

    /* renamed from: e  reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.ui.b.b f7454e;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7457h;

    /* renamed from: j  reason: collision with root package name */
    private boolean f7459j;

    /* renamed from: k  reason: collision with root package name */
    private final Context f7460k;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, com.applovin.impl.mediation.debugger.b.b.b> f7455f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f7456g = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    private int f7458i = 2;

    public a(m mVar) {
        this.f7452c = mVar;
        this.f7453d = mVar.A();
        Context L = mVar.L();
        this.f7460k = L;
        this.f7454e = new com.applovin.impl.mediation.debugger.ui.b.b(L);
    }

    private List<com.applovin.impl.mediation.debugger.b.b.b> a(JSONObject jSONObject, m mVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                com.applovin.impl.mediation.debugger.b.b.b bVar = new com.applovin.impl.mediation.debugger.b.b.b(jSONObject2, mVar);
                arrayList.add(bVar);
                this.f7455f.put(bVar.m(), bVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.b.a.a> a(JSONObject jSONObject, List<com.applovin.impl.mediation.debugger.b.b.b> list, m mVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new com.applovin.impl.mediation.debugger.b.a.a(jSONObject2, this.f7455f, mVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private void a(List<com.applovin.impl.mediation.debugger.b.b.b> list) {
        boolean z10;
        Iterator<com.applovin.impl.mediation.debugger.b.b.b> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            com.applovin.impl.mediation.debugger.b.b.b next = it.next();
            if (next.e() && next.a() == b.a.INVALID_INTEGRATION) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.debugger.a.2
                @Override // java.lang.Runnable
                public void run() {
                    new AlertDialog.Builder(a.this.f7452c.af().a()).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.a.2.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i10) {
                            a.this.c();
                        }
                    }).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
                }
            }, TimeUnit.SECONDS.toMillis(2L));
        }
    }

    private void f() {
        this.f7452c.af().a(new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.mediation.debugger.a.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof MaxDebuggerActivity) {
                    v.f("AppLovinSdk", "Started mediation debugger");
                    if (!a.this.g() || a.f7450a.get() != activity) {
                        MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                        WeakReference unused = a.f7450a = new WeakReference(maxDebuggerActivity);
                        maxDebuggerActivity.setListAdapter(a.this.f7454e, a.this.f7452c.af());
                    }
                    a.f7451b.set(false);
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof MaxDebuggerActivity) {
                    v.f("AppLovinSdk", "Mediation debugger destroyed");
                    WeakReference unused = a.f7450a = null;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        WeakReference<MaxDebuggerActivity> weakReference = f7450a;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void a() {
        if (this.f7456g.compareAndSet(false, true)) {
            this.f7452c.S().a(new com.applovin.impl.mediation.debugger.c.a(this, this.f7452c), o.a.MEDIATION_MAIN);
        }
    }

    @Override // com.applovin.impl.sdk.network.b.c
    public void a(int i10, String str, JSONObject jSONObject) {
        v vVar = this.f7453d;
        vVar.e("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i10);
        v.i("AppLovinSdk", "Unable to show mediation debugger.");
        this.f7454e.a(null, null, null, null, null, this.f7452c);
        this.f7456g.set(false);
    }

    @Override // com.applovin.impl.sdk.network.b.c
    public void a(JSONObject jSONObject, int i10) {
        List<com.applovin.impl.mediation.debugger.b.b.b> a10 = a(jSONObject, this.f7452c);
        List<com.applovin.impl.mediation.debugger.b.a.a> a11 = a(jSONObject, a10, this.f7452c);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.f7454e.a(a10, a11, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), this.f7452c);
        if (b()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.debugger.a.3
                @Override // java.lang.Runnable
                public void run() {
                    a.this.c();
                }
            }, TimeUnit.SECONDS.toMillis(this.f7458i));
        } else {
            a(a10);
        }
    }

    public void a(boolean z10, int i10) {
        this.f7457h = z10;
        this.f7458i = i10;
    }

    public boolean b() {
        return this.f7457h;
    }

    public void c() {
        a();
        if (g() || !f7451b.compareAndSet(false, true)) {
            v.i("AppLovinSdk", "Mediation debugger is already showing");
            return;
        }
        if (!this.f7459j) {
            f();
            this.f7459j = true;
        }
        Intent intent = new Intent(this.f7460k, MaxDebuggerActivity.class);
        intent.setFlags(268435456);
        v.f("AppLovinSdk", "Starting mediation debugger...");
        this.f7460k.startActivity(intent);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.f7454e + "}";
    }
}
