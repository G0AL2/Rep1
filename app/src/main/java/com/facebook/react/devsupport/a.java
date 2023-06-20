package com.facebook.react.devsupport;

import android.content.Context;
import java.util.Map;

/* compiled from: DefaultDevSupportManagerFactory.java */
/* loaded from: classes.dex */
public class a implements b {
    @Override // com.facebook.react.devsupport.b
    public k6.d a(Context context, g gVar, String str, boolean z10, h hVar, k6.a aVar, int i10, Map<String, Object> map, h6.i iVar) {
        if (!z10) {
            return new c();
        }
        try {
            return (k6.d) Class.forName("com.facebook.react.devsupport.BridgeDevSupportManager").getConstructor(Context.class, g.class, String.class, Boolean.TYPE, h.class, k6.a.class, Integer.TYPE, Map.class, h6.i.class).newInstance(context, gVar, str, Boolean.TRUE, hVar, aVar, Integer.valueOf(i10), map, iVar);
        } catch (Exception e10) {
            throw new RuntimeException("Requested enabled DevSupportManager, but BridgeDevSupportManager class was not found or could not be created", e10);
        }
    }
}
