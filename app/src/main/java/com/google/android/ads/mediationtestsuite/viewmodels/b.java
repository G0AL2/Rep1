package com.google.android.ads.mediationtestsuite.viewmodels;

import android.content.Context;
import com.google.android.ads.mediationtestsuite.dataobjects.Caption;
import com.google.android.ads.mediationtestsuite.viewmodels.e;
import java.util.List;

/* compiled from: DetailItemViewModel.java */
/* loaded from: classes2.dex */
public abstract class b implements e {

    /* renamed from: a  reason: collision with root package name */
    private boolean f20955a;

    @Override // com.google.android.ads.mediationtestsuite.viewmodels.e
    public e.a f() {
        return e.a.DETAIL_ITEM;
    }

    public abstract List<Caption> g();

    public abstract String h(Context context);

    public abstract String i(Context context);

    public boolean j() {
        return this.f20955a;
    }

    public void k(boolean z10) {
        this.f20955a = z10;
    }

    public boolean l() {
        return false;
    }

    public abstract boolean m();
}
