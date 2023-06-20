package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UnifiedIDServiceCallback.java */
/* loaded from: classes3.dex */
public final class jn implements gu<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    jo f25880a;

    /* renamed from: b  reason: collision with root package name */
    Set<InMobiUnifiedIdInterface> f25881b;

    public jn(jo joVar, Set<InMobiUnifiedIdInterface> set) {
        this.f25880a = joVar;
        this.f25881b = set;
    }

    @Override // com.inmobi.media.gu
    public final /* synthetic */ void a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        synchronized (jm.class) {
            if (this.f25880a.f25633a.get()) {
                return;
            }
            jm.d();
            jk.a(jl.a(jSONObject2, jk.a()));
            JSONObject c10 = jl.c(jk.a());
            for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.f25881b) {
                if (c10 == null) {
                    jl.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT));
                } else {
                    jl.a(inMobiUnifiedIdInterface, c10, null);
                }
            }
            this.f25881b.clear();
        }
    }

    @Override // com.inmobi.media.gu
    public final void a(gw gwVar) {
        synchronized (jm.class) {
            HashMap hashMap = new HashMap();
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(gwVar.f25605a));
            hh.a().a("UnifiedIdNetworkResponseFailure", hashMap);
            if (this.f25880a.f25633a.get()) {
                return;
            }
            jm.d();
            a();
        }
    }

    private void a() {
        JSONObject c10 = jl.c(jk.a());
        try {
            if (c10 != null) {
                try {
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                if (c10.has("ufids") && c10.getJSONArray("ufids").length() > 0) {
                    for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface : this.f25881b) {
                        jl.a(inMobiUnifiedIdInterface, c10, null);
                    }
                }
            }
            for (InMobiUnifiedIdInterface inMobiUnifiedIdInterface2 : this.f25881b) {
                jl.a(inMobiUnifiedIdInterface2, null, new Error(InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT));
            }
        } finally {
            this.f25881b.clear();
        }
    }
}
