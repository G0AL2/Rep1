package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController.EventsListener;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class q<EventsListenerT extends InneractiveContentController.EventsListener> implements InneractiveContentController<EventsListenerT> {
    public WeakReference<InneractiveAdSpot> mAdSpot;
    public EventsListenerT mEventsListener;

    public abstract boolean canControl(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveContentController
    public void destroy() {
        this.mEventsListener = null;
        this.mAdSpot = null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveContentController
    public InneractiveAdSpot getAdSpot() {
        return (InneractiveAdSpot) com.fyber.inneractive.sdk.util.s.a(this.mAdSpot);
    }

    public EventsListenerT getEventsListener() {
        return this.mEventsListener;
    }

    public void setAdSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.mAdSpot = new WeakReference<>(inneractiveAdSpot);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveContentController
    public void setEventsListener(EventsListenerT eventslistenert) {
        this.mEventsListener = eventslistenert;
    }
}
