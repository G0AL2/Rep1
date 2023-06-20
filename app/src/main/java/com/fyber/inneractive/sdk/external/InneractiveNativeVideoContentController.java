package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.z;
import com.fyber.inneractive.sdk.util.s;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class InneractiveNativeVideoContentController extends z {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Renderer> f17167a;

    /* loaded from: classes.dex */
    public interface Renderer {
        void pauseVideo();

        void playVideo();
    }

    @Override // com.fyber.inneractive.sdk.flow.q
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent().isVideoAd();
    }

    public void pauseVideo() {
        if (((Renderer) s.a(this.f17167a)) != null) {
            this.f17167a.get().pauseVideo();
        }
    }

    public void playVideo() {
        Renderer renderer = (Renderer) s.a(this.f17167a);
        if (renderer != null) {
            renderer.playVideo();
        }
    }

    public void setControlledRenderer(Renderer renderer) {
        this.f17167a = new WeakReference<>(renderer);
    }
}
