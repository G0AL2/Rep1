package rb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.internal.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import ob.e;
import rb.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.2 */
/* loaded from: classes3.dex */
public class b implements rb.a {

    /* renamed from: c */
    private static volatile rb.a f36559c;
    @VisibleForTesting

    /* renamed from: a */
    final AppMeasurementSdk f36560a;
    @VisibleForTesting

    /* renamed from: b */
    final Map f36561b;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.2 */
    /* loaded from: classes3.dex */
    class a implements a.InterfaceC0491a {
        a(b bVar, String str) {
        }
    }

    b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f36560a = appMeasurementSdk;
        this.f36561b = new ConcurrentHashMap();
    }

    @KeepForSdk
    public static rb.a h(e eVar, Context context, pc.d dVar) {
        Preconditions.checkNotNull(eVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f36559c == null) {
            synchronized (b.class) {
                if (f36559c == null) {
                    Bundle bundle = new Bundle(1);
                    if (eVar.x()) {
                        dVar.a(ob.a.class, new Executor() { // from class: rb.d
                            @Override // java.util.concurrent.Executor
                            public final void execute(Runnable runnable) {
                                runnable.run();
                            }
                        }, new pc.b() { // from class: rb.c
                            @Override // pc.b
                            public final void a(pc.a aVar) {
                                b.i(aVar);
                            }
                        });
                        bundle.putBoolean("dataCollectionDefaultEnabled", eVar.w());
                    }
                    f36559c = new b(zzee.zzg(context, null, null, null, bundle).zzd());
                }
            }
        }
        return f36559c;
    }

    public static /* synthetic */ void i(pc.a aVar) {
        boolean z10 = ((ob.a) aVar.a()).f35169a;
        synchronized (b.class) {
            ((b) Preconditions.checkNotNull(f36559c)).f36560a.zza(z10);
        }
    }

    private final boolean j(String str) {
        return (str.isEmpty() || !this.f36561b.containsKey(str) || this.f36561b.get(str) == null) ? false : true;
    }

    @Override // rb.a
    @KeepForSdk
    public void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.i(str) && com.google.firebase.analytics.connector.internal.b.g(str2, bundle) && com.google.firebase.analytics.connector.internal.b.e(str, str2, bundle)) {
            com.google.firebase.analytics.connector.internal.b.d(str, str2, bundle);
            this.f36560a.logEvent(str, str2, bundle);
        }
    }

    @Override // rb.a
    @KeepForSdk
    public void b(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.i(str) && com.google.firebase.analytics.connector.internal.b.j(str, str2)) {
            this.f36560a.setUserProperty(str, str2, obj);
        }
    }

    @Override // rb.a
    @KeepForSdk
    public void c(a.c cVar) {
        if (com.google.firebase.analytics.connector.internal.b.f(cVar)) {
            this.f36560a.setConditionalUserProperty(com.google.firebase.analytics.connector.internal.b.a(cVar));
        }
    }

    @Override // rb.a
    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.g(str2, bundle)) {
            this.f36560a.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // rb.a
    @KeepForSdk
    public Map<String, Object> d(boolean z10) {
        return this.f36560a.getUserProperties(null, null, z10);
    }

    @Override // rb.a
    @KeepForSdk
    public int e(String str) {
        return this.f36560a.getMaxUserProperties(str);
    }

    @Override // rb.a
    @KeepForSdk
    public List<a.c> f(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f36560a.getConditionalUserProperties(str, str2)) {
            arrayList.add(com.google.firebase.analytics.connector.internal.b.b(bundle));
        }
        return arrayList;
    }

    @Override // rb.a
    @KeepForSdk
    public a.InterfaceC0491a g(String str, a.b bVar) {
        Object fVar;
        Preconditions.checkNotNull(bVar);
        if (com.google.firebase.analytics.connector.internal.b.i(str) && !j(str)) {
            AppMeasurementSdk appMeasurementSdk = this.f36560a;
            if (AppMeasurement.FIAM_ORIGIN.equals(str)) {
                fVar = new com.google.firebase.analytics.connector.internal.d(appMeasurementSdk, bVar);
            } else {
                fVar = (AppMeasurement.CRASH_ORIGIN.equals(str) || "clx".equals(str)) ? new f(appMeasurementSdk, bVar) : null;
            }
            if (fVar != null) {
                this.f36561b.put(str, fVar);
                return new a(this, str);
            }
            return null;
        }
        return null;
    }
}
