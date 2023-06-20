package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public final class zaaj implements zabf {
    private final zabi zaa;
    private boolean zab = false;

    public zaaj(zabi zabiVar) {
        this.zaa = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t10) {
        zab(t10);
        return t10;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t10) {
        try {
            this.zaa.zag.zai.zaa(t10);
            zabe zabeVar = this.zaa.zag;
            Api.Client client = zabeVar.zac.get(t10.getClientKey());
            Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (!client.isConnected() && this.zaa.zab.containsKey(t10.getClientKey())) {
                t10.setFailedResult(new Status(17));
            } else {
                t10.run(client);
            }
        } catch (DeadObjectException unused) {
            this.zaa.zal(new zaah(this, this));
        }
        return t10;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        if (this.zab) {
            this.zab = false;
            this.zaa.zal(new zaai(this, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zaf() {
        if (this.zab) {
            this.zab = false;
            this.zaa.zag.zai.zab();
            zaj();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(ConnectionResult connectionResult, Api<?> api, boolean z10) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int i10) {
        this.zaa.zak(null);
        this.zaa.zah.zac(i10, this.zab);
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        if (this.zab) {
            return false;
        }
        Set<zada> set = this.zaa.zag.zah;
        if (set != null && !set.isEmpty()) {
            this.zab = true;
            for (zada zadaVar : set) {
                zadaVar.zah();
            }
            return false;
        }
        this.zaa.zak(null);
        return true;
    }
}
