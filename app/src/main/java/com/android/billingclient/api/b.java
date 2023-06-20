package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.e;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzu;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: a */
    private volatile int f6015a;

    /* renamed from: b */
    private final String f6016b;

    /* renamed from: c */
    private final Handler f6017c;

    /* renamed from: d */
    private volatile q f6018d;

    /* renamed from: e */
    private Context f6019e;

    /* renamed from: f */
    private volatile zze f6020f;

    /* renamed from: g */
    private volatile k f6021g;

    /* renamed from: h */
    private boolean f6022h;

    /* renamed from: i */
    private boolean f6023i;

    /* renamed from: j */
    private int f6024j;

    /* renamed from: k */
    private boolean f6025k;

    /* renamed from: l */
    private boolean f6026l;

    /* renamed from: m */
    private boolean f6027m;

    /* renamed from: n */
    private boolean f6028n;

    /* renamed from: o */
    private boolean f6029o;

    /* renamed from: p */
    private boolean f6030p;

    /* renamed from: q */
    private boolean f6031q;

    /* renamed from: r */
    private boolean f6032r;

    /* renamed from: s */
    private boolean f6033s;

    /* renamed from: t */
    private boolean f6034t;

    /* renamed from: u */
    private boolean f6035u;

    /* renamed from: v */
    private ExecutorService f6036v;

    private b(Context context, boolean z10, o2.h hVar, String str, String str2, o2.t tVar) {
        this.f6015a = 0;
        this.f6017c = new Handler(Looper.getMainLooper());
        this.f6024j = 0;
        this.f6016b = str;
        i(context, hVar, z10, null);
    }

    private void i(Context context, o2.h hVar, boolean z10, o2.t tVar) {
        Context applicationContext = context.getApplicationContext();
        this.f6019e = applicationContext;
        this.f6018d = new q(applicationContext, hVar);
        this.f6034t = z10;
        this.f6035u = tVar != null;
    }

    public final Handler o() {
        return Looper.myLooper() == null ? this.f6017c : new Handler(Looper.myLooper());
    }

    private final e p(final e eVar) {
        if (Thread.interrupted()) {
            return eVar;
        }
        this.f6017c.post(new Runnable() { // from class: com.android.billingclient.api.v
            @Override // java.lang.Runnable
            public final void run() {
                b.this.n(eVar);
            }
        });
        return eVar;
    }

    public final e q() {
        if (this.f6015a != 0 && this.f6015a != 3) {
            return l.f6079j;
        }
        return l.f6081l;
    }

    @SuppressLint({"PrivateApi"})
    private static String r() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "4.1.0";
        }
    }

    public final Future s(Callable callable, long j10, final Runnable runnable, Handler handler) {
        long j11 = (long) (j10 * 0.95d);
        if (this.f6036v == null) {
            this.f6036v = Executors.newFixedThreadPool(zzb.zza, new h(this));
        }
        try {
            final Future submit = this.f6036v.submit(callable);
            handler.postDelayed(new Runnable() { // from class: o2.w
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    zzb.zzn("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j11);
            return submit;
        } catch (Exception e10) {
            zzb.zzo("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ Purchase.a z(b bVar, String str) {
        Bundle zzi;
        String valueOf = String.valueOf(str);
        zzb.zzm("BillingClient", valueOf.length() != 0 ? "Querying owned items, item type: ".concat(valueOf) : new String("Querying owned items, item type: "));
        ArrayList arrayList = new ArrayList();
        Bundle zzg = zzb.zzg(bVar.f6027m, bVar.f6034t, bVar.f6016b);
        String str2 = null;
        do {
            try {
                if (bVar.f6027m) {
                    zzi = bVar.f6020f.zzj(9, bVar.f6019e.getPackageName(), str, str2, zzg);
                } else {
                    zzi = bVar.f6020f.zzi(3, bVar.f6019e.getPackageName(), str, str2);
                }
                e a10 = m.a(zzi, "BillingClient", "getPurchase()");
                if (a10 != l.f6080k) {
                    return new Purchase.a(a10, null);
                }
                ArrayList<String> stringArrayList = zzi.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = zzi.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = zzi.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                    String str3 = stringArrayList2.get(i10);
                    String str4 = stringArrayList3.get(i10);
                    String valueOf2 = String.valueOf(stringArrayList.get(i10));
                    zzb.zzm("BillingClient", valueOf2.length() != 0 ? "Sku is owned: ".concat(valueOf2) : new String("Sku is owned: "));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.g())) {
                            zzb.zzn("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e10) {
                        zzb.zzo("BillingClient", "Got an exception trying to decode the purchase!", e10);
                        return new Purchase.a(l.f6079j, null);
                    }
                }
                str2 = zzi.getString("INAPP_CONTINUATION_TOKEN");
                String valueOf3 = String.valueOf(str2);
                zzb.zzm("BillingClient", valueOf3.length() != 0 ? "Continuation token: ".concat(valueOf3) : new String("Continuation token: "));
            } catch (Exception e11) {
                zzb.zzo("BillingClient", "Got exception trying to get purchasesm try to reconnect", e11);
                return new Purchase.a(l.f6081l, null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new Purchase.a(l.f6080k, arrayList);
    }

    public final /* synthetic */ Object B(o2.a aVar, o2.b bVar) throws Exception {
        try {
            Bundle zzd = this.f6020f.zzd(9, this.f6019e.getPackageName(), aVar.a(), zzb.zzc(aVar, this.f6016b));
            int zzb = zzb.zzb(zzd, "BillingClient");
            String zzj = zzb.zzj(zzd, "BillingClient");
            e.a c10 = e.c();
            c10.c(zzb);
            c10.b(zzj);
            bVar.a(c10.a());
            return null;
        } catch (Exception e10) {
            zzb.zzo("BillingClient", "Error acknowledge purchase!", e10);
            bVar.a(l.f6081l);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x008d, code lost:
        r0 = null;
        r4 = 4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object C(java.lang.String r22, java.util.List r23, java.lang.String r24, o2.i r25) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.C(java.lang.String, java.util.List, java.lang.String, o2.i):java.lang.Object");
    }

    @Override // com.android.billingclient.api.a
    public final void a(final o2.a aVar, final o2.b bVar) {
        if (!c()) {
            bVar.a(l.f6081l);
        } else if (TextUtils.isEmpty(aVar.a())) {
            zzb.zzn("BillingClient", "Please provide a valid purchase token.");
            bVar.a(l.f6078i);
        } else if (!this.f6027m) {
            bVar.a(l.f6071b);
        } else if (s(new Callable() { // from class: com.android.billingclient.api.t
            @Override // java.util.concurrent.Callable
            public final Object call() {
                b.this.B(aVar, bVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.r
            @Override // java.lang.Runnable
            public final void run() {
                o2.b.this.a(l.f6082m);
            }
        }, o()) == null) {
            bVar.a(q());
        }
    }

    @Override // com.android.billingclient.api.a
    public final void b() {
        try {
            this.f6018d.d();
            if (this.f6021g != null) {
                this.f6021g.c();
            }
            if (this.f6021g != null && this.f6020f != null) {
                zzb.zzm("BillingClient", "Unbinding from service.");
                this.f6019e.unbindService(this.f6021g);
                this.f6021g = null;
            }
            this.f6020f = null;
            ExecutorService executorService = this.f6036v;
            if (executorService != null) {
                executorService.shutdownNow();
                this.f6036v = null;
            }
        } catch (Exception e10) {
            zzb.zzo("BillingClient", "There was an exception while ending connection!", e10);
        } finally {
            this.f6015a = 3;
        }
    }

    @Override // com.android.billingclient.api.a
    public final boolean c() {
        return (this.f6015a != 2 || this.f6020f == null || this.f6021g == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:279:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0313 A[Catch: Exception -> 0x0355, CancellationException -> 0x0361, TimeoutException -> 0x0363, TryCatch #4 {CancellationException -> 0x0361, TimeoutException -> 0x0363, Exception -> 0x0355, blocks: (B:291:0x0301, B:293:0x0313, B:295:0x033b), top: B:311:0x0301 }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x033b A[Catch: Exception -> 0x0355, CancellationException -> 0x0361, TimeoutException -> 0x0363, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0361, TimeoutException -> 0x0363, Exception -> 0x0355, blocks: (B:291:0x0301, B:293:0x0313, B:295:0x033b), top: B:311:0x0301 }] */
    @Override // com.android.billingclient.api.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.e d(android.app.Activity r32, final com.android.billingclient.api.c r33) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.b.d(android.app.Activity, com.android.billingclient.api.c):com.android.billingclient.api.e");
    }

    @Override // com.android.billingclient.api.a
    public void f(String str, final o2.g gVar) {
        if (!c()) {
            gVar.a(l.f6081l, zzu.zzh());
        } else if (TextUtils.isEmpty(str)) {
            zzb.zzn("BillingClient", "Please provide a valid product type.");
            gVar.a(l.f6076g, zzu.zzh());
        } else if (s(new g(this, str, gVar), 30000L, new Runnable() { // from class: com.android.billingclient.api.x
            @Override // java.lang.Runnable
            public final void run() {
                o2.g.this.a(l.f6082m, zzu.zzh());
            }
        }, o()) == null) {
            gVar.a(q(), zzu.zzh());
        }
    }

    @Override // com.android.billingclient.api.a
    public final void g(f fVar, final o2.i iVar) {
        if (!c()) {
            iVar.a(l.f6081l, null);
            return;
        }
        String a10 = fVar.a();
        List<String> b10 = fVar.b();
        if (TextUtils.isEmpty(a10)) {
            zzb.zzn("BillingClient", "Please fix the input params. SKU type can't be empty.");
            iVar.a(l.f6075f, null);
        } else if (b10 != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : b10) {
                n nVar = new n(null);
                nVar.a(str);
                arrayList.add(nVar.b());
            }
            if (s(new Callable(a10, arrayList, null, iVar) { // from class: com.android.billingclient.api.w

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ String f6112b;

                /* renamed from: c  reason: collision with root package name */
                public final /* synthetic */ List f6113c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ o2.i f6114d;

                {
                    this.f6114d = iVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    b.this.C(this.f6112b, this.f6113c, null, this.f6114d);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.y
                @Override // java.lang.Runnable
                public final void run() {
                    o2.i.this.a(l.f6082m, null);
                }
            }, o()) == null) {
                iVar.a(q(), null);
            }
        } else {
            zzb.zzn("BillingClient", "Please fix the input params. The list of SKUs can't be empty - set SKU list or SkuWithOffer list.");
            iVar.a(l.f6074e, null);
        }
    }

    @Override // com.android.billingclient.api.a
    public final void h(o2.c cVar) {
        ServiceInfo serviceInfo;
        if (c()) {
            zzb.zzm("BillingClient", "Service connection is valid. No need to re-initialize.");
            cVar.onBillingSetupFinished(l.f6080k);
        } else if (this.f6015a == 1) {
            zzb.zzn("BillingClient", "Client is already in the process of connecting to billing service.");
            cVar.onBillingSetupFinished(l.f6073d);
        } else if (this.f6015a == 3) {
            zzb.zzn("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            cVar.onBillingSetupFinished(l.f6081l);
        } else {
            this.f6015a = 1;
            this.f6018d.e();
            zzb.zzm("BillingClient", "Starting in-app billing setup.");
            this.f6021g = new k(this, cVar, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f6019e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f6016b);
                    if (this.f6019e.bindService(intent2, this.f6021g, 1)) {
                        zzb.zzm("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    zzb.zzn("BillingClient", "Connection to Billing service is blocked.");
                } else {
                    zzb.zzn("BillingClient", "The device doesn't have valid Play Store.");
                }
            }
            this.f6015a = 0;
            zzb.zzm("BillingClient", "Billing service unavailable on device.");
            cVar.onBillingSetupFinished(l.f6072c);
        }
    }

    public final /* synthetic */ void n(e eVar) {
        if (this.f6018d.c() != null) {
            this.f6018d.c().onPurchasesUpdated(eVar, null);
            return;
        }
        this.f6018d.b();
        zzb.zzn("BillingClient", "No valid listener is set in BroadcastManager");
    }

    public final /* synthetic */ Bundle v(int i10, String str, String str2, c cVar, Bundle bundle) throws Exception {
        return this.f6020f.zzg(i10, this.f6019e.getPackageName(), str, str2, null, bundle);
    }

    public final /* synthetic */ Bundle w(String str, String str2) throws Exception {
        return this.f6020f.zzf(3, this.f6019e.getPackageName(), str, str2, null);
    }

    public b(String str, boolean z10, Context context, o2.o oVar) {
        this.f6015a = 0;
        this.f6017c = new Handler(Looper.getMainLooper());
        this.f6024j = 0;
        this.f6016b = r();
        Context applicationContext = context.getApplicationContext();
        this.f6019e = applicationContext;
        this.f6018d = new q(applicationContext, (o2.o) null);
        this.f6034t = z10;
    }

    public b(String str, boolean z10, Context context, o2.h hVar, o2.t tVar) {
        this(context, z10, hVar, r(), null, null);
    }
}
