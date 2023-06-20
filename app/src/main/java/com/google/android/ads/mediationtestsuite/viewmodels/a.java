package com.google.android.ads.mediationtestsuite.viewmodels;

import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.ads.mediationtestsuite.viewmodels.e;

/* compiled from: AdLoadViewModel.java */
/* loaded from: classes2.dex */
public class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final NetworkConfig f20954a;

    public a(NetworkConfig networkConfig) {
        this.f20954a = networkConfig;
    }

    public NetworkConfig a() {
        return this.f20954a;
    }

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.e
    public e.a f() {
        return e.a.AD_LOAD;
    }
}
