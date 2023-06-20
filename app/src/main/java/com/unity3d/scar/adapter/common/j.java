package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ScarAdapterBase.java */
/* loaded from: classes3.dex */
public abstract class j implements f {

    /* renamed from: a  reason: collision with root package name */
    protected pd.b f28511a;

    /* renamed from: b  reason: collision with root package name */
    protected Map<String, od.a> f28512b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    protected od.a f28513c;

    /* renamed from: d  reason: collision with root package name */
    protected d f28514d;

    /* compiled from: ScarAdapterBase.java */
    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f28515a;

        a(Activity activity) {
            this.f28515a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f28513c.a(this.f28515a);
        }
    }

    public j(d dVar) {
        this.f28514d = dVar;
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void a(Context context, String[] strArr, String[] strArr2, pd.a aVar) {
        this.f28511a.a(context, strArr, strArr2, aVar);
    }

    @Override // com.unity3d.scar.adapter.common.f
    public void c(Activity activity, String str, String str2) {
        od.a aVar = this.f28512b.get(str2);
        if (aVar == null) {
            d dVar = this.f28514d;
            dVar.handleError(b.f(str2, str, "Could not find ad for placement '" + str2 + "'."));
            return;
        }
        this.f28513c = aVar;
        k.a(new a(activity));
    }
}
