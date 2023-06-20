package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static n f27278b;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<NetworkSettings> f27279a = new ArrayList<>();

    private n() {
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            if (f27278b == null) {
                f27278b = new n();
            }
            nVar = f27278b;
        }
        return nVar;
    }

    public final NetworkSettings a(String str) {
        Iterator<NetworkSettings> it = this.f27279a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.getProviderName().equals(str)) {
                return next;
            }
        }
        NetworkSettings networkSettings = new NetworkSettings(str);
        a(networkSettings);
        return networkSettings;
    }

    public final void a(NetworkSettings networkSettings) {
        this.f27279a.add(networkSettings);
    }

    public final void b() {
        Iterator<NetworkSettings> it = this.f27279a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.isMultipleInstances() && !TextUtils.isEmpty(next.getProviderTypeForReflection())) {
                NetworkSettings a10 = a(next.getProviderDefaultInstance());
                next.setApplicationSettings(IronSourceUtils.mergeJsons(next.getApplicationSettings(), a10.getApplicationSettings()));
                next.setInterstitialSettings(IronSourceUtils.mergeJsons(next.getInterstitialSettings(), a10.getInterstitialSettings()));
                next.setRewardedVideoSettings(IronSourceUtils.mergeJsons(next.getRewardedVideoSettings(), a10.getRewardedVideoSettings()));
                next.setBannerSettings(IronSourceUtils.mergeJsons(next.getBannerSettings(), a10.getBannerSettings()));
            }
        }
    }

    public final boolean b(String str) {
        Iterator<NetworkSettings> it = this.f27279a.iterator();
        while (it.hasNext()) {
            if (it.next().getProviderName().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
