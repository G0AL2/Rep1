package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.VideoContentListener;

/* loaded from: classes.dex */
public abstract class z extends q<VideoContentListener> implements VideoContentListener {
    public boolean isOverlayOutside = true;

    public boolean isOverlayOutside() {
        return this.isOverlayOutside;
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onCompleted() {
        EventsListenerT eventslistenert = this.mEventsListener;
        if (eventslistenert != 0) {
            ((VideoContentListener) eventslistenert).onCompleted();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onPlayerError() {
        EventsListenerT eventslistenert = this.mEventsListener;
        if (eventslistenert != 0) {
            ((VideoContentListener) eventslistenert).onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onProgress(int i10, int i11) {
        EventsListenerT eventslistenert = this.mEventsListener;
        if (eventslistenert != 0) {
            ((VideoContentListener) eventslistenert).onProgress(i10, i11);
        }
    }

    public z setOverlayOutside(boolean z10) {
        this.isOverlayOutside = z10;
        return this;
    }
}
