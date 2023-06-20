package com.unity3d.services.ads.gmascar.adapters;

import com.unity3d.scar.adapter.common.b;
import com.unity3d.scar.adapter.common.d;
import com.unity3d.scar.adapter.common.f;
import com.unity3d.services.core.log.DeviceLog;
import wd.a;

/* loaded from: classes3.dex */
public class ScarAdapterFactory {
    public static final int CODE_19_2 = 201604000;
    public static final int CODE_19_5 = 203404000;
    public static final int CODE_19_8 = 204890000;
    public static final int CODE_20_0 = 210402000;

    public f createScarAdapter(long j10, d dVar) {
        if (j10 >= 210402000) {
            return new a(dVar);
        }
        if (j10 < 203404000 || j10 > 204890000) {
            if (j10 >= 201604000) {
                return new qd.a(dVar);
            }
            String format = String.format("SCAR version %s is not supported.", Long.valueOf(j10));
            dVar.handleError(b.b(format));
            DeviceLog.debug(format);
            return null;
        }
        return new td.a(dVar);
    }
}
