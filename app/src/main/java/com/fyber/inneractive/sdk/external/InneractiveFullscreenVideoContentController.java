package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.y;
import com.fyber.inneractive.sdk.flow.z;
import com.fyber.inneractive.sdk.renderers.m;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class InneractiveFullscreenVideoContentController extends z {
    @Override // com.fyber.inneractive.sdk.flow.q
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof y;
    }

    public void setControlledRenderer(m mVar) {
        new WeakReference(mVar);
    }
}
