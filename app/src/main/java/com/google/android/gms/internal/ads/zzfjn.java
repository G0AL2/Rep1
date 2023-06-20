package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfjn implements zzfjl {
    private final zzfjl zza;

    public zzfjn(zzfjl zzfjlVar) {
        this.zza = zzfjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final JSONObject zza(View view) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final void zzb(View view, JSONObject jSONObject, zzfjk zzfjkVar, boolean z10) {
        ArrayList arrayList = new ArrayList();
        zzfjc zza = zzfjc.zza();
        if (zza != null) {
            Collection<zzfir> zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (zzfir zzfirVar : zzb) {
                View zzf = zzfirVar.zzf();
                if (zzf != null && zzf.isAttachedToWindow() && zzf.isShown()) {
                    View view2 = zzf;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() != 0.0f) {
                                ViewParent parent = view2.getParent();
                                view2 = parent instanceof View ? (View) parent : null;
                            }
                        } else {
                            View rootView = zzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float zza2 = zzfjw.zza(rootView);
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (zzfjw.zza((View) arrayList.get(i10)) <= zza2) {
                                        break;
                                    }
                                    size2 = i10;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            zzfjkVar.zza((View) arrayList.get(i11), this.zza, jSONObject);
        }
    }
}
