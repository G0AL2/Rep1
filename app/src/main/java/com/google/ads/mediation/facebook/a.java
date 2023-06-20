package com.google.ads.mediation.facebook;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FacebookInitializer.java */
/* loaded from: classes2.dex */
class a implements AudienceNetworkAds.InitListener {

    /* renamed from: d  reason: collision with root package name */
    private static a f20538d;

    /* renamed from: a  reason: collision with root package name */
    private boolean f20539a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20540b = false;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<InterfaceC0276a> f20541c = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FacebookInitializer.java */
    /* renamed from: com.google.ads.mediation.facebook.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0276a {
        void a(AdError adError);

        void b();
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a() {
        if (f20538d == null) {
            f20538d = new a();
        }
        return f20538d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Context context, String str, InterfaceC0276a interfaceC0276a) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        a().c(context, arrayList, interfaceC0276a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(Context context, ArrayList<String> arrayList, InterfaceC0276a interfaceC0276a) {
        if (this.f20539a) {
            this.f20541c.add(interfaceC0276a);
        } else if (this.f20540b) {
            interfaceC0276a.b();
        } else {
            this.f20539a = true;
            a().f20541c.add(interfaceC0276a);
            AudienceNetworkAds.buildInitSettings(context).withMediationService("GOOGLE:6.11.0.1").withPlacementIds(arrayList).withInitListener(this).initialize();
        }
    }

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f20539a = false;
        this.f20540b = initResult.isSuccess();
        Iterator<InterfaceC0276a> it = this.f20541c.iterator();
        while (it.hasNext()) {
            InterfaceC0276a next = it.next();
            if (initResult.isSuccess()) {
                next.b();
            } else {
                next.a(new AdError(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN));
            }
        }
        this.f20541c.clear();
    }
}
